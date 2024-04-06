package Challenge14;
import java.util.*;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Fahrenheit To Celsius Calculator ");
		
		System.out.print("Please enter value in Fahrenheit :");
		int F = sc.nextInt();
		
		int Celsius = (F - 32) * 5/9 ;
		
		System.out.println("Value in Celsius is  " + Celsius + " C");
		
	}

	
}