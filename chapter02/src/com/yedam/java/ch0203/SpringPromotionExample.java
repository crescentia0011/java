package com.yedam.java.ch0203;

public class SpringPromotionExample {

	public static void main(String[] args) {
		String str1 = 1 + 2 + 3 + ""; // "6"
		String str2 = 1+ 2+ "3";	  // "33"
		String str3 = "1" + 2+ 3;	  // "123"
		String str4 = 1 + "2" + 3;	  // "123"
		String str5 = "1" + (2+ 3);	  // "15"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
	}

}
