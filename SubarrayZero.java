package hashpack;
//O(n)-->TIME AND SPACE COMPLEXITY
//It is like if you get the sun you hav egot already means some cancellations has happened in between.
//Or else addition of all values might lead to zero at some specific position
import java.util.HashSet;
import java.util.Scanner;

public class SubarrayZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(zero(arr));

	}
	static boolean zero(int[] a) {
		int n = a.length;
		int prefix_sum = 0;
		HashSet<Integer> z = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			prefix_sum += a[i];
			if(z.contains(prefix_sum))
				return true;
			if(prefix_sum ==0)
				return true;
			z.add(prefix_sum);
			}
		return false;
		
	}

}
