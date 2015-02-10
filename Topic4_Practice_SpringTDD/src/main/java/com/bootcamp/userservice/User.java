package com.bootcamp.userservice;


public class User {
	private int userId;
	private String name;
	private String mail;
	private int age;

	public User(int userId, String name, String mail, int age) {
		this.userId = userId;
		this.name = name;
		this.mail = mail;
		this.age = age;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void UploadPhoto() {

	}

	@Override
	public String toString() {
		return (name + " " + mail + " " + age);
	}
}
