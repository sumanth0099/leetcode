class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        return true;
        int s = 0;
        String str="";
        String str1="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                str+=s1.charAt(i);
                str1+=s2.charAt(i);
            s++;
            }
        }
       
        if(s==2){
            for(int i=0;i<str.length();i++)
            {
                if(!str.contains(""+str1.charAt(i)))
                return false;
            }
            return true;
        }
        return false;
    }
}

