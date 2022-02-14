package hashpack;

import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Scanner;
//O(n) -- Time and space complexity
public class PrintNbyK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		NbyK(arr,n,k);
		sc.close();

	}
	static void NbyK(int[] arr,int n,int k) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int x:arr) {
			hm.put(x,hm.getOrDefault(x, 0)+1);
		}
		for(Entry<Integer,Integer> e:hm.entrySet()) {
			if(e.getValue() >n/k ) {
				System.out.print(e.getKey()+" ");
			}
		}
		
	}

}
