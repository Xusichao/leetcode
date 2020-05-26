import PublicClass.ListNode;

/**
 * 合并两个有序链表
 */
public class Examination21 {
    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while (l1 != null){
            while (l2 != null){
                if (l1.val < l2.val){
                    ListNode temp1 = l1.next;
                    ListNode temp2 = l2.next;
                    l1.next = l2;
                    l2.next = temp1;
                    l2 = temp2;
                }
            }
        }
        return l1;
    }

    public ListNode useRecursion(ListNode l1, ListNode l2){
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

    }
}
