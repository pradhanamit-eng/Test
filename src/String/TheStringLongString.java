package String;

public class TheStringLongString {

	
	
	public static void main(String[] args) {
		//Java – Convert String to long using the constructor of Long class
		//Java Program for String to long conversion using new Long(String)
		String str = "10000";
	    String str2 = "22222";
	    //Conversion using Long(String s) constructor
	    long num = new Long(str);
	    long num2 = new Long(str2);
	    System.out.println(num*num2);	
	}
}
