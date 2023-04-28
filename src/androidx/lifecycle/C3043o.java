package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class C3043o {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4472a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends AbstractC3033f>>> f4473b = new HashMap();

    /* renamed from: a */
    private static AbstractC3033f m35770a(Constructor<? extends AbstractC3033f> constructor, Object obj) {
        try {
            return (AbstractC3033f) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends AbstractC3033f> m35769b(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String c = m35768c(canonicalName);
            if (!str.isEmpty()) {
                c = str + "." + c;
            }
            Constructor declaredConstructor = Class.forName(c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m35768c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m35767d(Class<?> cls) {
        Integer num = f4472a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m35764g(cls);
        f4472a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m35766e(Class<?> cls) {
        return cls != null && AbstractC3040l.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static AbstractC3038j m35765f(Object obj) {
        boolean z = obj instanceof AbstractC3038j;
        boolean z2 = obj instanceof AbstractC3032e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((AbstractC3032e) obj, (AbstractC3038j) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((AbstractC3032e) obj, null);
        }
        if (z) {
            return (AbstractC3038j) obj;
        }
        Class<?> cls = obj.getClass();
        if (m35767d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends AbstractC3033f>> list = f4473b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m35770a(list.get(0), obj));
        }
        AbstractC3033f[] fVarArr = new AbstractC3033f[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fVarArr[i] = m35770a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    /* renamed from: g */
    private static int m35764g(Class<?> cls) {
        ArrayList arrayList;
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC3033f> b = m35769b(cls);
        if (b != null) {
            f4473b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C3028b.f4464c.m35785d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (!m35766e(superclass)) {
                arrayList = null;
            } else if (m35767d(superclass) == 1) {
                return 1;
            } else {
                arrayList = new ArrayList(f4473b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m35766e(cls2)) {
                    if (m35767d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4473b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4473b.put(cls, arrayList);
            return 2;
        }
    }
}
