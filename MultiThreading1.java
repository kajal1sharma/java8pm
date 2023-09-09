//public class MultiThreading1 extends Thread{
public class MultiThreading1 implements Runnable{

    public void run(){
        Thread temp = Thread.currentThread();
        System.out.println(temp.getName()+" is executing run function");
        for(int i=0;i<10;i++){
            System.out.println("Hi iam thread-1");
        }
    }
    public static void main(String[] args) {
        // MultiThreading1 mt = new MultiThreading1();
        // mt.start();

        Thread temp = Thread.currentThread();
        System.out.println(temp.getName()+" is executing main function");

        Thread t= new Thread(new MultiThreading1());
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("iam main thread");
        }
    }
}
