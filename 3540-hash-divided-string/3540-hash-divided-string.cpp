class Solution {
public:
    string stringHash(string s, int k) {
        string tmp="abcdefghijklmnopqrstuvwxyz";
        string ans="";
        int t=0;
        for(int i=0;i<s.size();i++){
            if(i and i%k==0){
                ans+=tmp[t%26];
                t=0;
            }
            t+=(s[i]-'a');
        }
        ans+=tmp[t%26];
        return ans;
    }
};