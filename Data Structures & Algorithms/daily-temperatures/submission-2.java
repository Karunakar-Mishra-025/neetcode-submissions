class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            int num=temperatures[i];
            while(!stack.empty() && temperatures[stack.peek()]<=num) stack.pop();
            if(stack.empty()){
                result[i]=0;
            }else{
                result[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return result;
    }
}
