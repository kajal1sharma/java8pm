import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// class Test implements Cloneable{
//     int a;
//     Test(int a){
//         this.a=a;
//     }
import java.util.Stack;

//     public Object clone () throws CloneNotSupportedException{
//            return  super.clone();
//     }
// }
public class IterableIntf {

    // static public ArrayList<Test> cloneIt(ArrayList<Test> list1) throws CloneNotSupportedException{
    //     ArrayList<Test> list2= new ArrayList<>();

    //     for(Test temp : list1){
    //         Test t= (Test)temp.clone();
    //         list2.add(t);
    //     }
    //     return list2;
    // }
    public static void main(String[] args) throws CloneNotSupportedException   {
        
 
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(45);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

        //Question => String ="{{}}{}{}}"well formed parantheses
        
        // List<Integer> list= new ArrayList<>();
        // list.add(12);
        // list.add(13);
        // list.add(14);
        // List<Integer> list2 = new LinkedList<>(list);
        // list2.add(34);
        // list2.add(0,12);
        // list2.addAll(list2);
        // System.out.println(list2);
        // list2.equals(list2);
        
        //ArrayList=> not a thread safe class //Vector=> thread safe

        // Test t1=new Test(10);
        //  Test t2=new Test(20);
        // Test t3=new Test(30);
        //  Test t4=new Test(40);
        // ArrayList<Test> list1 = new ArrayList<>();
        // list1.add(t1);
        // list1.add(t2);
        // list1.add(t3);
        // list1.add(t4);

        // ArrayList<Test> list2=cloneIt(list1);
        // ArrayList<Test> list2= new ArrayList<>();
        // list2.add(null);
        // list2.add(null);
        // list2.add(null);
        // list2.add(null);
        // Collections.copy(list2, list1);
        //  Test temp = list2.get(1);
        //  temp.a=100;
         
        //   for (Test test : list1) {
        //     System.out.print(test.a+"  ");
        //  }
        //  System.out.println();
        //  for (Test test : list2) {
        //     System.out.print(test.a+"  ");
        //  }

         



        // ArrayList<String> list = new ArrayList<>();
        // list.add("reena");
        // list.add("sita");
        // list.add(null);
        // list.add("sita");
        // list.add("tina");

        // ArrayList<String> list2= (ArrayList<String>)list.clone();
        // list2.add("jimmy");
        // list2.remove(0);
        // // list=list2;
        // System.out.println(list2);
        // System.out.println(list);
        // ArrayList list = new ArrayList();
        // list.add(12);
        // list.add("red");
        // list.add('a');
        // System.out.println(list);

    }
}
