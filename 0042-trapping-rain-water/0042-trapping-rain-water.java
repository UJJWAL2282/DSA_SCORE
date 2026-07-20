class Solution {
    public int trap(int[] height) {
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        int pme[]=new int[height.length];
        int nme[]=new int[height.length];
        
       for(int i=0; i<height.length; i++){
            
            if(st.isEmpty()){
                pme[i]=height[i];
            }else{
                pme[i]=Math.max(height[i],st.peek());
            }

            st.push(pme[i]);

        }

        st=new Stack<>();
        for(int i=n-1; i>=0; i--){

            if(st.isEmpty()){
                nme[i]=height[i];
            }else{
                nme[i]=Math.max(st.peek(),height[i]);
            }

            st.push(nme[i]);
        }

        int water=0;
        for(int i=0; i<n; i++){
           int area=Math.min(nme[i],pme[i])-height[i];

            if(area>0){
                water+=area;
            }
        }


        return water;
        
    }
}