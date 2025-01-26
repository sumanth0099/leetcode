class Solution {
    public List<List<Integer>> generate(int numRows) {
         int size = numRows;
        List<List<Integer>> v1 = new ArrayList<>();
        if(size<1)
        return v1;
        if (size >= 1){ 
            v1.add(Arrays.asList(1));
            if(size<2)
            return v1;
        } 
        if (size >= 2) {
            v1.add(Arrays.asList(1, 1)); 
            if(size<3)
             return v1;
        }
        for (int i = 2; i < size; i++) {
            List<Integer> prevRow = v1.get(i - 1);
            List<Integer> v2 = new ArrayList<>();
            v2.add(1); 
            for (int j = 1; j < prevRow.size(); j++) 
                v2.add(prevRow.get(j - 1) + prevRow.get(j)); 
            v2.add(1); 
            v1.add(v2); 
        }
        return v1;
    }
}