
// class Stack2 <E> {
 
//     E arr[];
//     int top;
//     Stack2(int size){
//         this.arr= (E[])(new Object[size]);
//         top=-1;
//     }

//     boolean push(E data){
//         if(top==arr.length-1){
//             return false;
//         }
//         else{
//             top++;
//             arr[top]=data;
//             return true;
//         }
//     }

//     E pop(){
//         if(top==-1){
            
//             return null;
//         }
//         else{
//             E ele = this.arr[top];
//             top--;
//             return ele;
//         }
//     }

// }

// class Car{
// int a;
// Car(int a){
//     this.a=a;
// }
// }


class KeyValue <K,V>{

    K key;
    V value;

    KeyValue(K obj1, V obj2){
        this.key= obj1;
        this.value=obj2;
    }
}

class HashMap<K,V>{
    KeyValue<K,V> arr[];
    HashMap(int size){
        this.arr= new KeyValue[size];
    }
  //add
  //remove

}

public class Generics {
    public static void main(String[] args) {
        // Stack2<Integer> st = new Stack2<Integer>(5);
        // st.push(23);
        // st.push(34);
        // System.out.println(st.pop());
        // Car c= new Car(23);
        // Car c2= new Car(60);

        // Stack2<Car> st2 = new Stack2<Car>(5);
        // st2.push(c);
        // st2.push(c2);
        // System.out.println(st2.pop().a);
        // Stack2<Character> st3 = new Stack2<Character>(5);
            // Stack2 st = new Stack2(5);
            // st.push(23);
            // st.push(24);
            // st.pop();
        }    
}














