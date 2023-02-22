import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
        int[] num = new int[T];

        // Input Data
        for(int i=0; i<T; i++) {
            num[i] = sc.nextInt();
        }
        
        int n = num.length;
        ////////////////////////
		ArrayList<Integer> ans = new ArrayList<Integer>(); 
        	int total = 0;
        	for(int i=0; i<n; i++) {
        		int cnt = 0;
        		
        		for(int j=1; j<=num[i]; j++) {
        			if(num[i] % j == 0) {
        				cnt ++;
        				if(cnt>2) {
        					break;
        				}
        			}
        		}
        		
    			if(cnt==2) {
    				total++;
    			}
        	} // 
     		System.out.println(total);
        
		
	} //
} // 
