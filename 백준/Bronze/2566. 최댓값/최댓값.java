import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int r=0; r<9; r++) {
			for(int c=0; c<9; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
	
		int max = 0;
		int ridx = 0;
		int cidx = 0;
		
		for(int r=0; r<9; r++) {
			for(int c=0; c<9; c++) {
				if(max < arr[r][c]) {
					max = arr[r][c];
					ridx = r; cidx = c;
				}
			}
		}
		System.out.println(max);
		System.out.print(ridx+1+" ");
		System.out.println(cidx+1);

	} 
}