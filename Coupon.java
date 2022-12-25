package com.logicprogram;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to have distinct random number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int c;
			Random random=new Random();
			c=random.nextInt(10+1);
			a=c+a*10;
		}
        System.out.println(a);
	}

}
