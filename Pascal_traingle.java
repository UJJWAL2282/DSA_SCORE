//Given an integer numRows, return the first numRows of Pascal's triangle.

//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    list.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }

            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int numRows=5;
        List<List<Integer>> result=sol.generate(numRows);
        for(List<Integer> row : result){
            System.out.println(row);
        }
    }
}