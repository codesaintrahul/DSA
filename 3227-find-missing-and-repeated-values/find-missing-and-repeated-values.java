class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int ns=n*n;

        long exp_sum=(long) ns*(ns+1)/2;
        long exp_sqSum=(long) ns*(ns+1)*(2*ns+1)/6;

        long act_sum=0; 
        long act_sqSum=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                act_sum +=grid[i][j];
                act_sqSum +=(long) grid[i][j] * grid[i][j];
            }
        }

        long diffsum= act_sum - exp_sum;
        long diff_sqSum= act_sqSum- exp_sqSum;

        long sumAB= diff_sqSum/diffsum;

        int a=(int) ((sumAB+diffsum)/2);
        int b=(int) ((sumAB-diffsum)/2);

        return new int[]{a,b};


    }
}