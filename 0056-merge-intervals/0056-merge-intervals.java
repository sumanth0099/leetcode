class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> l = new ArrayList<>();
        int a = intervals[0][0];
        int b = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (b >= intervals[i][0]) {
                b = Math.max(b, intervals[i][1]); // Merge intervals properly
            } else {
                l.add(new int[]{a, b});
                a = intervals[i][0];
                b = intervals[i][1];
            }
        }

        l.add(new int[]{a, b}); // Add the last interval

        // Convert List<int[]> to int[][]
        return l.toArray(new int[l.size()][]);
    }
}