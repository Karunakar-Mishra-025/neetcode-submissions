class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        // Find pivot
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        int pivot = l;

        // If array is not rotated
        if (pivot == 0) {
            l = 0;
            r = nums.length - 1;
        }
        // Search left half
        else if (target >= nums[0] && target <= nums[pivot - 1]) {
            l = 0;
            r = pivot - 1;
        }
        // Search right half
        else {
            l = pivot;
            r = nums.length - 1;
        }

        // Binary search
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}