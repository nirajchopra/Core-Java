package com.rays;

import java.util.Arrays;

public class Anagram{
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 =  "silent";
		char str;
		
		char[] ch = str1.toCharArray();
		char[] ch1 = str2.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			for (int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
				str=ch[i];
				ch[i]=ch[j];
				ch[j]=str;
			}
			}
		}
				for (int a=0; a<ch1.length; a++) {
					for (int b=a+1; b<ch1.length; b++) {
						if(ch1[a]>ch1[b]) {
						str=ch1[a];
						ch1[a]=ch1[b];
						ch1[b]=str;
			
		}
		
		
	}
					
}
				boolean result = Arrays.equals(ch, ch1);
				if(result == true) {
					System.out.println("Anagram");
				} else {
					System.out.println("Not Anagram");
				}
			}

}
