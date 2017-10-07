/* HelloWorld.java
 */
import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args) {
		System.out.println("Hello Earthling! \nWelcome to Reilly and Geoff's and Lason's change calculator.");

		// Opens a scanner which will be used to get the value the user types into the command line
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number and hit Enter\n");

		// here is where we get the number that the user types in
		int i = sc.nextInt();

		// here is where we figure out how many of each coin is included.		
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;
		int quarters = (i/q);
		int dimes = (i - quarters*q)/d;
		int nickels = (i - quarters*q - dimes*d)/n;
		int pennies = (i - quarters*q - dimes*d - nickels*n)/p;
		System.out.println ("Your amount contain the following");
		System.out.println ("Quarters: " + quarters);
		System.out.println ("Dimes: " + dimes);
		System.out.println ("Nickels: " + nickels);
		System.out.println ("Pennies: " + pennies);  
	}
}