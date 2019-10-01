import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String designation;
	String technical;
	int basicSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, String technical, int basicSalary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.technical = technical;
		this.basicSalary = basicSalary;
	}
	
	void printSalarySlip() {
		
		/*Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		id=s.nextInt();
		System.out.print("Enter Employee Name : ");
		name=s.next();
		System.out.print("Enter Employee Designation : ");
		designation=s.next();
		System.out.print("Enter Employee Technical : ");
		technical=s.next();
		System.out.print("Enter Employee Basic Salary : ");
		basicSalary=s.nextInt();
		if(basicSalary>=1 && basicSalary<=10000) {
			System.out.println("HR");
		}
		else if(basicSalary>=10001 && basicSalary<=20000) {
			System.out.println("TA");
		}
		else if(basicSalary>=20001 && basicSalary<=30000) {
			System.out.println("DA");
			
		}
		else if(basicSalary>30001) {
			System.out.println("PF");
		}
		else {
			System.out.println("Enter Valid Input");
		}*/
		
		System.out.println("Employee ID is : "+id+"Employee Name is : "+name+"Employee Designation is : "+designation+"Employee Technical Skill : "+technical+"Emoployee Basic Salary is :"+basicSalary);
		



		
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		int id1=s1.nextInt();
		System.out.print("Enter Employee Name : ");
		String name1=s1.next();
		System.out.print("Enter Employee Designation : ");
		String designation1=s1.next();
		System.out.print("Enter Employee Technical : ");
		String technical1=s1.next();
		System.out.print("Enter Employee Basic Salary : ");
		int basicSalary1=s1.nextInt();
		if(basicSalary1>=1 && basicSalary1<=10000) {
			System.out.println("HR");
		}
		else if(basicSalary1>=10001 && basicSalary1<=20000) {
			System.out.println("TA");
		}
		else if(basicSalary1>=20001 && basicSalary1<=30000) {
			System.out.println("DA");
			
		}
		else if(basicSalary1>30001) {
			System.out.println("PF");
		}
		else {
			System.out.println("Enter Valid Input");
		}
		
		Employee e=new Employee(id1, name1, designation1, technical1, basicSalary1);
		e.printSalarySlip();
	}
	
}
