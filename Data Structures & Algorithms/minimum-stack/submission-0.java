

class Pair { 
    int val; 
    int min; 
    
    public Pair(int val , int min){ 
        this.val = val; 
        this.min = min; 
    } 
    
    public int getVal(){ return this.val; } 
    public int getmin(){ return this.min; } 
} 

class MinStack { 
    // 1. Declare the stack as an instance variable
    private Stack<Pair> s; 

    public MinStack() { 
        s = new Stack<>(); 
    } 
    
    public void push(int val) { 
        if (s.isEmpty()) { 
            s.push(new Pair(val, val)); 
        } else { 
            // 2. Get the current minimum from the top of the stack without removing it
            int currentMin = s.peek().getmin(); 
            // 3. Push the new value along with the updated running minimum
            s.push(new Pair(val, Math.min(val, currentMin))); 
        } 
    } 
    
    public void pop() { 
        if (!s.isEmpty()) { 
            s.pop(); 
        } 
    } 
    
    public int top() { 
        // 4. Use peek() so the element isn't removed from the stack
        return s.peek().getVal(); 
    } 
    
    public int getMin() { 
        // 5. Use peek() to view the minimum value safely
        return s.peek().getmin(); 
    } 
}
