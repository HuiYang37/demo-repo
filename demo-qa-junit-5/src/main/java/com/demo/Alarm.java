package com.demo;

import java.time.LocalTime;

public class Alarm {

	public static void main(String[] args) {
		printAlarm(3, 30, true);
	}

	private static void printAlarm(int hour, int minute, boolean isMorning) {
		String arriveHalf = " PM";
		String leaveHalf = " PM";
		String wakeHalf = " PM";

		LocalTime arriveTime = findArriveTime(hour, minute, isMorning);
		LocalTime leaveTime = getLeaveTime(arriveTime);
		LocalTime wakeTime = getWakeTime(leaveTime);

		if (arriveTime.getHour() < 12)
			arriveHalf = " AM";
		if (leaveTime.getHour() < 12)
			leaveHalf = " AM";
		if (wakeTime.getHour() < 12)
			wakeHalf = " AM";

		System.out.println("Arrive: " + arriveTime + arriveHalf);
		System.out.println("Leave: " + leaveTime + leaveHalf);
		System.out.println("Wake: " + wakeTime + wakeHalf);

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
