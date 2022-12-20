package leetcode;

public class l206 {
    int dem=0;
    public ListNode reverseList(ListNode head) {
        if(head ==null) return null;
        return getLastNode(head, head.next);

    }

    public ListNode getLastNode(ListNode head, ListNode nNext){
        if(dem==0) {
            head.next=null;
            dem++;
        }
        if(nNext != null){
            ListNode nNext2 = nNext.next;
            nNext.next = head;
            return getLastNode(nNext, nNext2);
        } else {
            return head;
        }
    }
}
