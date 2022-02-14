package hashpack;

import java.util.HashSet;
import java.util.Scanner;

//O(m+n)---time and O(m)---Auxiliary space
public class Intersectionoftwounsortedarrays {

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
		int k=Intersect(arr1,arr2);
		System.out.print(k);
	}
	static int Intersect (int[] a,int[] b) {
		int res=0;
		HashSet<Integer> in = new HashSet<Integer>();
		for(int x:a)
			in.add(x);
		for(int x:b) {
			if(in.contains(x)) {
				res++;
				in.remove(x);
			}
		}
		return res;
	}

}
