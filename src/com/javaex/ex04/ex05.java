package com.javaex.ex04;

public class ex05 {
	public static void main(String[] args) {
		int i;
		int sum =0;
		
		for(i=1;i<=10;i++) {
			sum = i+sum;
			System.out.println(i+" 까지의 합은 "+sum);
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+sum+"입니다.");
	}

}
