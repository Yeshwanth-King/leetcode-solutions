class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L); 
            min = val;
        } else {
            stack.push((long)val - min);
            if (val < min) {
                min = val;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long diff = stack.pop();
        if (diff < 0) {
            min = min - diff;
        }
    }

    public int top() {
        long diff = stack.peek();
        if (diff >= 0) {
            return (int)(min + diff);
        } else {
            return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
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