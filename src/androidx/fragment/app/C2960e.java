package androidx.fragment.app;

import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class C2960e {

    /* renamed from: a */
    private static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f4206a = new SimpleArrayMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m36009b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m36008c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m36008c(ClassLoader classLoader, String str) {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = f4206a;
        SimpleArrayMap<String, Class<?>> simpleArrayMap2 = simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        Class<?> cls = simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m36007d(ClassLoader classLoader, String str) {
        try {
            return m36008c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C2915i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C2915i("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo36010a(ClassLoader classLoader, String str) {
        throw null;
    }
}
