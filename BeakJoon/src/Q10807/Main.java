package Q10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inp = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			inp[i] = sc.nextInt();
		}
		int v = sc.nextInt();

		for (int i = 0; i < inp.length; i++) {
			if (v == inp[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}