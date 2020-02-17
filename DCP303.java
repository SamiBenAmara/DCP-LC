//Given a clock time in hh:mm format, determine, to the nearest degree, the angle between the hour and the minute hands.

import java.lang.*;

class DCP303
{
	public static float angle(String time)
	{
		// Convet the time into hour and minute variables
		float hour = Float.parseFloat(time.substring(0, 2));
		float minutes = Float.parseFloat(time.substring(3, 5));

		// Each minute on the clock represents a turn of 6 degrees
		// Multiply hour and minutes by 6 to obtain the angle
		// Use mod 360 on the hour variable to reset it to 0 whenver it reaches 12
		hour = (hour * 30) % 360;
		minutes *= 6;

		// On a clock, the hour hand moves slightly as the minute hand moves
		// Calculate the increased turn of the hour hand by dividing hour by 360, then multiplying by 30
		hour += (minutes / 360) * 30;
		float ans = Math.abs(hour - minutes);
		return (ans > 180) ? 360 - ans : ans;
	}

	public static void main(String[] args)
	{
		System.out.println("00:00 = " + angle("00:00"));
		System.out.println("00:30 = " + angle("00:30"));
		System.out.println("01:00 = " + angle("01:00"));
		System.out.println("01.30 = " + angle("01.30"));
		System.out.println("02:00 = " + angle("02:00"));
		System.out.println("02.30 = " + angle("02.30"));
		System.out.println("03:00 = " + angle("03:00"));
		System.out.println("03:30 = " + angle("03:30"));
		System.out.println("04:00 = " + angle("04:00"));
		System.out.println("04:30 = " + angle("04:30"));
		System.out.println("05:00 = " + angle("05:00"));
		System.out.println("05:30 = " + angle("05:30"));
		System.out.println("06:00 = " + angle("06:00"));
		System.out.println("06:30 = " + angle("06:30"));
		System.out.println("07:00 = " + angle("07:00"));
		System.out.println("07:30 = " + angle("07:30"));
		System.out.println("08:00 = " + angle("08:00"));
		System.out.println("08:30 = " + angle("08:30"));
		System.out.println("09:00 = " + angle("09:00"));
		System.out.println("09:30 = " + angle("09:30"));
		System.out.println("10:00 = " + angle("10:00"));
		System.out.println("10:30 = " + angle("10:30"));
		System.out.println("11:00 = " + angle("11:00"));
		System.out.println("11:30 = " + angle("11:30"));
		System.out.println("12:00 = " + angle("12:00"));
		System.out.println("12:30 = " + angle("12:30"));		
	}
}