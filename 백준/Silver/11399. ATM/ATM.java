

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();	 //처음 설탕무
    	
    	int[] arr = new int[N];
    	
    	int ans = 0;
    	
    	for(int i=0; i<N; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
//    	System.out.println(Arrays.toString(arr));
    	
   
    	
    	for(int i =0; i<N; i++) {
    		ans += arr[i] * (N-i);
    	}
    	System.out.println(ans);
    	/**
    	 * ans = arr[i] * N - i;
    	 * 0 + 01 + 012 + 0123
    	 * [0]은 * n  
    	 * [1]은 n-1 = n-i
    	 * [2]는 n-2 
    	 * [3]은 n-3
    	 * 
    	 */
    	
    	
    	


    	
    } //
} //


