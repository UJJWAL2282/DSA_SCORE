class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();

        helper(1,k,n,new ArrayList<>(),ans);
        return ans;
    }

    public void helper(int num,int k,int target,List<Integer> list,List<List<Integer>> ans){
        if(target==0 && list.size()==k){
            ans.add(new ArrayList<>(list));
        }
        

        for(int i=num; i<=9; i++){

            if(list.size()==k){
                return;
            }

            list.add(i);
            helper(i+1,k,target-i,list,ans);
            list.remove(list.size()-1);
        }
    }
}