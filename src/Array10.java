import java.util.Random;
import java.util.Scanner;

public class Array10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter size for array: ");
		int size = s.nextInt();

		if (size < 0) {
			size = 0;
		}

		int[] a = new int[size];

		Random r = new Random();

		for (int i = 0; i < a.length; i++) {

			int x = r.nextInt(51);
			int y = x;

			a[i] = y;
			System.out.println(a[i]);
			if (y >= 25 && y <= 35) {
				System.out.println("The Value Between 25 and 35 is : " + a[i]);
			}

		}

	}

}
