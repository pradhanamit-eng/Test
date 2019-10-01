package String;

public class TheStringIntegerValueOf {
	public static void main(String[] args) {
		
		//-------------Java Convert String to int Example using Integer.valueOf(String)
		   String str="-234";
	       int num1 = 110;
	       //num2 would be having a negative value
	       int num2 = Integer.valueOf(str);
	       int sum=num1+num2;
	       System.out.println("Result is: "+sum);
	       
	    //--------------Convert a String to int with leading zeroes
	       String str1="00000678";
	       /* String to int conversion with leading zeroes
	        * the %08 format specifier is used to have 8 digits in
	        * the number, this ensures the leading zeroes
	        */
	       str1 = String.format("%08d", Integer.parseInt(str1)+102);
	       System.out.println("Output String: "+str1);
	}

}
