import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[][] chr = new char[5][15];
		int max = 0;
		
		
		for(int r=0; r<5; r++) {
			String str = sc.next();
			for(int c=0; c<str.length(); c++) {
				chr[r][c] = str.charAt(c);
			}
		}
		
		for(int c=0; c<15; c++) {
			for(int r=0; r<5; r++) {
				if(chr[r][c] =='\0' || chr[r][c] == ' ') continue;
				System.out.print(chr[r][c]);
		} 
			}

	}
}