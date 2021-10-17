

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(N)
import java.util.Stack;

public class Question3 {
    public boolean isValid(String s) {
        char chars[] = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(char ch : chars) {
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            } else {
                if(stk.empty()){
                    return false;
                }
                if(ch==')' && stk.pop()!='(') {
                    return false;
                }
                if(ch=='}' && stk.pop()!='{') {
                    return false;
                }
                if(ch==']' && stk.pop()!='[') {
                    return false;
                }
            }
        }
        return stk.empty();
    }
}
