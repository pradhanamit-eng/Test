import java.util.Scanner;

public class TimeLabs {
	static void fName() {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		
		long time1 = System.currentTimeMillis();
		System.out.print("Enter the First Name : ");
		String fname = s2.nextLine();
		//Time For Entering Fname
		
		long x = System.currentTimeMillis();
		long x1=x-time1;
		long x2=x1/1000;
		
		System.out.println("Time Taken to Input Fname is : "+x2);
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		
		//Time For Entering Fname
		fName();
		
		long time2 = System.currentTimeMillis();
		long time3 = System.currentTimeMillis();
		long time4 = System.currentTimeMillis();
		long time5 = System.currentTimeMillis();
		
		
		
		System.out.print("Enter the Last Name : ");
		String lname = s2.nextLine();
		
		//Time For Entering Lname
		
				long y = System.currentTimeMillis();
				long y1=y-time2;
				long y2=y1/1000;
				
				System.out.println("Time Taken to Input Fname is : "+y2);
		
		System.out.print("Enter the Email-ID : ");
		String email = s2.nextLine();
		
		//Time For Entering Email
		
				long z = System.currentTimeMillis();
				long z1=z-time3;
				long z2=z1/1000;
				
				System.out.println("Time Taken to Input Fname is : "+z2);
		
		System.out.print("Enter the Mobile Number  : ");
		long mobile = s1.nextLong();
		
		//Time For Entering Mobile
		
				long k = System.currentTimeMillis();
				long k1=k-time4;
				long k2=k1/1000;
				
				System.out.println("Time Taken to Input Fname is : "+k2);
		
		System.out.print("Enter City : ");
		String city = s2.nextLine();
		
		//Time For Entering City
		
				long c = System.currentTimeMillis();
				long c1=c-time5;
				long c2=c1/1000;
				
				System.out.println("Time Taken to Input Fname is : "+c2);
		
		
		
	}
}

