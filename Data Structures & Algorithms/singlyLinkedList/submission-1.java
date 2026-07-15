class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        ListNode ln = new ListNode(-1);
        this.head = ln;
        this.tail = ln;
    }

    public int get(int index) {
        ListNode current = this.head.next;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.value;
            }
            i++;
            current = current.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (newNode.next == null) {
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (this.head.next == null) {
            this.head.next = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    public boolean remove(int index) {
        // when removing and head/tail are just initialized then simply return true
        // indexOutOfBound return false

        // starting from dummy head.
        ListNode current = this.head;
        int i = 0;

        // traversing the NODE just before the target node
        while (i<index && current != null) {
            i++;
            current = current.next;
        }

        if (current!=null && current.next!=null){
            if (current.next == this.tail) {
                this.tail = current;
            }
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = this.head.next;
        while(curr!= null){
            list.add(curr.value);
            curr = curr.next;
        }
        return list;
    }
}
