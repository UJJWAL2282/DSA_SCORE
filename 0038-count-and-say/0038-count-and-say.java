class Solution {
    public String countAndSay(int n) {
        
        if(n==1){
            return "1";
        }

        String str="1";

        for(int i=2; i<=n; i++){

            int j=0;
            String ans="";
            while(j<str.length()){
                char ch=str.charAt(j);
                int k=j;
                while(k<str.length() && ch==str.charAt(k)){
                    k++;
                }

                ans+=""+(k-j)+ch;
                j=k;

            }

            str=ans;
        }

        return str;
    }
}