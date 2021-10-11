

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(1) .... for each operation
public class Question3 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int i;
    private int size;

    public MyCircularDeque(int k) {
        head = tail = null;
        i = k;
        size = 0;
    }


    public boolean insertFront(int value) {
        if(size == i){
            return false;
        }
        ListNode newNode=new ListNode(value);
        if(size == 0){
            tail = head = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(size == i){
            return false;
        }
        ListNode newNode = new ListNode(value);
        if(size == 0){
            tail = head = newNode;
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(size == 0){
            return false;
        }
        if(size == 1){
            head = tail = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(size == 0){
            return false;
        }
        if(size ==1 ){
            head = tail = null;
        }
        else{
            ListNode itr = head;
            while(itr.next != tail){
                itr=itr.next;
            }
            tail = itr;
            itr.next = head;
        }
        size--;
        return true;
    }

    public int getFront() {
        if(head == null){
            return -1;
        }
        return head.val;
    }

    public int getRear() {
        if(tail == null){
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == i;
    }
}
