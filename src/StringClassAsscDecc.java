
public class StringClassAsscDecc {

	public static void main(String[] args) {
		String s="urtfgjfujvb dfgsdgss gdfgdgsd gdsgsgsgs gdfgsdfg gdffhdf fddhfdhd fdgdgsd grgdf sdgsg"+"zfd ffhfdhfh dfhdfh dfgdfg fgsfgfd"+"dfgdgf hgdgfd hgfhg";
		
		int count = 1;
		 
		for (int i = 0; i < s.length()-1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + (count+1));
	}

}
