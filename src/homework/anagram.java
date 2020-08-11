package homework;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two string values");

		String inp1 = input.nextLine();
		String inp2 = input.nextLine();
		input.close();
		anagram.checkanagram(inp1, inp2);
		
}

	private static void checkanagram(String inp1, String inp2) {
		char[] char1 = inp1.toLowerCase().toCharArray();
		char[] char2 = inp2.toLowerCase().toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		if (Arrays.equals(char1, char2)) {
			System.out.println(inp1 + " and " + inp2 + " are anagrams");
		} else {
			System.out.println(inp1 + " and " + inp2 + " are not anagrams");
		}
	}		
	}
