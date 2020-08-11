import java.util.Arrays;
import java.util.Scanner;

public class arraycalculate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers you want to calculate to find its sum?");
		System.out.println("\nHow many numbers you want to calculate to find its sum?");
		int len = input.nextInt();
		int[] num = new int[len];
		for (int a = 0; a < num.length; a++) {
			System.out.println("enter the value");
			num[a] = input.nextInt();
		}
		input.close();

		System.out.println("******************");
		arraycalculate.sum(num);
		System.out.println();
		average.average1(num);
		System.out.println();
		arraycalculate.largest(num);

	}

	static void sum(int[] num) {
		int sum = 0;
		for (int a = 0; a < num.length; a++) {
			sum = sum + num[a];
		}
		System.out.println("total sum of numbers = " + sum);
	}

	static void largest(int[] num) {
		Arrays.sort(num);
		System.out.println("the largest input number = " + num[(num.length) - 1]);

	}
}
