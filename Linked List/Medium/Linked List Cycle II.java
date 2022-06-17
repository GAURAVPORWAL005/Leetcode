// Question => https://leetcode.com/problems/linked-list-cycle-ii/
// First find the meeting point and from there move slow pointer to head and iterate both pointer if they become equal then it has cycle otherwise not
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
                if(head == null) return head;
        ListNode fast = head, slow = head;
        Boolean loopFound = false;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                loopFound = true;
                break;
            }
        }
        
        if(loopFound == true) {
            slow = head;
            while(fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        
        return null;
    }
}
// Time complexity => O(n)
