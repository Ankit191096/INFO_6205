

// Time Complexity = O(N , M) N is headA size and M is headB size
// Space Complexity = O(N,M)
public class Question1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int traverse=0;
        while(l1 != null && l2 != null){
            if(l1 == l2){
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
            if(l1 == null && traverse <= 1){
                l1 = headB;
                traverse++;
            }
            if(l2 == null && traverse <= 1){
                traverse++;
                l2 = headA;
            }
        }
        return null;
    }
}

