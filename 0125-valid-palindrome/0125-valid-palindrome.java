class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9') )
            str+=s.charAt(i);
        }
        int left = 0;
        int right = str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right)){
            return false;
            }
            left++;
            right--;
        }
        return true;
    }
}