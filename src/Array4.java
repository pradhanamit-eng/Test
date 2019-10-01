import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter size for array: ");
		int size = s.nextInt();
		
		if(size < 0)
		{
			size = 0;		
		}
		// create an array of given size
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print("Input value for array index "+i+": ");
			
			array[i] = s.nextInt();
		}
		
		System.out.println("---Array is :");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);	
		}
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);	
		}
	}
}
