
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }

        int left = 1;
        int right = max;
        int min_rate = max;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long hours = hoursNeeded(piles, mid);

            if (hours <= h) {
                min_rate = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return min_rate;
    }

    public long hoursNeeded(int[] piles, int rate) {

        long hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + (long) rate - 1) / rate;
        }

        return hours;
    }
}
