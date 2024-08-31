package task6;

public class Question3 {

	public static void main(String[] args) {

		// Create a Circle object using the no-argument constructor
        Circle obj1 = new Circle();
        System.out.println("Default Circle Radius: " + obj1.getRadius());
        System.out.println("Default Circle Circumference: " + obj1.calculateCircumference());

        // Create a Circle object using the constructor with one argument
        Circle obj2 = new Circle(5.0);
        System.out.println("Custom Circle Radius: " + obj2.getRadius());
        System.out.println("Custom Circle Circumference: " + obj2.calculateCircumference());
    }
	}


