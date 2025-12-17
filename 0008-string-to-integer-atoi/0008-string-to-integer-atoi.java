class Solution {
     public static Boolean SymbolCheck(char ch){
        return (ch>='!' && ch<='~' && ch!='-' && ch!='+' && !Character.isDigit(ch) && !Character.isLetter(ch));
    }
    public static int AtoI(String str,String sol,char ch,int i)
    {
  if(
        (i>=str.length()) ||
         (Character.isLetter(str.charAt(i))) || 
         (ch!='0' && (str.charAt(i)=='-' || str.charAt(i)=='+')) ||
          (SymbolCheck(str.charAt(i)) && !(str.charAt(i)==' ' && sol.length()
          <=0)) || (ch!='0' && str.charAt(i)==' ')
          )
      {
            int result = 0;
            if(sol.length()<=0)
            return result;
            try {
                result = Integer.parseInt(sol);
                if(ch=='-')
                result*=-1; 
            } catch (Exception e) {
                if(ch=='-')
                result=Integer.MIN_VALUE;
                else
                result=Integer.MAX_VALUE;
            }
            return result;
      } 
      else if(Character.isDigit(str.charAt(i))){
        if(sol.length()<=0 && ch=='0')
        return AtoI(str, sol+str.charAt(i), '+', i+1);
      return AtoI(str, sol+str.charAt(i), ch, i+1);
      }
      else if(str.charAt(i)==' ')
      return  AtoI(str, sol, ch, i+1);
      else
      return  AtoI(str, sol, str.charAt(i), i+1);
    }
    public int myAtoi(String str) {
        return AtoI(str, "", '0', 0);
    }
}