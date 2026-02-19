class Solution {
        ArrayList<String>list = new ArrayList<>();
    public void Generate(int left,int right,String str)
    {
        if(right<left)
        return;
        if(left>0)
            Generate(left-1, right, str+"(");
        if(right>0 && !str.equals(""))
            Generate(left, right-1, str+")");
        if(left==0 && right==0)
        list.add(str);
    }
    public List<String> generateParenthesis(int n) {
        Generate(n, n, "");
        return list;
    }
}