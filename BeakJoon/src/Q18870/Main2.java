package Q18870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ori = arr.clone();
		Arrays.sort(arr);
		
		int rank = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], rank++);
			}
		}
		
		for(int i=0; i<n;i++) {
			System.out.print(hmap.get(ori[i]) + " ");
		}
		sc.close();
	}
}
