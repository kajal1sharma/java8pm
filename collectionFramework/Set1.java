import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


class Human1{
    int height;
    String name;
    Human1(int height, String name){
        this.height=height;
        this.name=name;
    }
    public String toString(){
        return this.height+"..."+this.name;
    }
}
class Human1Comparator implements Comparator<Human1>{
    public int compare(Human1 obj1, Human1 obj2){
        if(obj1.height>obj2.height){
            return 1;
        }
        else if(obj1.height<obj2.height){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class Set1 {
    public static void main(String[] args) {

       SortedSet<Human1> ss =new TreeSet<>(new Human1Comparator());
       ss.add(new Human1(156,"pooja"));
       ss.add(new Human1(146,"neha"));
       ss.add(new Human1(176,"kunal"));

      System.out.println(ss.last());

        // SortedSet<Integer> ss= new TreeSet<>();
        
        // ss.add();
        // ss.add(40);
        // ss.add(30);
        // ss.add(90);
        // ss.add(30);
        // ss.add(60);
        // System.out.println(ss.first());
        
        // System.out.println(ss);

        //ques=>[12,13,14,12,23,45,12,13,23]
        // Set<Integer> s = new HashSet<>();
        // s.add(10);
        // s.add(20);
        // s.add(30);
        // s.add(40);
        // s.add(40);
        // s.add(null);
        // s.add(null);
        // System.out.println(s);

        // Set<Integer> st= new LinkedHashSet<>();
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(40);
        // st.add(30);
        // System.out.println(st);
        }
}
