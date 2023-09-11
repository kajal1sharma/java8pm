public class Stack {
    int arr[];
    int top;
    Stack(int size){
        top=-1;
        arr=new int[size];
    }

    boolean push(int data){
        synchronized(this){
        if(top==arr.length-1){
                return false;
            }
            else{
                top++;
                arr[top]=data;
                return true;
            }
        }
        
    }
    int pop(){
          
       synchronized(this) {
            if(top==-1){
            return Integer.MIN_VALUE;

        }
        else{
            int result=arr[top];
            top--;
            return result;
        }
        }
    
    }
}
