package hashpack;

import java.util.HashMap;
import java.util.Scanner;
//Naive-subtract array2 and array1 at any point if both array sums are equal Maximu length will be retrieved
//O(n)--Time and space complexity
public class longestsubarraywithsamesum {

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
		int res=samesum(arr1,arr2);
		System.out.print(res);

	}
	//three cases
	// 1 0 1
	// 0 0 0
	// 1 1 0
	// 0 1 -1
	static int samesum(int[] arr1,int [] arr2) {
		int[] temp = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			temp[i] = arr2[i] - arr1[i];//to find sum equals to 0 that will be common sum
		}
		int sum =0;
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int res=0,prefix_sum=0;
		for(int i=0;i<temp.length;i++) {
			prefix_sum += temp[i];
			if(prefix_sum == sum)//if first element is sum
				res = i+1;
			if(m.containsKey(prefix_sum)==false)//duplicate is avoided to increase the length
				m.put(prefix_sum, i);//if sum is not seen then insert it in map
			if(m.containsKey(prefix_sum - sum))
				res = Math.max(res, i-m.get(prefix_sum - sum));//-->get objectkey
		}
		return res;
	}

}
