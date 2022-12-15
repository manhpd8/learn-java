package leetcode;

import java.math.BigInteger;

public class l2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        n1.append(l1.val);
        n2.append(l2.val);
        while (l1.next != null) {
            l1 = l1.next;
            n1.append(l1.val);
        }
        while (l2.next != null) {
            l2 = l2.next;
            n2.append(l2.val);
        }
        BigInteger b1 = new BigInteger(n1.reverse().toString());
        BigInteger b2= new BigInteger(n2.reverse().toString());
        String sResult = new StringBuilder(b1.add(b2).toString()).reverse().toString();
        if(sResult.length()==1){
            return new ListNode(sResult.charAt(0) -48);
        }
        System.out.println(sResult);
        //708
        ListNode nNext = new ListNode();
        ListNode nRoot = new ListNode(sResult.charAt(0) -48, nNext);
        for(int i=1;i<sResult.length();i++){
            nNext.val=sResult.charAt(i)-48;
            ListNode node = new ListNode();
            if(i<sResult.length()-1) {
                nNext.next = node;
                nNext = node;
            } else {

            }

        }
        return nRoot;
    }
}
