import java.util.Scanner;

public class IQ {

	// non static variable 
	int number;
	
	void input() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Input Number : ");
		number=s.nextInt();
		
		
		System.out.println(number);
		
		
	}
	
	void print() {
		
		
		
	}
	
	void checkSign() {
		
		if(number>=0){
			
			System.out.println("Input Value is +ve " );
			
			
		}
		else if(number == 0) {
			System.out.println(" Zero ");
		}
		else {
			
			System.out.println("Input Value is -Ve ");
		}
		
	}
	
	void inc() {
		
		number =number + 1;
		
		System.out.println(number);
		
		
		
		
	}
	
	void dic() {
		
		number =number - 1;
		
		System.out.println(number);
		
		 
	}
	
	public static void main(String[] args) {
		
		IQ iq=new IQ();
		
		
		iq.input();
		iq.checkSign();
		iq.inc();
		iq.dic();
	}
	
	
}
