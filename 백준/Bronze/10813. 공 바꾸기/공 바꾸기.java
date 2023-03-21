import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int M = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			int tmp = 0;
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			tmp = arr[x];
			arr[x]= arr[y];
			arr[y] = tmp;
		
		}
		for(int a : arr) System.out.print(a+" ");
		
	}
}