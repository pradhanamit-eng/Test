package String;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TheStringClassInputStreamToString {

	// How To Convert InputStream To String In Java
	// ------------------------------------------
	// 1) I have initialized the InputStream after converting the file content to
	// bytes using getBytes() method
	// and then using the ByteArrayInputStream which contains an internal buffer
	// that contains bytes that may be read from the stream.
	// 2) Read the InputStream using InputStreamReader.
	// 3) Read InputStreamReader using BufferedReader.
	// 4) Appended each line to a StringBuilder object which has been read by
	// BufferedReader.
	// 5) Finally converted the StringBuilder to String using toString() method.
	// -----------------------------------------

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = null;
		BufferedReader br = null;
		InputStream is = new ByteArrayInputStream("C:\\Users\\Amit\\Desktop\\AMIT KUMAR PRADHAN.docx".getBytes());
		StringBuilder sb = new StringBuilder();
		String content;
		try {
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			while ((content = br.readLine()) != null) {
				sb.append(content);
			}
		} catch (IOException ioe) {
			System.out.println("IO Exception occurred");
			ioe.printStackTrace();
		} finally {
			isr.close();
			br.close();
		}
		String mystring = sb.toString();
		System.out.println(mystring);
	}

}
