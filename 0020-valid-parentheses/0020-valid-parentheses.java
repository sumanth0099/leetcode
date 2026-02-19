class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')' && s.charAt(i)!=']' &&  s.charAt(i)!='}')
            stack.add(s.charAt(i));
            else if(stack.isEmpty() && ((s.charAt(i)==')')
                ||(s.charAt(i)==']' ) || (s.charAt(i)=='}')))
                return false;
            else
            {
                char ch = stack.pop();
                if((s.charAt(i)==')' && ch!='(')
                ||(s.charAt(i)==']' && ch!='[' ) || (s.charAt(i)=='}' && ch!='{'))
                return false;
            }
        }
        return (stack.isEmpty());
    }
}