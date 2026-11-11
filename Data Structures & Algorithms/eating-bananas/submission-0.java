class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxPile = 0;

        for (int i = 0; i < piles.length; i++) {
            maxPile = Math.max(maxPile, piles[i]);
        }

        int left = 1, right = maxPile;
        int minK = maxPile;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int totalHours = 0;

            for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + mid - 1) / mid;
            }

            if (totalHours <= h) {
                minK = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minK;
    }
}