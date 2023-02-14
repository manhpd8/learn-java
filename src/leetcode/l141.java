package leetcode;

public class l141 {
    public boolean hasCycle(ListNode head) {
        if(head ==null || head.next == null) return false;
        ListNode fastNode = head, slowNode = head;
        while(fastNode.next != null && slowNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if( fastNode ==null || slowNode == null) return false;
            if(fastNode == slowNode) return true;
        }
        return false;
    }
}
