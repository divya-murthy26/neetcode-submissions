class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] res = new int[n];
        Stack<int []> s = new Stack<>(); 

        for(int i=0;i<n;i++){
            int t=temperatures[i];
            while(!s.isEmpty() &&  t > s.peek()[0]){
                int [] pair = s.pop();
                res[pair[1]] = i-pair[1];
            }
            s.push(new int[]{t,i});
        }
       return res;
    }
}
