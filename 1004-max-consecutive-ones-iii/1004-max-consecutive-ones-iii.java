class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;

        int zerCount=0;
        int ans=Integer.MIN_VALUE;

        for(int right=0; right<n; right++){
            if(nums[right]==0){
                zerCount++;
            }

            while(left<n && zerCount>k){
                if(nums[left]==0){
                    zerCount--;
                }
                left++;
            }

            ans=Math.max(ans,(right-left+1));
        }

        return ans;
    }
}