package leetcode;

public class l160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenga=1,lengb=1;
        ListNode ra =headA, rb =headB;
        while(ra.next != null) {
            ra = ra.next;
            lenga++;
        }
        while (rb.next != null) {
            rb = rb.next;
            lengb++;
        }
        if(ra != rb) return null;
        ra =headA; rb =headB;
        if(lenga > lengb){
            for(int i=1;i<=lenga-lengb;i++) ra = ra.next;
        } else {
            for(int i=1;i<=lengb-lenga;i++) rb = rb.next;
        }
        while(true){
            if(ra== rb) return ra;
            ra = ra.next;
            rb = rb.next;
        }
    }
}
