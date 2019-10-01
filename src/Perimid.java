import java.util.Scanner;

public class Perimid {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

    System.out.print("Input terms to print a Diamond: ");
    // take a term from keyboard
    int term = s.nextInt(); 
   
    // create a copy of term
    int copyOfterm = term;
   
    // variable for printing spaces
    int spaceCounter = 1; 
   
    // loop starts
    for (int i = 1; i <= (2 * term - 1) * (term + 1); i++) 
    {
        // check condition for spaces
        if (spaceCounter <= copyOfterm) 
        {
            System.out.print(" ");
            spaceCounter++;
        } 
        else 
        {
            System.out.print("* ");
        }
       
        // check condition for next line 
        if (i % (term + 1) == 0) 
        { 
            System.out.println();
            spaceCounter = 1;

            // check condition to get upper part of the diamond
            if(i < term *(term + 1)) 
            {   
                copyOfterm--;
            }
            else 
            {
                copyOfterm++;
            }
        }
    }         // end of the loop  
}
}
