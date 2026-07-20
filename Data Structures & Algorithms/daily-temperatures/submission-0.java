class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[n];

        for(int i = 0 ; i < n ; i++){
            result[i] = 0;
        }

        for(int i = 0 ; i < n ; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                if(temperatures[stack.peek()] >= temperatures[i]){
                    stack.push(i);
                }else{
                    while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                        result[stack.peek()] = i - stack.pop();
                    }
                    stack.push(i);
                }
            }
        }

        return result;
    }
}
