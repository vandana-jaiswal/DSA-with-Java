class ListNode {

    int val;
    ListNode next;
    ListNode head;

    public ListNode(int data) {
        
        this.val = data;
        this.next = null;
    }

    ListNode() {

    }
}

public class Example {
    public ListNode addTwoNumbers(new ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum / 0;
            
            
            temp.next = new ListNode(digit);
            temp = temp.next;
        
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    
}