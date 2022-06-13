// Question => https://leetcode.com/problems/unique-paths/submissions/
// Brute Force Approach
class Solution {
    public int uniquePaths(int m, int n) {
        // base case
        if(m ==1 || n ==1){
            return 1;
        }
        int downMove = uniquePaths(m-1,n);
        int rightMove = uniquePaths(m,n-1);
        return downMove + rightMove;
    }
}
