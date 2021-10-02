

// Time Complexity = O(N) N is size of list
// Space Complexity = O(1)
public class Question4 {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode ans = new ListNode();
        ListNode mid = new ListNode();
        ListNode[] arr = new ListNode[2];
        arr[0] = ans;
        arr[1] = mid;
        for(int i=1; temp!=null; i++) {
            if(i%2 ==1) {
                ans.next = temp;
                ans = ans.next;
            }else {
                mid.next = temp;
                mid = mid.next;
            }
            temp = temp.next;
        }
        mid.next=null;
        ans.next = arr[1].next;
        return arr[0].next;
    }
}
