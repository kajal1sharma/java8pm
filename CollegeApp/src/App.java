
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void enterUser(){
        System.out.println("Enter username");
        String username= sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        JDBC.insertIntoDB("userdetail", username, password);
    }
    public static void showDetail(){
        System.out.println("Enter username");
        String username= sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        JDBC.readFromDB("userdetail", username, password);
    }
 public static void main(String[] args) {
    
    char ch= 'Y';
    
    while(ch=='Y'|| ch=='y'){
        System.out.println("Enter your choice\n1.Enter new user\n2.Edit details\n3.Delete user\n4.Show Info");
        int choice = sc.nextInt();

        switch(choice){
            case 1: enterUser();
                    break;
            case 2: System.out.println("case 2");
                    break;
            case 3: System.out.println("case 3");
                    break;
            case 4: showDetail();
                    break;
            default: System.out.println("wrong choice");
        }

        System.out.println("Do you want to continue(Y,y)");
        ch=sc.next().charAt(0);
    }
 }   
}
