package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.m */
/* loaded from: classes.dex */
public class C2419m extends C2418l {
    @Override // androidx.core.graphics.C2418l
    /* renamed from: h */
    protected Typeface mo37765h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3361g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3367m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C2418l
    /* renamed from: t */
    protected Method mo37764t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
