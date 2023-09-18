public class Stack {
    int arr[];
    int top;
    String str1="string1";
    String str2="string2";
    Stack(int size){
        top=-1;
        arr=new int[size];
    }
    static String printData(String data){
        synchronized(Stack.class){
            
            System.out.println(data);
            return data;
        }
    }
    boolean push(int data){
        synchronized(str1){
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
          
       synchronized(str2) {
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
