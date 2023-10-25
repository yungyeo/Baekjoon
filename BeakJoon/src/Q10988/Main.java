package Q10988;

import java.util.Scanner;

public class Main {
	private String str;
	private int length, inp = 1;

	public Main() {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		sc.close();
	}

	public void run() {
		length = str.length();

		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				inp = 0;
			}
		}
		System.out.println(inp);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
