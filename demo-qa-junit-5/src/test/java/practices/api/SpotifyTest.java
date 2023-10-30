package practices.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilities.api.Spotify;

public class SpotifyTest {

	@Test
	void run() {
		Spotify.printTokenResponse();
	}

	@BeforeEach
	void setUp() {
	}

}
