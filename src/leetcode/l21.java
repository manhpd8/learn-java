package leetcode;

public class l21 {
    boolean ok=false;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 ==null) return list2;
        if(list2 ==null ) return list1;
        ListNode rootNode;
        if(list1.val<list2.val){
            rootNode = list1;
            list1=list1.next;
        } else {
            rootNode = list2;
            list2=list2.next;
        }
        ListNode cNode = rootNode,nNode;
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                nNode = list1;
                list1=list1.next;
            } else {
                nNode = list2;
                list2=list2.next;
            }
            cNode.next=nNode;
            cNode =nNode;
        }
        if(list1 != null) cNode.next=list1;
        if(list2 != null) cNode.next=list2;
        return rootNode;
    }
}
