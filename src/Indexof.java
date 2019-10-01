
public class Indexof {
	public static void main(String[] args) {
		String str = "TATA STEEL";
		String str2 = "L";
		
		int i1 = str.indexOf(str2);
		System.out.println("first index is "+i1);

		int i2 = str.lastIndexOf(str2);
		System.out.println("last index is "+i2);
	}

}
