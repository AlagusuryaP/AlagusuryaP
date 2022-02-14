package hashpack;

import java.util.HashMap;
import java.util.Scanner;

//O(n-k) ----> Time complexity O(k)--space complexity
public class Countdistinctinwindow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		distinct_window(arr,n,k);
		sc.close();
		

	}
	static void distinct_window(int[] arr,int n,int k) {
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<k;i++) {// first four elements are inserted in the map
			h.put(arr[i],h.getOrDefault(arr[i],0)+1);
		}
		System.out.print(h.size()+" ");//size of map is printed
		for(int i = k;i<n;i++) {//Adding again requires another loop
			h.put(arr[i-k],h.getOrDefault(arr[i-k],0)-1);
			if(h.get(arr[i-k])==0) {
				h.remove(arr[i-k]);
			}
			h.put(arr[i],h.getOrDefault(arr[i],0)+1);
			System.out.print(h.size()+" ");
		}
	}

}
