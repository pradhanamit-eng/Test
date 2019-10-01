import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;

public class FileClass2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter The path : ");
		
		String path = s.nextLine();
		File f=new File(path) ;
		// Path Exit Or Not 
		if(f.exists()) {
			System.out.println("Path Exit");
		}
		else {
			System.out.println("Path Not Exit ");
		}
		
		/// Counter for Folders Using Array
		File[] array=f.listFiles();
		int count1=0;
		int count2=0;
		for (int i = 1; i < array.length; i++) {
			
			
			
			if(array[i].isDirectory()) {	
				System.out.println(array[i]+ "  :Folders");
				System.out.println();
				count1++;
			}
			else {
				System.out.println(array[i]+ "  :Files");
				System.out.println();
				count2++;
		}
		
}
	System.out.println("Total no. of Folders :"+count1);
	System.out.println("Total no. of Files :"+count2);
	}
}
