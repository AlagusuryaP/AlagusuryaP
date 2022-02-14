package hashpack;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {

	public static void main(String[] args) {
		MyHash mh = new MyHash(7);
		mh.insert(3);
		mh.insert(5);
		mh.insert(56);
		System.out.print(mh.search(5));
		mh.delete(3);
		System.out.print(mh.search(3));

	}
	
}
class MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i<b; i++)
           table.add(new LinkedList<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}
