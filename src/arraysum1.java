import java.util.Scanner;

public class arraysum1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values!");
		int val = input.nextInt();

		int[] num = new int[val];
		for (int a = 0; a < val; a++) {
			System.out.println("Enter the value");
			num[a] = input.nextInt();
		}
		arraysum1.sum(num);

	}

	static void sum(int[] num) {
		int total = 0;
		for  (int a = 0; a < num.length; a++) {
			total = total + num[a];

		}
		System.out.println("total sum = " + total);

	}
}