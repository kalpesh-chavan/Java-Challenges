package Challenge13;
import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Compound Interest Calculator");
		
		System.out.print("Please enter principal in rupees :");
		   float Principal  = sc.nextFloat();
		   
		System.out.print("Please enter rate of interest in percentage :");
		   float Rate = sc.nextFloat();
		   
		System.out.print("Please enter Tenure in years :");
		   float Time = sc.nextFloat();
		   
		  
		double CI = Principal * Math.(1 + Rate/100) * years ;   //incomplete
		   
	   
		
	}

	
}

