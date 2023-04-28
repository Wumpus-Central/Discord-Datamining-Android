package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
class C2413g extends C2388c0 {

    /* renamed from: b */
    private static final Class<?> f3357b;

    /* renamed from: c */
    private static final Constructor<?> f3358c;

    /* renamed from: d */
    private static final Method f3359d;

    /* renamed from: e */
    private static final Method f3360e;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f3358c = constructor;
        f3357b = cls;
        f3359d = method;
        f3360e = method2;
    }

    /* renamed from: g */
    private static boolean m37788g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3359d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static Typeface m37787h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3357b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3360e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m37786i() {
        Method method = f3359d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static Object m37785j() {
        try {
            return f3358c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: a */
    public Typeface mo37780a(Context context, C2359e.C2362c cVar, Resources resources, int i) {
        C2359e.C2363d[] a;
        Object j = m37785j();
        if (j == null) {
            return null;
        }
        for (C2359e.C2363d dVar : cVar.m38007a()) {
            ByteBuffer b = C2394d0.m37890b(context, resources, dVar.m38005b());
            if (b == null || !m37788g(j, b, dVar.m38004c(), dVar.m38002e(), dVar.m38001f())) {
                return null;
            }
        }
        return m37787h(j);
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: b */
    public Typeface mo37779b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        Object j = m37785j();
        if (j == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (C2476g.C2478b bVar : bVarArr) {
            Uri d = bVar.m37671d();
            ByteBuffer byteBuffer = (ByteBuffer) simpleArrayMap.get(d);
            if (byteBuffer == null) {
                byteBuffer = C2394d0.m37886f(context, cancellationSignal, d);
                simpleArrayMap.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m37788g(j, byteBuffer, bVar.m37672c(), bVar.m37670e(), bVar.m37669f())) {
                return null;
            }
        }
        Typeface h = m37787h(j);
        if (h == null) {
            return null;
        }
        return Typeface.create(h, i);
    }
}
