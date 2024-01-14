public class Practice2 {
    public static void main(String[]args){
        StudentDetails stud = new StudentDetails(20,"Mary");
        stud.displayRecord();
        //when calling a void method there is no need to calling it inside the sout since the method has already a sout keyword
        
    }
}
class StudentDetails{
    int age;
    String name;
    StudentDetails(int a,String n){
        age = a;
        name = n;
    }
    void displayRecord(){
        System.out.println(age+" " + name);
    }
}