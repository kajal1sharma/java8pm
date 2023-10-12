import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Queue3 {
    public static void main(String[] args) {
        //Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        dq2.add(10);
        dq2.addFirst(20);
        dq2.addFirst(30);
        System.out.println(dq2);
        dq2.addLast(40);
        System.out.println(dq2);
        dq2.addFirst(60);
        System.out.println(dq2);

        System.out.println(dq2.removeFirst());
        System.out.println(dq2);
        System.out.println(dq2.removeLast());
        System.out.println(dq2);

        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(232);
        list.add(878);

        list.addAll(dq2);
        System.out.println("list element ===============");
        System.out.println(list);


        // dq2.addLast(null);
        //double ended queue;
    }
}
