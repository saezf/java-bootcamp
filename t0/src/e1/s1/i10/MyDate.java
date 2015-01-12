package e1.s1.i10;

public class MyDate {

	private static final int MIN_YEAR = 1;
	private static final int MAX_YEAR = 9999; // in case you want to change this
												// Arbitrary restrictions

	private int year = MIN_YEAR;
	private int month = 1;
	private int day = 1;

	private static final String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	private static final String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	private static final int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate(int year, int month, int day) {
		setDate(year, month, day);
	}

	public void setDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (isValidDate(year, month, day)) {

			this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (isValidDate(year, month, day)) {
			this.month = month;
		}
	}

	public void setDay(int day) {

		if (isValidDate(year, month, day)) {
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}

	public static String[] getStrmonths() {
		return strMonths;
	}

	public static String[] getStrdays() {
		return strDays;
	}

	public static int[] getDaysinmonths() {
		return daysInMonths;
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	/**
	 * Checks if the parameters conform a valid date
	 * 
	 * @param year
	 *            int from MIN_YEAR to MAX_YEAR
	 * @param month
	 *            int from 1 to 12
	 * @param day
	 *            int from 1 to (28||29||30||31) (depending on month and year)
	 * @return true if it's valid.
	 */
	public static boolean isValidDate(int year, int month, int day) {

		if ((year < MIN_YEAR || year > MAX_YEAR)) { // Invalid Year
			throw new IllegalArgumentException("Year out of range!");
		}

		if (month < 1 || month > 12) // Invalid Month
		{
			throw new IllegalArgumentException("Invalid Month!");
		}

		if (day < 0 || day > daysInMonths[month - 1] + ((isLeapYear(year) && month == 2) ? 1 : 0)) {
			throw new IllegalArgumentException("Invalid Day!");

		}
		return true;
	}

	public static int getDayOfWeek(int year, int month, int day) {

		/*
		 * I chose this method with the idea of adjust the day when calendar
		 * past from julian to gregorian. But I'm getting behind with the
		 * exercises, so it just gives you the day from gregorian calendar
		 * 
		 * If I know what day was on 1/1/1 then I just have to get how many days
		 * have past from there the retrieve the Remainder (days % 7 = i) and
		 * then count the days from the day of week of 1/1/1 to i which are
		 * stored on strDays.
		 * the day of the week of 1/1/1 (searched on the web), was a
		 * Monday (gregorian calendar).
		 * 
		 * 
		 * So if I need to know how many days have past from 1/1/1 until
		 * 1/1/2015, the retrieve the Remainder Year * (days of regular year
		 * =365) + (days added by leap years) + days from current year, in this
		 * case days passed = 1, leap years are divisible 4, but no by 100
		 * unless is divisible by 400 so to know how many leap years have past
		 * since a date . I'll consider all years divisible by 4 as leap and
		 * then subtract the years that where divisible by 100 and add those
		 * divisible by 400. leapYears = (Years/4) - (years/100) + (years/400)
		 * then (2014 * 365) + 488 +1 = 735599 =>735599 % 7 = 4 (Thursday).
		 */

		isValidDate(year, month, day); // Throws exception if not valid
										
		int DaysOfLastMonths;
		if (year == 0) {
			year--;
		}// year 0 is year -1
		if (year % 2 == -1) {
			DaysOfLastMonths = day;
			year++;
			for (int j = 11; j < month - 2; j--) { // Counts backwards
				DaysOfLastMonths += daysInMonths[j];
			}

		} else {
			year--;
			DaysOfLastMonths = day;
			for (int j = 0; j < month - 1; j++) {
				DaysOfLastMonths += daysInMonths[j];
			}

		}

		year = Math.abs(year); // years are adjusted

		int dayspast = (year * 365) + (year / 4) + (year / 400) - (year / 100) + DaysOfLastMonths
				+ ((isLeapYear(year) && month > 2) ? 1 : 0);
		// if (isLeapYear(year) && month >2 )
		// {
		// dayspast++;
		// }

		return dayspast % 7;

	}

	public MyDate nextDay() {
		int lastDay = daysInMonths[month - 1] + ((isLeapYear(year) && month == 2) ? 1 : 0);

		if (lastDay == day && 12 == month) {

			setDate(year + 1, 1, 1);
			return this;
		}

		if (lastDay == day) {
			setDate(year, month + 1, 1);
			return this;
		}

		setDate(year, month, day + 1); 
		return this;
	}

	public MyDate nextMonth() {
		if (12 == month) {
			// don't need to check day, jan and dec have 31 days
			setDate(year + 1, 1, day);
		return this;
		}
		// returns daysInMonths value , if next month is feb and is leapyear
		// adds 1
		// month is not 12 or this method would end above.
		int lastDayOfNextMonth = daysInMonths[month] + ((isLeapYear(year) && month == 1) ? 1 : 0);
		if (day > lastDayOfNextMonth) { // if this
			setDate(year, month + 1, lastDayOfNextMonth);
		} else {
			setDate(year, month + 1, day);
		}
		return this;
	}

	public MyDate nextYear() {
		setDate(year + 1, month, day);

		return this;
	}

	public MyDate previousDay() {

		if (1 == day && 1 == month) {

			setDate(year - 1, 1, 1);// If wasn't valid year this will throw
									// exception
			return this;
		}

		if (1 == day) { // month >= 2
			setDate(year, month - 1, daysInMonths[month - 2] + ((isLeapYear(year) && month == 3) ? 1 : 0));
			return this;
		}
		setDate(year, month, day - 1);
		return this;

	}

	public MyDate previousMonth() {
		if (1 == month) {

			setDate(year - 1, 1, day);
		}

		// month >= 2
		// returns daysInMonths value , if next month is feb and is leapyear
		// adds 1
		int lastDayOfPrevtMonth = daysInMonths[month - 2] + ((isLeapYear(year) && month == 3) ? 1 : 0);
		if (day > lastDayOfPrevtMonth) { // if this
			setDate(year, month - 1, lastDayOfPrevtMonth);
		} else {
			setDate(year, month - 1, day);
		}
		return this;

	}

	public MyDate previousYear() {

		setDate(year - 1, month, day);

		return this;
	}

	public String toString() {
		int index = getDayOfWeek(year, month, day);
		return String.format("%1$s %2$d %3$s %4$04d", strDays[index], day, strMonths[month - 1], year);
	}

}
