package Challenge05;

import java.util.Scanner;

public class UserAddition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter First Value: ");
		
		int value1 = sc.nextInt();
		
		System.out.print("Please Enter Second value: ");
		
		int value2 = sc.nextInt();
		
		int result = value1 + value2;
		
		System.out.println("Addition of two value is  " + result);
		
		
		
	}

}
