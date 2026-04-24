package com.yedam.java.ch0203;

public class IntegerOperationExample {

	public static void main(String[] args) {
		// 정수 연산
		
		// 1) int 보다 밑의 타입 => int로 자동 타입 변환
		byte x = 30;
		byte y = 50;
		// byte z = x + y;
		int z = x + y;
		
		// 2) long이 포함될 경우 => long으로 자동 타입 변환
		int a = 100;
		long b = 150L;
		long c = a + b;

	}

}
