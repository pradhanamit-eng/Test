import java.util.Scanner;

public class Person1 {
	String name;
	Double age;
	String city;
	
	Person1(){
		
	}
	Person1(String name,
	Double age,
	String city){
		
	}
	
	void printPersonInfo() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Name of Person");
		name=s.next();
		System.out.print("Enter Age of Person");
		age=s.nextDouble();
		System.out.print("Enter City");
		city=s.next();
		
		System.out.println("Person name is "+name+"  his age is "+age+" his city is "+city);
		
	}
	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter Name of person");
		String a1=s1.next();
		System.out.print("Enter Age of person");
		Double a2=s1.nextDouble();
		System.out.print("Enter City of person");
		String a3=s1.next();
		Person1 p1=new Person1(a1, a2,a3);
		p1.printPersonInfo();
//		System.out.println("Person name is"+a1+"his age is"+a2+"his city is"+a3);
	}
	
}
