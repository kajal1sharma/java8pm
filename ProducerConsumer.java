import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    Queue<Integer> q;
    int capacity;
    
    ProducerConsumer(int capacity){
        q= new LinkedList<Integer>();
      this.capacity=capacity;   
    }

    boolean add(int ele){
        if(q.size()==capacity){
            try {
                q.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    
            q.add(ele);
            q.notifyAll();
            return true;
    
    }

    int remove(){
        if(q.size()==0){
            try {
                q.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        int ele= q.poll();
        q.notifyAll();
        return ele;        
    } 


    public static void main(String[] args) {
        
    }
}
