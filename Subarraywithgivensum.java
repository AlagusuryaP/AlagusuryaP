package hashpack;
import java.util.HashSet;
//O(n)--->time and space complexity
import java.util.Scanner;
import java.util.Set;

public class Subarraywithgivensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(Givensum(arr,sum));


	}
	static boolean Givensum(int[] arr,int sum) {
		int pre_sum = 0;
		Set<Integer> gs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			pre_sum += arr[i];
			if(pre_sum == sum)//1st few elements addition leads to sum
				return true;
			if(gs.contains(pre_sum-sum))//At this point prefix_sum - previous hashset value == sum
				return true;
			gs.add(pre_sum);
		}
		return false;
	}

}
