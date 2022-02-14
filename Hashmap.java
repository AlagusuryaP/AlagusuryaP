package hashpack;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(10,"GFG");// 1st value is key and 2nd is value
		m.put(15,"TECHDOSE");
		m.put(20,"T4TEQ");
		if(m.containsKey(15))//we have m.containsValue()-->To check for value
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(m.get(20));//The value in that key can be retrieved
		System.out.println(m.get(14));//key should be given and if key present value will be retrieved
		m.remove(10);//object key should be given to remove
		System.out.println(m.size());
	}

}
