import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] board=new boolean[n];
        combination(n,k,board,ll,ans,0,0);
        System.out.print(ans);
        
    }
    public static void combination(int n,int k, boolean[] board,List<Integer> ll,List<List<Integer>> ans ,int idx,int qp){
        if(qp==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                ll.add(i+1);
                combination(n,k,board,ll,ans,i+1,qp+1);
                ll.remove(ll.size()-1);
                board[i]=false;
                
                }
        }




    }
}

