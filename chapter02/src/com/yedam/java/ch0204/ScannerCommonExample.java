package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScannerCommonExample {

	public static void main(String[] args) {
		// 표준입력장치(System.in/키보드)를 통해
		// 값을 읽어들이는 객체 +> Scanner
		Scanner scanner = new Scanner(System.in);
		
		//nextLine(); 줄 단위로 읽어들이는 메서드
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		
		System.out.println("프로그램 종료");
		scanner.close(); //객체 반환

	}

}
