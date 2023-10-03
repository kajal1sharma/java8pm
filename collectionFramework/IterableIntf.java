import java.util.ArrayList;
import java.util.Collections;
class Test{
    int a;
    Test(int a){
        this.a=a;
    }

    public Object clone () throws CloneNotSupportedException{
           return  super.clone();
    }
}
public class IterableIntf {

    public ArrayList<Test> cloneIt(ArrayList<Test> list1) throws CloneNotSupportedException{
        ArrayList<Test> list2= new ArrayList<>();

        for(Test temp : list1){
            Test t= (Test)temp.clone();
            list2.add(t);
        }
        return list2;
    }
    public static void main(String[] args) {

        Test t1=new Test(10);
         Test t2=new Test(20);
        Test t3=new Test(30);
         Test t4=new Test(40);
        ArrayList<Test> list1 = new ArrayList<>();
        list1.add(t1);
        list1.add(t2);
        list1.add(t3);
        list1.add(t4);

        ArrayList<Test> list2= (ArrayList)  list1.clone();
        // ArrayList<Test> list2= new ArrayList<>();
        // list2.add(null);
        // list2.add(null);
        // list2.add(null);
        // list2.add(null);
        // Collections.copy(list2, list1);
         Test temp = list2.get(1);
         temp.a=100;
         
          for (Test test : list1) {
            System.out.print(test.a+"  ");
         }
         System.out.println();
         for (Test test : list2) {
            System.out.print(test.a+"  ");
         }

         



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
