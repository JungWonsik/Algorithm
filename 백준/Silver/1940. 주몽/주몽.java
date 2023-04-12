import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 재료의 개수
		int[] arr = new int[N];
		
		int M = sc.nextInt(); // 수 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int total_cnt = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == M) {
					total_cnt ++;
				}
			}
		}
		
		System.out.println(total_cnt);
		
		
	}
}