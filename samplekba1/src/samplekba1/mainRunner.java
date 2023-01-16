package samplekba1;

public class mainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		String[] lastName = { "Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr" };

		String[] department = { "production", "r&d", "sales", "marketing", "human resources", "accounting", "sales",
		"r&d" };

		Employee aNewEmployee = new Employee("Li", "Chen", "Java");
		System.out.println(aNewEmployee.toString());


		System.out.println(Employee.addEmployees(firstName, lastName, department));
	}



}


