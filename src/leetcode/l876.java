package leetcode;

public class l876 {
    public ListNode middleNode(ListNode head) {
        int sizeNode = sizeNode(head);
        int middleNode=sizeNode/2+1;

        int dem=1;
        while(dem <=sizeNode) {
            if(dem== middleNode) return head;
            dem++;
            head = head.next;
        }
        return head;
    }
    public int sizeNode(ListNode head){
        int result =1;
        while(head.next != null) {
            result++;
            head = head.next;
        }
        return result;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
