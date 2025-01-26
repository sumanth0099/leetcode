import java.util.*;
class Solution{
    public String removeDuplicateLetters(String s) {
        String src = s;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < src.length(); i++) {
            char currentChar = src.charAt(i);
            hashtable.put(currentChar, hashtable.getOrDefault(currentChar, 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        Set<Character> inStack = new HashSet<>();
        for (int i = 0; i < src.length(); i++) {
            char currentChar = src.charAt(i);
            hashtable.put(currentChar, hashtable.get(currentChar) - 1);

            // Skip this character if it's already in the stack
            if (inStack.contains(currentChar)) {
                continue;
            }

            // Maintain lexicographical order by removing larger elements
            while (!stack.isEmpty() && stack.peek() > currentChar && hashtable.get(stack.peek()) > 0) {
                inStack.remove(stack.pop());
            }

            // Add the current character to the stack and mark it as present
            stack.push(currentChar);
            inStack.add(currentChar);
        }

        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
       return result.toString();
        // System.out.println(result.toString());

    }
}