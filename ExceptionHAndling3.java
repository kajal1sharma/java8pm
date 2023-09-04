class Stack{
    int arr[];
    int top;

    Stack(int size){
        arr = new int[size];
        top=-1;
    }

    void push(int ele) throws Exception{
        if(arr.length-1 == top){
           throw new Exception("stack Overflow");
        }
        else{
            top++;
            arr[top]=ele;
        }
    }

    int pop() throws Exception{
        if(top==-1){
            throw new Exception("stack underflow");
        }
        else{
            int ele =arr[top];
            top--;
            return ele;
        }

       // return Integer.MIN_VALUE;
    }
}

public class ExceptionHAndling3 {
public static void main(String[] args) {
    Stack st= new Stack(4);
   try{
    // st.pop();
    st.push(34);
    st.push(32);
    st.push(31);
    st.push(30);
    st.push(35);
   }
   catch(Exception e){
    System.out.println(e);
   }
}    
}
