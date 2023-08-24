class String2{
    public static void main(String[] args) {


        // String s= new String("hello world");

        // System.out.println(s.charAt(8));
        // System.out.println(s.substring(6));
        // System.out.println(s.substring(6,9));
        // //endIndex is excluded index
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.endsWith("wo"));

        String str[]={"abc.py","test.java", "index.html", "Human.java", "Test.py"};


        int size=0;
        for(String s: str){
            if(s.endsWith(".java")){
                size++;
            }
        }

        String arr[]= new String[size];
        int i=0;
        for(String s: str){
            if(s.endsWith(".java")){
                arr[i]=s;
                i=i+1;
            }
        }

        for(String s:arr){
            System.out.println(s);
        }


        //literal??//a constants => that are assigned to a variables
        //int a=34;

        // String s= "hello world";//literal => string pool
        // String s2 = new String("hello world");//object

        // String s="hello";
        // String s2="hello";
        // String s3="hello";
        // String s4="hello world";
        // System.out.println(s==s2);
        // System.out.println(s2==s3);
        // System.out.println(s==s4);
        // System.out.println(s.hashCode());
        // System.out.println(s2.hashCode());
        // System.out.println(s3.hashCode());
        // System.out.println(s4.hashCode());


        // String s="tree";
        // String s2= new String("tree");
        // String s3= new String("tree");
        // System.out.println(s==s2);


        //strings are immutable in nature
        //String str = "hello";
        //str=str+ " world";
        // int a =90;
        // a=80;
        // System.out.println(str);

    }
}












