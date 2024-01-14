 import java.util.Scanner;
class Weeks{
	private String[] weeks= {"Monday","Tuesday","Wenesday", "Thursday", "Friday", "Saturday","Sunday"};
public  void today(Scanner scanner){
	int day;
	for(day=1;day<=weeks.length;day++){
		System.out.println("Provide anynumber from 1 to 7 to know 'what day it is'");
		day = scanner.nextInt();
		scanner.nextLine();
		if( day<=7){
			System.out.println("Today is " +weeks[day-1]);
			break;
		}
		   else{
		System.out.println("CAUTION: The number should be less than 7 and ensure it is a positive number");
		}
	System.out.println("Try again please but remember to follow the instruction");
	}
}
}
class Loop01{
 	private String yourNames;
 	private int lang;
    public  void details(Scanner scanner){
	System.out.println("What is your name please?");
 	yourNames = scanner.nextLine();
	System.out.println("which language do you understand well\n1.English\n2.Kiswahili");
	System.out.println("reply with number 1 or2 ");
	lang = scanner.nextInt();
	scanner.nextLine();
	if(lang ==1){
	  System.out.println("That good below you will be required to input the number of the day of week to know what the day is ");
	}
	else if(lang ==2){
	  System.out.println("Asante sana, hapo chini  utastahili ueke nambari ya siku ya wiki iliyo leo  ilikujua ni siku gani tafadhali");
        }
     }
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	Weeks  contain = new Weeks();
 	Loop01 contain01 = new Loop01();
 	contain01.details(scanner);
	contain.today(scanner);
scanner.close();
}
}
