package Q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		System.out.println(T);

		for (int t = 0; t < T; t++) {
			String score = sc.next();

			int sum = 0, cnt = 1;
			for (int i = 0; i < score.length(); i++) {

				if (score.charAt(i) == 'O') {
					sum += cnt++;
				} else {
					cnt = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();

		/*
		String str[] = new String[sc.nextInt()];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		sc.close();

		for (int i = 0; i < str.length; i++) {
			int cnt = 0;
			int sum = 0;

			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		*/
	}
}
