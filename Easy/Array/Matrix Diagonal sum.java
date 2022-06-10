// Question => https://leetcode.com/problems/matrix-diagonal-sum/submissions/

// Brute Force Approach
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    sum += mat[i][j];
                }
                else if(i + j == n-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

// Time complexity => O(n^2)-

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
