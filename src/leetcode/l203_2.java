package leetcode;

public class l203_2 {
    public ListNode removeElements(ListNode head, int val) {
        while (head !=null && head.val==val) head=head.next;
        ListNode root=head;
        if(head==null) return null;
        ListNode beforeNode;//chac chan != val
        beforeNode=head;
        System.out.printf("befo"+beforeNode.val);
        head=head.next;
        while (head!=null){
            if(head.val != val){
                beforeNode.next=head;
                beforeNode = head;
            }
            head = head.next;
        }
        beforeNode.next=null;
        return root;
    }
}
