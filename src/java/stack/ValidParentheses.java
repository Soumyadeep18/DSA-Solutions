/*
* @Question https://leetcode.com/problems/valid-parentheses/description/
* @Level EASY
*/

import java.util.Stack;

public class ValidParentheses {
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())
                    return false;
                char top=stack.peek();
                if((ch==')' && top=='(')||(ch==']' && top=='[')||(ch=='}' && top=='{')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //Tests
        ValidParentheses obj=new ValidParentheses();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("(]"));
    }
}
