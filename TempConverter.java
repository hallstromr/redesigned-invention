/* HelloWorld.java
 */
import java.util.Scanner;

public class TempConverter
{
	public static void main(String[] args) {
		System.out.println("Hello Earthling! \nWelcome to Reilly, Geoff, and Lason's temperature converter");

		// Opens a scanner which will be used to get the value the user types into the command line
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a temperature:\n");

		// here is where we get the number that the user types in
		String entry = sc.nextLine();
		int temp = Integer.parseInt(entry);

		System.out.print("Enter a temperature unit (F or C):\n");
		String unit = sc.nextLine();

		if (unit.equals("C")) {
			//convert to farenheit
		}
	}
}
