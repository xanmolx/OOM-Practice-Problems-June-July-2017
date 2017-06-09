import java.util.*;

public class Question1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print ( "Enter name: ");
        String name = sc.nextLine();
        System.out.print ( "Enter salary: ");
        int salary = sc.nextInt();
        System.out.print ( "Enter years: ");
        int years = sc.nextInt();

        Employee employee = new Employee(name,salary,years);
        System.out.println("Congratulations ! Your salary bonus is Rs s"+employee.calculateBonus()+".");
	}
}
