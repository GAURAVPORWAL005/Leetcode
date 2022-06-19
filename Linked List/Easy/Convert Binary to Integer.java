// Question => https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        ListNode temp = head;
        while(temp != null){
            sum *= 2;
            sum += temp.val;
            temp = temp.next;
        }
        return sum;
    }
}

// TIme complexity => O(n)
