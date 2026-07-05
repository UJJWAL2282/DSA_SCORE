class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {

        
        if(!q1.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        if(q1.isEmpty()){
            while(q2.size()>1){
                q1.add(q2.remove());
            }

            return q2.remove();
        }else{
            while(q1.size()>1){
                q2.add(q1.remove());
            }

            return q1.remove();
        }
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        if(q1.isEmpty()){
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            int t=q2.remove();
            q1.add(t);
            return t ;
        }else{
            while(q1.size()>1){
                q2.add(q1.remove());
            }

            int t=q1.remove();
            q2.add(t);
            return t ;
        }
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */