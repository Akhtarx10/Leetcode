#include <stack>

class MyQueue {
private:
    std::stack<int> stack1; // Main stack for enqueueing elements
    std::stack<int> stack2; // Secondary stack for dequeueing elements

public:
    MyQueue() {
        
    }
    
    void push(int x) {
        // Push the element onto stack1
        stack1.push(x);
    }
    
    int pop() {
        // Check if stack2 is empty, if it is, transfer elements from stack1
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.top());
                stack1.pop();
            }
        }
        
        // Pop the front element from stack2 (which is the front of the queue)
        int front = stack2.top();
        stack2.pop();
        return front;
    }
    
    int peek() {
        // Check if stack2 is empty, if it is, transfer elements from stack1
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.top());
                stack1.pop();
            }
        }
        
        // Peek at the front element without removing it
        return stack2.top();
    }
    
    bool empty() {
        // Both stacks should be empty for the queue to be empty
        return stack1.empty() && stack2.empty();
    }
};
