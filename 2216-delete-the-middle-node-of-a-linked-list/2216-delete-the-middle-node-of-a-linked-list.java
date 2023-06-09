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
    if(head == null || head.next == null) return null;
    ListNode temp = head;
    int count = 0;
    while(temp != null){
        temp = temp.next;
        count++;
    }   
    temp = head;
    int n = (count/2)-1;
    while(n-->0){
    temp = temp.next;
    }
    temp.next = temp.next.next;

    return head;
    }
}