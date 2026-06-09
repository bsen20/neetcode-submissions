class MinStack {

    Stack<Integer>s1,s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.empty()) s2.push(val);
        else{
            if(s2.peek()>=val)
            s2.push(val);
        }
    }
    
    public void pop() {
        int v = s1.pop();
        if(s2.peek()==v)
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
