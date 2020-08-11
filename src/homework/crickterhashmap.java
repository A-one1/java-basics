package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class crickterhashmap {
	public static void main(String[] args) {

		Map<String, Integer> cmap = new HashMap<>();
		System.out.println("Cricketer | No. of Centuries");
		cmap.put("Rohit ", 101);
		cmap.put("Paras ", 150);
		cmap.put("Shane ", 99);
		cmap.put("Dhoni ", 78);

		System.out.println("---------------> Using For Loop");

		for (Entry<String, Integer> key : cmap.entrySet()) {
			System.out.println(key.getKey() + " = " + key.getValue());
		}
		for (String key : cmap.keySet()) 
			System.out.println(key + " = " + cmap.get(key));
		
		System.out.println("---------------> Using ForEach Loop");
		
		cmap.forEach((key, value) -> System.out.println(key + " = " + value));
		
		System.out.println("---------------> Using While Loop");
		Iterator<Entry<String, Integer>> it = cmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> it1 = (Map.Entry<String, Integer>) it.next();

			System.out.println(it1.getKey() + " = " + it1.getValue());
		}

	}

}
