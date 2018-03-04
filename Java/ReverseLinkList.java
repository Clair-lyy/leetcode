public class ReverseLinkList {
    public static ListNode reverse(ListNode listNode) {
        ListNode pre = listNode;
        ListNode cur = listNode.getNext();
        ListNode tmp;

        while (cur != null) {
            tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }
        listNode.setNext(null);
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        ListNode reverse = reverse(node1);
        while (reverse != null) {
            System.out.println(reverse.getValue());
            reverse = reverse.getNext();
        }
    }
}
