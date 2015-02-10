package e1.s1.i9;

public class MyTime {

	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	/**
	 * Sets and validate
	 * 
	 * @param hour
	 *            Hour's value must be an integer number between 0 and 23
	 */
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Hour's value must be an integer number between 0 and 23.\n Parameter passed:" + hour);
		}
		this.hour = hour;
	}

	/**
	 * Sets and validate
	 * 
	 * @param minute
	 *            Minute's value must be an integer number between 0 and 59
	 */
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Minute's value must be an integer number between 0 and 59.\n Parameter passed:" + minute);
		}
		this.minute = minute;
	}

	/**
	 * Sets and validate
	 * 
	 * @param second
	 *            Second's value must be an integer number between 0 and 59
	 */
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Second's value must be an integer number between 0 and 59.\n Parameter passed:" + second);
		}
		this.second = second;
	}

	public MyTime nextSecond() {
		try {
			setTime(hour, minute, ++second);
			return this;
		} catch (IllegalArgumentException e) {
			second = 0;
			return nextMinute();
		}
	}

	public MyTime nextMinute() {
		try {
			setTime(hour, ++minute, second);
			return this;
		} catch (IllegalArgumentException e) {
			minute = 0;
			return nextHour();
		}
	}

	public MyTime nextHour() {
		try {
			setTime(++hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
			hour = 0;
			return this;
		}
	}

	public MyTime previousSecond() {
		try {
			setTime(hour, minute, --second);
			return this;
		} catch (IllegalArgumentException e) {
			second = 59;
			return previousMinute();
		}
	}

	public MyTime previousMinute() {
		try {
			setTime(hour, --minute, second);
			return this;
		} catch (IllegalArgumentException e) {
			minute = 59;
			return previousHour();
		}
	}

	public MyTime previousHour() {
		try {
			setTime(--hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
			hour = 23;
			return this;
		}
	}

	public String toString() {
		// using the getters to call all methods on the test class
		return String.format("%1$02d:%2$02d:%3$02d", getHour(), getMinute(), getSecond());
	}
}