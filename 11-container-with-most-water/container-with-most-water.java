class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=0;
        int area=0;
        while(i<=j){
            if(height[i]>=height[j]){
                area=height[j]*(j-i);
                j--;
            }
            else{
                area=height[i]*(j-i);
                i++;
            }
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
        
    }
}