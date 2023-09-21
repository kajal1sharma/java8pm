class Pair<K,V>{
    K key;
    V value;

    Pair(K key, V value){
        this.key=key;
        this.value=value;
    }
}

public class HashMap2<M,N> {

    Pair<M,N>[] arr;
    int top=-1;
    HashMap2(){
        System.out.println("your hashmap object is created");
        arr = new Pair[5];
    }

    void add(M key , N value){
        Pair<M,N> obj1 = new Pair<>(key, value);
        arr[++top] = obj1;
    }
    
    void getInfo(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i].key+" "+arr[i].value);
        }
    }
    

    //remove(i)
}
