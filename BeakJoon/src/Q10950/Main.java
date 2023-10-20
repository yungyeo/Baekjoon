package Q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		int sum = 0;
		
		for(int i=0;i<T;i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			sum = A[i] + B[i];
			
			System.out.println(sum);
		}
		sc.close();
	}
}
