class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      return atMostkOdd(nums,k)-atMostkOdd(nums,k-1);
    }
    private int atMostkOdd(int nums[],int k){
        if(k<0){
            return 0;
        }
        int n=nums.length;
        int left=0;
        int count=0;
        int ans=0;
        for(int right=0; right<n; right++){
            if(nums[right]%2==1){
                count++;
            }

            while(count>k){
                if(nums[left]%2==1){
                    count--;
                }
                left++;
            }

            ans+=(right-left+1);
        }

        return ans;
    }
}