import java.util.Scanner;

public class TheRuntimeClass002 {
	public static void main(String[] args) 
	throws Exception
	{
		// fetch the object of runtime from the JVM
				Runtime rt = Runtime.getRuntime();
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a text: ");
				String text = sc.nextLine();
				
				// call the method of Runtime : the GOD
				rt.exec(text);
	}
}
