package demo_app;

import java.time.LocalTime;

public class Alarm {

	public static void main(String[] args) {
		printAlarm(4, 45, true);
	}

	private static void printAlarm(int hour, int minute, boolean isMorning) {
		LocalTime arriveTime = findArriveTime(hour, minute, isMorning);
		LocalTime leaveTime = getLeaveTime(arriveTime);
		LocalTime wakeTime = getWakeTime(leaveTime);
		System.out.println("Arrive: " + arriveTime);
		System.out.println("Leave: " + leaveTime);
		System.out.println("Wake: " + wakeTime);

	}

	private static LocalTime findArriveTime(int hour, int minute, boolean isMorning) {
		if (isMorning)
			return LocalTime.of(hour, minute);
		return LocalTime.of(hour + 12, minute);
	}

	private static LocalTime getLeaveTime(LocalTime time) {
		return time.minusMinutes(45);
	}

	private static LocalTime getWakeTime(LocalTime time) {
		return time.minusMinutes(45);
	}

}
