
class ThreadDeadlock1 extends Thread{
    Resource1 r1;
    Resource2 r2;
    ThreadDeadlock1(Resource1 r1, Resource2 r2){
        this.r1=r1;
        this.r2=r2;
    }
    public void run(){
        synchronized(r1){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("iam running first sync block with a"+Thread.currentThread().getName());
       
        synchronized(r2){
            System.out.println("iam running first sync block with b"+Thread.currentThread().getName());
        }
        }
       
    }
}

class ThreadDeadlock2 extends Thread{
     Resource1 r1;
    Resource2 r2;
    ThreadDeadlock2(Resource1 r1, Resource2 r2){
        this.r1=r1;
        this.r2=r2;
    }
    public void run(){
         synchronized(r2){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("iam running first sync block with a"+Thread.currentThread().getName());
        synchronized(r1){
            System.out.println("iam running first sync block with b"+Thread.currentThread().getName());
        }
        }
        
    }
}

class Resource1{
    String s="first";
}
class Resource2{
    String s2="second";
}
public class DeadLock {
    
    public static void main(String[] args) {
        Resource1 r1= new Resource1();
        Resource2 r2= new Resource2();
        ThreadDeadlock1 t1= new ThreadDeadlock1(r1, r2);
        ThreadDeadlock2 t2= new ThreadDeadlock2(r1, r2);
        t1.start();
        t2.start();
    }
}
