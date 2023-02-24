import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	LinkedList<Integer> arr = new LinkedList<>();
	
	for(int tc=0; tc<10; tc++) { 
		int idx = sc.nextInt(); // 원본 암호의 길이
		
		for(int i=0; i<idx; i++) { // 원본 암호문
			arr.add(i, sc.nextInt());
		}
		
		
		int gr = sc.nextInt();  
		int cnt = 0;
		
		while(cnt < gr) {
			String cul = sc.next(); 
			cnt++;
			int x = sc.nextInt(); 
			int y = sc.nextInt(); 

			for(int i=0; i<y; i++) {
				int s = sc.nextInt();
				arr.add(x+i, s);
				}
			}
		
			while(arr.size()>10) {
			arr.remove(arr.size()-1);
			}

			System.out.print("#"+(tc+1));
			for(int t=0; t<arr.size(); t++) {
				System.out.print(" "+arr.get(t));
			}
			System.out.println();
			arr.clear();
		}
	}
}
