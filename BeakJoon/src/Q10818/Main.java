package Q10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inp = new int[N];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		Arrays.sort(inp);
		System.out.print(inp[0] + " " + inp[N-1]);
		sc.close();
	}
}