package Q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		
		int back = 0;
		int num = 0;
		String cmd = "";

		try {
			int N = Integer.parseInt(bf.readLine());

			for (int i = 0; i < N; i++) {
				String str = bf.readLine();
				StringTokenizer st = new StringTokenizer(str);
				
				if(st.countTokens() == 2) {
					cmd = st.nextToken();
					num = Integer.parseInt(st.nextToken());
				}else {
					cmd = st.nextToken();
				}
//				System.out.print(cmd + " " + num);
				
				switch (cmd) {
				case "push":
					q.offer(num);
					break;
				case "front":
					if (q.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(q.peek());
					}
					break;
				case "back":
					if (q.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(back);
					}
					break;
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					if (q.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "pop":
					if (q.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(q.poll());
					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
