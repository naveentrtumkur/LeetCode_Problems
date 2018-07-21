// classic stack implementation where we would perform the following operations:-
// Push(), pop(), peek() and getMin() functionalities implemented.
// approach using two stacks. One to hold elements and another stack to hold the min elements.
class MinStack {
    private Stack<Integer> mStack = new Stack<Integer>();
    private Stack<Integer> mMinStack = new Stack<Integer>();

public void push(int x) {
	mStack.push(x);
	if (mMinStack.size() != 0) {
		int min = mMinStack.peek();
		if (x <= min) {
			mMinStack.push(x);
		}
	} else {
		mMinStack.push(x);
	}
}

public void pop() {
	int x = mStack.pop();
	if (mMinStack.size() != 0) {
		if (x == mMinStack.peek()) {
			mMinStack.pop();
		}
	}
}

public int top() {
	return mStack.peek();
}

public int getMin() 
{
    return mMinStack.peek();
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
