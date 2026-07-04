class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }


    private void backtracking(int indx,int arr[],int target,List<Integer> list,List<List<Integer>> ans){

        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        // if(indx==arr.length){
        //     return;
        // }

        for(int i=indx; i<arr.length; i++){

            if(i>indx && arr[i-1]==arr[i]){
                continue;
            }

            if(arr[i]>target){
                break;
            }
            list.add(arr[i]);
            backtracking(i+1,arr,target-arr[i],list,ans);
            list.remove(list.size()-1);
        
        }
    }
}