public class Test {
    public static void main(String[] args) {
        HashMap2<String , Integer> map = new HashMap2<>();
        map.add("neetu",12);
        map.add("ritu",34);
        map.add("nisha",14);
        map.add("anisha",23);

        map.getInfo();

         HashMap2<String , String> map2 = new HashMap2<>();
         map2.add("ram","sita");
         map2.add("prakash","pooman");
         map2.add("rakesh","tina");

         map2.getInfo();
         map2.remove(1);

        
    }
}
