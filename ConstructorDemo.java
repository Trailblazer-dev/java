public class ConstructorDemo {
    private int value;

    // Default constructor (no parameters)
    public ConstructorDemo() {
        value = 0; // Default initialization
    }

    // Parameterized constructor (one parameter)
    public ConstructorDemo(int val) {
        value = val; // Initialize with the provided value
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Creating objects using default constructor
        ConstructorDemo obj1 = new ConstructorDemo();

        // Creating objects using parameterized constructor
        ConstructorDemo obj2 = new ConstructorDemo(42);

        // Display values
        System.out.println("Object 1 (Default Constructor):");
        obj1.displayValue();

        System.out.println("Object 2 (Parameterized Constructor):");
        obj2.displayValue();
    }
}
