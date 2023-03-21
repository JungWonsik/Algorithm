import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger[] arr = new BigInteger[N+1];
		arr[1] = BigInteger.ONE;
		for (int i = 2; i <= N; i++)
			arr[i] = arr[i-1].multiply(BigInteger.TWO).add(BigInteger.ONE);
		sb.append(arr[N].toString()+"\n");
		if (N <= 20) 
			Hanoi(N, 1, 3);
		System.out.println(sb);
	}
	
	private static void Hanoi(int n, int start, int end) {
		int mid = 6 - start - end;
		if (n == 1) {
			sb.append(start+" "+end+"\n");
			return;
		} 
		Hanoi(n-1, start, mid); 
		Hanoi(1, start, end);
		Hanoi(n-1, mid, end);
		return;
	}
}