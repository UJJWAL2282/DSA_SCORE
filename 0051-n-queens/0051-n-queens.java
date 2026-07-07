class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        
        for(char ch[]: board){
            Arrays.fill(ch,'.');
        }

        int leftCol[]=new int[n];
        int upperDigonal[]=new int[2*n-1];
        int lowerDigonal[]=new int[2*n-1];
        
        solve(0,board,ans,n,leftCol,upperDigonal,lowerDigonal);

        return ans;
    }


    private void solve(int col,char board[][], List<List<String>> ans,int n,int leftCol[],int upperDigonal[],int lowerDigonal[]){

        if(col==n){
            List<String> temp=new ArrayList<>();
            for(char ch[]:board){
                temp.add(new String(ch));
            }
            ans.add(temp);
        }

        for(int row=0; row<n; row++){
            if(leftCol[row]==0 && lowerDigonal[row+col]==0 && upperDigonal[n-1+col-row]==0){

                //Place Queen
                leftCol[row]=1;
                lowerDigonal[row+col]=1;
                upperDigonal[n-1+col-row]=1;
                board[row][col]='Q';

                //recurssion
                solve(col+1,board,ans,n,leftCol,upperDigonal,lowerDigonal);

                //backtracking
                leftCol[row]=0;
                lowerDigonal[row+col]=0;
                upperDigonal[n-1+col-row]=0;
                board[row][col]='.';
            }
        }
    }
}