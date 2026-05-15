// import java.util.*;
class Solution {
    List<List<String>>solution = new ArrayList<>(); 
     public boolean isPalindrom(String a)
    {
        int left = 0;
        int right = a.length()-1;
        while(left<right)
        {
            if(a.charAt(left)!=a.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }

    public void helper(String i,int start,ArrayList<String> l)
    {
        String str ="";
        for(int j=start;j<i.length();j++)
        {
            str+=i.charAt(j);
            if(!isPalindrom(str))
            continue;
            l.add(str);
            helper(i,j+1,l);
            if(j==i.length()-1)
            solution.add(new ArrayList<>(l));
            l.remove(l.size()-1);
        }
    }
    public List<List<String>> partition(String s) {
        solution.clear();
        ArrayList<String>l = new ArrayList<>();
        helper(s,0,l);
        return solution;
    }
}