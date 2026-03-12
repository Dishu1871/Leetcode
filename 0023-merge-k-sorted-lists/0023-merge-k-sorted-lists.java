/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { 
 *         this.val = val; 
 *         this.next = next; 
 *     }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> v1 = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                v1.add(temp.val);
                temp = temp.next;
            }
        }

        if (v1.size() == 0) {
            return null;
        }

        Collections.sort(v1);

        ListNode l1 = new ListNode(v1.get(0));
        ListNode current = l1;

        int j = 1;
        while (j < v1.size()) {
            current.next = new ListNode(v1.get(j));
            current = current.next;
            j++;
        }

        return l1;
    }
}