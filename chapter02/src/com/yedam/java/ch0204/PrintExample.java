package com.yedam.java.ch0204;

public class PrintExample {

	public static void main(String[] args) {
		//System.out.println();
		System.out.println("Hello, World!");
		
		// System.out.print()
		System.out.print("Hello");
		System.out.print(", ");
		System.out.print("World");
		System.out.print("!\n");
		
		// 예시, 사원의 정보를 정해진 양식으로 출력
		// 이름: 홍길동, 나이: 32, 월급: 350.25
		
		
		System.out.printf("이름: %s, 나이: %d, 월급: %.2f", "홍길동",32,350.25);

	}

}
