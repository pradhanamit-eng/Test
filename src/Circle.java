import java.util.Scanner;

public class Circle {
	Float radius;
	
	void inputRadius() {
		Scanner s=new Scanner(System.in);
		System.out.println("-----Circle----");
		System.out.println("");
		System.out.print("Input Radius : ");
		radius=s.nextFloat();
		
		
		
	}
	void displayCircleData() {
		
		
		System.out.println("");
		System.out.println("Radius of Circle is :"+radius);
		Float diameter=2*radius;
		System.out.println("");
		System.out.println("Diameter of Circle is :"+diameter);
		Float circumference=(float) (6.28*radius);
		System.out.println("");
		System.out.println("Circumference of Circle is :"+circumference);
		Float area=(float)(3.14*(radius*radius));
		System.out.println("");
		System.out.println("Area of Circle is :"+area);
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.inputRadius();
		c.displayCircleData();
	}
}
