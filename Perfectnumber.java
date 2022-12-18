/**
 * 
 */
package com.logicprogram;

import java.util.Scanner;

/**
 *
 *
 */
public class Perfectnumber {
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int 	n,sum=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  n=sc.nextInt();
		  int i=1;
		  while(i<=n%2) {
			  if(n%i==0) {
				  sum+=i;
				  
				  if(sum==n) {
					  System.out.println(n+ "is a perfect number");
				  }
				  else
				  {
					  System.out.println(n+ "not perfect number");
				  }
			  }
		  }
	}

}
