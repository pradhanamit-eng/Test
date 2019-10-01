import javax.swing.JOptionPane;

public class AssignmentJoption2 {

	public static void main(String[] args) {
		String a=JOptionPane.showInputDialog(null,"Input a Double Number :");
		
		String b=JOptionPane.showInputDialog(null,"Input a Double Number Again ");
		
		double double1 = Double.parseDouble(a);
		double double2 =Double.parseDouble(b);
		
		String input1 = JOptionPane.showInputDialog(null,"Press 1 for Addition and 2 for Subtraction");
		int num = Integer.parseInt(input1);
		
		switch (num) {
		case 1:
			double addition = double1+double2;
			
			JOptionPane.showMessageDialog(null, "Addition of "+double1+"+"+double2+" is :"+addition);
			break;
		case 2:
			double subtraction = double1-double2;
			
			JOptionPane.showMessageDialog(null, "Subtraction of "+double1+"-"+double2+" is :"+subtraction);

		default:
			break;
		}
	}

}
