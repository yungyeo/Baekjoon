package Q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[9];
		int sum = 0;

		for (int i = 0; i < inp.length - 1; i++) {
			inp[i] = sc.nextInt();
		}

		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}

		for (int a = 0; a < inp.length; a++) {
			for (int b = 0; b < inp.length; b++) {
				if (a != b) {
					int svnSum = sum - inp[a] - inp[b];
					if (svnSum == 100) {
//					System.out.println(inp[a] + " " + inp[b] + " = " + sum);
					}
					for (int i = 0; i < inp.length; i++) {
						if (i != a && i != b) {
							System.out.println(inp[i]);
						}
					}
					System.exit(0);
				}
			}
		}

		sc.close();
	}
}
