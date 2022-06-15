// Question => https://leetcode.com/problems/reverse-linked-list/

// we reverse the list with the help of three pointer current, previous and next
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
      }
    }
// Time complexity = >O(n)
