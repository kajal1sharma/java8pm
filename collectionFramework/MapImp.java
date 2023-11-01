import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

class MapImp{
    public static void main(String[] args) {
        
        Map<Integer,String> mp= new HashMap<Integer,String>();

        mp.put(12, "reena");
        mp.put(90,"ram");
        mp.put(89,"leena");
         mp.put(14,"tina");
         Set<Integer> set = mp.keySet();
         System.out.println(set);

         Collection<String> list =mp.values();
         System.out.println(list);

         for(Integer i : mp.keySet()){
            System.out.println(i+"  -- "+mp.get(i));
         }
         Set<Map.Entry<Integer, String>> list2 = mp.entrySet();

         for(Map.Entry<Integer,String> e: list2){
            System.out.println(e.getKey()+"===="+e.getValue());

         }


        // mp.putIfAbsent(13,"ramesh");
        // String name= mp.get(12);
        //Ques 
        // int []arr ={1,2,3,1,2,4,3,1};

        // HashMap<Integer, Integer> map = new HashMap<>();
        


        // for(int i=0;i<arr.length;i++){
        //     int key= arr[i];
        //     if(map.containsKey(key)){
        //         int value = map.get(key);
        //         map.replace(key,value+1);
        //     }
        //     else{
        //         map.put(key, 1);
        //     }

        // }
        // System.out.println(map);
        //containsKey
        //get
        
        // System.out.println(mp);


    //     Map<Integer,String> mp2= new HashMap<>(mp);
    //     mp2.put(45,"priya");
    //     mp2.put(67, "priya");
    //     mp2.put(null,null);
    //    // System.out.println(mp2);

    //     mp.putAll(mp2);
        
    //     mp.putIfAbsent(67,"reena");
    //     System.out.println(mp);
    }
}