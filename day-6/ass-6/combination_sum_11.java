import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_11 {
    public static void main(String[] args) {
        int[] candidates= {10,1,2,7,6,1,5};
        int target=8;
       List<Integer> ll=new ArrayList<>();
	   List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
		Combination(candidates,target,ll,0,ans);
        System.out.print( ans);

	}
	public static void Combination(int[] coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(amount==0) {
			//System.out.println(ans);
            
			ans.add(new ArrayList<>(ll));
			return;
			}
		for(int i=idx;i<coin.length;i++) {
             if(i>idx && coin[i]==coin[i-1]){
                continue;
            }
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				Combination(coin,amount-coin[i],ll,i+1,ans);
				ll.remove(ll.size()-1);
			}
		}
        
    }
}
    
    

