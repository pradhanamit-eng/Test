import java.util.Scanner;

public class SumTillSingle {

	static void digsum(long num) {
		long sum = 0;
        while (num > 0 || sum > 9) 
        {
            if (num == 0) { 
                num = sum;
                sum = 0;
            }
            sum +=num % 10; 
            num /= 10;
        }
        
    
        System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		
		System.out.println("Input a Number :");
		long num = str.nextLong();
		digsum(num);
	}
	
	
	

}
