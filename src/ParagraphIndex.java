import java.util.Scanner;

public class ParagraphIndex {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		

		Scanner s1= new Scanner(System.in);
		
		System.out.println(" Enter the Paragraph :");
		
		String str= s1.nextLine();
		String[] tokens = str.split(" ");
		
		for (int i = 0; i < tokens.length; i++) {
			String tockens1=tokens[i].toLowerCase();
			
			System.out.println(tockens1);
		}
		
		System.out.println(tokens.length);
		
		System.out.println(" Enter the word to Find Its Index :");
		String str2=s1.nextLine();
		String str3 = str2.toLowerCase();
		
		int i = str2.indexOf(str3);
		
		int j = str2.lastIndexOf(str3);
		
		
		System.out.println(i);
		
		System.out.println(j);
		
		
		
	}

}
