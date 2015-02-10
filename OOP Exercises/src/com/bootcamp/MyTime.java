package com.bootcamp;

public class MyTime{
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public MyTime(int h, int m, int s){
		setTime(h, m, s);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23){
			throw new IllegalArgumentException("Hour's value must be an integer number between 0 and 23.\n Parameter passed:"
					+ hour);
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59){
			throw new IllegalArgumentException("Minute's value must be an integer number between 0 and 59.\n Parameter passed:"
					+ minute);
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59){
			throw new IllegalArgumentException("Second's value must be an integer number between 0 and 59.\n Parameter passed:" + second);
		}
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public String toString(){
		return hour +":" + minute + ":" + second;
	}
	
	public void nextHour(){
		if(hour == 23){
			setHour(0);
		}else{
			setHour(hour+1);
		}
	}
	
	public void nextMinute(){
		if(minute == 59){
			setMinute(0);
		}else{
			setMinute(minute+1);
		}
	}
	
	public void nextSecond(){
		if(second == 59){
			setSecond(0);
		}else{
			setSecond(second+1);
		}
	}
	
	public void previousHour(){
		if(hour == 0){
			setHour(23);
		}else{
			setHour(hour-1);
		}
	}
	
	public void previousMinute(){
		if(minute == 0){
			setMinute(59);
		}else{
			setMinute(minute-1);
		}
	}
	
	public void previousSecond(){
		if(second == 0){
			setSecond(59);
		}else{
			setSecond(second-1);
		}
	}
}