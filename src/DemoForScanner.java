import java.util.Scanner;

public class DemoForScanner {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		 Scanner s =new Scanner(System.in);
		 
		 System.out.println("-------Operation--------");
		 System.out.println("Input  a Float Num");
		 Float f1=s.nextFloat();
		 System.out.println("Input a Float Num Again ");
		 Float  f2=s.nextFloat();
		 
		 
		 System.out.println("Input a Choice 1=Addition,2=Subtraction,3=Multiplication,4=Division,5=Max,6=Min");
		 int i=s.nextInt();
		 
		 
		 System.out.println(f1);
		 System.out.println(f2);
		 if( i==1) {
			 Float f=f1+f2;
			 System.out.println(f);
			 
		 }
		 else if( i==2) {
			 Float f=f1-f2;
			 System.out.println(f);
			 
		 }
		 else if( i==3) {
			 Float f=f1*f2;
			 System.out.println(f);
			 
		 }
		 else if( i==4) {
			 Float f=f1/f2;
			 System.out.println(f);
			 
		 }
		 else if( i==5) {
			 if(f1>f2) {
				 System.out.println("Num1 is Maximum");
			 }
			 else if(f2>f1) {
				 System.out.println("Num2 is Maximum");
			 }
			 else
			 {
				 
			 }
			 
		 }
		 else if( i==6) {
			 if(f1<f2) {
				 System.out.println("Num1 is Minimum");
			 }
			 else if(f2<f1) {
				 System.out.println("Num2 is Minimum");
			 }
			 else
			 {
				 
			 }
			 
		 }
		 else
		 {
			 System.out.println("Enter a Valid Input for Operation");
		 }
	}

}
