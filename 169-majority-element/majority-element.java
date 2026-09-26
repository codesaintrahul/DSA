class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
                ans=nums[i];
            }
            //max=Math.max(max,map.get(nums[i]));
        }
        
        return ans;
        
    }
}