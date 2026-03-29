package Q0002;


import java.math.BigInteger;

class Solution1BigInteger {
    public int length(ListNode l){
        ListNode pointer = l;
        int len=1;
        while(pointer.next!=null){
            pointer=pointer.next;
            len++;
        }
        return len;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        BigInteger sum1=new BigInteger("0");
        BigInteger sum2=new BigInteger("0");
        int step1=0;
        int step2=0;
        while(p1!=null){
            BigInteger power = BigInteger.TEN.pow(step1);
            BigInteger term = BigInteger.valueOf(p1.val).multiply(power);
            sum1 = sum1.add(term);
            p1=p1.next;
            step1++;
        }
        while(p2!=null){
            BigInteger power = BigInteger.TEN.pow(step2);
            BigInteger term = BigInteger.valueOf(p2.val).multiply(power);
            sum2 = sum2.add(term);
            p2=p2.next;
            step2++;
        }
        BigInteger sum3=new BigInteger(String.valueOf(sum1.add(sum2)));
        String str= sum3.toString();
        ListNode l3=new ListNode();
        ListNode p3=l3;
        l3.val=str.charAt(str.length()-1)-'0';
        for(int i=1;i<str.length();i++){
            p3.next=new ListNode(str.charAt(str.length()-1-i)-'0');;
            p3=p3.next;
        }
        return l3;

    }
}