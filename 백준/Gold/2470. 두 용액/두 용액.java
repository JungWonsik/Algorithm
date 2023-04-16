import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Long[] arr = new Long[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		
		Arrays.sort(arr);
		
		long min = Integer.MAX_VALUE;
		
		int start = 0;
		int end = arr.length-1;
		int x = start, y = end;
		
		while(start < end) {
			
			// 운이 좋아 처음부터 0이면 걍 출력하고 break
			if( arr[start] + arr[end] == 0  ) {
				x = start;
				y = end;
				break;
			}
			
			
			if( arr[start] + arr[end] < 0  ) {
				 if( Math.abs(arr[start] + arr[end]) < min ) {
					 min = Math.abs(arr[start] + arr[end]);
					 x = start;
					 y = end;
				 }
				 start ++;
			}
			
			else if( arr[start] + arr[end] > 0 ) {
				if( Math.abs(arr[start] + arr[end]) < min ) {
					 min = Math.abs(arr[start] + arr[end]);
					 x = start;
					 y = end;
				 }
				end --;
			}
	
		} // while
		
		System.out.print(arr[x] +" "+arr[y]);
		
		
		
		
	}
}