import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a String :");
		String st=str.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(st);
		sb.reverse();
		st = sb.toString();
		System.out.println(st);
		
		
	}
}
