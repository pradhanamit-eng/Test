import java.util.Scanner;

public class AsciiUpperCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String :");
		String s1 = sc.nextLine();
		
		byte[] array=s1.getBytes();		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(" AscII value :"+array[i]);
		}
		
	}

}
