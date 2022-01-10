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
    public ListNode reverseBetween(ListNode head, int start, int end) {
        if(head==null || start==end)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode nodebeforesublist=dummy;
        int pos=1;
        while(pos<start){
            nodebeforesublist=nodebeforesublist.next;
            pos++;
        }
        ListNode workingpointer=nodebeforesublist.next;
        while(start<end){
            ListNode nodetobextracted=workingpointer.next;
            workingpointer.next=nodetobextracted.next;
            nodetobextracted.next=nodebeforesublist.next;
            nodebeforesublist.next=nodetobextracted;
            start++;
        }
        
        return dummy.next;
    }
}