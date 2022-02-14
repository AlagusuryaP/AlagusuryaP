package hashpack;

import java.util.Scanner;

//o(nk)--time and O(k-1)---space
public class PrintNbyKforHigerValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		printNbyK(arr,n,k);
		sc.close();


	}
	static void printNbyK(int[] arr,int n,int k) {
		
	}

}
