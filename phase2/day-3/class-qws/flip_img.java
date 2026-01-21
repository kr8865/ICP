public class flip_img {
    public static void main(String[] args) {
        /*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
        To flip an image horizontally means that each row of the image is reversed.
        For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
        For example, inverting [0,1,1] results in [1,0,0].
        Example 1:
        Input: image = [[1,1,0],[1,0,1],[0,0,0]] */
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int i=0;
        while(i<arr.length){
            int j=0;
            int k =arr.length-1;
            while(j<=k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k]^1;
                arr[i][k]=temp^1;
                j++;
                k--;

            }
            i++;
        }
        display(arr);







    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
