public class Employee{
	String name;
	int salary;
	int years;
	double bonus;

	public Employee(String name, int salary, int years){
		this.name = name;
		this.salary = salary;
		this.years = years;
	}

	public double calculateBonus()
	{
		if(this.years<5)
		{
			bonus = this.salary*0.01;
			return bonus;
		}
		else 
		{
			bonus = this.salary*0.02;
			return bonus;
		}
	}
}
