class Box {
    // Data members
    double length,width;
    double height;

    // Constructor to initialize the Box object
    public Box(double length, double width, double height) {
        this.length = length;this.width = width;
        this.height = height;
    }

    // Method to calculate and return the volume of the box
    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create two Box objects and initialize them with values
        Box box1 = new Box(5.0, 3.0, 2.0);
        Box box2 = new Box(4.0, 4.0, 4.0);

        // Calculate and display the volume of the first box using the method
     
        System.out.println("Volume of Box 1: " + box1.calculateVolume());

        // Calculate and display the volume of the second box using the method
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
    }
}
