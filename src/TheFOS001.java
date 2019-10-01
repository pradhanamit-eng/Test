import java.io.FileOutputStream;

public class TheFOS001 {
	public static void main(String[] args) {
		try {
			String filepath1 = "F:/abc.txt";
			String filepath2 = "F:/abc.txt";
			
			// open a file in write mode
			FileOutputStream fo1 = new FileOutputStream(filepath1,!false);
			
			
			
			System.out.println("..done");
			/*// open a file in append mode
						FileOutputStream fo2 = new FileOutputStream(filepath2,!true);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
