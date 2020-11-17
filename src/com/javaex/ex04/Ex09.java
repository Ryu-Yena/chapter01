package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		int i=1;
		int j;
		
		while(true) {
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			}
			i++;
		}
		
		
		//예제 2
		for(j=1; j<=100;j++) {
			if(j%6==0 && j%14==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
