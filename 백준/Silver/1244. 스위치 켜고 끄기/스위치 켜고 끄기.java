import java.util.Scanner;

public class Main {
	
	static int[] state;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		state = new int[num+1];
		
		
		for(int i=1; i<state.length; i++) {
			state[i] = sc.nextInt();
		}
		
		int stu = sc.nextInt();
		
		for(int i=0; i<stu; i++) {
			int gender = sc.nextInt();
			
			if(gender == 1) {
				man(sc.nextInt());
			} 
			else if (gender == 2){
				women(sc.nextInt());
			}
		}
		
		for(int i=1; i<state.length; i++) {
			System.out.print(state[i]+" ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
		
		
	
		
	}
	
	public static void man(int x) {
		int cur = x;
		while(cur < state.length) {
			if(state[cur] == 0) {
					state[cur] = 1;
			} 
			else if(state[cur] == 1) {
					state[cur] = 0;
			}
			cur += x;
		}	
	}
	
	public static void women(int x) {
		if(state[x] == 0) {
				state[x] = 1;
		} 
		else if(state[x] == 1) {
				state[x] = 0;
		}
		
		int count = 1;
		while( (x-count) > 0  &&  (x+count)  <  state.length) {
				if(state[x + count ] == state[ x- count]) {
				
					if(state[x+count] == 0) {
								state[x+count] = 1;
								state[x-count] = 1;
					} 
					else if(state[x+count] == 1) {
								state[x+count] = 0;
								state[x-count] = 0;
				}
				count ++;
			}
			else {
				break;
			}
		} // while 
		
	} // method
	
}