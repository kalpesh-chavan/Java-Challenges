package Challenge12;
import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Simple Interest Calculator");
		
		System.out.print("Please enter principal in rupees :");
		   double P = sc.nextDouble();
		System.out.print("Please enter rate of interest in percentage :");
		   double R = sc.nextDouble();
		System.out.print("Please enter Tenure in years :");
		   double T = sc.nextDouble();
		   
	    Double SI = (P * T * R)/100 ;
	    
	    System.out.println("\n Simple interest is " + SI);
		
		
	}

}
