class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        backtracking(0, nums, new ArrayList<>(),ans);
        return ans;
    }

    private void backtracking(int indx,int nums[],List<Integer> list,List<List<Integer>> ans){
        if(indx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[indx]);
        backtracking(indx+1,nums,list,ans);
        list.remove(list.size()-1);
        backtracking(indx+1,nums,list,ans);
    }
}