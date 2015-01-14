package com.bootcamp;

public class TestMyTime {
	public static void main(String[] args) {
		
		MyTime mytime = new MyTime(16,44,25);
		System.out.println(mytime);
		
		//Test increase Time
		mytime.nextSecond();
		System.out.println(mytime);
		mytime.nextMinute();
		System.out.println(mytime);
		mytime.nextHour();
		System.out.println(mytime);
		
		//Test Decrease Time
		mytime.previousSecond();
		System.out.println(mytime);
		mytime.previousMinute();
		System.out.println(mytime);
		mytime.previousHour();
		System.out.println(mytime);
		
		//Test increase time 23:59:59
		mytime = new MyTime(23,59,59);
		mytime.nextSecond();
		System.out.println(mytime);
		mytime.nextMinute();
		System.out.println(mytime);
		mytime.nextHour();
		System.out.println(mytime);
		
		//Test Decrease Time 00:00:00
		mytime.previousSecond();
		System.out.println(mytime);
		mytime.previousMinute();
		System.out.println(mytime);
		mytime.previousHour();
		System.out.println(mytime);
	}
}