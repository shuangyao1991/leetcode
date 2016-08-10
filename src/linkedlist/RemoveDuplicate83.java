package linkedlist;

/**
 * Created by flyig.
 * Date: 2016/8/10.
 */

/**
 * Questions: Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example:
 *          Given 1->1->2, return 1->2.
 *          Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicate83 {

    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null){
//            return head;
//        }
        ListNode p = head;
        while (p != null && p.next != null){
            if (p.val == p.next.val){
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        RemoveDuplicate83 insatnce = new RemoveDuplicate83();
        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
        System.out.println(insatnce.deleteDuplicates(head).getValues());
    }
}
