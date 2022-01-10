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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode curr=head;
        if(head.next==null)
            return null;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
    
        ListNode dummy=head;
        if(count%2==0){
            for(int i=0;i<count/2-1;i++){
                 dummy=dummy.next;
        }}
        else
        {
            for(int i=0;i<count/2;i++){
                 dummy=dummy.next;
            
        }}
        dummy.next=dummy.next.next;
        return head;
    }
    
    
}