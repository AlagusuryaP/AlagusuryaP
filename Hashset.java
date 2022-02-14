package hashpack;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("I");
		h.add("Love");
		h.add("Alagusurya");
		System.out.println(h.size());
		h.remove("I");
		System.out.println(h.contains("Love"));
		Iterator<String> i = h.iterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");
	}

}
