package week1;

import common.ListNode;

public class lt1 {


    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode resHead = new ListNode();
        ListNode pre = resHead;
        do{
            ListNode cur = new ListNode(0);
            if(l1 != null){
                cur.val = cur.val + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                cur.val = cur.val + l2.val;
                l2 = l2.next;
            }
            cur.val = cur.val + temp;
            temp = cur.val / 10;
            cur.val = cur.val % 10;
            pre.next = cur;
        } while(l1 != null || l2 != null);
        // !! 别忘了最后一位
        if(temp > 0){
            ListNode cur = new ListNode(1);
            pre.next = cur;
        }

        return resHead.next;
    }
}
