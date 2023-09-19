import java.util.LinkedList;
import java.util.Queue;

class ThreadAdd extends Thread{
    ProducerConsumer pc;

    ThreadAdd( ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println( pc.q.add(i));
        }
    }
}

class ThreadRemove extends Thread{
   ProducerConsumer pc;

    ThreadRemove( ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
       for(int i=0;i<10;i++){
        System.out.println( pc.q.remove());
       }
    }
}


public class ProducerConsumer {
    Queue<Integer> q;
    int capacity;
    
    ProducerConsumer(int capacity){
        q= new LinkedList<Integer>();
      this.capacity=capacity;   
    }

    boolean add(int ele){
        synchronized(q){
        while(q.size()==capacity){
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
    }

    int remove(){
       synchronized(q){ 
        while(q.size()==0){
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
    } 


    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(5);
        ThreadAdd t1= new ThreadAdd(pc);    
        ThreadRemove t2 = new ThreadRemove(pc);
        t1.start();
        t2.start();            
    }
}
