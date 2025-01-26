import java.util.*;
class Solution {
    public String smallestSubsequence(String s) {
        String src = s;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < src.length(); i++) {
            char currentChar = src.charAt(i);
            hashtable.put(currentChar, hashtable.getOrDefault(currentChar, 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < src.length(); i++) {
            char currentChar = src.charAt(i);
            hashtable.put(currentChar, hashtable.get(currentChar) - 1);
            if (stack.contains(currentChar)) 
                continue;
            while (!stack.isEmpty() && stack.peek() > currentChar && hashtable.get(stack.peek()) > 0) {
                stack.pop();
            }
            stack.push(currentChar);
        }
        String result = "";
            while (!stack.isEmpty()) 
            {
               result+=stack.firstElement();
               stack.removeFirst();
            }
          return result;
    }
}