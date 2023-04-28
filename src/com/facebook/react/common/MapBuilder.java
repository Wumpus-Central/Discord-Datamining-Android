package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class MapBuilder {

    /* loaded from: classes7.dex */
    public static final class Builder<K, V> {
        private Map mMap;
        private boolean mUnderConstruction;

        public Map<K, V> build() {
            if (this.mUnderConstruction) {
                this.mUnderConstruction = false;
                return this.mMap;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public Builder<K, V> put(K k, V v) {
            if (this.mUnderConstruction) {
                this.mMap.put(k, v);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        private Builder() {
            this.mMap = MapBuilder.newHashMap();
            this.mUnderConstruction = true;
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30832of() {
        return newHashMap();
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30831of(K k, V v) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30830of(K k, V v, K k2, V v2) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30829of(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        of.put(k3, v3);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30828of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        of.put(k3, v3);
        of.put(k4, v4);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30827of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        of.put(k3, v3);
        of.put(k4, v4);
        of.put(k5, v5);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30826of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        of.put(k3, v3);
        of.put(k4, v4);
        of.put(k5, v5);
        of.put(k6, v6);
        return of;
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m30825of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> of = m30832of();
        of.put(k, v);
        of.put(k2, v2);
        of.put(k3, v3);
        of.put(k4, v4);
        of.put(k5, v5);
        of.put(k6, v6);
        of.put(k7, v7);
        return of;
    }
}
