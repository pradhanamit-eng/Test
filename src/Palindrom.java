import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String sc=s.nextLine();
		
		for (int i = 0; i <sc.length(); i++) {
			
			char ch=sc.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		
		for (int j = sc.length()-1; j >= 0; j--) {
			char ch=sc.charAt(j);
			System.out.print(ch);
		}
		
		System.out.println("----------");
		
		 int r,sum=0,temp;    
		  int n=sc.length();
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome  ");    
		  else    
		   System.out.println("not palindrome");    
	}

}
