package com.rays;

public class RemoveDuplicateCharInString {
	public static void main(String[] args) {
		String name1 = "Chopra";
		String name = name1.toLowerCase();
		for (int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			int dup = name.indexOf(ch,i+1);
			if(dup==-1) {
				System.out.println(ch);
			}
		}
		char[] ch1 = name.toCharArray();
		for (int ascii:ch1) {
			System.out.println(ch1);
		}
	}

}
