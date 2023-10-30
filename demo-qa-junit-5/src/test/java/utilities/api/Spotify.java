package utilities.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.readers.SecretReader;

public class Spotify {

	public static void printTokenResponse() {
		Response response = getTokenResponse();
		System.out.println(response.getStatusLine());

		if (response.getStatusCode() == 200) {
			response.getBody().prettyPrint();
		}
	}

	private static Response getTokenResponse() {
		SecretReader.load("spotify");
		String id = SecretReader.getSecret("id");
		String secret = SecretReader.getSecret("secret");
		String credentials = String.format("grant_type=client_credentials&client_id=%s&client_secret=%s", id, secret);

		loadBaseURI();
		String endpoint = "api/token";
		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/x-www-form-urlencoded");
		request.body(credentials);

		Response response = request.post(endpoint);
		return response;
	}

	public static void loadBaseURI() {
		RestAssured.baseURI = "https://accounts.spotify.com/";
	}

}
