// Quesiton => https://leetcode.com/problems/xor-operation-in-an-array/
class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;
        for(int i=0;i<n;i++){
            int num = start + 2 * i;
             sum = sum ^ num;
        }
        return sum;
        }
    }
   
// Time complexity => O(n)
