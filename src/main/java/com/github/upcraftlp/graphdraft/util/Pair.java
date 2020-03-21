package com.github.upcraftlp.graphdraft.util;

import com.google.common.base.Objects;

public final class Pair<K, V> {

    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equal(key, pair.key) &&
               Objects.equal(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key, value);
    }
}
