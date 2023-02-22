import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			// Push
			if(s.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			// Top
			if(s.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.pop()+"\n");
				}
			}
			// Size
			if(s.equals("size")) {
				sb.append(stack.size()+"\n");
			}
			// Empty
			if(s.equals("empty")) {
				if(stack.empty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}
			// Top
			if(s.equals("top")) {
				if(stack.empty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.peek()+"\n");
				}
			}

			
		} // for.
		System.out.print(sb);
		
	} //
} //
