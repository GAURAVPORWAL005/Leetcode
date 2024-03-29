// Question => https://leetcode.com/problems/decode-xored-array/
// Given that encoded[i] = arr[i] XOR arr[i + 1]
        // then arr[i+1] = encoded[i] XOR arr[i].
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for(int i=0;i<encoded.length;i++){
            ans[i+1] = encoded[i] ^ ans[i];
        }
        return ans;
    }
}
// Time complexity => O(n)
