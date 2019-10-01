import java.util.Random;
import java.util.Scanner;

public class Random0to9 {
	public static void main(String...args) 
	{
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();
		
		System.out.print("Input  number: ");
					
		int number = s.nextInt();
		
		if(number >= 5 && number <= 10)
		{
			System.out.print("The OTP of "+number+" digits is ");
			for(int i = 1; i <= number; i++)
			{
				// get a random number in the range of 0 to 9
				int num = r.nextInt(10);
				
				System.out.print(num);
			}
		}
		else
		{
			System.out.println("number not in a range");
		}
		
		
	}

}
