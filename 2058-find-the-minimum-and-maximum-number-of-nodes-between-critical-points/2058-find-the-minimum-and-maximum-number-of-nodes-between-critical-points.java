/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null ||head.next==null ||head.next.next==null)return new int[]{-1,-1};
        int firstidx=-1;
        int previdx=-1;
        ListNode prev=head;
        ListNode curr=head.next;
        int curridx=1;
        int mindistance=Integer.MAX_VALUE;
        while(curr.next!=null){
            boolean localmin=curr.val<prev.val && curr.val<curr.next.val;
            boolean localmax=curr.val>prev.val && curr.val>curr.next.val;
            if(localmin ||localmax){
                if(firstidx==-1){
                    firstidx=curridx;
                    previdx=curridx;
                }else{
                    mindistance=Math.min(mindistance,curridx-previdx);
                    previdx=curridx;
                }
            }
            curridx++;
            prev=curr;
            curr=curr.next;
        }
        if(mindistance==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        int maxdistance=previdx-firstidx;
        return new int[]{mindistance,maxdistance};
    }
}