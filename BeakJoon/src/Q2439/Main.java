package Q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		for(int i=0;i<inp;i++) {
			for(int j=inp-1;j>=0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
