import java.util.ArrayList;

public class min_stack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;
     
     public min_stack(){
        stack= new ArrayList<>();
        minStack=new ArrayList<>();

     }

    public  void push(int val){
        stack.add(val);
        if(minStack.isEmpty() || minStack.get(minStack.size()-1)>=val){
            minStack.add(val);
        }

    }
    public int pop(){
        int ans=stack.remove(stack.size()-1);
        if(minStack.get(minStack.size()-1)==ans){
            minStack.remove(minStack.size()-1);
        }
        return ans;

    }
    public int top(){
        int top=stack.get(stack.size()-1);
        return top;
    }
    public int getMin(){
        return minStack.get(minStack.size()-1);
        
    }
    public static void main(String[] args) {
        min_stack s=new min_stack();
        s.push(5);
        s.push(10);
        s.push(11);
        int v=s.getMin();
        System.out.print(v);
        
    }
    
}
