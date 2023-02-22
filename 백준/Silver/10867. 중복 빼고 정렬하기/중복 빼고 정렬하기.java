import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// 중복을 자동으로 제거해주는 HashSet으로 input값을 받고
        // 정렬과 원소 출력을 위해 ArrayList로 변환하여 사용
        
		HashSet<Integer> arr = new HashSet<Integer>();
		
		for(int i=0; i<T; i++) {
			arr.add(sc.nextInt());
		}
		ArrayList<Integer> f_arr = new ArrayList<Integer>(arr);
		Collections.sort(f_arr);
		
		for(int i=0; i<f_arr.size(); i++) {
			System.out.print(f_arr.get(i)+" ");
		}
		
		
	}
}
