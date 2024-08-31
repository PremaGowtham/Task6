package task6;

public class Circle {
	
	 // Data member for the radius of the circle
    private double radius;

    // No-argument constructor that sets radius to a default value (e.g., 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with one argument to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
