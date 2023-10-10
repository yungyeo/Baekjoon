package Q2292;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int cnt = 1, r = 1;

		while (true) {
			if (inp <= r) {
				break;
			}
			r = r + 6 * cnt++;
		}
		System.out.println(cnt);
	}
}
