import java.util.LinkedList;
import java.util.Queue;

public class Mystack {
    Queue<Integer> q;
    Queue<Integer> q2;
    public Mystack(){
        q=new LinkedList<>();
        q2=new LinkedList<>();
    }
    public void push(int val){
        q.add(val);
    }
    public int pop(){
        int ans = 0;
    if(!q.isEmpty()){
       while(!q.isEmpty()){
        int top=q.remove();
        ans=top;
        if(q.isEmpty()){
            break;
        }
        q2.add(top);
       }
    }
    else{
        while(!q2.isEmpty()){
            int top=q2.remove();
            ans=top;
            if(q2.isEmpty()){
                break;
            }
            q.add(top);
        }
    }
       return ans;
    }
    public int top(){
        int ans = 0;
    if(!q.isEmpty()){
       while(!q.isEmpty()){
        int top=q.remove();
        ans=top;
        
        q2.add(top);
       }
    }
    else{
        while(!q2.isEmpty()){
            int top=q2.remove();
            ans=top;
            
            q.add(top);
        }
    }
        return ans;

    }
    public boolean isEmpty(){
        return q.isEmpty()&&q2.isEmpty();
    }

    public static void main(String[] args) {
        Mystack s=new Mystack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();


        
    }
    
}
