import java.util.Arrays;

public class min_arrows {
    public static void main(String[] args) {
        
        //points = [[10,16],[2,8],[1,6],[7,12]]

        int[][] points={{10,16},{2,8},{1,6},{7,12}};
         Arrays.sort(points,(a,b)->a[0]-b[0]);
        int si=points[0][0];
        int ei=points[0][1];
        int a=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>ei){
                a++;
                si=points[i][0];
                ei=points[i][1];
            }
        }

        
    System.out.print(a);
    }
    
}
