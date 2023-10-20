package Q8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 0; i <= inp; i++) {
			sum += i;

		}
		System.out.print(sum);
	}
}
