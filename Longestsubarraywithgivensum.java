package hashpack;

import java.util.HashMap;
import java.util.Scanner;

//theta(n)--->Time complexity ||  O(n)--->Auxiliary space
public class Longestsubarraywithgivensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int res=Longest(arr,sum);
		System.out.print(res);

	}
	static int Longest(int[] arr,int sum) {
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int res=0,prefix_sum=0;
		for(int i=0;i<arr.length;i++) {
			prefix_sum += arr[i];
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
