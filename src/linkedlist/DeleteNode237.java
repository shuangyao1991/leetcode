package linkedlist;

/**
 * Created with by shuangyao on 2016/8/1.
 */

/**
 *  Question: Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *  Example: Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 *           the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNode237 {

    public void deleteNode(ListNode node) {
        if (node == null) return;

        if (node.next == null){
            node = null;
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
