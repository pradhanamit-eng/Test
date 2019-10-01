
public class Book {
	
	String topic, author, publisher;
	int price;
	
	public static void main(String[] args) 
	{
	// create object of class book in order to access the non-static-var
		// b1 is object-name or ref-var or pointer-to-object
	Book b1 = new Book();
	
	// store the info inside object b1
	b1.topic = "c";
	b1.author = "yrk";
	b1.price = 200;
	b1.publisher = "bpb";
	
	// show the data of n-s-v
	System.out.println(b1.topic);
	System.out.println(b1.author);
	System.out.println(b1.price);
	System.out.println(b1.publisher);
		
		
	}

}
