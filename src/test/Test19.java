package test;

import java.util.*;

/**
 * @date 2022年03月01日14:13
 */
public class Test19 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        //for(Integer i:list){
        //    if(1==i){
        //        list.remove(i);
        //    }
        //    System.out.println(i);
        //}
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 2) {
                iterator.remove();
            }
        }
        boolean contains = list.contains(3);
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set);
        Map<String, String>  hashMap = new HashMap();
        hashMap.put("","");
        hashMap.put("","");
        hashMap.put("1","1");
        hashMap.put("1","2");
        hashMap.put("2","1");
        hashMap.put("3","2");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String, String> entry=iterator1.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println(hashMap.size());
    }
}
