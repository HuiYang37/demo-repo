package utilities;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TestUtils {

	public static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getTimestamp() {
		long tsNumValue = Timestamp.valueOf(LocalDateTime.now()).getTime();
		return String.valueOf(tsNumValue);
	}

}
