package Challenge17;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to number comparator \n");
		
		System.out.print("Please enter the first number :");
		  int num1 = sc.nextInt();
		  
		System.out.print("Please enter the second number :");
		  int num2 = sc.nextInt();
		  
		System.out.print("Please enter the third number : ");
		  int num3 = sc.nextInt();
		  
		
		if (num1 > num2 && num1 > num3) {
		 System.out.println("Greatest number is " + num1);
		}else if (num2 > num1 && num2 > num3) {
         System.out.println("Greatest number is " + num2);
		}else {
			System.out.println("Greatest number is " + num3);
		}
}
}
