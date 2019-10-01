import java.util.Scanner;

public class Car {
	String name;
	int cc;
	String maker;
	
	public Car(){
		
	}
	public Car(String name, int cc, String maker) {
		this.name = name;
		this.cc = cc;
		this.maker = maker;
	}



	void showCarInfo() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Car Name :");
		name=s.next();
		System.out.print("Enter Car CC :");
		cc=s.nextInt();
		if(cc<=800) {
			System.out.println("Entry Level Car");
		}
		else if(cc>=801 && cc<=1499) {
			System.out.println("Middle Level Car");
		}
		else if(cc>=1500)
		{
			System.out.println("Sports Car");
		}
		else {
			System.out.println("Enter Valid input");
		}
		System.out.print("Enter Car Maker :");
		maker=s.next();
		
		System.out.println("Car Name is :"+name+"Its CC is :"+cc+"Its Maker is :"+maker);
		
		
		
	}
	public static void main(String[] args) {
		
		
Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Car Name :");
		 String a1=s.next();
		System.out.print("Enter Car CC :");
		int a2=s.nextInt();
		if(a2<=800) {
			System.out.println("Entry Level Car");
		}
		else if(a2>=801 && a2<=1499) {
			System.out.println("Middle Level Car");
		}
		else if(a2>=1500)
		{
			System.out.println("Sports Car");
		}
		else {
			System.out.println("Enter Valid input");
		}
		System.out.print("Enter Car Maker :");
		String a3=s.next();
		
		Car c1=new Car(a1, a2, a3);
		c1.showCarInfo();
	}
	
}
