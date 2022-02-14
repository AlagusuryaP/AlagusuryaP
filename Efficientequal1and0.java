package hashpack;

import java.util.HashMap;
import java.util.Scanner;

//O(n)--time and space
public class Efficientequal1and0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int res=Long(arr);
		System.out.print(res);


	}
	
	static int Long(int[] arr) {
			int sum =0;
			HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
			int res=0,prefix_sum=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0)
					arr[i]=-1;//to change it to longest with given sum
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
