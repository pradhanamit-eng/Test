
public class Person {
	String name;
	String city;
	
	public static void main(String[] args) 
	{
	// create object of person
	Person p1 = new Person();
	
	// store info inside p1
	p1.name = "pappu";
	p1.city = "noida";
	
	System.out.println("info of p1 ->");
	System.out.println(p1.name);
	System.out.println(p1.city);
	
	// create object of person
	Person p2 = new Person();
	
	// store info inside p1
	p2.name = "gappu";
	p2.city = "chandigarh";
	
	System.out.println("info of p2 ->");
	System.out.println(p2.name);
	System.out.println(p2.city);
	
	// declare a local variable
	String temp = p1.name;
	p1.name = p2.name;
	p2.name = temp;
	
	String temp2 = p1.city;
	p1.city = p2.city;
	p2.city = temp2;
	
	System.out.println("-----------------------");
	

	System.out.println("info of p1 ->");
	System.out.println(p1.name);
	System.out.println(p1.city);

	System.out.println("info of p2 ->");
	System.out.println(p2.name);
	System.out.println(p2.city);
	
	
	
	}
}
