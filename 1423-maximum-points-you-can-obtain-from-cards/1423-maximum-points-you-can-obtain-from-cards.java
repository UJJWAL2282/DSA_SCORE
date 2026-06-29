class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;

        int left=0;
        int right=n-1;
        int lsum=0;
        int rsum=0;
        int max=0;

        for(int i=k-1; i>=0; i--){
            lsum+=cardPoints[i];
        }
        max=lsum;

        for(int i=k-1; i>=0; i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[right];
            max=Math.max(max,lsum+rsum);
            right--;
        }


        
        return max;
    }
}