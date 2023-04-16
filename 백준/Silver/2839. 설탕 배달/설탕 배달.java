import java.util.Scanner;

public class Main {	
	
	static int N;
	
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			N = sc.nextInt();
			int cnt = 0;
			
			if(N%5 == 0) {
				cnt = N / 5;
			} else {
				
				while( true ) {
					
					if(N-3 >= 0 && N%5 != 0 ) {
						N = N-3;
						cnt ++;
					}
	 				
					if( N % 5 == 0 ) {
						cnt += N / 5;
						break;
					}
					
					if(N - 3 < 0) {
						cnt = -1;
						break;
					}
					
				}
				
			} 
		
			if(cnt < 0 ) {
				System.out.println(-1);
			} else {
				System.out.println(cnt);
			}
				
		
		
		
		
		}
}