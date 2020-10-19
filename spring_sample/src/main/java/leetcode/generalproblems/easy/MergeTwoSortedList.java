package leetcode.generalproblems.easy;
/*
    Created By: Talveen Rakhra
    Created On: 11-09-2020 
    Question URL: https://leetcode.com/problems/merge-two-sorted-lists/
    Time Taken: 
    Complexity: 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] agrs) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.mergeTwoLists(null,null);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        List<Integer> mergedlistNodes = new ArrayList<Integer>();
        while(l1!=null){
            mergedlistNodes.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            mergedlistNodes.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(mergedlistNodes, Collections.reverseOrder());
        ListNode ln = null;
        for(int i=0; i<mergedlistNodes.size();i++){
            if(i==0){
                ln = new ListNode(mergedlistNodes.get(i));
            }
            else{
                ln = new ListNode(mergedlistNodes.get(i), ln);
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
