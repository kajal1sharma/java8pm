import java.util.Comparator;
import java.util.PriorityQueue;

public class PriotyQueueI {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        // pq.add(56);
        // pq.add(89);
        // pq.add(78);
        // pq.add(156);

        // System.out.println(pq);
        PriorityQueue<Integer> pq= new PriorityQueue<>(new NumberComparator());
        pq.add(56);
        pq.add(89);
        pq.add(71);
        pq.add(156);
        System.out.println(pq);
    }
}

class NumberComparator implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){

       
        if(o1%2==0 && o2%2!=0){
            return -1;
        }
        else if(o1%2!=0 && o2%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
