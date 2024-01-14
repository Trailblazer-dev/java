 class Student{
    private int age;
    /*public int getage(){
        return this.age;
    }
    public int setage(int age){
        return this.age = age;
    }*/
    void showRec(){
        System.out.println(age);
    }
    void secRec(int a){
        age = a;
    }
}

public class  Students{
    public static void main(String[]args){
        Student s = new Student();
        s.secRec(20);
        s.showRec();
    }

    
}
