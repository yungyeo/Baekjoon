package Q10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		sc.close();

		System.out.println((inp1 + inp2) % inp3);
		System.out.println(((inp1 % inp3) + (inp2 % inp3))%inp3);
		System.out.println((inp1 * inp2) % inp3);
		System.out.println(((inp1 % inp3) * (inp2 % inp3))%inp3);
	}
}
