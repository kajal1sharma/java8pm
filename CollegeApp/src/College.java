import java.util.ArrayList;

public class College {
    static String collegeName;

    ArrayList<Student> students=new ArrayList<>();

    boolean Admission(String roll){

        for(Student st : students){
            if(st.roll.equals(roll)){
                return false;
            }
        }

        Student st=  new Student();
        st.setRoll(roll);

        students.add(st);
        return true;

    }

    void listOfStudents(){
           for(Student st : students){
            System.out.println(st.roll);
        } 
    }
}
