package Q2742;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		for(int i = inp; i >= 1; i--) {
			System.out.println(i);
		}
	}
}