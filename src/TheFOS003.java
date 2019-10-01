import java.io.FileOutputStream;

public class TheFOS003 {
	public static void main(String[] args) {
		try {
			String filepath = "F:/abc.txt";
			
			String message = "messeges comes is and we becomes restlesst";
			
			// convert string into array of byte
			byte[] array = message.getBytes();
			
			// open file in write mode
			FileOutputStream fo = new FileOutputStream(filepath,!false);
			
			// store the data of array inside file in one by one
			for (int i = 0; i < array.length; i++) 
			{
			// store 1 byte of data inside file
			fo.write(array[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
