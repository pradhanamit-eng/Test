import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LoginLogout {
		
		String[] emails = {"a@a.com","b@b.com","c@c.com","d@d.com"};
		String[] password = {"a1#A","b1#B","c1#C","d1#D"};
		public static void main(String[] args) {
			
			LoginLogout l1=new LoginLogout();
			l1.login();
			l1.password();
			
			
		}
		
		void login() {
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("------Login------");
			System.out.println();
			System.out.print("Enter Email :");
			String email = sc.nextLine();
			
			for (int i = 0; i < emails.length; i++) {
				
				if(emails[i].equals(email)) {

					System.out.println("Valid Email");
				}
				
				
			}
		}
		
		void password(){
			
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("------Password------");
			System.out.println();
			System.out.print("Enter Password :");
			String password1 = sc1.nextLine();
			
			for (int i = 0; i < password.length; i++) {
				
				if(password[i].equals(password1)) {
					System.out.println(" Valid Password ");
				}
				
			}
		}
		
		
		
		
	
	}
	
	
	

