import java.util.Arrays;
import java.util.Comparator;

public class non_over {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        Arrays.sort(intervals, Comparator.comparingDouble(o->o[1]));
        int lastend=intervals[0][1];
        int max=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastend){
                max++;
                lastend=intervals[i][1];
            }

        }
       System.out.print(intervals.length-max);
        
    }
}
