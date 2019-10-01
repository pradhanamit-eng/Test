
public class NumCharacter {

	public static void main(String[] args) {
		
		String s= "Hii "+"hgfjfjh hjgfhjgfj GHHJGERYTFGHRF YTDCVJHDHFH jhhhf ncngfng"+"jyfgyjfc gdghfhgdf jhfjhf jjhfjh          tydtgd hjfhgf yhrfty jhghdsagf jsadgjdg ajdgasja sjagdjag"+"jysgja jhgdaj jhcgsajf";
		
		int ch_num = s.length();
		
		System.out.println("Total no of Character "+ch_num);
		
		int count=1;
		int uppercase=0,lowercase=0,num=0,space=0,other=0;
		for (int i = 0; i<s.length(); ++i) {
			char c= s.charAt(i);
			if(c==' ') 
				count++;
					
		}
		System.out.println("Total No of Words :"+count);
		System.out.println("Total no. of Spaces : "+(count-1));
		
		for (int j = 0; j < s.length(); j++) {
			
			if(Character.isUpperCase(s.charAt(j))) {
				
				uppercase++;
				
			}
			else if(Character.isLowerCase(s.charAt(j))) {
				
				lowercase++;
			}
			else if(Character.isDigit(s.charAt(j))) {
				num++;
			}
			else if(Character.isSpaceChar(s.charAt(j))) {
				space++;
			}
			else {
				other++;
			}
			
			
		}
		System.out.println("The uppercase characters are " + uppercase);
		System.out.println("The lowercase characters are " + lowercase);
		System.out.println("Total no of Uppercase and Lowercase letter are "+(uppercase+lowercase));
		System.out.println("The integer characters are " + num);
		System.out.println("The Spaces are " + space);
		System.out.println("The others are " + other);
		
		
		
	}

}
