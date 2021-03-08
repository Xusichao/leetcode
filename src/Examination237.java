import PublicClass.ListNode;

/**
 * 删除链表中的节点
 */
public class Examination237 {
    public void deleteNode(ListNode node){
        if (node == null) return;
        if (node.next == null){
            node = null;
            return;
        }
        node.val = node.next.val;
        deleteNode(node.next);
    }
}
