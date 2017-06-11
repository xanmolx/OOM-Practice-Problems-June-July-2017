import java.util.*;

class Student{
	Scanner sc = new Scanner(System.in);

	private int rollNo;
	private String name;
	private int age;

	void GetData(){
		System.out.println("Enter the RollNo: ");
		rollNo = sc.nextInt();
		System.out.println("Enter the name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}

	void SetData(){
		System.out.print("RollNo: "+rollNo+" Name: "+name+" Age: "+age);

	}
}
