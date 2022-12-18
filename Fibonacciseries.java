/**
 * 
 */
package com.logicprogram;

import java.util.Scanner;

/**

 *
 */
public class Fibonacciseries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=0,c=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number n: ");
		n=sc.nextInt();
		System.out.println("fibonacci series is: ");
		
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+ " ");
		}

	}

}
