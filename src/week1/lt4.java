package week1;

import common.ListNode;

/**
 * 234. 回文链表
 */
public class lt4 {
    public boolean isPalindrome(ListNode head) {
        ListNode pre = head,cur = head;
        ListNode prep = null,prec = null;
        while(cur != null && cur.next != null){
            cur = cur.next.next;
            prec = pre;
            pre = pre.next;
            prec.next = prep;
            prep = prec;
        }
        // todo core
        if(cur != null)
            pre = pre.next;

        while(prec != null || pre != null){
            if(prec == null || pre == null){
                return false;
            }
            if(prec.val != pre.val){
                return false;
            }
            prec = prec.next;
            pre = pre.next;
        }
        return true;

    }
}
