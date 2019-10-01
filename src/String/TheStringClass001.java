package String;

public class TheStringClass001 {

	//Convert String to int in java
	
	static String str1="1234";
	static int num1=Integer.parseInt(str1);
	
	static String str2="-1234";
	static int num2=Integer.parseInt(str2);
	
	public static void main(String[] args) {
		
		
		System.out.println(str1);
		System.out.println(num1);
		
		System.out.println(str2);
		System.out.println(num2);
		
		
		
		///------------------------
			String str3="123";
	      	int num3 = 100;
	       
	       //converting the string to an int value
	       int num4 = Integer.parseInt(str3);
	       int sum=num3+num4;
	       System.out.println("Result is: "+sum);
	}
}
