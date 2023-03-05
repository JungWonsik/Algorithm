import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // test_case
		
		for(int tc=0; tc<T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] arr = new char[N][M];
			
			for(int r=0; r<N; r++) {
				String str = sc.next();
				char[] crr = str.toCharArray();
				for(int c=0; c<M; c++) {
					arr[r][c] = crr[c];
				}
			}
			
			int min = Integer.MAX_VALUE;
			
			//탐색 시작
			for(int b=1; b<=N-2; b++) {
				for(int r=2; r<=N-1; r++) {
					int cnt = 0;
					// white
					for(int i=0; i<b; i++) {
						for(int j=0; j<M; j++) {
							if(arr[i][j] != 'W') {
								cnt ++;
							}
						}
					}
					// blue
					for(int i=b; i<r; i++) {
						for(int j=0; j<M; j++) {
							if(arr[i][j] != 'B') {
								cnt++;
							}
						}
					}
					// red
					for(int i=r; i<=N-1; i++) {
						for(int j=0; j<M; j++) {
							if(arr[i][j] != 'R') {
								cnt++;
							}
						}
					}
					if(min > cnt) {
						min = cnt;
					}
					
				}
			}
			System.out.println("#"+(tc+1)+" "+min);
			
			
		}

	}
}