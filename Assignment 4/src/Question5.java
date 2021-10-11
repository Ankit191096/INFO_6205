

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(1)
public class Question5 {
    public int getDecimalValue(ListNode head) {
        int n = head.val;
        while(head.next != null){
            n = n*2 + head.next.val;
            head = head.next;
        }
        return n;
    }
}
