

// Time Complexity = O(N) N is size of list
// Space Complexity = O(1)
public class Question2 {
    public ListNode removeElements(ListNode head, int val) {
        while( head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
