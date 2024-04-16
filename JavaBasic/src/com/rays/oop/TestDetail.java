package com.rays.oop;

public class TestDetail {
	public static void main(String[] args) {
		Detail de = new Detail();
		de.setAddress("Rahadkot");
		de.setName("Niraj");
		de.setContact(830544348);
		de.setAVG_AGE(21);
		
		System.out.println(de.getName());
		System.out.println(de.getAddress());
		System.out.println(de.getContact());
		System.out.println(de.getAVG_AGE());
	}

}
