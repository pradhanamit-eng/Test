import java.util.Scanner;

public class Bank1 {
	String name;
	int amount;
	
	void openAccount() {
		
		Scanner s1=new Scanner(System.in); // int / float / doubles 
		Scanner s2=new Scanner(System.in); // nextLine
		
		
		System.out.print(" Enter Name of Account Holder :");
		name = s2.nextLine();
		
		System.out.println(" Deposit Amount :");
		amount = s1.nextInt();
		
		if(amount<500 || amount>10000 ) {
			
			System.out.println("Account Not Created ");
			
			System.out.println(" Enter Amount Between 500 and 10000");
			
			System.out.println("Input Details again");
			openAccount();
		}
		else {
			System.out.println("Account Created ");
		}
		
	}
	
	void deposit() {
		
		Scanner s3=new Scanner(System.in);
		
		System.out.print( "Input Amount to Deposit :");
		int depositamount = s3.nextInt();
		int x=amount+depositamount;
		System.out.println("Deposited Amount is"+depositamount);
		
		System.out.println("Total Amount in Account is :"+x);
			
	}
	
	void withdraw() {
		
		Scanner s4=new Scanner(System.in);
		
		System.out.print( "Input Amount to withdraw:");
		int withdrawamount = s4.nextInt();
		int y=amount-withdrawamount;
		System.out.println("Deposited Amount is"+withdrawamount);
		
		System.out.println("Total Amount in Account is :"+y);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Bank1 b1=new Bank1();
		
		b1.openAccount();
		b1.deposit();
		b1.withdraw();
	}
	
	
}
