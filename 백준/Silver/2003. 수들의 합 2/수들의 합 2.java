import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		int start = 0, end = 0, cnt = 0;
		
		while(true) {
			
			if(sum >= M) {
					sum -= arr[start++];
			} 
			else if(end >= arr.length) {
					break;
			}
			else {
					sum += arr[end++];
			}
			
			if(sum == M) {
					cnt ++;
			}
			
		} // 
		
		System.out.println(cnt);
		
	}
}