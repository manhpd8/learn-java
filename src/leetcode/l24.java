package leetcode;

public class l24 {
    ListNode beforeNode;
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode rootNode = head.next;
        swapNode(head);
        return rootNode;
    }

    void swapNode(ListNode head) {
        if(head ==null || head.next == null) return;
        ListNode currentNode = head.next;
        head.next = head.next.next;
        currentNode.next = head;
        if(beforeNode!=null) beforeNode.next = currentNode;

        beforeNode = head;
        swapNode(head.next);
    }
}
