import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylistpractise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 tv series you have seen");
		List<String> tvshows = new ArrayList<String>();

		for (int a = 0; a <= 4; a++) {
			String name = input.nextLine();
			tvshows.add(name);
		}
		Collections.sort(tvshows);
		
		System.out.println("");
		System.out.println("YOU HAVE ENTERED");
		for (String s : tvshows)
			System.out.println(s.toUpperCase());
		System.out.println("");

		arraylistpractise.add(tvshows);
		System.out.println("");
		arraylistpractise.remove(tvshows);
		System.out.println("");
		System.out.println("Thank you for your time!!!");

	}

	static void add(List<String> tvshows) {
		Scanner input = new Scanner(System.in);
		System.out.println("DO you want to add more?(Y/N)");
		String ans = input.next();

		if (ans.toUpperCase().equals("Y")) {
			System.out.println("");
			System.out.println("Enter the name you want to add");
			String name = input.next();
			tvshows.add(name);
			System.out.println("");
			System.out.println("AFTER ADDITION ");
			for (String s : tvshows)
				System.out.println(s.toUpperCase());

		} else if (ans.toUpperCase().equals("N")) {
			System.out.println();
		}
	}

	static void remove(List<String> tvshows) {
		Scanner input = new Scanner(System.in);
		System.out.println("do you want to remove any of these name?(Y/N)");
		String ans1 = input.next();
		if (ans1.toUpperCase().equals("Y")) {
			System.out.println("");
			System.out.println("Enter the name you want to delete");
			String name = input.next();
			tvshows.remove(name);
			Collections.sort(tvshows);
			System.out.println("");
			System.out.println("AFTER Deletion ");
			for (String s : tvshows)
				System.out.println(s.toUpperCase());

		} else if (ans1.toUpperCase().equals("N")) {
			System.out.println("");
		}
	}
}