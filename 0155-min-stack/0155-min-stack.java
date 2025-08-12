
class MinStack {
    List<Integer>list;    
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
       return list.get(list.size() - 1);
    }
    
    public int getMin() {
        int min=list.get(0);
     for(Integer i:list)
        min=Math.min(i,min);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */