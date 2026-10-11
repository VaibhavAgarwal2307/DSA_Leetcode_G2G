class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        for(int i=matrix.length-2; i>=0; i--)
        {
            for(int j=0; j<matrix[0].length-1; j++)
            {
             if(matrix[i][j]!=matrix[i+1][j+1])
             return false;
            }
        }
        return true;
    }
}