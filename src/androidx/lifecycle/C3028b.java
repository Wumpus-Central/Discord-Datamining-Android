package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
final class C3028b {

    /* renamed from: c */
    static C3028b f4464c = new C3028b();

    /* renamed from: a */
    private final Map<Class<?>, C3029a> f4465a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4466b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes.dex */
    public static class C3029a {

        /* renamed from: a */
        final Map<Lifecycle.EnumC3010b, List<C0059b>> f4467a = new HashMap();

        /* renamed from: b */
        final Map<C0059b, Lifecycle.EnumC3010b> f4468b;

        C3029a(Map<C0059b, Lifecycle.EnumC3010b> map) {
            this.f4468b = map;
            for (Map.Entry<C0059b, Lifecycle.EnumC3010b> entry : map.entrySet()) {
                Lifecycle.EnumC3010b value = entry.getValue();
                List<C0059b> list = this.f4467a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4467a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m35782b(List<C0059b> list, LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m35781a(lifecycleOwner, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m35783a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar, Object obj) {
            m35782b(this.f4467a.get(bVar), lifecycleOwner, bVar, obj);
            m35782b(this.f4467a.get(Lifecycle.EnumC3010b.ON_ANY), lifecycleOwner, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes.dex */
    public static final class C0059b {

        /* renamed from: a */
        final int f4469a;

        /* renamed from: b */
        final Method f4470b;

        C0059b(int i, Method method) {
            this.f4469a = i;
            this.f4470b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m35781a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar, Object obj) {
            try {
                int i = this.f4469a;
                if (i == 0) {
                    this.f4470b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4470b.invoke(obj, lifecycleOwner);
                } else if (i == 2) {
                    this.f4470b.invoke(obj, lifecycleOwner, bVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0059b)) {
                return false;
            }
            C0059b bVar = (C0059b) obj;
            if (this.f4469a != bVar.f4469a || !this.f4470b.getName().equals(bVar.f4470b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f4469a * 31) + this.f4470b.getName().hashCode();
        }
    }

    C3028b() {
    }

    /* renamed from: a */
    private C3029a m35788a(Class<?> cls, Method[] methodArr) {
        int i;
        C3029a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = m35786c(superclass)) == null)) {
            hashMap.putAll(c.f4468b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0059b, Lifecycle.EnumC3010b> entry : m35786c(cls2).f4468b.entrySet()) {
                m35784e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m35787b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            AbstractC3047r rVar = (AbstractC3047r) method.getAnnotation(AbstractC3047r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.EnumC3010b value = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.EnumC3010b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.EnumC3010b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m35784e(hashMap, new C0059b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C3029a aVar = new C3029a(hashMap);
        this.f4465a.put(cls, aVar);
        this.f4466b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m35787b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m35784e(Map<C0059b, Lifecycle.EnumC3010b> map, C0059b bVar, Lifecycle.EnumC3010b bVar2, Class<?> cls) {
        Lifecycle.EnumC3010b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f4470b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C3029a m35786c(Class<?> cls) {
        C3029a aVar = this.f4465a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m35788a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m35785d(Class<?> cls) {
        Boolean bool = this.f4466b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m35787b(cls);
        for (Method method : b) {
            if (((AbstractC3047r) method.getAnnotation(AbstractC3047r.class)) != null) {
                m35788a(cls, b);
                return true;
            }
        }
        this.f4466b.put(cls, Boolean.FALSE);
        return false;
    }
}
