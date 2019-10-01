import java.util.Scanner;

public class StringParagraph {

	public static void main(String[] args) {
		
		String paragraph = "zoo,jug,papita,mango,anar,kaddoo,timatar,ZOO,Anar,ANAR"+"dfdf,ytdgrd,gdfgfdg,gfdgdf,gfdgdfg,ggfdgfd,afaefs";
		String[] tokens = paragraph.split(",");
		System.out.println("no of tokens are "+tokens.length);
		
		for(int i = 0; i < tokens.length; i++)
		{
			for(int j = i + 1; j < tokens.length; j++)
			{
				if(tokens[i].compareToIgnoreCase(tokens[j]) > 0)
				{
					String temp = tokens[i];
					tokens[i] = tokens[j];
					tokens[j] = temp;
				}
			}
		}
		
		// show the array
		for (int i = 0; i < tokens.length; i++) 
		{
			System.out.println(tokens[i]);
		}
		
	}

}
