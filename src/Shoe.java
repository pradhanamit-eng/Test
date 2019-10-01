import java.util.Scanner;

public class Shoe {
	String type;
	int price;
	
	void storeShoeInfo()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Input shoe type :");
		type = s.next();
		System.out.print("Input shoe price :");
		price = s.nextInt();
	}
	
	void showShoeInfo()
	{
		System.out.println("# shoe-info #");
		System.out.println("Type :"+type);
		System.out.println("price :"+price+" INR");
	}
	
	public static void main(String[] args) 
	{
	// create some shoes
	Shoe s1 = new Shoe();
	
	// store data inside s1 using method
	s1.storeShoeInfo();
	
	// show data of s1 using method
	s1.showShoeInfo();
	
	}
}
