package Q18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		int n = 0;
		int[] arr = null;
		int rank = 0;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			rank = 0;
			
			String inp = br.readLine();
			StringTokenizer st = new StringTokenizer(inp);
			while(st.hasMoreTokens()) {
				arr[rank++] = Integer.parseInt(st.nextToken());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		int[] ori = arr.clone();
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
				arr[i] += rank++;
		}
		
		for(int i=0; i<n;i++) {
			System.out.print(ori[i] + " ");
		}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		int rank = 0;
//		
//		for(int i=0;i<n;i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		int[] temp = arr.clone();
//		Arrays.sort(arr);
//		
//
//		HashMap<Integer, Integer> hmap = new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if(!hmap.containsKey(arr[i])) {
//				hmap.put(arr[i], rank++);
//			}
//		}
//		
//		for(int i=0; i<n;i++) {
//			sb.append(hmap.get(temp[i])).append(" ");
//		}
//		
//		System.out.println(sb.toString());
	}
}
