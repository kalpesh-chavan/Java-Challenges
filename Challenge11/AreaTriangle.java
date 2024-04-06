package Challenge11;
import java.util.Scanner;


public class AreaTriangle {

	public static void main(String[] args) {
		
		System.out.println(" **Triangle area Calculator**");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter bredth of triangle :" );
		 double B = sc.nextInt();
		System.out.print("Please enter height of triangle :");
		 double  H = sc.nextInt();
		 
		 double Area = 0.5 * B * H ;
		 
		 System.out.println("Area of triangle is "+ Area);
		
	}
}
