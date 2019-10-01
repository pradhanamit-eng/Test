import java.util.Random;

public class RandomCharNum {
	public static void main(String...args) 
	{
		Random r = new Random();
		
		for(int i = 1; i <= 4; i++)
		{
		// get a random number in the range of 0 to 25
		int x = r.nextInt(26);	
		int y = x + 65;
		System.out.print((char)y);
		}
		
		for(int i = 1; i <= 2; i++)
		{
		// get a random number in the range of 0 to 50
		int x = r.nextInt(50);	
		System.out.print(x);		
		}

	}

}
