package hashpack;

import java.util.HashSet;
import java.util.Scanner;
//O(n)--Time and space complexity
public class Longestconsecutivesubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int res=subsequence(arr);
		System.out.print(res);


	}
	static int subsequence(int[] arr) {
		
		HashSet<Integer> s = new HashSet<Integer>();
		int res =1;
		for(int x:arr)//adding elements to hash
			s.add(x);
		for(Integer i :s) {//searching in hash table
			if(s.contains(i-1)==false) {//previous element not present
				int curr=1;
				while(s.contains(curr+1))
					curr++;
				res = Math.max(res, curr);
			}
		}
		return res;
	}

}
