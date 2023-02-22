import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    
    	Scanner sc = new Scanner(System.in);
    	
    	int sugar = sc.nextInt();	 //처음 설탕무
    	
    	int bag = 0;
    	
    	
    	while(true) {
    		
    		if(sugar % 5 == 0) {
    			bag += sugar / 5;
    			System.out.println(bag);
    			break;
    			
    		} else {
    			sugar -= 3;
    			bag++;
    		}	
    		if(sugar<0) {
    			System.out.println(-1);
    			break;
    		}
    		
    		
    	}
    	
    	
    	
    	


    	
    } //
} //


