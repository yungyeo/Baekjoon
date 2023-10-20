package Q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		if(inp >= 90 && inp <= 100) {
			System.out.println("A");
		}else if(inp >= 80 && inp <= 89) {
			System.out.println("B");
		}else if(inp >= 70 && inp <= 79) {
			System.out.println("C");
		}else if(inp >= 60 && inp <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
