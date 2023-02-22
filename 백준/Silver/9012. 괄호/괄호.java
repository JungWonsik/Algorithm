import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	 Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         
         Stack<String> stack = new Stack<>();

         sc.nextLine();
         outer:for (int i = 1; i <= T; i++) {

             String[] s = sc.nextLine().split("");

             for (int j = 0; j < s.length; j++) {
                 String ch = s[j];
                 if (ch.equals("(")) {
                     stack.push(ch);
                 } else {
                     if (stack.empty()) {
                         System.out.println("NO");
                         continue outer;
                     }
                     stack.pop();
                 }
             }
             if (stack.empty()) {
                 System.out.println("YES");
             } else {
                 System.out.println("NO");
             }
             stack.clear();
         }
    	
    	
         
    	
    } //
} //

