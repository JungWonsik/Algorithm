import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			arr.add(i, sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<arr.size(); i++) {
			sb.append(arr.get(i)+"\n");
		}
		System.out.println(sb);
		
	} //
} //
