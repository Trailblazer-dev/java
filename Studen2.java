public class Studen2 {
    public static void main(String[]args){
        Persona_Details stud = new Persona_Details();
        stud.setage(20);//Here I am assigning values to the variables
        stud.setname("Peak Blinders");
        System.out.println(stud.getage()+" "+ stud.getname());
    }
    
}
class Persona_Details{
    private int age;
    private String name;
    //since the above variable are private meaning they can't be accessed from outside the class I have created public methods get and setter
    public int getage(){
        return age;
    }
    public int setage(int age){
        return this.age = age;
    }
    public String getname(){
        return name;
    }
    public String setname(String name){
        return this.name= name;
    }
}