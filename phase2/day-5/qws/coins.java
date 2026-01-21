import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            if(n>=10){
                n-=10;
                c++;
            }
            else if(n>=5){
                n-=5;
                c++;
            }
            else if(n>=2){
                n-=2;
                c++;
            }
            else if(n>=1){
                n-=1;
                c++;
            }
            
        }
       System.out.print(c);
    }
    
}
