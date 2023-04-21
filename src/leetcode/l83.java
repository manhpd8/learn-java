package leetcode;

public class l83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode curNode = head;
        ListNode nextNode =head.next;
        while (nextNode!= null){
            if(curNode.val == nextNode.val){
                curNode.next = nextNode.next;
                nextNode = nextNode.next;
            } else {
                curNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return head;
    }
}
