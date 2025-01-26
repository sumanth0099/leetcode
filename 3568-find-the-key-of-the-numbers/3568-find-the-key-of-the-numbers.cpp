class Solution {
public:
    int generateKey(int a,int b,int c) {
        int ans=0,tp=1;
        while(a and b and c){
            ans+=tp*(min({a%10,b%10,c%10}));
            tp*=10;
            a/=10;
            b/=10;
            c/=10;
        }
        return ans;
    }
};