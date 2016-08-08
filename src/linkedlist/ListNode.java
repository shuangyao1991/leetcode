package linkedlist;

/**
 * Created with by shuangyao on 2016/8/1.
 */
public class ListNode {

    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public String getValues(){
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        ListNode temp = next;
        while (temp != null){
            sb.append(" -> ");
            sb.append(temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }
}
