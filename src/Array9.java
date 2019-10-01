import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // int / float / string - word
		Scanner s2 = new Scanner(System.in); // string-line
		
		
		System.out.print("Enter size for array: ");
		int size = s.nextInt();
		
		if(size < 0)
		{
			size = 0;		
		}
		
		String[] array = new String[size];
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print("Input value for array index "+i+": ");
			
			array[i] = s2.nextLine();
		}
		
		System.out.println("----Array Elements Are ------");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);	
		}
		
		
	}
}
