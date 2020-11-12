package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		int money, overtime;
		int unit = 10000;
		
		if(time<=8){
			money = time*unit;
			System.out.println("임금은 "+money+"원 입니다.");
		}else if(time>8) {
			
			overtime = time - 8;
			
			//money = (time-overtime)*unit + (overtime*12000);
			money = (int)((time-overtime)*unit + overtime*(unit*1.5));
			System.out.println("임금은 "+ money +"원 입니다.");
		}
		sc.close();
	}

}
