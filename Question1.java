package task6;

public class Question1 {

	public static void main(String[] args) {
		
		 // Creating an instance of Person
        Person person = new Person("Hari", 30);

        // Accessing attributes using getter methods
        System.out.println("Name: " + person.getName()); // Output: Name: Alice
        System.out.println("Age: " + person.getAge());   // Output: Age: 30
	}

}
