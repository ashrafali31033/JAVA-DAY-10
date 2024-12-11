class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String model, int year) {
        this.model = model; // 'this' keyword refers to the current object
        this.year = year;
    }

    // Method to display car details
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car car1 = new Car();
        car1.display(); // Output: Model: Unknown, Year: 0

        // Creating an object using the parameterized constructor
        Car car2 = new Car("Toyota", 2021);
        car2.display(); // Output: Model: Toyota, Year: 2021
    }
}