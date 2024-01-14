import java.util.Scanner;
class Mydetails{
	private String firstname;
	private String lastname;
	private int age;
       private	Scanner scanner = new Scanner(System.in);

public void setdetails(){
        System.out.println("What is your firstname?");
	this.firstname = scanner.nextLine();
	System.out.println("What is your lastname?");
	this.lastname = scanner.nextLine();
	System.out.println("what is your age?");
	this.age = scanner.nextInt();
}
public void getdetails(){
	System.out.println("Hello " + firstname + " " + lastname);
	System.out.println("is your age "+age+" ?\n if yes input true else input false");
	boolean setage = scanner.nextBoolean();
	if(setage==true){
	System.out.println( "ok, thanks for confirming");
	}
	else{
	System.out.println( "restart the program to insert the correct age");
	}
	scanner.close();
}
}
class Input{
public static void main(String[]arg){
	Mydetails details = new Mydetails();
 	details.setdetails();
	details.getdetails();
}
}

