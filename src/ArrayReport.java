import java.util.Scanner;

public class ArrayReport {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter size for array: ");
		int size = s.nextInt();
		int[] a = new int[size];

		if (size < 0) {
			size = 0;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("Input value for array index " + i + ": ");

			a[i] = s.nextInt();
		}
		System.out.println("------Array is------ :");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println("Number of Occurrence of the Element:" + a[j] + " is :" + count);
		}

	}
}
