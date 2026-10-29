package OOPS_CHAPTER;

// Demonstrates classes, objects, instance variables, and methods in Java.
public class OOPS1 {
    public static void main(String[] args) {

        // Create an object of the Car class.
        Car c1 = new Car();

        // Assign values to the object's instance variables.
        c1.color = "red";
        c1.brand = "Tata";

        // Display the car's brand and color.
        System.out.println(c1.brand);
        System.out.println(c1.color);

        // Call the drive() method using the object.
        c1.drive();
    }
}

// Car class acts as a blueprint for creating car objects.
class Car {
    // Instance variables represent the car's properties.
    String brand;
    String color;

    // Instance method represents the car's behavior.
    void drive() {
        System.out.println("Drive car carefully");
    }
}