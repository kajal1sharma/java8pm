import java.util.ArrayList;

public class IterableIntf {
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("reena");
        list.add("sita");
        list.add(null);
        list.add("sita");
        list.add("tina");

        ArrayList<String> list2= (ArrayList<String>)list.clone();
        list2.add("jimmy");
        // list=list2;
        System.out.println(list2);
        System.out.println(list);
        // ArrayList list = new ArrayList();
        // list.add(12);
        // list.add("red");
        // list.add('a');
        // System.out.println(list);

    }
}
