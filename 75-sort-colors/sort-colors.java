class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt0++;
            }
            else if(nums[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }

        for(int j=0;j<cnt0;j++){
            nums[j]=0;
        }
        for(int k=cnt0;k<(cnt1+cnt0);k++){
            nums[k]=1;
        }
        for(int l=(cnt1+cnt0);l<nums.length;l++){
            nums[l]=2;
        }
        
    }
}