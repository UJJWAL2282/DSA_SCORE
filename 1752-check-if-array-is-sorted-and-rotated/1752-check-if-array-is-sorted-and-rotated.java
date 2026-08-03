class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;

        int i=1;

        for(i=1; i<n; i++){
            if(nums[i-1]>nums[i]){
                break;
            }
        }

        int b[]=new int[n];

        for(int j=0; j<n; j++){
            b[j]=nums[(j+i) % n];
        }

        for(int j=0; j<n; j++){
            System.out.print(b[j]);
        }


        for(int j=1; j<n; j++){
            if(b[j-1]>b[j]){
                return false;
            }
        }


        return true;


    }
}