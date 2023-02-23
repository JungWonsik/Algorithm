import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>(); 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=T; i++) {
			int k = sc.nextInt();
			for(int j=0; j<k; j++) {
				int kc = sc.nextInt();
				if(kc!=0) {
					stack.add(kc);
				}else {
					stack.pop();
				}
			}
			if(stack.size()==0) {
				System.out.println("#"+i+" "+0);
			}else {
				for(int s=0; s<stack.size(); s++) {
					sum += stack.get(s);
				}
			}
			System.out.println("#"+i+" "+sum);
			stack.clear();
			sum = 0;
		}
			
	
	}
}