
class Stack3{

    Object arr[];
    int top;

    Stack3(int size){
        arr = new Object[size];
        top=-1;
    }
    void push(Object obj){
        if(top==arr.length-1){
            return ;
        }
        arr[++top]=obj;
    }
    Object pop(){
        if(top==-1){
            return null;
        }
        Object obj = arr[top];
        top--;
        return obj;
    }

}

class Car2 {
    int val=90;
}
public class ObjectGen {
    public static void main(String[] args) {
        Stack3 st = new Stack3(5);
        st.push(34);
        st.push("teena");
        st.push(78.87f);
        st.push(new Car2());
        //st.pop(); 
        Car2 res =(Car2)st.pop();
        System.out.println(res.val);               
    }    
}
