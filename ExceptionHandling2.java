//Checked Unchecked 
//checked exception are the exception which are checkwed by compiler if they handled
//they have to handled
// An exeption can be handled in two ways =>
//try -catch block

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;

public class ExceptionHandling2 {

    static void doSomething() throws Exception{
        int a=90/0;
    }
    public static void main(String[] args) throws URISyntaxException{
        
        try{
            
            File f = new File("text.txt");
            FileReader f2= new FileReader(f);
        }
        catch(FileNotFoundException e){
          try{
                File f = new File("abc.txt");
                FileReader f2= new FileReader(f);
          }
          catch(FileNotFoundException e2){
            System.out.println("let it be");
          }
            
        }

        // doSomething();

        // try{
        //  doSomething();
        // }
        // catch(Exception e){

        // }
        // try{
        //     int a=90;
        //     int b=60;

        //     a=a/0;
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
    }
}
