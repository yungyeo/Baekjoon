package Q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String inp = sc.next();
			boolean boo = true;
			stk.clear();
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					stk.push('(');
				} else {
					if (stk.isEmpty()) {
						boo = false;
						break;
					} else {
						stk.pop();
					}
				}
			}
			if (stk.isEmpty() && boo == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		//Case 1
		/*
		for (int i = 0; i < T; i++) {
			String str = sc.next();

			int c = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					c--;
				} else {
					c++;
					if (c > 0) {
						break;
					}
				}
			}
			if (c == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		*/
		sc.close();
	}
}
