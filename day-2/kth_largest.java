import java.util.PriorityQueue;

public class kth_largest {
    public static void main(String[] args) {
        int[] nums={4,5,6,3,2,1};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.print(pq.peek());
        
    }
    
}
