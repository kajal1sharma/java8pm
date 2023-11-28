public class App {
    public static void main(String[] args) throws Exception {
        College.collegeName="Abcd";
        College c= new College();

        boolean admitted = c.Admission("jkdfgjkdfk343");
        if(admitted==true){
            System.out.println("Student has been admitted");
        }
        else{
            System.out.println("not admitted");
        }


        admitted = c.Admission("4958349583945k343");
        if(admitted==true){
            System.out.println("Student has been admitted");
        }
        else{
            System.out.println("not admitted");
        }

        c.listOfStudents();
    }
}
