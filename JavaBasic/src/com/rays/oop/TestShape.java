package com.rays.oop;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.setColor("Purple");
		s.setBordorWidth(23);
		
		int bordorW = s.getBordorWidth();
		String Color  = s.getColor();
		
		System.out.println(bordorW);
		System.out.println(Color);
	}

}
