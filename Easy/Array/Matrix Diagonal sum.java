// Question => https://leetcode.com/problems/matrix-diagonal-sum/submissions/
// Optimized Approach
class Solution {
    public int diagonalSum(int[][] matrix) {
        int p_sum = 0;
        int s_sum = 0;
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            p_sum = p_sum + matrix[i][i];
            s_sum = s_sum + matrix[i][n-i-1];
        }
        if(n % 2 != 0){
            s_sum = s_sum - matrix[n/2][n/2];
        }
         sum = p_sum + s_sum;
        return sum;
    }
}

// Time complexity => O(n)
