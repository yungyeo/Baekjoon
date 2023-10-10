package Q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		int add = 2;
		int cnt = 1;

		if (inp == 1) {
			System.out.println(1);
		} else {
			while (add < inp) {
				add = add + (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
