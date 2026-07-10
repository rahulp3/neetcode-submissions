class MinStack {

    private Deque<Integer> mainStack;
    private Queue<Integer> minStack;

    public MinStack() {
        this.mainStack = new ArrayDeque<>();
        this.minStack = new PriorityQueue<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        minStack.add(val);
    }
    
    public void pop() {
        int val = mainStack.pop();
        minStack.remove(val);
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
