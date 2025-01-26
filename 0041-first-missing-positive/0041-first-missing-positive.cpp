class Solution {
public:
    int firstMissingPositive(vector<int>& a) {
        unordered_map<int,bool>m;
        for(int i:a) m[i]=1;
        for(int i=1;i<=100001;i++) if(!m[i]) return i;
        return 0;
    }
};