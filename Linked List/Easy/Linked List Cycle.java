// Question => https://leetcode.com/problems/linked-list-cycle/submissions/
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
// space complexity => O(n)
// TIme complexity => O(n)
