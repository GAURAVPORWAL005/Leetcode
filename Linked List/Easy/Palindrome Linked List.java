// Question => https://leetcode.com/problems/palindrome-linked-list/
// Brute force Approach
// Using ArrayList
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        for(int i=0;i<n;i++){
            if(list.get(i) != list.get(n-1-i)){
                return false;
            }
        }
        return true;
    }
}

// Time Complexity => O(n)
// Space complexity => O(n)

// Optimized Approach
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
            ListNode fast = head;
            ListNode slow = head;
            while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
                slow = slow.next;
            }
            slow.next  = reverseList(slow.next);
            slow = slow.next;
        // Fine middle of the linked List
                while(slow != null){
                    if(head.val != slow.val){
                        return false;
                    }
                    head = head.next;
                    slow = slow.next;
                }
                return true;
        }
            // Reverse the linked list
             ListNode reverseList(ListNode head){
                   ListNode previous = null;
                ListNode next = null;
                while(head != null){
                next = head.next;
                head.next = previous;
                previous = head;
                head = next;
                }
                return previous;
             }    
}

// Time complexity => O(n)
// Space complexity => O(1)
