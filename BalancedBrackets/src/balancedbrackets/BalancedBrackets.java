
package balancedbrackets;

import java.util.*;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        String left = "{[(";
        String right= "}])";
        if(s.length()%2 != 0)return false;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
        	if(left.indexOf(s.charAt(i)) > -1){
        		stack.push(s.charAt(i));
        	}
        	else{
        		if(stack.isEmpty())return false;
        		char pop = stack.pop();
        		int indexR = right.indexOf(s.charAt(i));
        		int indexL = left.indexOf(pop);
        		if(indexR != indexL)return false;
        	}
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
