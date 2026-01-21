import java.util.Arrays;

public class boats {
    public static void main(String[] args) {
         int[] people = {1,2};
         int limit = 3;
         int c=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                i++;
            }
            j--;
            c++;
        }
        System.out.print(c);
    }
}
    
    

