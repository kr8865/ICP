public class search_2d {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int j=arr.length;
        int i=0;
        while(i<arr.length){
            if(arr[i][j]==target){
                System.out.print("true"+" ");
                return;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
    }
}
