package hashpack;

import java.util.Scanner;

//Theta(n*n) --time and O(1) -- auxiliary space
public class Longestsubarraywithequalnoof01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int res=Bin_Longest(arr);
		System.out.print(res);

	}
	static int Bin_Longest(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int c0= 0;int c1=0;
			for(int j=i;j<arr.length;j++){//subarray-- contiguous elements
				if(arr[j]==0)
					c0++;
				if(arr[j]==1)
					c1++;
				if(c0==c1)
					res = Math.max(res,c0+c1);//addition will give length and largest will be ans
			}
				
		}
		return res;
	}

}
