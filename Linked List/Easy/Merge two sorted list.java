// QUesiton => https://leetcode.com/problems/merge-two-sorted-lists/
// here we are using extra space by creating new node
// Brute force Approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = null;
        temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                temp = temp.next;
            }
            temp = temp.next;
        }
        if(list1 == null){
            temp.next = list2;
        }
        else{
            temp.next = list1;
        }
        return dummy.next;
    }
}
// Time complexity = O(n)
// Space complexity => O(n)
