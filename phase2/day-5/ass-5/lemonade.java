public class lemonade {
    public static void main(String[] args) {
        int[] bills={5,5,5,10,20};
        int c=0;
        int n=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                c+=5;
                n+=5;
            }
            else if(n>=(bills[i]-5)){
                
                    c=c-bills[i];
                    n=c+bills[i];
                
            }
            else{
                System.out.print("false");
                return;
            }
        }
        if(n>=0){
            System.out.print("true");
        }
        else{
            System.out.print("false");

        }
    }
    
}
