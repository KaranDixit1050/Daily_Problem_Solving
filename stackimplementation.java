import java.util.ArrayList;
import java.util.Collections;
class stackimplementation {

    public stackimplementation() {
        
    }
    ArrayList<Integer> list=new ArrayList<>();
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return Collections.min(list);
    }
    public static void main(String[] args) {
        stackimplementation stack = new stackimplementation();
        
        stack.push(5);
        stack.push(3);
        stack.push(7);
        
        System.out.println("Top element: " + stack.top()); // Should print 7
        System.out.println("Minimum element: " + stack.getMin()); // Should print 3
        
        stack.pop();
        
        System.out.println("Top element after pop: " + stack.top()); // Should print 3
        System.out.println("Minimum element after pop: " + stack.getMin()); // Should still print 3
    }
}