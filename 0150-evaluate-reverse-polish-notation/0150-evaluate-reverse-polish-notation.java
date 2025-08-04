class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String>stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/"))
            stack.add(ch);
            else
            {
                int result = 0;
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                switch(ch) {
                 case "+":
                result = a + b;
                break;
                case "-":
                result = a - b;
                break;
                case "*":
                result = a * b;
                break;
                case "/":
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        stack.add(""+result);
            }
        }
        return Integer.parseInt(stack.peek());
    }
}