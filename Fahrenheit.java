package com.logicprogram;

import java.util.Scanner;

public class Fahrenheit {
	static double celcius(double fahrenheit) {
		return((fahrenheit-32)*5.0/9.0);
	}

	public static void main(String[] args) {
		double fahrenheit=0.0;
		double celcius=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value fahrenheit temparature:: ");
		fahrenheit=sc.nextDouble();
		celcius=celcius(fahrenheit);
		System.out.println("celcius temparature value is::" +celcius);
		sc.close();

	}

}
