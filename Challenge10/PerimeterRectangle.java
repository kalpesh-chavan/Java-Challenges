package Challenge10;
import java.util.Scanner;

public class PerimeterRectangle {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Rectangle's Perimerer Calculator \n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter first side length :");
		 int A = sc.nextInt();
		System.out.print("Please enter second side length :");
		 int B = sc.nextInt();
		System.out.print("Please enter third side length :");
		 int C = sc.nextInt();
		System.out.print("Please enter forth side length : ");
		 int D = sc.nextInt();
		 
		 int Perimeter = A+B+C+D;
		 
		 System.out.println("\n Perimeter Of Rectangle Is "+ Perimeter);
		
		
		
	}

}
