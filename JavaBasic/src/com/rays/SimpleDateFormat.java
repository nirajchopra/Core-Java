package com.rays;

import java.util.Date;

public class SimpleDateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(d);
		System.out.println(s);
		
	}

	String format(Date d) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
