import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Rahul", 1000);
		map.put("Ravi", 1100);
		map.put("Hari", 1200);
		map.put("Radhe", 1700);
		System.out.println("Total no. of workers = " + map.size());

		//Set<Entry<String, Integer>> set = map.entrySet();
System.out.println("workers | salary ");
		for (String key : map.keySet())
			System.out.println(key + " - " + map.get(key));
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("");
			System.out.println("enter the name of worker");
			System.out.println("");
			String input = scanner.nextLine();
			scanner.close();

			if (map.containsKey(input)) {
				System.out.println("The current salary of " + input + "=" + map.get(input));
				System.out.println("The updated salary of " + input + "=" + (map.get(input) * 1.5  ));
				System.out.println("");
				break;
			} else {
				System.out.println("");
				System.out.println("No worker found. Please enter the name again ");

			}

		}
	}
}
