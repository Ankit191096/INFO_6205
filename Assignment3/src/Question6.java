

// Time Complexity = O(N) N is size of list
// Space Complexity = O(1)
public class Question6 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 != null && ptr2.next != null){
            ptr2 = ptr2.next.next;
            ptr1 = ptr1.next;
            if(ptr1 == ptr2){
                break;
            }
        }
        if(ptr2 == null || ptr2.next == null){
            return null;
        }
        ptr2 = head;
        while(ptr2 != ptr1){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}

