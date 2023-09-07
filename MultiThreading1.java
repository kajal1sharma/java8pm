public class MultiThreading1 extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi iam thread-1");
        }
    }
    public static void main(String[] args) {
        MultiThreading1 mt = new MultiThreading1();
        mt.start();
        for(int i=0;i<100;i++){
            System.out.println("iam main thread");
        }
    }
}
