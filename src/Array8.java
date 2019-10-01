import java.util.Scanner;

public class Array8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter size for array: ");
		int size = s.nextInt();
		
		if(size < 0)
		{
			size = 0;		
		}
		// create an array of given size
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print("Input value for array index "+i+": ");
			
			array[i] = s.nextInt();
		}
		
		System.out.println("--------ARRAY --------");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");	
		}
		
		
		
		//--------ARRAY After Bubble Sort (Ascending Order)--------
		
		for(int pass=array.length-1;pass>=0;pass--) {
			for(int i=0;i<=pass-1;i++) {
				if(array[i]>array[i+1]) {
					//swap elements
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		System.out.println("--------ARRAY After Bubble Sort (Ascending Order)--------");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");	
		}
		
		//--------ARRAY After Bubble Sort (Decending Order)--------
		
		for(int pass=0;pass<array.length; pass++) {
			for(int i=1;i< (array.length-pass); i++) {
				if(array[i-1] <= array[i]) {
					//swap elements
					int temp = array[i-1];
					array[i-1]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("--------ARRAY After Bubble Sort (Decending Order)--------");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");	
		}
		
		
		//------Sum Of all Elements -------------
		
		int sum1 = 0;
		int sum2 = 0;
	      for( int num : array) {
	          sum1 = sum1+num;
	      }
	      System.out.println("---Sum of array elements is---  :"+sum1);
	     
	     //------Sum of Elements at even and Odd location--------
	     int even = 0, odd = 0;
	     for (int i = 0; i < array.length; i++) {
	            if (i % 2 == 0)
	                even += array[i];
	            	//even = even + array[i];
	            else
	                odd += array[i];
	            //odd = odd + array[i];
	        }
	 
	     System.out.println("---Sum of array elements Located at Even Index---  :"+even);
	     System.out.println("---Sum of array elements Located at Odd Index---  :"+odd);
	     
	     //------Maximum Value of an Array With its Index--------
	     
	     int max=array[0];
	     int min=array[0];
	     int index1=0;
	     int index2=0;
	     
	     for (int i = 0; i < array.length; i++) 
			{
				if (max < array[i]) 
				{
					max = array[i];
					index1 = i;
				}
			}
	     System.out.println("---Maximum Value of an Array is---  :"+max);
	     System.out.println("---Maximum value Located at Index---  :"+index1);
	     
	   //------Minimum Value of an Array With its Index--------
	     for(int i = 0; i < array.length; i++)
	       {
	            if(min > array[i])
	            {
	                min = array[i];
	                index2=i;
	            }
	        }
	     System.out.println("---Minimum Value of an Array is---  :"+min);
	     System.out.println("---Minimum value Located at Index---  :"+index2);
	    
	   //------Second Maximum Value of an Array With its Index--------
	     int maximum = 0;
		 int secondmaximum = 0;
		 int index3=0;
	     for (int j = 0; j < array.length; j++) {
	    	 
				if (array[j] > maximum) {
					secondmaximum = maximum;
					maximum = array[j];
					
	 
				} else if (array[j] > secondmaximum) {
					secondmaximum = array[j];
					index3=j;
					
	 
				}
			}
	     System.out.println("---Second Maximum Value of an Array is---  :"+secondmaximum);
	     System.out.println("---Second Maximum Value Located at Index ---  :"+index3);
	     
	   //------Second Minimum Value of an Array With its Index--------
	     
	     int minimum =array[0];
	     int secondminimum =array[0];
	     int index4=0;
	     
	     for (int k = 0; k < array.length; k++) {
			if(minimum > array[k]) {
				secondminimum = minimum;
				minimum = array[k];
				
			}
			else if(secondminimum > array[k]) {
				secondminimum = array [k];
				index4 = k;
			}
		}
	     
	     
	     System.out.println("---Second Minimum Value of an Array is---  :"+secondminimum);
	     System.out.println("---Second Minimum Value Located at Index ---  :"+index4);
	     
	}	
}
