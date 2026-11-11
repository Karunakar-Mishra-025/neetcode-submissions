class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Brute Force Solution ;
        
        // int n=temperatures.length;
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=i+1;j<n;j++){
        //         count++;
        //         if(temperatures[i]<temperatures[j]) {
        //             result[i]=count;
        //             break;
        //         }
        //     }
        // }
        int result[]=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
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
