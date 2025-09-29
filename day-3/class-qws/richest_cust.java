public class richest_cust {
    public static void main(String[] args) {
        /*ou are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ 
        customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts. 
            The richest customer is the customer that has the maximum wealth.
        Example 1:
        Input: accounts = [[1,2,3],[3,2,1]] */
        int[][] arr={{1,2,3},{3,2,1}};
        
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            max=Math.max(max,sum);
        }
        System.out.print(max);


        
    }
    
}
