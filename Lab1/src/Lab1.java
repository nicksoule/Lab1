import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double length;
		double width;
		double area;
		double perimeter;
		char userChar = 'Y'; // userChar assigned 'Y' to start while loop

		while ((userChar == 'Y') || (userChar == 'y')) {
			// get user input for length and width of room/rectangle
			System.out.println("Enter Length: ");
			length = scan.nextDouble();
			System.out.println("Enter Width: ");
			width = scan.nextDouble();

			perimeter = 2 * (length + width); // perimeter is 2(length + width)
			area = length * width; // area is length multiplied by width

			// output area and perimeter values
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);

			// ask user to continue. If 'Y' or 'y' the while loop will repeat
			System.out.println("Do you want to continue? Y/N");
			userChar = scan.next().charAt(0);
		}

		// if 'N' or 'n' the loop stops and prints "Goodbye."
		if ((userChar == 'N') || (userChar == 'n')) {
			System.out.println("Goodbye.");
		}

	}

}
