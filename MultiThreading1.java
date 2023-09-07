//public class MultiThreading1 extends Thread{
public class MultiThreading1 implements Runnable{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi iam thread-1");
        }
    }
    public static void main(String[] args) {
        // MultiThreading1 mt = new MultiThreading1();
        // mt.start();


        Thread t= new Thread(new MultiThreading1());
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("iam main thread");
        }
    }
}
