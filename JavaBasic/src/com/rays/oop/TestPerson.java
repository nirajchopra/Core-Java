package com.rays.oop;

import java.util.Date;

import com.rays.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) {
		
	
	Person p = new Person();
	SimpleDateFormat sdf = new SimpleDateFormat();
	
    String name = p.getName();
    String address = p.getAddress();
    Date dob =  p.getDob();
    int AVG_AGE = p.getAvgAge();
    
    String s = "13-12-2002";
    Date d = (Date) sdf.parse(s);
    p.setName("Niraj Chopra");
    System.out.println(p.getName());
    p.setDob("13-12-2002");
    System.out.println(p.setDob());
    p.setAddress("Rahadkot");
    System.out.println(p.setAddress());

    
	
	
	}
  
	

}
