package week1.day_1;

public class idx_of_frstoccur {

    
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int ans=-1;
        if (needle.length() == 0) 
            {System.out.print(0);
                 return;
            }
        if(needle.length()>haystack.length()){
            System.out.print(-1);
            return;
        }
        int j=0;
      
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==0){
                    ans=i;
                }
                j++;
               
                if(j==needle.length()){
                    System.out.print(ans);
                }
                
            }
            else{
                if(j>0){
                    i=i-j;
                }
                j=0;
                
            }

        }
        System.out.print( -1);
        /*
        optimized
        class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
         */
    }

    
}
