package Challenge08;

import java.util.Scanner;

public class ArithmaticOperators {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to arithmatic calculator");
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter first number : ");
		
		int a = sc.nextInt();
		
		System.out.print("Please enter second number : ");
		
		int b = sc.nextInt();
		

		
		int AddResult = a + b ;
		int subResult = a - b ;
		int MulResult = a * b ;
		int DivResult = a / b ;
		int ModResult = a % b ;
		
		System.out.println("Addition is " + AddResult);
		System.out.println("Substraction is " + subResult);
		System.out.println("multiplication is " + MulResult);
		System.out.println("division is " + DivResult);
		System.out.println("modulus/Remander is " + ModResult);
		
		
		
	
		
				
	}

}
