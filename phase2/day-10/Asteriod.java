import java.util.Stack;

public class Asteriod {
    public static void main(String[] args) {
        //asteroids = [5,10,-5]Output: [5,10]
        int[] asteroids={5,10,-5};
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int f=-1;
           
            while(!s.isEmpty() && s.peek()>0 && asteroids[i]<0){
                int top=s.peek();
                if(top>Math.abs(asteroids[i])){
                    f=0;
                    break;
                }
                else if(top==Math.abs(asteroids[i])){
                    s.pop();
                    f=0;
                    break;
                }
                else{
                    s.pop();
                }
            }
                if(f!=0){
                    s.push(asteroids[i]);
                }
            

        }
       
        
    }
    
}
