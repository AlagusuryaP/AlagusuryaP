package hashpack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//O(m*m)+n*(m+n) in case of naive solution-->We create extra distinct[] arr
//O(n+m) ---> space and time complexity in case of Efficient hash solution
public class Unionoftwounsortedarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		for(int i=0;i<m;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		sc.close();
		int res=Union(arr1,arr2);
		System.out.print(res);

	}
	static int  Union(int[] a,int[] b) {
		Set<Integer> u = new HashSet<>();
		for(int x:a) {
			u.add(x);
		}
		for(int x:b) {
			u.add(x);
		}
		return u.size();
	}

}
