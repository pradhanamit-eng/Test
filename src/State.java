import java.util.Scanner;

public class State {
	String name;
	String capital;
	int population;
	String chifminister;
	String direction;
	
	void inputStateData() {
		Scanner s1=new Scanner(System.in);//for nextLine()
		Scanner s2=new Scanner(System.in);//for nextInt(),nextFloat(),nextBoolean(),next()
		
		System.out.print("Enter Name of State :");
		name=s1.nextLine();
		System.out.print("Enter Capital :");
		capital=s2.next();
		System.out.print("Enter Population :");
		population=s2.nextInt();
		System.out.print("Enter Chif Minister :");
		chifminister=s1.nextLine();
		System.out.print("Enter Direction :");
		direction=s1.nextLine();
		
		
		
		
	}
	void displayStateData() {
		System.out.println("");
		System.out.println("State :"+name);
		System.out.println("State :"+capital);
		System.out.println("State :"+population);
		System.out.println("State :"+chifminister);
		System.out.println("State :"+direction);
		
	}
	public static void main(String[] args) {
		State s=new State();
		
		s.inputStateData();
		s.displayStateData();
	}
	
	
}
