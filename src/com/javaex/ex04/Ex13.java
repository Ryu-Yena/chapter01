package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		do {
			num = sc.nextInt();
			sum = num + sum;
			System.out.println("합계: "+sum);
		}while(num !=0);
		System.out.println("종료");
		
		sc.close();

	}

}
