class Bcd{
    int c=90;

}
public class Abc implements Cloneable {
    
    int a;
    int b;
    Bcd t;
    Abc(int a, int b){
        this.a=a;
        this.b=b;
        this.t=new Bcd();
    }
    public Object clone() throws CloneNotSupportedException{
         Abc temp=(Abc)super.clone();
         temp.t= new Bcd();
         temp.t.c= this.t.c;
         return temp;
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Abc obj=new Abc(34, 56);
        Abc obj2 = (Abc)obj.clone();
        obj2.a=100;
        obj2.t.c=70;
        System.out.println(obj.a+"  "+obj.b+" "+obj.t.c);
        System.out.println(obj2.a+"  "+obj2.b+"  "+obj2.t.c);
    }
}
