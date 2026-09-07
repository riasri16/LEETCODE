class Solution {
public:
    bool isValid(string s) {
        stack<char> stack_box;
        for (char ch : s) {

            // Opening bracket → stack mein daalo
            if (ch == '(' || ch == '[' || ch == '{') {
                stack_box.push(ch);
            }
           // Closing bracket
            else {
                // Stack empty → matching opening bracket hai hi nahi
                if (stack_box.empty())
                    return false;

                // Top bracket check karo
                if ((ch == ')' && stack_box.top() != '(') ||
                    (ch == ']' && stack_box.top() != '[') ||
                    (ch == '}' && stack_box.top() != '{')) {
                    return false;
                }

                // Match ho gaya → remove
                stack_box.pop();
            }
        }
         // Sab opening brackets match ho gaye?
        return stack_box.empty();
    }
};