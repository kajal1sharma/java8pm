class InvalidStudentException extends Exception{
    InvalidStudentException(String msg){
        super(msg);
    }
} 

public class CutomException {
    public static void main(String[] args) {
        try{
          //   int arr[]= new int[Integer.MAX_VALUE];
          //int a=90/0;
          int age=90;
          if(age>30 || age<18){
            throw new InvalidStudentException("age "+age+" is invalid");
          }
          ArithmeticException e;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello world");
    }
}
