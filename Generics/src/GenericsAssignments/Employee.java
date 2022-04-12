package GenericsAssignments;

import java.util.HashSet;
import java.util.Set;
public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String department;
	
	public void displayDetails() {
		
	}
	


	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	 



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> semp = new HashSet<Employee>();
		semp.add(new Employee(1,"Ram",45000,"a"));
		semp.add(new Employee(2,"Rak",75000,"c"));
		System.out.println(semp);

	}

}
