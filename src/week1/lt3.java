package week1;

import common.ListNode;

/**
 * 142 环形链表
 */
public class lt3 {

    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode cur = head;
        ListNode pre = head;
        do{
            if(pre == null || pre.next == null){
                return null;
            }
            cur = cur.next;
            pre = pre.next.next;
        }while(cur != pre);

        while(cur != temp){
            cur = cur.next;
            temp = temp.next;
        }

        return temp;
    }
}
