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
        if(top<arr.length-1){
            Pair<M,N> obj1 = new Pair<>(key, value);
            arr[++top] = obj1;
        }
    }

     void add(int i,M key , N value){
     
        if(top<arr.length-1){
            Pair<M,N> obj1 = new Pair<>(key, value);
            if(i>top){
                arr[++top]=obj1;
            }
            else{
                
                for(int j =top ;j>=i;j--){
                    arr[j+1]=arr[j];
                }
                top++;;
                arr[i]=obj1;
            }
        }

    }
    
    void getInfo(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i].key+" "+arr[i].value);
        }
        System.out.println("==========================");
    }
    
    void remove(int i){
        for(int j=i;j<top;j++){
            arr[j]=arr[j+1];

        }
        arr[top]=null;
        top--;
    }
    void removeEnd(){
        if(top==-1){
            return;
        }
        arr[top]=null;
        top--;
    }

    //remove(i)
}
