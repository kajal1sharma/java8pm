
class Thread1 implements Runnable{
    Stack st;
    Thread1(Stack st){
        this.st= st;
    }
    //thread 1 is for pushing in the stack
    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           System.out.println( st.push(i));
           
        }
    }
}
class Thread2 implements Runnable{
    Stack st;
    Thread2(Stack st){
        this.st= st;
    }
    //pop out from the stack
    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println( st.pop());
        }
    }
}

public class Multi3{
    public static void main(String[] args) {
        Stack st = new Stack(10);
        Thread1 t1= new Thread1(st);
        Thread2 t2= new Thread2(st);
        Thread thread_push =new Thread(t1);
        Thread thread_pop = new Thread(t2);
        thread_push.start(); 
        thread_pop.start();
    }
}
