package PublicClass;

/**
 * 链表
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public int getLength(ListNode head){
        if (head == null) return 0;
        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null){
            length++;
            currentNode = head.next;
        }
        return length;
    }
}
