package task6;

public class Employee {

	 // Data members for the Employee class
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // No-argument constructor
    public Employee() {
        this.id = 0;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with parameters
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Method to raise the salary by a specific percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increase = salary * (percent / 100);
            salary += increase;
            System.out.println("Salary increased by " + percent + "%");
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Method to get the annual salary
    public double getAnnualSalary() {
        return salary * 12; // Assuming monthly salary
    }
}
