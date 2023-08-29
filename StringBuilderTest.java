public class StringBuilderTest {
    public static void main(String[] args) {

//not thread safe
    //     StringBuilder sb= new StringBuilder("abncddfsdgdsfgncd");
    //     StringBuilder sb2 = new StringBuilder("abcd");
    //     // sb=sb.reverse();
    //     // System.out.println(sb);
    //    // System.out.println(sb.charAt(3));
    //     // String s = sb.toString();
    //     // System.out.println(s);
    //     System.out.println(sb.equals(sb2));
    //     System.out.println(sb.lastIndexOf("ncd"));
    //     System.out.println(sb.lastIndexOf("ncd", 13));
    //     System.out.println(sb2.delete(0, 0));
        //string => immutable => the string cannot be changed
        // String str="a";
        // str=str+"bc";

        //stringbuilder => str made using this class is mutable
        // String str;
        // StringBuilder sb = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder("abcd");
        // StringBuilder sb3 = new StringBuilder(20);
        // CharSequence s = "ksndfksndf";
        // StringBuilder sb4 = new StringBuilder(s);
        // System.out.println(sb4);
        // sb3.append("abcddegdjsfkasjfkjasdf");
        // sb3.append(sb3);
        // System.out.println(sb3.capacity());
        // System.out.println(sb3.length());


        // System.out.println(sb2.capacity());
        //new capacity = capacity*2+2
        //  sb.append("defgh");
        // sb.append("knkdsddfnsdss");
        // sb.append(sb);
        // System.out.println(sb);
        // System.out.println(sb.length());//how many characters are stored inside this object
        // System.out.println(sb.capacity());//what is the size of charater it is using
    }
}
