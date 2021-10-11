

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(1)
public class Question4 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while(left > 1){
            previous = current;
            current = current.next;
            right--;
            left--;
        }
        ListNode connect = previous;
        ListNode tail = current;
        ListNode third = null;
        while( right > 0){
            third = current.next;
            current.next = previous;
            previous = current;
            current = third;
            right--;
        }
        if(connect != null){
            connect.next = previous;
        } else{
            head = previous;
        }
        tail.next = current;
        return head;
    }
}
