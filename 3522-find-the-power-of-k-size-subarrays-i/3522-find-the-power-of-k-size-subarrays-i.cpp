class Solution {
public:
    vector<int> resultsArray(vector<int>& a, int k) {
        vector<int>ans;
        for(int i=0;i<=a.size()-k;i++){
            int c=0;
            for(int j=1;j<k;j++){
                if(a[i+j-1]+1==a[i+j]) c++;
                else break;
            }
            if(c==k-1) ans.push_back(a[i+k-1]);
            else ans.push_back(-1);
        }
        return ans;
    }
};