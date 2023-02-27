import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
 
		for(int i=1; i<=N; i++) {
			que.add(i);
		}	
	
	
		int cnt = 0;
		
		while(true) {
			if(que.size() == 0) break;
			cnt++;
			if(cnt % K == 0)  {
				arr2.add(que.poll());
			}else if(cnt % K != 0){
				que.offer(que.poll());
				
			}
		}
		
		sb.append("<");
		for(int i=0; i<arr2.size()-1; i++) {
			sb.append(arr2.get(i)+", ");
			
		}
		sb.append(arr2.get(arr2.size()-1));
		sb.append(">");
		System.out.println(sb);
		
	} 
}