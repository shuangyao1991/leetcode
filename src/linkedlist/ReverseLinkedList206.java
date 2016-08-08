package linkedlist;

/**
 * Created with by shuangyao on 2016/8/8.
 */

/**
 * Question: Reverse a singly linked list.
 */
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode root = head;
        ListNode p = root.next;
        root.next = null;
        ListNode q ;
        while (p != null){
            q = p.next;
            p.next = root;
            root = p;
            p = q;
        }
        return root;
    }

    public static void main(String[] args){
        ReverseLinkedList206 instance = new ReverseLinkedList206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(head.getValues());
        System.out.println(instance.reverseList(head).getValues());
    }
}
