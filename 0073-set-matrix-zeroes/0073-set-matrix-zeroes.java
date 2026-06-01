class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols=matrix[0].length;
        boolean[] r = new boolean[rows];
        boolean[] c = new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            if(r[i]){
                for(int j=0;j<cols;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<cols;j++){
            if(c[j]){
                for(int i=0;i<rows;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}