import javax.swing.JOptionPane;

public class AssignmentJoption1 {

	public static void main(String[] args) {
		String a=JOptionPane.showInputDialog(null,"Enter Your Name");
		
		String b=JOptionPane.showInputDialog(null,"Enter your College Name");
		
		String c=JOptionPane.showInputDialog(null,"Enter your City");
		
		JOptionPane.showMessageDialog(null, "#----INFO---# \n Name is:"+a+"\n College Name is:"+b+"\n Home Town is:"+c);
	}

}
