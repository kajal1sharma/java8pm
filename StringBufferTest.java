public class StringBufferTest {
    public static void main(String[] args) {

        //thread safe and little slower than stringBuilder
        // StringBuffer sb = new StringBuffer("asndfkdsn");
        // System.out.println(sb);
        // System.out.println(sb.append("jksdsndfja"));
        StringBuffer sb2= new StringBuffer("abcd");
        sb2.append("jknagksndgknsdsdssak");
        System.out.println(sb2.capacity());

    }
}
