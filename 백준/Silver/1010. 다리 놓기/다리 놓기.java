import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] memo;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		memo = new int[30][30];
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			sb.append(combination(M, N)).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

	public static int combination(int n, int r) {
		if(n == r || r == 0) 
			return 1; 
		 if (memo[n][r] > 0)
	            return memo[n][r];

	        int result = combination(n - 1, r - 1) + combination(n - 1, r);

	        memo[n][r] = result;

	        return result;
	}
}