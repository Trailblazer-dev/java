public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    public void checkBalance(){
      System.out.println("Hello!\n Your balance is " + balance );
    }
    //deposit method
    public void deposit(int amountToDeposit){
      balance +=amountToDeposit;
      System.out.println("You just deposited "+amountToDeposit);
    }
    //withdraw method
    public  int withdraw(int amountToWithdraw){
      balance -= amountToWithdraw;
      return amountToWithdraw;
    }
    public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      savings.checkBalance();
      //Withdrawing:
      savings.withdraw(300);
      
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
      //Check balance:
      savings.checkBalance();
      
      //Deposit:
      savings.deposit(600);
      
      //Check balance:
      savings.checkBalance();
      System.out.println("Your balance is"+ savings);
      
      
    }       
  }