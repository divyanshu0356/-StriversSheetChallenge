class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //THIS LOOP IS FOR FINDING THE TRANSPOSE
        //AND AFTER TRANSPOSE WE CAN CONVERT THE ROW IN COLUMN
        //int x=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int a=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=a;
            }
        }
        for(int i=0;i<n;i++)
        {
            int low=0;
            int high=n-1;
            while(low<=high)
            {
                int a=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=a;
                low++;
                high--;

            }
        }
        
        
    }
    
}