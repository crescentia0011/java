package com.yedam.java.ch0203;

public class NumberOperationExample {
	
	public static void main(String[] args) {
		// 실수 연산
		// double을 기준으로 자동 타입 변환
		float v1 = 0.12F;
		double v2 = 0.1;
		double v3 = v1 + v2;
		
		int x = 5;
		int y = 2;
		double z = (double)x/y;
		
		System.out.println(z);
	}
}
