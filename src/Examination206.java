import PublicClass.ListNode;

/**
 * 翻转单向链表
 */
public class Examination206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        ListNode tempNext = nextNode.next;      //保存原来的next
        nextNode.next = currentNode;
        reverseList(tempNext);
        return head;
    }

    /**
     * 迭代实现
     * @param head
     * @return
     * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。在更改引用之前，
     * 还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/reverse-linked-list/solution/fan-zhuan-lian-biao-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public ListNode useIterator(ListNode head){
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null){
            ListNode tempNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = tempNode;
        }
        return preNode;
    }

    /**
     * 递归实现
     * @param head
     * @return
     */
    public ListNode useRecursion(ListNode head){
        return head;
    }
}
