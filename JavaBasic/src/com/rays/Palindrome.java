package com.rays;

public class Palindrome {
	public static void main(String args[]) {
		int num = 1234321;
		int num2 = num;
		int rev = 0;
		while(num2 != 0) {
			int r = num %10;
			rev = rev * 10 + r;
			num = num/10; 			
		}
		System.out.println(rev);
		if (rev==num) {
			System .out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
