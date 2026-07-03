class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();

        backtracking(0,"",ans,n);
        return ans;
    }

    private void backtracking(int open,String str,ArrayList<String> ans,int n){
        if(str.length()>=2*n){
            ans.add(new String(str));
            return;
        }

        if(open<n){
            backtracking(open+1,str+'(',ans,n);
        }

        if(str.length()-open<open){
            backtracking(open,str+")",ans,n);
        }
    }
}