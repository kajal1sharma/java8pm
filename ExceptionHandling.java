public class ExceptionHandling {

    public static void doSomethingEvenMore(){
        System.out.println("Line 7 = do Something even more");
   
        int a=90/0;
        
        System.out.println("Line 8 = doSomething even more");
    }
    public static void doSomethingMore(){
        System.out.println("Line 5 = doSomethingMore");
       // try{
        doSomethingEvenMore();
       
        System.out.println("Line 6 = doSomethingMore");
    }
    public static void  doSomething(){
        System.out.println("Line 3 = doSomething");
        try{
        doSomethingMore();
         }
        catch(Exception e){
            e.printStackTrace();
            // System.out.println();
        }
        System.out.println("Line 4 = do something ");
    }
    public static void main(String[] args) {

        System.out.println("Line 1 = main");
        doSomething();
        System.out.println("Line 2 = main");



    //Syntax error = when we compile our program 
    //java has defined its set of rules and regulation that you have to follow 
    //in order for jvm to understand what you are writing

    // int =67;

    //runtime error => two types 
    //1:exception 2: error
    //exception can be handled
    //=>exception occurs always at runtime
    //errors cannot be handled

    //catch block it handles exception =>when exception occurs    
    // try{
    //         int number1 = 45;
    //         int number2= 0;
    //          //int ans= number1/number2; 
    //         String str= null;
    //         //int len=str.length();
    //         int arr[]=new int[4];
    //         // arr[5]=90;
           
    //     }
    //     catch(NullPointerException n){
    //         System.out.println("null pointer excetion has come");
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("arithmetic exception is handled");
    //     }
    //     catch(Exception e){
    //         System.out.println("this is exception");
    //     }
    //     finally{
    //         System.out.println("Now you can give exam");
    //     } 
            
    //         System.out.println("now you can happily code");
    //         System.out.println("iam in main function");    
    }
    
}
