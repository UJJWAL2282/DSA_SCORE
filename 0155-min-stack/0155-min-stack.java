class Pair{
    int n;
    int min;

    Pair(int n,int min){
        this.n=n;
        this.min=min;
    }
}
class MinStack {
    Stack<Pair> st;
    int min; 
    public MinStack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            min=val;
            st.push(new Pair(val,min));
            
        }else{
            if(val<min){
                min=val;
            }

            st.push(new Pair(val,min));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
        if(!st.isEmpty()){
            min=st.peek().min;
        }else{
            min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek().n;
        }else{
            return -1;
        }
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */