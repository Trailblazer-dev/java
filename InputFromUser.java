import java.util.Scanner;
class PersonalDetails{
    protected String firstName;
    protected String lastName;
    protected int age;
    public  void whoamI (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your firstName");
        this.firstName = scanner.nextLine();
        System.out.println("what is your lastname");
        this.lastName = scanner.nextLine();
        System.out.println("What is your age");
        this.age = scanner.nextInt();
        System.out.println("Thanks for your cooperation");
        scanner.close();
    }
}
public class InputFromUser {
    public static void main(String[]arg){
    PersonalDetails details = new PersonalDetails();
    details.whoamI();
    }
    
    
}
