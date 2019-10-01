
public class Array6 {
	public static void main(String[] args) {
		// take an array of float type and store some values
		float[] a = {10.0f,2.0f,3.0f,4.0f,5.0f};
		
		// show the value at index-0 and 4
		System.out.println(a[0]+" "+a[4]);
		
		float temp = a[0];
		a[0] = a[4];
		a[4] = temp;
		
		// show the value at index-0 and 4
		System.out.println(a[0]+" "+a[4]);
		
		a[2] = a[1] + a[3];
		
		System.out.println(a[2]);
	}

}
