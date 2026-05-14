class Solution {
        public static String phone[] = {
    "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public static ArrayList<String>solution = new ArrayList<>();
    public static void phoneNumberComb(int p,String l,String input){
        if(!(p<input.length()))
        return;
        for(int i=0;i<phone[input.charAt(p)-48].length();i++){
            if(input.length()==(l+phone[input.charAt(p)-48].charAt(i)).length())
            solution.add(l+phone[input.charAt(p)-48].charAt(i));
            phoneNumberComb(p+1, l+phone[input.charAt(p)-48].charAt(i),input);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        solution.clear();
        phoneNumberComb(0, "", digits);
        return solution;
    }
}