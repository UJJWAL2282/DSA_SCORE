class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int longest=0;
        int left=0;
       
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            longest=Math.max(longest,i-left+1);

        }

        return longest;
    }
}