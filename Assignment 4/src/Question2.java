

// Time Complexity O(N)
// Space Complexity O(1)
public class Question2 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode insert(ListNode head, int i){
        ListNode solution = new ListNode(i);
        if (head == null) {
            solution.next = solution;
            return solution;
        }
        ListNode current = head;
        while(current.next != head && !(current.val <= i && i <= current.next.val) || (current.val > current.next.val && (current.next.val > i || current.val < i))){
            current = current.next;
        }
        solution.next = current.next;
        current.next = solution;
        return head;
    }
}