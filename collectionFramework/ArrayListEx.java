import java.util.ArrayList;
import java.util.HashSet;
public class ArrayListEx{
    public static void main(String[] args){


        String str1= "this is a string and this is repeated string";
        //this is a string and repeated
        String arr[] = str1.split(" ");

        ArrayList<String > list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        StringBuilder st = new StringBuilder();
        for(int i=0;i<list.size();i++){
            st=st.append(list.get(i)+" ");
        }
        System.out.println(st);

        // ArrayList<String> list = new ArrayList<>(10);
        // //System.out.println(list.size());
        // list.add("sita");
        // list.add("gita");
        // list.add("meeta");
        // String str= list.get(0);
        // System.out.println(str);

        // HashSet<String> hs= new HashSet<>();
        // hs.add("siita");
        // hs.add("mina");

        // ArrayList<String> list = new ArrayList<>();
        // list.add("reena");
        // list.add("mina");
        // list.add("sita");
        // // System.out.println(list.contains("siita"));
        // System.out.println(list.containsAll(hs));
        
        // // list.remove(1);
        // System.out.println(list);
         // ArrayList<Integer> list = new ArrayList<>();
        // list.add(100);
        // list.add(34);
        // list.add(78);
        // list.add(67);
        // // list.add(34);
        // // list.add(78);
        // // list.add(67);
        // // list.add(0, 0);
        // // //list.addAll(hs);
        // // list.addAll(3, hs);
        // // list.remove( 0);//index
        // Integer i=100;
        // list.remove(i);//object
        // System.out.println(list);

        //you have to insert at 2nd last position 

        


        // ArrayList<Integer> list2 = new ArrayList<>(list);
        // System.out.println(list2);

        // System.out.println(list);
        // System.out.println(list.size());

        // int marks[] =new int[50];
        // marks[0]=90;
        // marks[1]=56;
        // marks[2]=443;

        // int sum=0;
        // for(int i=0;i<marks.length;i++){
        //     sum=sum+marks[i];
        // }

        // int num1=12;
        // int num2=13;
        // int num3=34;
        // int num50 =34;

        // //int sum =num1+num2 +......;
        // num1=num1+10;
        // num2=num2+10;

    }
}