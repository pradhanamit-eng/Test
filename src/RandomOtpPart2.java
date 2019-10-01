import java.util.Random;

public class RandomOtpPart2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Random r=new Random();
		
		String a= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        
        int rl = 1+r.nextInt(26);
        
            char c1 = a.charAt(r.nextInt(26));
            char c2 = a.charAt(r.nextInt(26));
            char c3 = a.charAt(r.nextInt(26));
            char c4 = a.charAt(r.nextInt(26));
            
            s1+=c1;
            s2+=c2;
            s3+=c3;
            s4+=c4;
            
		int b1;
		for( b1=10000;b1<=9999;b1++) {}
		int b=r.nextInt(b1);
		System.out.println("---Random 8 Digit OTP With 4 Alphabet and 4 Integer ---");
		System.out.println("");
		System.out.print(s1+s2+s3+s4);
		System.out.print(b);
	}
}
