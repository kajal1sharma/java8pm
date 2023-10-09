import java.util.Stack;

public class ParanWellFormed {
    public static void main(String[] args) {
        
        String str="{{}{}{{}{}}";
        //Ques => solve for valid parantheses
        String str2="[({}{[]})]()";
        String str3="[({}{[]})](){{}()";
       Stack<Character> st= new Stack<>();

       boolean isWellFormed = true;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='{'){
            st.push(str.charAt(i));
        }
        else if( str.charAt(i)=='}'){
            if(st.size()==0){
                isWellFormed=false;
                break;
            }
            else if(st.size()>=1){
                st.pop();
                continue;
            }
        }
       }

       if(isWellFormed==true && st.size()==0 ){
        System.out.println("Well Formed Parantheses");
       }
       else{
        System.out.println("Not well formed parantheses");
       }

    }
}
