import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class QueueIntf {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(12);
        q.offer(23);
        q.add(34);
        q.add(78);
       
        // System.out.println(q.peek());
        // // System.out.println(q.remove());
        // System.out.println(q.remove(23));
        // System.out.println(q);
        // System.out.println(q.add(null));
        // q.element();
        
        //5 index queue 
        Iterator<Integer>i=q.iterator();
          
        
        while(i.hasNext()){
            System.out.println(i.next());
        }     
        i.remove();  
         System.out.println(q);       
    }
}
