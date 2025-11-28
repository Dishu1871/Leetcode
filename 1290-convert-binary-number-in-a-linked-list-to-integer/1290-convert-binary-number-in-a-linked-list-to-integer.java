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
    public int getDecimalValue(ListNode head) {
        Stack<Integer>temp=new Stack();
        ListNode a=head;
        while(a!=null){
            temp.push(a.val);
            a=a.next;
        }
        int ans=0,i=0;
        while(!temp.isEmpty()){
            ans+=temp.pop()* Math.pow(2,i);
            i++;
        }
        return ans;
    }
}