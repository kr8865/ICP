public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{5,6,7},{9,10,11}};
       int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        
        while(top <= bottom && left <= right) {
            // Top row
            for(int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;
            
            // Right column
            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            
            // Bottom row (if any)
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }
            
            // Left column (if any)
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}