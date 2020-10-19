package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 07-09-2020
    Question URL: https://leetcode.com/problems/add-two-numbers/
    Time Taken: 2hrs
    Complexity: Medium
*/

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(null, null);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = new ListNode(0);
        l2 = new ListNode(7, new ListNode(3));
        List<Integer> l1listNodes = new ArrayList<Integer>();
        List<Integer> resultSum = new ArrayList<Integer>();
        List<Integer> l2listNodes = new ArrayList<Integer>();
        while(l1!=null){
            l1listNodes.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            l2listNodes.add(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        int size = l2listNodes.size()>l1listNodes.size()?l2listNodes.size():l1listNodes.size();
        for(int i=0;i<size;i++){
            int sum = carry + (l1listNodes.size()-1>=i?l1listNodes.get(i):0) + (l2listNodes.size()-1>=i?l2listNodes.get(i):0);
            carry = sum / 10;
            resultSum.add(sum%10);
        }
        if(carry>0){
            resultSum.add(carry);
        }
        ListNode ln = null;
        for(int i=resultSum.size()-1;i>=0;i--){
            if(i==resultSum.size()-1){
                if(resultSum.get(i)>=10){
                    ln = new ListNode(resultSum.get(i)%10);
                }
                else{
                    ln = new ListNode(resultSum.get(i));
                }
            }
            else{
                ln = new ListNode(resultSum.get(i), ln);
            }
        }

        return ln;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
