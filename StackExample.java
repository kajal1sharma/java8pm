import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class StackExample {
    public String toString(){
        return "hello i have changesd the output";
    }
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.push(34);
        //collection => storing same type of reference elements
        Collection<Integer> c=  new Stack<>();
        //PArent ref = store the ref of child object
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(34);
        arr.add(45);
        
        System.out.println(arr);

        int arr2[] =new int[5];
        arr2[0]=90;
        arr2[1]=80;
        arr2[2]=49;
        System.out.println(arr2); 

        // Object o = new Object();
        //  System.out.println(o.toString()); 
        // StackExample ste = new StackExample();
        // System.out.println(ste);

    }
}
