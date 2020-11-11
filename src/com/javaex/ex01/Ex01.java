package com.javaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		int myAge ;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		//정수항
		//자료형 int를 정확하게 써야한다.
		int ver01 =3;
		double ver02 = -3.4;
		
		//메모리 크기에 맞게 작성
		int ver03 = 12345678;
		long ver06 = 12345678;
		
		//long형
		int ver07 = 2147; //int의 범위를 초과
		long ver08 = 2147483648l; //long형에 대입 안됨 >> 기호 l 을 붙여야함.
		int ver09 = 2147483647;
		long ver10 = 2147483647; //long은 int를 기준으로 하지만 끝에 무조건 l을 붙이면 오류날 확률이 줄어든다.
	}
}
