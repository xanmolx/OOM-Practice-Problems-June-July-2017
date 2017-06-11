import java.util.*;

public class assignment1_question3 {
	public static void main(String[] args) {
		int inches, feet;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance: ");
		System.out.print("Feet: ");
		feet = sc.nextInt();
		System.out.print("Inches: ");
		inches = sc.nextInt();

		Distance a = new Distance(feet, inches);

		System.out.println("Enter the distance: ");
		System.out.print("Feet: ");
		feet = sc.nextInt();
		System.out.print("Inches: ");
		inches = sc.nextInt();

		Distance b = new Distance(feet, inches);

		Distance c = new Distance(feet, inches);
		System.out.println("Total Distance: ");
		System.out.print("Feet: " + c.feet);
		System.out.print(" Inches: " + c.inches);
	}
}
