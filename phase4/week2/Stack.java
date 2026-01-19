public class Stack{
    static int[] arr;
    static int idx;

    static class Stac{
        Stac(){
            arr=new int[10];
            idx=-1;
        }
      
       public static void push(int v){
          arr[++idx]=v;
       }
       public static int pop(){
        if(idx==-1){
            System.out.print("empty");
            return -1;
        }
         int r=arr[idx];
         idx--;
        return r;
       

       }
       public static int peek(){
        if(idx==-1){
            System.out.print("empty");
            return -1;
        }
        return arr[idx];

       }
       public static void display(){
        if(idx==-1){
            System.out.print("empty");
            return;
        }
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");
        }   

        
    }
    public static boolean isEmpty(){
        if(idx==-1){
            return true;
        }
        return false;
    }
    }
    public static void main(String[] args) {
        Stac st=new Stac();
        st.push(10);
        st.push(20);
        st.push(30);
       while(!st.isEmpty()){
        System.out.print(st.pop()+" ");
       }


        
    
}

}