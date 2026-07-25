class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int cnt=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                cnt++;

            }
            else{
                cnt--;

            }
        }
        int cnt1=0;
        for(int j=0;j<n;j++){
            if(el==nums[j]){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return el;
        }
        else{
            return -1;
        }
        
    }
}