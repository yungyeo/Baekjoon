package Q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] inp = new int[n];

		for (int i = 0; i < n; i++) {
			inp[i] = sc.nextInt();
			if (x > inp[i]) {
				System.out.print(inp[i] + " ");
			}
		}
		sc.close();
	}
}
