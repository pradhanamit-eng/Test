import java.lang.reflect.Array;
import java.util.Scanner;

public class TheStringClass01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input A String :");
		String s=sc.nextLine();
		
		for (int i = 0; i <s.length(); i++) {
			
			char ch=s.charAt(i);
			System.out.println(ch);
		}
		
		for (int j = s.length()-1; j >= 0; j--) {
			char ch=s.charAt(j);
			System.out.println(ch);
		}
		
	}

}
