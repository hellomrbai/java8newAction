package com.company.myHashMap;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by 12430 on 2018/3/7.
 */
public class MyHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable {
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict){
        return null;
    }

    public V put(K key,V value){
        return putVal(hash(key), key, value, false, true);
    }
}
