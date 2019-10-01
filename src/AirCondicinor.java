import java.util.Scanner;

public class AirCondicinor {
	String type;
	Float capacity;
	int price;
	String vender;
	
	void inputAcInfo() {
		Scanner s=new Scanner(System.in);
		System.out.print("Input AC Type :");
		type =s.next();
		System.out.print("Input AC Capacity :");
		capacity=s.nextFloat();
		if(capacity<0.8 || capacity>3) {
			capacity=(float) 1.2;
		}
		
		System.out.print("Input AC Price :");
		price=s.nextInt();
		if(price<20000 || price>50000) {
			price=24999;
		}
		
		else {
			System.out.println("Enter Price Between 20000 to 50000");
		}
		System.out.print("Input AC Vender :");
		vender=s.next();
		
		
		
		
	}
	void displayAcInfo() {
		System.out.println(type);
		System.out.println(capacity);
		System.out.println(price);
		System.out.println(vender);
	}
	public static void main(String[] args) {
		AirCondicinor a1=new AirCondicinor();
		a1.inputAcInfo();
		a1.displayAcInfo();
		
		
	}

}
