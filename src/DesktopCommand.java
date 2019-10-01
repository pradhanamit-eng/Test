import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DesktopCommand {

	public static void main(String[] args) 
	throws Exception
	{
		
		Runtime rt=Runtime.getRuntime();
		
		
		JOptionPane.showMessageDialog(null,"-----------------------MENU-----------------"+"\n"+" Enter 1 for Notpad "+"\n"+" Enter 2 for Calculator "+"\n"+" Enter 3 for Paint "+"\n"+" Enter 4 for Open File "+"\n"+" Enter 5 to Open URL "+"\n"+" Enter 6 ShurtDown "+"\n"+" Enter 7 to Restart "+"\n"+" Enter 8 to LogOff ");
		
		String s = JOptionPane.showInputDialog(null,"");
		int n=Integer.parseInt(s);
		switch (n) {
		case 1:
			String notpad= "cmd /c start notepad ";
			rt.exec(notpad);
			
			
			break;
		case 2:
			String calculator= "cmd /c start calc";
			rt.exec(calculator);
			
			
			break;
		case 3:
			String paint= "cmd /c start mspaint ";
			rt.exec(paint);
			
			
			break;
			
		case 4:
			String choosefile= "cmd /c start explorer ";
			rt.exec(choosefile);
			
			
			break;
		case 5:
			String url= "cmd /c start http://www.google.com ";
			rt.exec(url);
			
			
			break;
		case 6:
			String shutdown= "cmd /c start shutdown -s ";
			rt.exec(shutdown);
			
			
			break;
		case 7:
			String restart= "cmd /c start shutdown -r ";
			rt.exec(restart);
			
			
			break;
		case 8:
			String logoff= "cmd /c start shutdown -l ";
			rt.exec(logoff);
			
			
			break;
		default:
			break;
		}
		
		
	}

}
