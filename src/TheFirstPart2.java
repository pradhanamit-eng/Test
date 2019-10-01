import java.io.FileInputStream;

public class TheFirstPart2 {
	
	public static void main(String[] args) {
		
		try {
			String filepath = "F:/abc.txt";
			
			FileInputStream f1 = new FileInputStream(filepath);
			
			int size=f1.available();
			
			byte[] buffer = new byte[size];
			
			
			
			f1.read(buffer);
			
			
			String text = new String(buffer);
			
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
