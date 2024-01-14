public class Agregation {
    public static void main(String[]args){
        Address address = new Address("Nakuru","Njoro");
        Emp e = new Emp(30, "mary",address);
        e.show();
    }
    
}
class Address{
    String city;
    String street;
    public Address(String city, String street){
        this.city = city;
        this.street= street;  
    }
}
class Emp{
    int age;
    String name;
    Address address;
    public Emp(int age, String name,Address address){
        this.age = age;
        this.name= name;
        this.address = address;
    }
    public void show(){
        System.out.println(age+" "+ address.city+" "+address.street);
    }
}
