import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		for(int tc=1; tc<=T; tc++) {
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			
			for(int i=0; i<N; i++) {
					String str = sc.next(); // 14054 "14054"
					for (int j = 0; j < N; j++)
						arr[i][j] = str.charAt(j) - '0';
				}

//			for (int[] a : arr) System.out.println(Arrays.toString(a));
			
			/////////////////////
			int sum = 0;
			int mid = N/2;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(c<N  && c>=0 && c>=Math.abs(mid-r) && c< N-Math.abs(mid-r)) {
						sum += arr[r][c];
					}
				}
			}
			System.out.println("#"+tc+" "+sum);
			
			
		} // tc_for
		
		
	}
}