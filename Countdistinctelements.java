package hashpack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//Hashset won't allow duplicates --->Important advantage
//O(n) Time and Auxiliary space is required.
public class Countdistinctelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Integer arr[] = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(Distinct(arr));
		
	}
	static int Distinct(Integer[] arr) {
		HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));//In place changes to list set eliminates dupliactes
		return h.size();
	}

}
