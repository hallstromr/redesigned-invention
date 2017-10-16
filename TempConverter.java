/*
HelloWorld.java
 */
import java.util.Scanner;

public class TempConverter
{
	public static void main(String[] args) {
		System.out.println("Hello Earthling! \nWelcome to Reilly, Geoff, and Lason's temperature converter");

		// Opens a scanner which will be used to get the value the user types into the command line
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a temperature:");

		// here is where we get the number that the user types in
		String entry = sc.nextLine();
		int temp = Integer.parseInt(entry);

		System.out.println("Enter a temperature unit (F or C):");
		String unit = sc.nextLine();

		double convertedTemp = 0.00;
		boolean tempIsConverted = false;
		boolean fahrenheit = false;
		boolean celsius = false;

		if (unit.equals("C")) {
			convertedTemp = (temp*1.8)+32;
			tempIsConverted = true;
			celsius = true;
		}
		else if (unit.equals("F")) {
			convertedTemp = (temp-32)/1.8;
			tempIsConverted = true;
			fahrenheit = true;
		}
		else {
			System.out.println("Only able to use F or C");
		}
		if (tempIsConverted && fahrenheit) {
			System.out.println("The Converted Temp is: " + convertedTemp + " Celsius");
		}
		if (tempIsConverted && celsius) {
			System.out.println("The Converted Temp is: " + convertedTemp + " Fahrenheit");
		}
	}
}
