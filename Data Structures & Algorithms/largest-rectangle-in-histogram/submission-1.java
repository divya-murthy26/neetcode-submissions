class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        Stack<Integer> s= new Stack<>();
        
        int MaxArea=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&& heights[s.peek()]>heights[i]){
                int ele= s.peek();
                s.pop();
                int nse=i;
                int pse=s.isEmpty() ? -1:s.peek();

                MaxArea = Math.max(MaxArea , (heights[ele]*(nse-pse-1)));
            }
            s.push(i);

            
        }
        while(!s.isEmpty()){
               int ele= s.peek();
                s.pop();
                int nse=n;
                int pse=s.isEmpty() ? -1:s.peek();

                MaxArea = Math.max(MaxArea , (heights[ele]*(nse-pse-1)));

            }
        return MaxArea;
    }
}