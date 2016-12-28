package com.trantor.leavesys.test;

import java.util.Calendar;
import java.util.Date;

public class Student {
	private String name;
	private Date date;
	private int id=0;
	private static int count = 0;
	public Student(String name, Date date) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.date = date;
		id = ++count;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public Date getDate() {
		return date;
	}
	public String toString() {
		return "Student ::: "+name+" --- date :::"+date+" ;;; id::"+id;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Rajni", createDate(1993, 9, 24));
		Student s2 = new Student("Sachin", createDate(1991, 11, 27));
		System.out.println("Student 1:::"+s1);
		System.out.println("Student 2:::"+s2);
		Date d1 = s1.getDate();
		d1.setTime(System.currentTimeMillis());
		System.out.println("Now object becomes :::: "+s1);
		
		int id = s1.getId();
		id = 2111;
		System.out.println(id);
		System.out.println(s1);
	}
	
	public static Date createDate(int year,int month,int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		Date date = cal.getTime();
		return date;
	}
}
