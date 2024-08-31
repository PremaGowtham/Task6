package task6;

public class Question2 {

	public static void main(String[] args) {
		   // Create an Employee object using the parameterized constructor
        Employee emp = new Employee(1, "Hari", "Krish", 5000);

        // Display initial details
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        // Raise the salary by 10%
        emp.raiseSalary(10);

        // Display updated details
        System.out.println("Updated Monthly Salary: " + emp.getSalary());
        System.out.println("Updated Annual Salary: " + emp.getAnnualSalary());
    }
}