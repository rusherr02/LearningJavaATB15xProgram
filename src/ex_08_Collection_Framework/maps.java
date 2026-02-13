package ex_08_Collection_Framework;

import java.util.*;

public class maps {
    static void main() {
//        HashMap map = new HashMap();
//        map.put("kuchbhi", 123);
//        map.put(new ArrayList<>(), "");
//        System.out.println(map);

        // Map methods
//        Map<Integer,String> map5 = new EnumMap<>(Integer.class);

//            public abstract int size();
//            public abstract boolean isEmpty();
//            public abstract boolean containsKey(java.lang.Object);
//            public abstract boolean containsValue(java.lang.Object);
//            public abstract V get(java.lang.Object);
//            public abstract V put(K, V);
//            public abstract V remove(java.lang.Object);
//            public abstract void putAll(java.util.Map<? extends K, ? extends V>);
//            public abstract void clear();
//            public abstract java.util.Set<K> keySet();
//            public abstract java.util.Collection<V> values();
//            public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
//            public abstract boolean equals(java.lang.Object);
//            public abstract int hashCode();
//            public default V getOrDefault(java.lang.Object, V);
//            public default void forEach(java.util.function.BiConsumer<? super K, ? super V>);
//            public default void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
//            public default V putIfAbsent(K, V);
//            public default boolean remove(java.lang.Object, java.lang.Object);
//            public default boolean replace(K, V, V);
//            public default V replace(K, V);

        Map<String,Integer> hm = new HashMap<>();
        Map<Integer,String> tm = new TreeMap<>();
        Map<Integer,String> lhm = new LinkedHashMap<>();
//        Map<Integer,String> em = new EnumMap<>(Integer.class);
//        Map<Integer,String> Whm = new WeakHashMap<>();

        hm.put("A", 23);
        hm.put("B", 33);
        hm.put("C", 43);
        hm.put("D", 56);
        hm.put(null, 78);

        System.out.println(hm.size());
        System.out.println(hm.containsValue(33));
        System.out.println(hm.get("z"));


        Hashtable<Integer,String> ht = new Hashtable<>();

//        map.forEach((key, value) -> {
//            // Process key-value pair
//            hm.put(key, value);
//        });








    }
}
