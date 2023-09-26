package Q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		int b = sc.nextInt();
		String b = sc.next();
		sc.close();
		
		//case1 -------------------------------------------------------
		for(int i=2; i >=0; i--) {
			char c = b.charAt(i);
			int ic = Character.getNumericValue(c);
			System.out.println(a*ic);
		}
		int ic2 = Integer.parseInt(b);
		System.out.println(a*ic2);
		
		//case3 -------------------------------------------------------
		/*
		int f = a* (b%10);
		int e = a* (b%100 / 10);
		int c = a* (b /100);
		int sum = a*b;
		
		System.out.println(f);
		System.out.println(e);
		System.out.println(c);
		System.out.println(sum);
		
		int c = a *(b%10);
		int d = a * ((b/10) %10);
		int e = a * (b/100);
		int f = c+(d*10) + (e*100);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		*/
		
		//case2 -------------------------------------------------------
		/*
		  Scanner sc = new Scanner(System.in);
	      int A =sc.nextInt();
	      String B = sc.next();
	   
	      System.out.println(A *(B.charAt(2)-'0'));
	      System.out.println(A *(B.charAt(1)-'0'));
	      System.out.println(A *(B.charAt(0)-'0'));
	      
	      
	      System.out.println(A * Integer.parseInt(B));
	      
	
	      //입력받은 문자열을 숫자로 바꿔주는 Integer.parseInt()
		 */
	}
}
