import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Input a Number :");
		
		int decimal =sc.nextInt();
		
		System.out.println("Thankyou");
		
		String binary="";
		System.out.println("Input 1 = Binary 2=Octane & 3=Hexadecimal ");
		int number=sc.nextInt();
		switch (number) {
		
		case 1: 

		    if(decimal<=0)
		    {
		        System.out.println("Please Enter more than 0");

		    }
		    else
		    {
		        while(decimal>0)
		        {

		            binary=(decimal%2)+binary;
		            decimal=decimal/2;

		        }
		        System.out.println("Binary No of "+decimal+" is :"+binary);

		    }
			
			break;
		case 2:
			
			int i=1, j;
			int oct_num[] = new int[100];
			while(decimal != 0)
	        {
	            oct_num[i++] = decimal%8;
	            decimal = decimal/8;
	        }
			
	        System.out.println("Octal number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.println("Octane no. of"+decimal+" is :"+oct_num[j]);
	        }
	        System.out.print("\n");
			break;
			
		case 3:
			// For storing remainder
		     int rem;
		        
		     // For storing result
		     String str2=""; 
		 
		     // Digits in hexadecimal number system
		     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 
		     while(decimal>0)
		     {
		       rem=decimal%16; 
		       str2=hex[rem]+str2; 
		       decimal=decimal/16;
		     }
		     System.out.println("Hexadecimal no. of "+decimal+" is :"+str2);
		     
		     break;

		default:
			break;
		}
	}

}
