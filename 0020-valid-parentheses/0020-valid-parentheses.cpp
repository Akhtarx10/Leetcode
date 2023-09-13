class Solution {
public:
    bool isValid(string s) {
        stack<char> parenthesesStack;  // Using a stack to keep track of open parentheses
        
        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.push(c);  // Push opening parentheses onto the stack
            } else if (c == ')' || c == '}' || c == ']') {
                if (parenthesesStack.empty()) {
                    return false;  // No matching opening parenthesis found
                }
                char top = parenthesesStack.top();
                parenthesesStack.pop();  // Pop the top element
                
                // Check if the current closing parenthesis matches the top opening parenthesis
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;  // Mismatched parentheses
                }
            }
        }
        
        // If the stack is empty, all parentheses were correctly matched and balanced
        return parenthesesStack.empty();
    }
};
