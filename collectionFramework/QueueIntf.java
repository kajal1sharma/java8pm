import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class QueueIntf {
    public static void main(String[] args) {

        LinkedList<Integer> list= new LinkedList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(90);
        list.add(20);
        list.add(50);
LinkedList<Integer> list2= new LinkedList<>();
        list.add(100);
        list.add(400);
        list.add(300);
        list.add(900);
        list.add(200);
        list.add(500);
        
        Collections.sort(list);//Collections => utility class
        Collections.swap(list, 0,3);
        Collections.copy(list,list2);
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 500));
        // Collections.rotate(list,2);
        // Collections.shuffle(list);
        System.out.println(list);
        // Collections.reverse(list);
        // Collections.addAll(list,45,56,56,67,78);
        // Collections.copy(null, null);
        
        // List<Object>list2 =Collections.emptyList();
        // Iterator i = list2.iterator();

        

        // System.out.println(list2.size());

        // System.out.println(list2);
        // System.out.println(list2);
    //     Queue<Integer> q= new LinkedList<>();
    //     q.add(10);
    //     q.offer(20);
    //     q.add(30);
    //     q.add(40);
    //    q.add(50);
    //    q.add(60);
    //    q.add(70);
    //    q.add(80);
    //    q.add(90);
    //    q.add(100);
    //    q.remove();
       
    //    Enumeration<Integer> en = Collections.enumeration(q);//read only

    //    while(en.hasMoreElements()){
    //     System.out.println(en.nextElement());
    //    }


        // System.out.println(q.peek());
        // // System.out.println(q.remove());
        // System.out.println(q.remove(23));
        // System.out.println(q);
        // System.out.println(q.add(null));
        // q.element();
        
        //5 index queue 
        // Iterator<Integer> i=q.iterator();
        
        // i.remove();
        // q.add(23);
        // q.add(340);
        // i.next();
        // i.next();
        // i.next();
        // i.next();

        // i.remove();
        // System.out.println(q);
        
    //     int j=0;
    //     while(i.hasNext()){
    //         i.next();
    //         j++;
    //         if(j==5){
    //             break;
    //         }
    //     }     
    //     i.remove();  
    //    q.remove();
        //  System.out.println(q);       
    }
}
