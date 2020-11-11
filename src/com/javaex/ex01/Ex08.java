package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		int a=7;
		int b=2;
		
		//부호연산자
		int ver01 = -3;
		System.out.println(ver01);
		System.out.println(-ver01);
		System.out.println(+ver01);
		System.out.println("========");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); // 실제 변수 a값이 변경된다. 7-->8 출력
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); //실제 변수 b값이 변경된다. 2-->1 출력
		System.out.println(b);
		
		System.out.println("========");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("========");
		
		
	}

}
