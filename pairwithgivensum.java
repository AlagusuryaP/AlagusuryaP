package hashpack;
//Done add all element and check in hash table because it will produce wrong results
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Two pointer approach is best for sorted array with O(nlogn)
//O(n)--Time and space for an unsorted array--Using hashing
public class pairwithgivensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(pair(arr,sum));
	}
	static boolean pair(int[] arr,int sum) {
		Set<Integer> p = new HashSet<Integer>();
		for(int x:arr) {
			if(p.contains(sum-x))
				return true;
			else
				p.add(x);
		}
		return false;
		
	}

}
