    class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer>stack = new Stack<>();
            if(s.length()<=0)
            return 0;
            stack.push(-1);
            int max = 0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                stack.push(i);
                else
                {
                    stack.pop();
                    if(stack.isEmpty())
                    stack.add(i);
                    max=Math.max(i-stack.peek(),max);
                }
            }
            return max;
        }
    }