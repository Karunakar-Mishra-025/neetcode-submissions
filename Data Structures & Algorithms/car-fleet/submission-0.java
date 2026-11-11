class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int n = position.length;

        // Store {position, speed}
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort cars by position from closest to target
        // to farthest from target
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            double time =
                (double) (target - cars[i][0]) / cars[i][1];

            // New fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // Otherwise this car joins the fleet ahead
        }

        return stack.size();
    }
}
