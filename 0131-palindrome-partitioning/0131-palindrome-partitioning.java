class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtracking(0,s,new ArrayList<>(),ans);
        return ans;
    }

    private void backtracking(int indx,String s,List<String> list,List<List<String>> ans){
        if(indx>=s.length()){
            ans.add(new ArrayList<>(list));
        }

        for(int i=indx; i<s.length(); i++){

            if(plindrome(s,indx,i)){
                list.add(s.substring(indx,i+1));
                backtracking(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean plindrome(String s, int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}