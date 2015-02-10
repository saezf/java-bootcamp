package com.bootcamp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate{
	private int year;
	private int month;
	private int day;
	
	private static String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public MyDate(int year, int month, int day){
		this.setDate(year,month,day);
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	public static boolean isValidDate(int year, int month, int day){
		if(year < 1 || year > 9999){
			throw new IllegalArgumentException("Year out of range!");
		}
		if(month < 1 || month > 12){
			throw new IllegalArgumentException("Invalid Month!");
		}
		if((day < 0) || (day > daysInMonths[month - 1] + ((isLeapYear(year) && month == 2) ? 1 : 0))){
			throw new IllegalArgumentException("Invalid Day!");
		}
		return true;
	}
	
	//Method valid only for Gregorian Calendar, since October 15, 1582
	public static int getDayOfWeek(int year, int month, int day) {
		 //isValidDate(year, month, day); // Throws exception if not valid
		 
		// Construct a Calendar instance with the given year, month and day
		 Calendar cal = new GregorianCalendar(year, month -1 , day);  // month is 0-based
		 
		// Get the day of the week number: 1 (Sunday) to 7 (Saturday)
		 int dayNumber = cal.get(Calendar.DAY_OF_WEEK);

		 // Print result
		 return dayNumber;
	}
	
	public MyDate nextDay(){
		int lastDay = daysInMonths[month - 1] + ((isLeapYear(year) && month == 2) ? 1 : 0);
		
		// is the last day of December (31)?
		if (lastDay == day && 12 == month) {
			setDate(year + 1, 1, 1);
			return this;
		}
		
		// is the last day of any month (except December)?
		if (lastDay == day) {
			setDate(year, month + 1, 1);
			return this;
		}
		
		//increase the day by 1 (except the last day of any month)
		setDate(year, month, day + 1); 
		return this;
	}
	
	public MyDate nextMonth(){
		// is the last Month(December)?
		if (12 == month) {
			setDate(year + 1, 1, day);
			return this;
		}
		// check the last day of the Month and the Leap Year
		int lastDayOfNextMonth = daysInMonths[month] + ((isLeapYear(year) && month == 1) ? 1 : 0);
		
		if (day > lastDayOfNextMonth) { // if this
			setDate(year, month + 1, lastDayOfNextMonth);
		} else {
			setDate(year, month + 1, day);
		}
		return this;
	}
	
	public MyDate nextYear(){
		setDate(year + 1, month, day);
		return this;
	}
	
	public MyDate previousDay(){
		if(day == 1 && month == 1){
			setDate(year -1, 12, 31);
			return this;
		}
		// month > = 2
		if (day == 1){
			setDate(year, month - 1, daysInMonths[month - 2] + ((isLeapYear(year) && month == 3) ? 1 : 0));
			return this;
		}
		setDate(year, month, day - 1);
		return this;
	}
	
	public MyDate previousMonth(){
		if (1 == month) {
			setDate(year - 1, 12, 31);
			return this;
		}
		// is Leap Year?
		int lastDayOfPrevtMonth = daysInMonths[month - 2] + ((isLeapYear(year) && month == 3) ? 1 : 0);
		if (day > lastDayOfPrevtMonth) { // if this
			setDate(year, month - 1, lastDayOfPrevtMonth);
		} else {
			setDate(year, month - 1, day);
		}
		return this;
	}
	
	public MyDate previousYear(){
		if (isLeapYear(year) && day == 29){
			setDate(year - 1, month, day-1);
		}else{
			setDate(year - 1, month, day);
		}
		return this;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setDate(int year, int month, int day){
		if (isValidDate(year, month, day)) {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
	}
	
	public String toString() {
		int index = getDayOfWeek(year, month, day);
		return String.format("%1$s %2$d %3$s %4$04d", strDays[index-1], day, strMonths[month - 1], year);
	}
}