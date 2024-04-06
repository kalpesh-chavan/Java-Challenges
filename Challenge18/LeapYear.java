package Challenge18;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Welcome to leap year identifier \n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the year : ");
		 int year = sc.nextInt();
		 
		 
		 if (year % 4 ==0 && year %100 != 0 || year % 400 ==0) {
			 System.out.println("Given year is leap year");
		 }else {
			 System.out.println("Given year is not leap year");
		 }
		 
		 
	}
}
