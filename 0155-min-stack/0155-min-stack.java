class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()) {
            min = value;
            st.push((long)value);
            return;
        }
        else{
            if(value > min){
            st.push((long)value);
        }
        else {
            long x = 2L * value - min;
            st.push(x);
            min = value;
        }
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        long y = st.pop();
        if(y<min){ //tthat means this was encoded
            min = 2 * min - y;

        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
            long x = st.peek();
            if(min < x){ //its encoded
                return (int)x;
            }
            else{
                return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */