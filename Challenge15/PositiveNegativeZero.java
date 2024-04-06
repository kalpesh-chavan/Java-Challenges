package Challenge15;


import java.util.Scanner;

public class PositiveNegativeZero {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to number identifier \n");
		
		System.out.println("Please enter the number : ");
		int number = sc.nextInt();
		
		
		if (number > 0) {
		System.out.println("Given number is positive");
	    }
		else if (number < 0) {
			System.out.println("Given number is negative");
		}
		else{
			System.out.println("Given number is zero");
		}
}
}
