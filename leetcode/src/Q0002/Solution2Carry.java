package Q0002;

public class Solution2Carry {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        int carry=0;
        int t1,t2;
        ListNode current =result;
        while(l1!=null||l2!=null||carry!=0){
            if(l1==null){
                t1=0;
            }
            else{
                t1=l1.val;
                l1=l1.next;
            }
            if(l2==null){
                t2=0;
            }
            else{
                t2=l2.val;
                l2=l2.next;
            }
            int sum=t1+t2+carry;
            int num=sum%10;
            carry=sum/10;
            current.next=new ListNode(num);;
            current=current.next;
        }
        return result.next;
    }
}
