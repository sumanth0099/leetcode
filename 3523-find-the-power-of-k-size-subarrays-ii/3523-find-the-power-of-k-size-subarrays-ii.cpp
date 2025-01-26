class Solution {
public:
    vector<int> resultsArray(vector<int>& a, int k) {
        vector<int>ans;
        vector<int>q;
        for(int i=1;i<a.size();i++){
            if((a[i-1]+1)!=a[i]) q.push_back(i);
        }
        for(int i=1;i<=a.size()-k+1;i++){
            int j=lower_bound(q.begin(),q.end(),i)-q.begin();
            if(j<q.size() and q[j]<=(i+k-2)) ans.push_back(-1);
            else ans.push_back(a[(i+k-2)]);
        }
        return ans;
    }
};