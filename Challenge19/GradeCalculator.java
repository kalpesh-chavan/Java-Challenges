package Challenge19;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to grade calculator");
		
		System.out.print("Please enter the percentage marks : ");
		 int mark = sc.nextInt();
		 
		 
		 if (mark >= 90 ) {
			 System.out.print("your grade is A");
		 }else if (mark >= 75) {
			 System.out.print("your grade is B");
		 }else if(mark >= 60) {
			 System.out.print("your grade is C");
		 }else if (mark >= 30) {
			 System.out.print("your grade is D");
		 }else {
			 System.out.print("you fail the test");
		 }
	}

}
