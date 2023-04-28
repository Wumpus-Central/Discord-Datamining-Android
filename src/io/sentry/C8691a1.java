package io.sentry;

import io.sentry.util.C9109i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.a1 */
/* loaded from: classes8.dex */
public final class C8691a1 {

    /* renamed from: a */
    private final Set<Object> f19209a = new HashSet();

    /* renamed from: b */
    private final int f19210b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8691a1(int i) {
        this.f19210b = i;
    }

    /* renamed from: a */
    private List<Object> m18353a(Collection<?> collection, AbstractC8869g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m18350d(it.next(), g0Var));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<Object> m18352b(Object[] objArr, AbstractC8869g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(m18350d(obj, g0Var));
        }
        return arrayList;
    }

    /* renamed from: c */
    private Map<String, Object> m18351c(Map<?, ?> map, AbstractC8869g0 g0Var) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), m18350d(obj2, g0Var));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: d */
    public Object m18350d(Object obj, AbstractC8869g0 g0Var) {
        Object obj2;
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return C9109i.m16998a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return C9109i.m16997b((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.f19209a.contains(obj)) {
            g0Var.mo17722c(EnumC8942n3.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f19209a.add(obj);
        try {
            if (this.f19209a.size() > this.f19210b) {
                this.f19209a.remove(obj);
                g0Var.mo17722c(EnumC8942n3.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
            } catch (Exception e) {
                g0Var.mo17723b(EnumC8942n3.INFO, "Not serializing object due to throwing sub-path.", e);
            }
            if (obj.getClass().isArray()) {
                obj2 = m18352b((Object[]) obj, g0Var);
            } else if (obj instanceof Collection) {
                obj2 = m18353a((Collection) obj, g0Var);
            } else if (obj instanceof Map) {
                obj2 = m18351c((Map) obj, g0Var);
            } else {
                Map<String, Object> e2 = m18349e(obj, g0Var);
                if (e2.isEmpty()) {
                    obj2 = obj.toString();
                } else {
                    obj3 = e2;
                    this.f19209a.remove(obj);
                    return obj3;
                }
            }
            obj3 = obj2;
            this.f19209a.remove(obj);
            return obj3;
        } catch (Throwable th2) {
            this.f19209a.remove(obj);
            throw th2;
        }
    }

    /* renamed from: e */
    public Map<String, Object> m18349e(Object obj, AbstractC8869g0 g0Var) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, m18350d(field.get(obj), g0Var));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    g0Var.mo17722c(EnumC8942n3.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
