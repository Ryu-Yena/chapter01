package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1;
		
		//메시지 출력, dan값 입력

		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
		dan = sc.nextInt();
		
		while(i<10) {
			//구구단 출력 코드

			System.out.println(dan+" * "+ i + "=" + dan*i);
			
			i++;
		}
		
		
		
		sc.close();
	}

}
