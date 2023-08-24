class Person{
    int id;
    String name;
    float salary;
    byte flatNo;
    char bloodGroup;
    
}

public class VariablesClass{
 public static void main(String[] args) {
        Person p = new Person(); 
        int a=0;
        String s=null;//null means object is pointing to nothing
        System.out.println(s);
    }
    //instance variables => data members

    // int rollno;//primitive => 
    // String name;//reference varibales
    
    //local variables=> created inside the stack frame and 
                          //  with limited scope of stack frame
    //static variables

    // void printInfo(){
    //     int AadharId;//local to printInfo()

    //     System.out.println(rollno);
    //     System.out.println(name);
    // }

    // static void doSomethingEvenMore(){
    //     System.out.println("Line 5");
    //     int a=90;
    //     int b=89;
    //     if(a<b){
    //        return; 
    //     }
    //     System.out.println("Line 6");
    // }
    // static void doSomethingMore(){
    //     System.out.println("Line 3");
    //     doSomethingEvenMore();
    //     int a=90;
    //     int b=78;
    //     if(a>b){
    //         return ;
    //     }
    //     System.out.println("Line 4");
    // }
    // static void doSomething(){
    //     System.out.println("line 1");
    //     doSomethingMore();
    //     System.out.println("Line 2");
    // }
   

}