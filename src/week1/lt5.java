package week1;

import common.ListNode;

/**
 * 19 删除链表的倒数第 N 个结点
 */
public class lt5 {

    public int N = 0;
    public ListNode HEAD;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        N = n;
        HEAD = head;
        recur(head);
        return HEAD;
    }

    public int recur(ListNode item){
        if(item == null){
            return 0;
        }
        int index = recur(item.next) + 1;
        if(index == N+1){
            item.next = item.next.next;
        }
        if(item == HEAD && index == N){
            HEAD = item.next;
        }

        return index;
    }
}
