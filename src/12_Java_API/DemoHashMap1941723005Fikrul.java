package fikrul.percobaan3;

import java.util.HashMap;

/**
 *
 * @author muhammadFikrulHaqi
 */
public class DemoHashMap1941723005Fikrul {
    public static void main(String[] args){
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMap Item Total : %d\n\n",hMapItem.size());
        
        Object nObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n",nObject);
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
    }
}
