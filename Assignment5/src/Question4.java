

// Tried on Leetcode
// Time Complexity = O(N ^ 2)
// Space Complexity =O(1)
public class Question4 {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        if(n == 2) {
            return "11";
        }
        String s = countAndSay(n-1);
        return talk(s);
    }

    public String talk(String s){
        int i=0;
        int count =1;
        StringBuilder sb = new StringBuilder();
        while(i< s.length()){
            while(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
            count=1;
            i++;
        }
        return sb.toString();
    }
}
