package Challenge09;

import java.util.Scanner;

public class FloatMultiplication {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to multiplication of floating numbers");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter first float number : ");
		
		float a = sc.nextFloat();
		
		System.out.print("Please enter second float number : ");
		
		float b = sc.nextFloat();
		
		
		float Result = a * b ;
		
		System.out.println("Multiplication of two float number is "+ Result);
	}

}
