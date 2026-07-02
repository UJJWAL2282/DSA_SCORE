class Solution {
    public int myAtoi(String s) {

        // long ans=0;
        // int i=0;
        // s=s.strip();
        // boolean positive=true;
        // for(char ch:s.toCharArray()){
        //     if(Character.isDigit(ch)){

        //         if (ans > (Integer.MAX_VALUE - (ch-'0')) / 10) {
        //             return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //         }
        //         ans=ans*10+(ch-'0');
        //         i++;
        //     }else if(i==0 && ch=='-'){
        //         positive=false;
        //         i++;
        //     }else if(i==0 && ch =='+'){
        //         i++;
        //         continue;
        //     }else{
        //         break;
        //     }
        // }

        // return positive==true ? (int)ans:(int)-ans;
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int sign=1;
        int i=0;

        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }

        return stringToInt(s,i,0,sign);
    }

    private int stringToInt(String s,int i,long ans,int sign){
        if(i>=s.length() || (!Character.isDigit(s.charAt(i)))){
            return (int)(ans*sign);
        }

        ans=ans*10+(s.charAt(i)-'0');
        if(ans*sign>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(ans*sign<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return stringToInt(s,i+1,ans,sign);
    }

    

    
}