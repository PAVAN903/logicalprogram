/**
 * 
 */
package com.logicprogram;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Stopwatch {
static long start;
static long stop;
static double time;
char a,b;
static Scanner sc=new Scanner(System.in)
;	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter key to start stopwatch");
 char a=sc.next().charAt(0);
 start=System.currentTimeMillis();
 System.out.println("enter key to stop the stopwatch");
 char b=sc.next().charAt(0);
 stop=System.currentTimeMillis();
 time=(stop-start)/1000.0;
 System.out.println(time);
	}

}
