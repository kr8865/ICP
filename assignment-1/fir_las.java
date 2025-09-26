public class fir_las {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int first_idx=firstoccur(nums,target);
        int last_idx=lastoccur(nums,target);
        int[] arr={first_idx,last_idx};
        System.out.println(arr[0]);
        System.out.print(arr[1]);
        
    }
    public static int firstoccur(int[] nums,int target){
        int left=0;
        int ans=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static int lastoccur(int[] nums,int target){
        int left=0;
        int ans1=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans1=mid;
                left=mid+1;;
            }
           else if(nums[mid] > target) {
                 right= mid-1;
            } else {
                left= mid+1;
            }
        }
        return ans1;
    }
}
