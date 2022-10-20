import java.lang.*;
import java.util.*;

class Account{
	
	int accountNumber;
	String holderName;
	double balance;
	
	Account(){
	
	}
	
	Account(int accountNumber, String holderName, double balance){
		
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void printDetails(){
		System.out.println("Your account number is : "+accountNumber);
		System.out.println("Account holder name is : "+holderName);
		System.out.println("Balance in the account : "+balance);
		
	}
	
}

class SavingAccount extends Account{
	
	double interestRate;
	
	SavingAccount(){
	
	}
	
	SavingAccount(int accountNumber, String holderName, double balance, double interestRate){
		
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	public void printDetails(){
		System.out.println("Your account number is : "+accountNumber);
		System.out.println("Account holder name is : "+holderName);
		System.out.println("Balance in the account : "+balance);
		
	}
	
	public void calculateYearlyInterest(){
		
		double totInterest = balance * interestRate;
		System.out.println("Yearly interest on saving account is : "+totInterest);
	}
	

}

class CurrentAccount extends Account{

	CurrentAccount(){
	
	}
	
	CurrentAccount(int accountNumber, String holderName, double balance){
		
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		
	}
	
	public void printDetails(){
	
		System.out.println("Your account number is : "+accountNumber);
		System.out.println("Account holder name is : "+holderName);
		System.out.println("Balance in the account : "+balance);
		
	}
}

class Manager{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of saving account you want to create : ");
		int sa = sc.nextInt();
		
		System.out.println("Enter the number of current account you want to create : ");
		int ca = sc.nextInt();
		
		for(int i = 0; i < 2; i++){
		
			System.out.print("Saving Account"+(i+1)+" ");

		}
		
		System.out.println();
		
		for(int j = 0; j < 3; j++){
				
			System.out.print("Current Account"+(j+1)+" ");
				
		}
		
		System.out.println();
		System.out.println("Enter the account name you want to know details : ");
		sc.nextLine();
		String s1 = sc.nextLine();

		if(s1.equals("Saving Account1")){
			
			SavingAccount sa1 = new SavingAccount(10001, "Omkar", 1000.0, 4);
			sa1.printDetails();
			sa1.calculateYearlyInterest();
				
		}
		else if(s1.equals("Saving Account2")){
		
			SavingAccount sa1 = new SavingAccount(20002, "Vishal", 2000.0, 6);
			sa1.printDetails();
			sa1.calculateYearlyInterest();
			
		}

		else if(s1.equals("Current Account1")){
				
			CurrentAccount ca1 = new CurrentAccount(30003, "Gaurav", 3000.0);
			ca1.printDetails();
				
		}
		
		else if(s1.equals("Current Account2")){
		
			CurrentAccount ca1 = new CurrentAccount(40004, "Kiran", 4000.0);
			ca1.printDetails();
				
		}
		else{
				
			CurrentAccount ca1 = new CurrentAccount(50005, "Shivam", 5000.0);
			ca1.printDetails();
			
		}
		
		
	}
}