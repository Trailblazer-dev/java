
class Practice {
    int age;
    String name;
    
    void insertRecords(int a, String n) {
        age = a;
        name = n;
    }
    
    void display() {
        System.out.println(age + " " + name);
    }
}

public class Student {
    public static void main(String[] args) { // Add the correct main method signature
        Practice stud = new Practice();
        stud.insertRecords(20, "yourname");
        stud.display();
    }
}
