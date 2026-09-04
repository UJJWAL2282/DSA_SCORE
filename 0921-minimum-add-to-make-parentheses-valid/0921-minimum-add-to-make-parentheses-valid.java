class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st= new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
            }else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    count++;
                }
            }
        }

        return st.size()+count;
    }
}