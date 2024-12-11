public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values (overloaded method)
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two strings as numbers (overloaded method)
    public String add(String a, String b) {
        return a + b; // Concatenates the strings
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the first overloaded add method (int, int)
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));

        // Calling the second overloaded add method (int, int, int)
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));

        // Calling the third overloaded add method (double, double)
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));

        // Calling the fourth overloaded add method (String, String)
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!"));
    }
}
