class Solution {
    public int repeatedStringMatch(String a, String b) {
    
        int n=a.length();
        int m=b.length();
        int count=0;
        StringBuilder str=new StringBuilder();
        while(str.length()<m){
            str.append(a);
            count++;
        }

        
        if(str.indexOf(b)>=0){
            return count;
        }else{
            str.append(a);
            count++;
            if(str.indexOf(b)>=0){
                return count;
            }
        }

        return -1;

      
    }
}