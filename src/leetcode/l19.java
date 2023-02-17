package leetcode;

public class l19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null){
            if(n==0) return head;
            if(n==1) return null;
        }
        ListNode nextNode = head;
        int lengthNode = 0;
        while (nextNode != null){
            lengthNode++;
            nextNode = nextNode.next;
        }
        System.out.println("lengthNode: "+lengthNode);
        if(lengthNode == n) return head.next;

        nextNode = head;
        for(int i=1;i<lengthNode-n;i++){
            nextNode = nextNode.next;
        }
        System.out.println("nodeNext: " + nextNode.val);
        if(nextNode.next != null) {
            nextNode.next = nextNode.next.next;
        }

        return head;
    }
}
