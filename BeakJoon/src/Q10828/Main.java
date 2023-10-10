package Q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			switch (str) {
			case "push":
				int p = sc.nextInt();
				stk.push(p);
				break;
			case "top":
				// stk.peek();		peek은 그냥 맨 위에 있는 내용을 읽는다. pop은 맨 위에 있는 내용을 꺼낸다.
				if(stk.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stk.peek());
				}
				break;
			case "size":
					System.out.println(stk.size());
				break;
			case "empty":
				if(stk.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "pop":
				if(stk.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stk.pop());
				}
				break;
			}
		}
		sc.close();
	}
}
