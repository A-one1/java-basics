
public class average {

	static void average1(int[] num) {
		int sum = 0;
		int avg = 0;
		for (int a = 0; a < num.length; a++) {
			sum = sum + num[a];
			avg = sum / (num.length);

		}
		System.out.println("average of input numbers = " + avg);

	}

}
