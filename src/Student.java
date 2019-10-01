import java.util.Scanner;

public class Student {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("----------Student Record-----------");
		System.out.println("Enter Student Name");
		
		String q=s.next();
		System.out.println("Enter Marks of Hindi");
		int i1=s.nextInt();
			if(i1 > 100)
		       {  
				  i1=0;
		         System.out.println(i1);
		       }
			else if(i1<0) {
				i1=0;
		         System.out.println(i1);
			}
			else {
				
			}
		System.out.println("Enter Marks of English");
		int i2=s.nextInt();
		if(i2 > 100)
	       {  
			  i2=0;
	         System.out.println(i2);
	       }
		else if(i2<0) {
			i2=0;
	         System.out.println(i2);
		}
		else {
			
		}
		System.out.println("Enter Marks of Physics");
		int i3=s.nextInt();
		if(i3 > 100)
	       {  
			  i3=0;
	         System.out.println(i3);
	       }
		else if(i3<0) {
			i3=0;
	         System.out.println(i3);
		}
		else {
			
		}
		System.out.println("Enter Marks of Chemistry");
		int i4=s.nextInt();
		if(i4 > 100)
	       {  
			  i4=0;
	         System.out.println(i1);
	       }
		else if(i4<0) {
			i4=0;
	         System.out.println(i4);
		}
		else {
			
		}
		System.out.println("Enter Marks of Maths");
		int i5=s.nextInt();
		if(i5 > 100)
	       {  
			  i5=0;
	         System.out.println(i5);
	       }
		else if(i5<0) {
			i5=0;
	         System.out.println(i5);
		}
		else {
			
		}
		int total=i1+i2+i3+i4+i5;
		float percentage=(total*100)/500;
		
		
		
		System.out.println(q);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println("Total Marks is :"+total);
		System.out.println("Percentage is :"+percentage);
		if(percentage<50) {
			String g1="Grade : F";
			System.out.println(g1);
		}
		else if(percentage>=50 && percentage<=59) {
			String g2="Grade : E";
			System.out.println(g2);
		}
		else if(percentage>=60 && percentage<=69) {
			String g3="Grade : D";
			System.out.println(g3);
		}
		else if(percentage>=70 && percentage<=79) {
			String g4="Grade : C";
			System.out.println(g4);
		}
		else if(percentage>=80 && percentage<=89) {
			String g5="Grade : B";
			System.out.println(g5);
		}
		else if(percentage>=90 && percentage<=100) {
			String g6="Grade : A";
			System.out.println(g6);
		}
		
		
		
	}
}
