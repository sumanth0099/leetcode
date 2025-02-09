import java.util.*;

class NumberContainers {
    private Map<Integer, Integer> indexMap;  // Stores index → number
    private TreeMap<Integer, TreeSet<Integer>> numberMap; // Stores number → sorted set of indices

    public NumberContainers() {
        indexMap = new HashMap<>();
        numberMap = new TreeMap<>();
    }

    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int oldNumber = indexMap.get(index);
            numberMap.get(oldNumber).remove(index);
            if (numberMap.get(oldNumber).isEmpty()) {
                numberMap.remove(oldNumber);
            }
        }
        indexMap.put(index, number);
        numberMap.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return numberMap.containsKey(number) ? numberMap.get(number).first() : -1;
    }
}
