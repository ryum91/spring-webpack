package com.ryum.example.dto;

public class User {

	private int idx;
	private String name;
	private int age;
	private String phone;
	
	public User() {
		super();
	}

	public User(int idx, String name, int age, String phone) {
		this();
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
