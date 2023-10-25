package Q2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inp = new int[N];

		for (int i = 0; i < N; i++) {
			inp[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			Arrays.sort(inp);
			System.out.println(inp[i]);
		}
		sc.close();
	}
}
