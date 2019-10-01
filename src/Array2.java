
public class Array2 {
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		
		for(int i=0; i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int j = a.length - 1; j >= 0; j--) 
		{
			System.out.println(a[j]);
		}
	}
}
