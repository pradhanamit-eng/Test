import java.util.Random;
import java.util.Scanner;

public class RandomOtp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("------OTP GENERATOR--------");
		System.out.println("");
		System.out.println("Enter a Choise 5 to 10");
		int i1=s.nextInt();
		if(i1>=10)
		{
			System.out.println("Invalid Input");
		}
		else if(i1<5) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(i1);
		}
		Random r=new Random();
		if(i1==5) {
			int a1;
			for(a1=10000;a1<=99999;a1++) {}
			int a=r.nextInt(a1);
			
			System.out.println("5 Digit OTP Numbar Is:"+a);
			
		}
		else if(i1==6) {
			int a1;
			for(a1=100000;a1<=999999;a1++) {}
			int a=r.nextInt(a1);
			
			System.out.println("6 Digit OTP Numbar Is:"+a);
			
		}
		else if(i1==7) {
			int a1;
			for(a1=1000000;a1<=9999999;a1++) {}
			int a=r.nextInt(a1);
			
			System.out.println("7 Digit OTP Numbar Is:"+a);
			
		}
		else if(i1==8) {
			int a1;
			for(a1=10000000;a1<=99999999;a1++) {}
			int a=r.nextInt(a1);
			
			System.out.println("8 Digit OTP Numbar Is:"+a);
			
		}
		else if(i1==9) {
			int a1;
			for(a1=1000000000;a1<=999999999;a1++) {}
			int a=r.nextInt(a1);
			
			System.out.println("9 Digit OTP Numbar Is:"+a);
			
		}
		else if(i1==10) {
			System.out.println("Your Input Value 10 Can`t Create OTP It is Out of Range");
			
		}
		else {
			System.out.println("Enter a Valid Input");
		}
		
	}

}
