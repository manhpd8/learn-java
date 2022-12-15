package leetcode;

public class l234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append(head.val);
        while(head.next != null) {
            head = head.next;
            sb.append(head.val);
        }
        String ss = sb.toString();
        String ssR = sb.reverse().toString();
        System.out.println(ss);
        System.out.println(ssR);
        return ss.equals(ssR);
    }
}
