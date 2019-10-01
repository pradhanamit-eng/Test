import java.io.File;
import java.sql.Date;
import java.util.Scanner;

public class TheFileClass01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Input a path :");
	
	String path = scanner.nextLine();
	
	// create object of file class to denote the path
	File file = new File(path);
	
	// check if path is correct or not
	if(file.exists())
	{
		System.out.println("path is valid");
		
		// check if path is of a file
		if(file.isFile())
		{
			System.out.println("it is a file");
			
			// get the size of file in bytes
			long size = file.length();
			System.out.println("size of file is "+size+" bytes");
			
			// get the modification time of file
			long time = file.lastModified();
			
			// convert milliseconds into a legal time and date
			Date date = new Date(time);
			
			System.out.println("modifiaction time of file is "+date);
		}
		
		// check if path is of a directory
		if(file.isDirectory())
		{
			System.out.println("it is a directory");
		}
	}
	else
	{
		System.out.println("path is invalid");
	}
	
			
	
	}
}
