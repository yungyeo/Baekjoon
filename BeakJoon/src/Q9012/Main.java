package Q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();

		boolean a = true;

		for (int i = 0; i < inp; i++) {
			String str = sc.next();

			int c = 0;

			for (int j = 0; j < str.length(); i++) {
				if (str.charAt(j) == ')') {
					c -= 1;
				} else {
					c += 1;
				}
				if (c < 0) {
					a = false;
					break;
				}
			}
			if (a == true && c == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
