package String;

public class TheStringClassIntToString {
	public static void main(String[] args) {
		
		
		// Java – int to String using String.valueOf()
		int ivar = 111;
		String str = String.valueOf(ivar);
		System.out.println("String is: " + str);
		// output is: 555111 because the str is a string
		// and the + would concatenate the 555 and str
		System.out.println(555 + str);
		
		
		//Java – int to String using Integer.toString()
		
		int ivar1 = 1234;
		String str1 = Integer.toString(ivar1);
		System.out.println("String is: "+str1);
		//output is: 555111 because the str1 is a string 
		//and the + would concatenate the 555 and str1
		System.out.println(555+str1);
		   
		//output is: 666 because ivar1 is int value and the
	        //+ would perform the addition of 555 and ivar1
		System.out.println(555+ivar1);
	}
}
