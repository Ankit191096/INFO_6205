

// Time Complexity = O(N , M) N is l1 size and M is l2 size
// Space Complexity = O(N)
public class Question3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0;
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while(l1 != null || l2 != null || x == 1){
            int sum = 0;
            if(l1 != null){
                sum =sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum =sum + l2.val;
                l2 = l2.next;
            }

            sum = sum + x;
            x = sum / 10;
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
        }
        return temp.next;
    }
}
