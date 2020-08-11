package homework;

import java.util.Scanner;

public class sumeo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int x = input.nextInt();
		System.out.println("Enter " + x + " elements");
		sumeo.calc(x);

		input.close();
	}

	public static void calc(int x) {
		int totale = 0, totalo = 0;
		Scanner input = new Scanner(System.in);
		int[] num = new int[x];

		for (int i = 0; i < x; i++) {
			num[i] = input.nextInt();
		}

		for (int a = 0; a < x; a++) {
			if (num[a] % 2 == 0) {

				totale = num[a] + totale;
			} else {

				totalo = num[a] + totalo;
			}

		}
		input.close();
		System.out.println("The sum of even input numbers = " + totale);
		System.out.println("The sum of odd input numbers = " + totalo);

	}
}