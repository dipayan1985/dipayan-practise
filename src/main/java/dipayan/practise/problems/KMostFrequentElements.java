package dipayan.practise.problems;

import java.util.*;

public class KMostFrequentElements {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2)));
  }

  public static int[] topKFrequent(int[] nums, int k) {
    List<Integer> topKFrequentElements = new ArrayList<>();
    Map<Integer, Integer> elementToFrequencyMap = new HashMap<>();

    for (int num : nums) {
      elementToFrequencyMap.put(num, elementToFrequencyMap.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pq =
        new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

    for (Map.Entry<Integer, Integer> entry : elementToFrequencyMap.entrySet()) {
      pq.add(entry);

      if (pq.size() > k) {
        pq.poll();
      }
    }

    for (int i = 0; i < k; i++) {
      topKFrequentElements.add(pq.poll().getKey());
    }

    return topKFrequentElements.stream().mapToInt(t -> t).toArray();
  }
}
