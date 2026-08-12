class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;

        int i=1;
        int ans=0;

        for(i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                ans++;
            }
        }

        
        return ans<=1;


    }
}