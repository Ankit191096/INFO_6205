

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(1)
public class Question1 {
    public static int myAtoi(String s) {
        double result = 0;
        boolean isNegative = false;
        int length = s.length();
        int start = 0, end = length - 1;
        while(start < length && s.charAt(start) == ' '){
            start++;
        }
        while(end > start && s.charAt(end) == ' '){
            end--;
        }
        if(start > end){
            return 0;
        }
        char ch = s.charAt(start);
        if(ch == '-'){
            isNegative = true;
        }else if(ch == '+'){
            isNegative = false;
        }else if(ch <= '9' && ch >= '0'){
            result = ch - '0';
        }else{
            return 0;
        }
        for(int i = start + 1; (i <= end && s.charAt(i) <= '9' && s.charAt(i) >= '0'); i++){
            result = result * 10 + s.charAt(i) - '0';
        }
        if(isNegative){
            result = 0 - result;
        }
        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}
