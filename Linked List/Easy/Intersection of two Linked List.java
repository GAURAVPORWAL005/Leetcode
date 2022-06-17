// Question => https://leetcode.com/problems/intersection-of-two-linked-lists/
// we start both the list from the same node to get intersection
// Brute Force Approach
// first calculate the size of both the linkedlist then start the largest list from the node (difference in size of both the list) and find intersection.
// Better Approach
// Using HashSet
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode a = headA;
        ListNode b = headB;
        while(a != null){
            set.add(a);
            a = a.next;
        }
        while(b != null){
            if(set.contains(b)){
                return b;
            }
            b = b.next;
        }
        return null;
    }
}
// Time complexity => O(m*n)

// Optimized Approach
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
            ListNode a = headA;
            ListNode b = headB;
        while(a != b){
            a = (a == null) ? headB: a.next;
            b = (b == null) ? headA: b.next;
        }
        return a;
    }
}

// Time Complexity => O(n+m)
