public class Trail01 {
    int age =12;
    String name= "Tony";
    //constructor
    //name = class name
   public Trail01(int age, String name){
    this.age = age;
    this.name = name;
    //has no return type
   } 
   public void ouputK(){
    System.out.println(age + " "+ name);
   }
   public String Noela(String carname){
    return "my car is " + carname;
   }
   public static void main(String[]args){
    Trail01 details = new Trail01(12, "tony");
    //System.out.println(details.age+" "+ details.name);
    System.out.println(details.Noela("bmw"));
   }
    
}
/* funtion <--returtype(String, int , double-->/void <nameofFunction> (parameter(eg. int name,String name)){
code
return 
}
When calling the funtion
funtionName(8,"name")
function void < nameofFUnction> (){
    code
}
*/