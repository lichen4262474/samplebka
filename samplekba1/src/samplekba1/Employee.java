package samplekba1;

import java.util.ArrayList;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;

	Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}// close constructor

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + " " + this.getDepartment();
	}

	public static ArrayList<Employee> addEmployees(String[] first, String[] last, String[] department) {

		ArrayList<Employee> employees = new ArrayList<>();
		for (int i = 0; i < first.length; i++) {
			Employee temp = new Employee(first[i], last[i], department[i]);
			employees.add(temp);
		}

		return employees;
	}

}// close class
