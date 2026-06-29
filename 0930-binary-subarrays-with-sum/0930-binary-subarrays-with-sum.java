class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return sumAtMostk(nums,goal)-sumAtMostk(nums,goal-1); //if goal=0 then it become -1;
    }

    private int sumAtMostk(int nums[],int goal){

        if(goal<0){
            return 0;
        }
        int n=nums.length;

        int left=0;
        int sum=0;
        int ans=0;
        for(int right=0; right<n; right++){

            sum+=nums[right];

            while(left<n && sum>goal){
                sum-=nums[left];
                left++;
            }

            ans+=(right-left+1);



        }

        return ans;
    }
}