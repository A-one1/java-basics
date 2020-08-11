package comparator;

public class Employee {
	int employeeid;
	String name;
	float salary;
	
	
	public Employee(int employeeid, String name1, float salary) {
	
		this.employeeid = employeeid;
		this.name = name1;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}