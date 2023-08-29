import java.util.StringTokenizer;

public class StringTokennizerTest {
    public static void main(String[] args) {
        
        String str= "this,is,a,string,that,will,be,tokenized";
        String strarr[]=str.split(",");
        for(String s:strarr){
            System.out.println(s);
        }
        // StringTokenizer s = new StringTokenizer(str,",");

        // while(s.hasMoreTokens()){
        //     System.out.println(s.nextToken());
        // }
    }
}
