package com.common.date;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeDemo {

	public static void main(String[] args) {
		System.out.println(getTime());
	}

	public static String getTime2() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH_mm");
		Calendar c = Calendar.getInstance();

		String time = "" + c.get(Calendar.HOUR_OF_DAY) + "_"
				+ ((c.get(Calendar.MINUTE) / 15) + 1) * 15;

		c.add(Calendar.MINUTE, -15);
		time = "" + c.get(Calendar.HOUR_OF_DAY) + "_"
				+ (c.get(Calendar.MINUTE) / 15) * 15 + ", " + time;

		return time;

	}

	public static String getTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH_mm");
		Calendar c = Calendar.getInstance();

		String time = "" + c.get(Calendar.HOUR_OF_DAY) + "_"
				+ ((c.get(Calendar.MINUTE) / 15) + 1) * 15;

		c.add(Calendar.MINUTE, -15);
		time = "" + c.get(Calendar.HOUR_OF_DAY) + "_"
				+ ((c.get(Calendar.MINUTE) / 15)+1) * 15 + ", " + time;

		return time;

	}

}
