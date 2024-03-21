package com.rays;

public class FindMissingNumber {
	public static void main(String args[]) {
		int a [] = {4, 8, 12, 16, 20};
		int b [] = {4, 8, 12, 16, 20, 24};
		
		int suma = 0;
		int sumb = 0;
		
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sumb = sumb + b[j];
		}
		System.out.println(sumb - suma);
	}

}
