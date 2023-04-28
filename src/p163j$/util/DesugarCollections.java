package p163j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p163j$.util.Collection;
import p163j$.util.List;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.UnaryOperator;

/* renamed from: j$.util.DesugarCollections */
/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f20258a;

    /* renamed from: b */
    static final Class f20259b = Collections.synchronizedList(new LinkedList()).getClass();

    /* renamed from: c */
    private static final Field f20260c;

    /* renamed from: d */
    private static final Field f20261d;

    /* renamed from: e */
    private static final Constructor f20262e;

    /* renamed from: f */
    private static final Constructor f20263f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f20258a = cls;
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f20260c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f20261d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f20263f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f20262e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* renamed from: c */
    public static void m16602c(Iterable iterable, Consumer consumer) {
        Field field = f20260c;
        if (field == null) {
            try {
                Collection.EL.m16605a((java.util.Collection) f20261d.get(iterable), consumer);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(iterable)) {
                    Collection.EL.m16605a((java.util.Collection) f20261d.get(iterable), consumer);
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection forEach.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m16601d(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f20260c;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f20261d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    java.util.Collection collection3 = (java.util.Collection) f20261d.get(collection);
                    removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
                }
                return removeIf;
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m16600e(List list, UnaryOperator unaryOperator) {
        Field field = f20260c;
        if (field == null) {
            try {
                List list2 = (List) f20261d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                }
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    java.util.List list3 = (java.util.List) f20261d.get(list);
                    if (list3 instanceof List) {
                        ((List) list3).replaceAll(unaryOperator);
                    } else {
                        List.CC.$default$replaceAll(list3, unaryOperator);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list replaceAll.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m16599f(java.util.List list, Comparator comparator) {
        Field field = f20260c;
        if (field == null) {
            try {
                java.util.List list2 = (java.util.List) f20261d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).sort(comparator);
                } else {
                    List.CC.$default$sort(list2, comparator);
                }
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    java.util.List list3 = (java.util.List) f20261d.get(list);
                    if (list3 instanceof List) {
                        ((List) list3).sort(comparator);
                    } else {
                        List.CC.$default$sort(list3, comparator);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list sort.", e2);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C0483d(map);
    }
}
