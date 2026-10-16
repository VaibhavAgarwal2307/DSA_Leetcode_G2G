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
    public ListNode middleNode(ListNode head) {
        
        ListNode curr=head;
        int c=0, k=0;

        while(curr!=null)
        {
            curr=curr.next;
            c++;
        }
        curr=head;

      while(k!=c/2)
      {
        curr=curr.next;
        k++;
      }

        return curr;
    }
}