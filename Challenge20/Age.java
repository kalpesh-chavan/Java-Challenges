package Challenge20;

import java.util.Scanner;

public class Age {
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	
	   System.out.print("Please enter your age : ");
	     int age = sc.nextInt();
	     
	   
	   if (age >= 60) {
		   System.out.println("You are senior citizen");
	   }else if (age >= 20) {
		   System.out.println("You are Adult");
	   }else if (age >= 13) {
		   System.out.println("you are Teenager");
	   }else {
		   System.out.println("You are Child");
	   }
	   
	   
}
}
