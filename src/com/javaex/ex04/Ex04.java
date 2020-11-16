package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		int i;
		int t=0;
		
		for(i=1;i<=10;i++) {
			t= i+t;
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+t+"입니다.");

	}

}
