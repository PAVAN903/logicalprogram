package com.logicprogram;


	

	import java.util.Scanner;

	public class Uc1_vendingmachine {
		public static int amount() {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter total amount:");
			int totalamount=sc.nextInt();
			return totalamount;
		}

		
		public static void countnote(int amount)
		{
			int[] notes = new int[]{ 1000, 500, 100, 50, 20, 10, 5, 1 };
			int[] noteCounter = new int[8];
		
			
			for (int i = 0; i < 8; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount % notes[i];
				}
			}
		
			// Print notes
			System.out.println("Currency Count ->");
			for (int i = 0; i < 8; i++) {
				if (noteCounter[i] != 0) {
					System.out.println(notes[i] + " : "
						+ noteCounter[i]);
				}
			}
		}
		
		
		public static void main(String argc[]){
			countnote(amount());


		}


		
			
		}


		



