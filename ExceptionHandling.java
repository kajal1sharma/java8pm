public class ExceptionHandling {
    public static void main(String[] args) {
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
    try{
            int number1 = 45;
            int number2= 0;
             //int ans= number1/number2; 
            String str= null;
            //int len=str.length();
            int arr[]=new int[4];
            arr[5]=90;
           
        }
        catch(NullPointerException n){
            System.out.println("null pointer excetion has come");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception is handled");
        }
        catch(Exception e){
            System.out.println("this is exception");
        }
            
            System.out.println("Now you can give exam");
            System.out.println("now you can happily code");
            System.out.println("iam in main function");    
    }
    
}
