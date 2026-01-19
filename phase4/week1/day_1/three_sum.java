package week1.day_1;
import java.util.*;
public class three_sum {
    public static void main(String[] args) {
        //bruteforce
       int[] arr = {-1, 0, 1, 2, -1, -4};
       ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
        Arrays.sort(arr); 
        for(int i=0;i<arr.length-2;i++){
            int target=-(arr[i]);
            int j=i+1;
            int k=arr.length-1;
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(j<k){
                ArrayList<Integer> l=new ArrayList<>();
                if(arr[j]+arr[k]==target){
                    l.add(arr[i]);
                    l.add(arr[j]);
                    l.add(arr[k]);
                    ll.add(l);
                    j++;
                    k--;
                while(j<k && arr[j]==arr[j-1]){
                    j++;
                }
                while(j<k && arr[k]==arr[k-1]){
                   k--;
                }
                }
                
                else if(arr[j]+arr[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
             System.out.print(ll);

        }       
    
}
/*
for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip duplicate i

            for (int j = i + 1; j < arr.length - 1; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // skip duplicate j

                for (int k = j + 1; k < arr.length; k++) {

                    if (k > j + 1 && arr[k] == arr[k - 1]) continue; // skip duplicate k

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        } */