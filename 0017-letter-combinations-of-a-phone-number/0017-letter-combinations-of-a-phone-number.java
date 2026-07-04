class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        backtracking(0,digits,"",ans,digitToLetters);
        return ans;
    }

    private void backtracking(int indx,String digits,String str,List<String> ans,Map<Character, String> digitToL){
        if(indx==digits.length()){
            ans.add(str);
            return;
        }

        String button=digitToL.get(digits.charAt(indx));
        for(char ch:button.toCharArray()){
            //with
            backtracking(indx+1,digits,str+ch,ans,digitToL);
            //remove ho gaya yaak baar 
            
        }

        
    }
}