/**
 * 
 */
package com.logicprogram;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Primenumber {
	static int temp;
	static int num;
	static Scanner sc=new Scanner(System.in);
	private static boolean isPrime;
	 int lt;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the number");
        num=sc.nextInt();
    
	for(int i=2;(i)==num/2;i++) {
    	  temp=num%i;
    	  if(temp==0) {
    		  break;
    		  
    	  }
    	 
		if(isPrime) {
			System.out.println(num +"number is prime");
		}
			else
				System.out.println(num +"number is not prime");
			{
			}
		}
      }
	}


 