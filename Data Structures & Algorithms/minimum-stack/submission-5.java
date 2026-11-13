class MinStack {
    Stack<Integer> minStack,stack;
    public MinStack() {
        minStack=new Stack<>();
        stack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.empty()==true || minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())) minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
