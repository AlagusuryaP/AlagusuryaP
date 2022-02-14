package hashpack;
//O((n-k)*k*k)---Time complexity
import java.util.Scanner;

public class distinctwindoweff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		distinct_window_eff(arr,n,k);
		sc.close();

	}
	static void distinct_window_eff(int[] arr,int n,int k) {
		
		for(int i=0;i<=n-k;i++) {//Total k times loop must run
			int count =0;
			for(int j=0;j<k;j++) {//for each element k time runs
				boolean flag = false;
				for(int p=0;p<j;p++) {
					if(arr[i+j] == arr[i+p]){//check for match in previous values
						flag = true;
						break;
					}
				}
				if(flag == false)count++;
				
			}
			
			System.out.print(count+" ");
		}
	}

}
