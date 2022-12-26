package com.logicprogram;

import java.util.Scanner;

public class Celcius {
	static double fahrenheit(double celcius) {
		return((celcius*9.0/5.0)+32);
	}

	public static void main(String[] args) {
		double celcius=0.0;
		double fahreheit=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of temparature::");
		celcius=sc.nextDouble();
		fahreheit=fahrenheit(celcius);
		System.out.println("fahrenheit value is::" +fahreheit);
        sc.close();
	}

}
