package hashpack;
//O(nsquare) and O(1)-->Naive solution
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Freq(arr);
		
	}
	static void Freq(int[] arr) {
		int n = arr.length;
		boolean flag = false;
		for(int i =0;i<n;i++) {
			for(int j = 0;j<i;j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==true)
				continue;
			int freq = 1;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j])
					freq++;
			}
			System.out.println(arr[i]+" "+freq);
		}
		
	}

}
