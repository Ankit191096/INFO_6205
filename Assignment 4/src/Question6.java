

// Tried on Leetcode
// Time Complexity = O(N)
// Space Complexity = O(1) for each operation
public class Question6 {
    private class Node {
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
    }
    Node head = null;
    Node tail = null;
    Node mid = null;
    int size = 0;

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
            mid = newNode;
            size++;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
            if(size%2 == 0){
                mid = mid.prev;
            }
        }
    }

    public void pushMiddle(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
            mid = newNode;
            size++;
        } else {
            if(size == 1) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
            } else {
                if(size%2 != 0) {
                    newNode.next = mid;
                    newNode.prev = mid.prev;
                    mid.prev.next = newNode;
                    mid.prev = newNode;
                } else {
                    newNode.prev = mid;
                    newNode.next = mid.next;
                    mid.next.prev = newNode;
                    mid.next = newNode;
                }
                mid = newNode;
                size++;
            }
            mid = newNode;
        }
    }

    public void pushBack(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
            mid = newNode;
            size++;
        } else {
            Node cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.prev = cur;
            tail = newNode;
            size++;
            if(size%2 != 0) {
                mid = mid.next;
            }
        }
    }

    public int popFront() {
        if(head != null) {
            if(size%2 == 0){
                mid = mid.next;
            }
            size--;
            int i = head.val;
            head = head.next;
            if(head != null && head.next != null){
                head.prev = null;
            }
            return i;
        }
        return -1;
    }

    public int popMiddle() {
        if(head != null) {
            if(size == 1) {
                int i = head.val;
                head = null;
                size--;
                mid = null;
                return i;
            } else {
                int i = mid.val;
                if(mid == head) {
                    head = head.next;
                    head.prev = null;
                    mid = head;
                } else {
                    mid.next.prev = mid.prev;
                    mid.prev.next = mid.next;
                    if(size%2 != 0){
                        mid = mid.prev;
                    }
                    else{
                        mid = mid.next;
                    }
                }
                size--;
                return i;
            }
        }
        return -1;
    }

    public int popBack() {
        if(head != null) {
            if(size%2 != 0){
                mid = mid.prev;
            }
            size--;
            if(head.next == null) {
                int i = head.val;
                head = null;
                return i;
            } else {
                int i = tail.val;
                tail.prev.next = tail.next;
                tail = tail.prev;
                return i;
            }
        }
        return -1;
    }
}
