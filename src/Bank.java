import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Bank {
	String name;
	int amount;
	
	void openAccount(){
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" -------------------------BANK------------------- ");
		System.out.println("  ");
		System.out.println("--Enter Details-- ");
		System.out.print(" Enter Name of Account Holder : ");
		name = s1.nextLine();
		 
		System.out.print(" Deposit Amount to Open an Account : ");
		amount =s2.nextInt();
		
		if(amount<500 || amount>10000) {
			
			
			System.out.println(" Account Not Created ");
			System.out.println(" Amount should be 500 to 10000");
			System.out.println(" You have to input Again");
			openAccount();
			
		}
		else {
			System.out.println("  ");
			System.out.println(" -- Account Created :) :)-- ");
		}	
		
		System.out.println("  ");
	}
	
	void deposite() {
		
		System.out.println("------ Deposit------ ");
		Scanner s3=new Scanner(System.in);
		
		System.out.print(" Input Amount to Deposit :");
		int depositAmount = s3.nextInt();
		
		amount = amount + depositAmount;
		
		
		System.out.println(" You Deposited Amount is :"+depositAmount);
		System.out.println(" Your Avail Account balance is  :"+amount);
		System.out.println("  ");
	}
	
	void withdraw() {
		
		System.out.println("------ Withdraw------ ");
		Scanner s4=new Scanner(System.in);
		
		System.out.print(" Input Amount to Withdraw :");
		int withdrawAmount = s4.nextInt();
		
		amount = amount - withdrawAmount;
		
		System.out.println(" You Withdraw Amount is :"+ withdrawAmount);
		System.out.println(" Your Avail Account balance is   :"+amount);
		System.out.println("  ");
		
	}
	
	void checkBalance() {
		System.out.println("------ Balance Check------ ");
		System.out.println(" Your Account Balance is :"+amount);
		System.out.println("  ");
	}
	
	void fundTransfer() {
		
		System.out.println("------ Fund Transfer------ ");
		
		Scanner s5=new Scanner(System.in);
		System.out.print(" Enter Name to whome you Transfer Money :");
		String fr = s5.nextLine();
		
		
		Scanner s6=new Scanner(System.in);
		System.out.print(" Enter Amount to Transfer  :");
		int fundamount = s6.nextInt();
		
		if(fundamount>amount) {
			
			System.out.println(" Your Account Balance is :"+amount);
			System.out.println(" Enter proper Amount ");
			
			fundTransfer();
			
		}else {
			System.out.println("You have Transfer Amount of :"+fundamount+" to :"+fr);
			
			amount=amount - fundamount;
			System.out.println(" Your Avail Account balance is  :"+amount);
			
		}
		
		
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.openAccount();
		b.deposite();
		b.withdraw();
		b.checkBalance();
		b.fundTransfer();
	}

}
