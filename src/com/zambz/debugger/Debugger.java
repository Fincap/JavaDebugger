package com.zambz.debugger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class serves as a static output logging tool.
 * The class takes a string to log, then prints it to the console and stores the log into a text file,
 * attaching the debug statement to an optional timestamp.
 */
public final class Debugger {

	private static boolean enabled = true;
	private static boolean timestampEnabled = true;

	public static void setEnabled(boolean active) {
		Debugger.enabled = active;
	}

	public static void setTimestampEnabled(boolean active) {
		Debugger.timestampEnabled = active;
	}

	public static boolean isEnabled() {
		return enabled;
	}

	public static boolean isTimestampEnabled() {
		return timestampEnabled;
	}

	/**
	 * Logs the arguments as a formatted string to system output.
	 * @param str A format string.
	 * @param args Arguments referenced by the format specifiers in the format string.
	 */
	public static void log(String str, Object... args){
		if (isEnabled()) {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd|HH:mm:ss").format(new Date());
			String fullString = String.format(str, args);
			System.out.printf("[%s] %s\n", isTimestampEnabled() ? timeStamp : "", fullString);
		}
	}

}
