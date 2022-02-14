package hashpack;
import java.util.HashMap;
import java.util.Map.Entry;
//O(n)--Time and O(n)--Auxiliary space
import java.util.Scanner;

public class EffFreq {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();
			Frequencyofelements(arr);
			
	}
	static void Frequencyofelements(int[] arr) {
		int n = arr.length;
		HashMap<Integer,Integer> k = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(k.containsKey(arr[i])==true) 
				k.put(arr[i],k.get(arr[i])+1);
			else
				k.put(arr[i],1);
		}
		//The above can be replaced
		/*for(int x:arr){
		 * k.put(x,k.getorDefault(x,0)+1);
	}*/
		for(Entry<Integer, Integer> i :k.entrySet())
			System.out.println(i.getKey()+" "+i.getValue());
	}

}
