package Q2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[9];
		int max = 1, cnt = 0, index = 0;
		
		for(int i=0;i<inp.length;i++) {
			inp[i] = sc.nextInt();
			cnt++;
			
			if(inp[i] > max) {
				max = inp[i];
				index = cnt;
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
