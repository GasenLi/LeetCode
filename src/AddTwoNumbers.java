public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean l1Block = false, l2Block = false, initial = true;
        int temp1,temp2,sumTemp,carry = 0;
        ListNode result = new ListNode(0);
        ListNode current = result, previos = current;

        while (l1Block==false || l2Block==false){
           temp1 = l1Block == true ? 0 : l1.val; temp2 = l2Block == true ? 0 : l2.val;

           sumTemp = temp1 + temp2 + carry;
           if(sumTemp >= 10){
               carry = 1;
               sumTemp -= 10;
           }else {
               carry = 0;
           }

           current.val = sumTemp;
           if(initial){
               result = current;
               initial = false;
           }
           current.next = new ListNode(0);
           previos = current;
           current = current.next;

           if(!l1Block){
               l1 = l1.next;
               l1Block = (l1 == null ? true : false);
           }
           if(!l2Block){
               l2 = l2.next;
               l2Block = (l2 == null ? true : false);
           }

        }

        if(carry == 1){
            current.val = 1;
        }else {
            previos.next = null;
        }


        return result;
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(2); ListNode ll1 = l1; l1.next = new ListNode(4); l1 = l1.next; l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5); ListNode ll2 = l2; l2.next = new ListNode(6); l2 = l2.next; l2.next = new ListNode(4);

        ListNode result = addTwoNumbers(ll1, ll2);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}