import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {

		Map<Integer, String> hash = new HashMap<Integer, String>();

		hash.put(99, "Madson");
		hash.put(11, "Ash");
		hash.put(101, "Jack");
		hash.put(7, "Nova");

//		Map<Integer, String> map = Collections.synchronizedMap(hash);
//		Set<Entry<Integer, String>> set = map.entrySet();
//		
//		synchronized (map) {
//			Iterator<Entry<Integer, String>> i = set.iterator();
//			while (i.hasNext()) {
//				Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) i.next();
//				System.out.print(me.getKey() + ": ");
//				System.out.println(me.getValue());
//			}
//		}

		Set<Entry<Integer, String>> set = hash.entrySet();
		for (Entry<Integer, String> s : set) {

			System.out.println(s.getKey() + " = " + s.getValue());

		}

	}
}
