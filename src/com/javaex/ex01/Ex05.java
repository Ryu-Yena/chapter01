package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] agrs) {
		
		final double pi = 3.14;
		
		//일반적인 경우
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//파이값을 변경하는 경우
		/* pi = 3.141519; */
		double result02 = pi*5*5;
		
		System.out.println(result02);
		System.out.println(pi);
		
		//상수정의
		final double PI = 3.14;
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
	}
}
