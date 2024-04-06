package Challenge16;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Even Odd identifier \n");
		
		System.out.print("Please enter the number : ");
			int num = sc.nextInt();
		
		
		
		if (num % 2 == 0) {
			System.out.println("\n Given number is Even");
		}
		else {
			System.out.println("\n Given number is Odd");
		}
	}

}
