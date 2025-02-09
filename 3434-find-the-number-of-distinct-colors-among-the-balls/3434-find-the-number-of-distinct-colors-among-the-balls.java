import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballmap = new HashMap<>();
        HashMap<Integer, Integer> colormap = new HashMap<>();
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int key = queries[i][0];
            int value = queries[i][1];

            if (ballmap.containsKey(key)) {
                int prevColor = ballmap.get(key);
                colormap.put(prevColor, colormap.get(prevColor) - 1);
                if (colormap.get(prevColor) <= 0) {
                    colormap.remove(prevColor);
                }
            }
            ballmap.put(key, value);
            colormap.put(value, colormap.getOrDefault(value, 0) + 1);

            result[i] = colormap.size();
        }

        return result;
    }
}
