import java.util.Scanner;

public class Doctor {
	String name;
	String specilization;
	int experience;
	float fees;
	String hospital;
	
	void showDocDetails() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Doctor Name");
		name=s.next();
		System.out.print("Enter Specilization");
		specilization=s.next();
		System.out.print("Enter experiance");
		experience=s.nextInt();
		System.out.print("Enter Fees");
		fees=s.nextFloat();
		System.out.print("Enter Hospital Name");
		hospital=s.nextLine();
		
		System.out.println("Doctor name is"+name);
		System.out.println(specilization);
		System.out.println(experience);
		System.out.println(fees);
		System.out.println(hospital);
		
		
	}
	
	public Doctor() {
		
	}
	
	public Doctor(String name,
	String specilization,
	int experience,
	float fees,
	String hospital) {
		
		this.name="abd";
		this.specilization="hand";
		this.experience=5;
		this.fees=45454;
		this.hospital="abd";
		
		
		
		
		
	}
	public static void main(String[] args) {
		Doctor d1=new Doctor("abc", "hand", 5, 5223, "abc");
		Doctor d2=new Doctor();
		d2.showDocDetails();
		
		
		
		
		
	}

}
