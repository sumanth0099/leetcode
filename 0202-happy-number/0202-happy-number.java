class Solution {
    public static int SquareFinder(int a){
        int b = 0;
        while(a>0){
            b+=(a%10)*(a%10);
            a=a/10;
        }
        return b;
    }
    public boolean isHappy(int n) {
        List<Integer>list = new ArrayList<>();
        while(n!=1 && !list.contains(n)){
        list.add(n);
        n=Solution.SquareFinder(n);
        }
        return n==1;
    }
}