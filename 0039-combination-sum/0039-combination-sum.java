class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        backtracking(0,0,candidates,new ArrayList<>(),target,ans);
        return ans;
    }

    private void backtracking(int indx,int sum, int arr[],List<Integer> list,int target,List<List<Integer>> ans){

        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(indx==arr.length || sum>target){
            return;
        }
        
        list.add(arr[indx]);
        backtracking(indx,sum+arr[indx],arr,list,target,ans);
        list.remove(list.size()-1);
        backtracking(indx+1,sum,arr,list,target,ans);
    }
}