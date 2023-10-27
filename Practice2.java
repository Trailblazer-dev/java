class Student{
    int age;
    String name;
    Student(int a,String n){
        age = a;
        name = n;
    }
    void displayRecord(){
        System.out.println(age+" " + name);
    }
}
public class Practice2 {
    public static void main(String[]args){
        Student stud = new Student(20,"Mary");
        stud.displayRecord();
    }
}
