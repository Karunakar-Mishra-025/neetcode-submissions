class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        for (int num : nums) {
            freq_map.put(num, freq_map.getOrDefault(num, 0) + 1);
        }
        // Step 2: Min Heap based on frequency
        PriorityQueue<Integer> min_heap = new PriorityQueue<>((a, b) -> freq_map.get(a) - freq_map.get(b));
        for (int num : freq_map.keySet()) {
            min_heap.add(num);
            if (min_heap.size() > k) {
                min_heap.poll();  // remove least frequent
            }
        }
        // Step 3: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = min_heap.poll();
        }

        return result;
    }
}
