package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.f */
/* loaded from: classes.dex */
class C2412f extends C2388c0 {

    /* renamed from: b */
    private static Class<?> f3352b = null;

    /* renamed from: c */
    private static Constructor<?> f3353c = null;

    /* renamed from: d */
    private static Method f3354d = null;

    /* renamed from: e */
    private static Method f3355e = null;

    /* renamed from: f */
    private static boolean f3356f = false;

    /* renamed from: g */
    private static boolean m37793g(Object obj, String str, int i, boolean z) {
        m37790j();
        try {
            return ((Boolean) f3354d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    private static Typeface m37792h(Object obj) {
        m37790j();
        try {
            Object newInstance = Array.newInstance(f3352b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3355e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    private File m37791i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: j */
    private static void m37790j() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f3356f) {
            f3356f = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f3353c = constructor;
            f3352b = cls;
            f3354d = method;
            f3355e = method2;
        }
    }

    /* renamed from: k */
    private static Object m37789k() {
        m37790j();
        try {
            return f3353c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: a */
    public Typeface mo37780a(Context context, C2359e.C2362c cVar, Resources resources, int i) {
        C2359e.C2363d[] a;
        Object k = m37789k();
        for (C2359e.C2363d dVar : cVar.m38007a()) {
            File e = C2394d0.m37887e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C2394d0.m37889c(e, resources, dVar.m38005b())) {
                    return null;
                }
                if (!m37793g(k, e.getPath(), dVar.m38002e(), dVar.m38001f())) {
                    return null;
                }
                e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return m37792h(k);
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: b */
    public Typeface mo37779b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        C2476g.C2478b f = mo37911f(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.m37671d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File i2 = m37791i(openFileDescriptor);
            if (i2 != null && i2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(i2);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c = super.m37913c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c;
        } catch (IOException unused) {
            return null;
        }
    }
}
