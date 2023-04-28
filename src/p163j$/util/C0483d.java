package p163j$.util;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import p163j$.time.AbstractC9166a;
import p163j$.util.Map;
import p163j$.util.concurrent.AbstractC9273v;
import p163j$.util.concurrent.C9272u;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.d */
/* loaded from: classes2.dex */
public final class C0483d implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f20370a;

    /* renamed from: b */
    final Object f20371b = this;

    /* renamed from: c */
    private transient Set f20372c;

    /* renamed from: d */
    private transient Set f20373d;

    /* renamed from: e */
    private transient Collection f20374e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0483d(Map map) {
        map.getClass();
        this.f20370a = map;
    }

    /* renamed from: a */
    private static Set m16554a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f20263f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f20263f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map, p163j$.util.Map
    public final void clear() {
        synchronized (this.f20371b) {
            this.f20370a.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r5 = null;
     */
    @Override // p163j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r5, p163j$.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f20371b
            monitor-enter(r0)
            java.util.Map r1 = r4.f20370a     // Catch: all -> 0x004a
            boolean r2 = r1 instanceof p163j$.util.Map     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0010
            j$.util.Map r1 = (p163j$.util.Map) r1     // Catch: all -> 0x004a
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: all -> 0x004a
            goto L_0x0048
        L_0x0010:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: all -> 0x004a
            r6.getClass()     // Catch: all -> 0x004a
        L_0x0019:
            java.lang.Object r2 = r1.get(r5)     // Catch: all -> 0x004a
        L_0x001d:
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: all -> 0x004a
            if (r3 != 0) goto L_0x0033
            if (r2 != 0) goto L_0x002b
            boolean r3 = r1.containsKey(r5)     // Catch: all -> 0x004a
            if (r3 == 0) goto L_0x0031
        L_0x002b:
            boolean r2 = r1.remove(r5, r2)     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0019
        L_0x0031:
            r5 = 0
            goto L_0x0048
        L_0x0033:
            if (r2 == 0) goto L_0x003c
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0019
            goto L_0x0042
        L_0x003c:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: all -> 0x004a
            if (r2 != 0) goto L_0x001d
        L_0x0042:
            r5 = r3
            goto L_0x0048
        L_0x0044:
            java.lang.Object r5 = p163j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: all -> 0x004a
        L_0x0048:
            monitor-exit(r0)     // Catch: all -> 0x004a
            return r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x004a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.C0483d.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p163j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        Object apply;
        synchronized (this.f20371b) {
            Map map = this.f20370a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                function.getClass();
                obj2 = concurrentMap.get(obj);
                if (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) {
                    obj2 = apply;
                }
            } else {
                obj2 = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p163j$.util.Map
    public final Object computeIfPresent(Object obj, p163j$.util.function.BiFunction biFunction) {
        Object obj2;
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    if (obj3 == null) {
                        obj2 = obj3;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj3);
                    if (apply != null) {
                        if (concurrentMap.replace(obj, obj3, apply)) {
                            obj2 = apply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj3)) {
                        obj2 = null;
                        break;
                    }
                }
            } else {
                obj2 = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f20371b) {
            containsKey = this.f20370a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f20371b) {
            containsValue = this.f20370a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f20371b) {
            if (this.f20373d == null) {
                this.f20373d = m16554a(this.f20370a.entrySet(), this.f20371b);
            }
            set = this.f20373d;
        }
        return set;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f20371b) {
            equals = this.f20370a.equals(obj);
        }
        return equals;
    }

    @Override // p163j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f20371b) {
            Map.EL.forEach(this.f20370a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f20371b) {
            obj2 = this.f20370a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            if (map instanceof Map) {
                obj2 = ((Map) map).getOrDefault(obj, obj2);
            } else if (map instanceof ConcurrentMap) {
                Object obj3 = ((ConcurrentMap) map).get(obj);
                if (obj3 != null) {
                    obj2 = obj3;
                }
            } else {
                obj2 = map.get(obj);
            }
        }
        return obj2;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f20371b) {
            hashCode = this.f20370a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f20371b) {
            isEmpty = this.f20370a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f20371b) {
            if (this.f20372c == null) {
                this.f20372c = m16554a(this.f20370a.keySet(), this.f20371b);
            }
            set = this.f20372c;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L_0x001c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L_0x001c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // p163j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, p163j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f20371b
            monitor-enter(r0)
            java.util.Map r1 = r4.f20370a     // Catch: all -> 0x0046
            boolean r2 = r1 instanceof p163j$.util.Map     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x0010
            j$.util.Map r1 = (p163j$.util.Map) r1     // Catch: all -> 0x0046
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: all -> 0x0046
            goto L_0x0044
        L_0x0010:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x0040
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: all -> 0x0046
            r7.getClass()     // Catch: all -> 0x0046
            r6.getClass()     // Catch: all -> 0x0046
        L_0x001c:
            java.lang.Object r2 = r1.get(r5)     // Catch: all -> 0x0046
        L_0x0020:
            if (r2 == 0) goto L_0x0038
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: all -> 0x0046
            if (r3 == 0) goto L_0x0030
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x001c
            r6 = r3
            goto L_0x003e
        L_0x0030:
            boolean r2 = r1.remove(r5, r2)     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x001c
            r6 = 0
            goto L_0x003e
        L_0x0038:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: all -> 0x0046
            if (r2 != 0) goto L_0x0020
        L_0x003e:
            r5 = r6
            goto L_0x0044
        L_0x0040:
            java.lang.Object r5 = p163j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: all -> 0x0046
        L_0x0044:
            monitor-exit(r0)     // Catch: all -> 0x0046
            return r5
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0046
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p163j$.util.C0483d.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f20371b) {
            put = this.f20370a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f20371b) {
            this.f20370a.putAll(map);
        }
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.f20371b) {
            putIfAbsent = Map.EL.putIfAbsent(this.f20370a, obj, obj2);
        }
        return putIfAbsent;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f20371b) {
            remove = this.f20370a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
        }
        return replace;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // p163j$.util.Map
    public final void replaceAll(p163j$.util.function.BiFunction biFunction) {
        synchronized (this.f20371b) {
            java.util.Map map = this.f20370a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                C9272u uVar = new C9272u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof AbstractC9273v) {
                    ((AbstractC9273v) concurrentMap).forEach(uVar);
                } else {
                    AbstractC9166a.m16733a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f20371b) {
            size = this.f20370a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f20371b) {
            obj = this.f20370a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Throwable e;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f20371b) {
            if (this.f20374e == null) {
                Collection values = this.f20370a.values();
                Object obj = this.f20371b;
                constructor = DesugarCollections.f20262e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f20262e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f20374e = collection2;
            }
            collection = this.f20374e;
        }
        return collection;
    }
}
