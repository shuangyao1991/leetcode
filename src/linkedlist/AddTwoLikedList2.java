package linkedlist;

/**
 * Created with by shuangyao on 2016/8/12.
 */

/**
 * Question: You are given two linked list representing two non-negative numbers.
 *           The digits are stored in reverse order and each of their nodes contain
 *           a single digit.Add the two numbers and return it as a linked list.
 * Example:
 *          Input: (2 -> 4 -> 3) + (5 -> 6 -> 4).
 *          Ouptu: 7 -> 0 -> 8.
 */
public class AddTwoLikedList2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (l1 != null || l2 != null){
            if (l1 == null){
                p.next = new ListNode((carry + l2.val) % 10);
                carry = (carry + l2.val) / 10;
                l2 = l2.next;
            } else if (l2 == null){
                p.next = new ListNode((carry + l1.val) % 10);
                carry = (carry + l1.val) / 10;
                l1 = l1.next;
            } else {
                p.next = new ListNode((carry + l1.val + l2.val) % 10);
                carry = (carry + l1.val + l2.val) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (carry != 0){
            p.next = new ListNode(carry);
        }
        return result.next;
    }

    public static void main(String[] args){
        AddTwoLikedList2 instance = new AddTwoLikedList2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        System.out.println(instance.addTwoNumbers(l1, l2).getValues());
    }
}
