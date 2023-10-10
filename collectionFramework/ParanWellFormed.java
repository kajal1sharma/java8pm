import java.util.Stack;

public class ParanWellFormed {
    public static void main(String[] args) {
        
        String str2="{{}{}{{}{}}";
        //Ques => solve for valid parantheses
        String str3="[({}{[]})]()";
        String str="[({}{[]})](){{}()";
       Stack<Character> st= new Stack<>();

       boolean isWellFormed = true;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='{'|| str.charAt(i)=='(' || str.charAt(i)=='['){
            st.push(str.charAt(i));
        }
        else{
            //else if( str.charAt(i)=='}'){
            if(st.size()==0){
                isWellFormed=false;
                break;
            }
            else if(st.size()>=1){
                if(str.charAt(i)=='}' ){
                    char top = st.peek();
                    if(top=='{'){
                        st.pop();
                        continue;
                    }
                    else{
                         isWellFormed=false;
                         break;
                    }
                }
                else if(str.charAt(i)==']' ){
                    char top = st.peek();
                    if(top=='['){
                        st.pop();
                        continue;
                    }
                    else{
                         isWellFormed=false;
                         break;
                    }
                }
                else if(str.charAt(i)==')' ){
                    char top = st.peek();
                    if(top=='('){
                        st.pop();
                        continue;
                    }
                    else{
                         isWellFormed=false;
                         break;
                    }
                }
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
