package Q2739;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		for(int i=inp;i<=inp;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}