// Question => https://leetcode.com/problems/rotate-list/
// Brute force Approach
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        for(int i=0;i<k;i++){
            ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
            ListNode ptr = temp.next;
        
            temp.next = null;
            ptr.next = head;
            head = ptr;
        
    }
        return head;
    }
}
// Time complexity => O(k*n)

// Optimized Approach
class Solution {
    // Edge case
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        // Compute the length of the list
        ListNode curr = head;
        int length = 1;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        // Go till that node
        curr.next = head;
        k = k % length;
        k = length - k;
        while(k-- > 0){
            curr = curr.next;
        }
        // make the node head and break connection
        head = curr.next;
        curr.next = null;
        return head;
        
    }
}
// Time complexity => O(n)
