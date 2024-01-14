public class Student {
    public static void main(String[] args) { // Add the correct main method signature
        Iam stud = new Iam();
        stud.insertRecords(20, "yourname");
        stud.display();
    }
}
class Iam {
    private int age;
    private String name;
    
    void insertRecords(int a, String n) {
        age = a;
        name = n;
    }
    
    void display() {
        System.out.println(age + " " + name);
    }
}