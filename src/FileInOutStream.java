import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FileInOutStream {
	public static void main(String[] args) {
		try {
			
			Scanner str=new Scanner(System.in);
			Scanner n=new Scanner(System.in);
			
			System.out.print("Input path of Source File :");
			String filepath1 = str.nextLine();
			System.out.print("Input path of Destination File :");
			String filepath2 = str.nextLine();
			
			
			System.out.print("#Menu#"+"\n 1 = Copy Source into Destination"+"\n 2 = Copy Source into Destination After Older data of Destination");
			int num=n.nextInt();
			
			switch (num) {
			case 1:
				// next string1
				FileInputStream f1=new FileInputStream(filepath1);
				int size=f1.available();
				
				byte[] buffer = new byte[size];
				f1.read(buffer);
				String text = new String(buffer);
				
				
				String message = text;
				// convert string into array of byte
				byte[] array = message.getBytes();
				
				// open file in write mode
				FileOutputStream fo = new FileOutputStream(filepath2,!false);
				
				// store the data of array inside file in one by one
				for (int i = 0; i < array.length; i++) 
				{
				// store 1 byte of data inside file
				fo.write(array[i]);
				}
				
				System.out.println("---Data Copied---");
				break;
			case 2:
				
				// next string1
				FileInputStream f2=new FileInputStream(filepath1);
				int size1=f2.available();
				
				byte[] buffer1 = new byte[size1];
				f2.read(buffer1);
				String text1 = new String(buffer1);
				
				
				String message1 = text1;
				// convert string into array of byte
				byte[] array1 = message1.getBytes();
				
				// open file in write mode
				FileOutputStream fo1 = new FileOutputStream(filepath2,!true);
				
				// store the data of array inside file in one by one
				for (int i = 0; i < array1.length; i++) 
				{
				// store 1 byte of data inside file
				fo1.write(array1[i]);
				}
				System.out.println("---Data Copied ---");
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
