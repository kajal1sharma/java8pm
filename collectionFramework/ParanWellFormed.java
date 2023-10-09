import java.util.Stack;

public class ParanWellFormed {
    public static void main(String[] args) {
        String str="{{}{}{{}{}}";
       Stack<Character> st= new Stack<>();

       boolean flag = true;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='{'){
            st.push(str.charAt(i));
        }
        else if( str.charAt(i)=='}'){
            if(st.size()==0){
                flag=false;
                break;
            }
            else if(st.size()>=1){
                st.pop();
                continue;
            }
        }
       }

       if(flag==true && st.size()==0 ){
        System.out.println("Well Formed Parantheses");
       }
       else{
        System.out.println("Not well formed parantheses");
       }

    }
}
