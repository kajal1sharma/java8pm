public class StringBuilderTest {
    public static void main(String[] args) {
        //string => immutable => the string cannot be changed
        // String str="a";
        // str=str+"bc";

        //stringbuilder => str made using this class is mutable

        StringBuilder sb = new StringBuilder();
        //new capacity = capacity*2+2
         sb.append("defgh");
        sb.append("knkdsddfnsdss");
        sb.append(sb);
        System.out.println(sb);
        System.out.println(sb.length());//how many characters are stored inside this object
        System.out.println(sb.capacity());//what is the size of charater it is using
    }
}
