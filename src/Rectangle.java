import java.util.Scanner;

public class Rectangle {
	Float length;
	Float width;
	
	
	void input() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("------------Rectangle---------");
		System.out.print("Length :");
		length=s.nextFloat();
		System.out.print("Width :");
		width=s.nextFloat();
	}
	
	void showInfo(){
		System.out.println("Length of Rectangle is :"+length);
		System.out.println("Width of Rectangle is :"+width);
		
		
	}
	void area() {
		
		  Float are=length*width;
		  System.out.println("Area of Rectangle :"+are);
		  
		
	}
	public static void main(String[] args) {
		Rectangle re=new Rectangle();
		re.input();
		re.showInfo();
		re.area();
	}

}
