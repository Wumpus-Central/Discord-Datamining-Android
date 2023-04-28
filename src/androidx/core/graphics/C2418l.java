package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.l */
/* loaded from: classes.dex */
public class C2418l extends C2412f {

    /* renamed from: g */
    protected final Class<?> f3361g;

    /* renamed from: h */
    protected final Constructor<?> f3362h;

    /* renamed from: i */
    protected final Method f3363i;

    /* renamed from: j */
    protected final Method f3364j;

    /* renamed from: k */
    protected final Method f3365k;

    /* renamed from: l */
    protected final Method f3366l;

    /* renamed from: m */
    protected final Method f3367m;

    public C2418l() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = m37768u();
            constructor = m37767v(cls);
            method5 = m37770r(cls);
            method4 = m37769s(cls);
            method3 = m37766w(cls);
            method2 = m37771q(cls);
            method = mo37764t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3361g = cls;
        this.f3362h = constructor;
        this.f3363i = method5;
        this.f3364j = method4;
        this.f3365k = method3;
        this.f3366l = method2;
        this.f3367m = method;
    }

    /* renamed from: k */
    private Object m37777k() {
        try {
            return this.f3362h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private void m37776l(Object obj) {
        try {
            this.f3366l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: m */
    private boolean m37775m(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3363i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: n */
    private boolean m37774n(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3364j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m37773o(Object obj) {
        try {
            return ((Boolean) this.f3365k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m37772p() {
        if (this.f3363i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f3363i != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.C2412f, androidx.core.graphics.C2388c0
    /* renamed from: a */
    public Typeface mo37780a(Context context, C2359e.C2362c cVar, Resources resources, int i) {
        C2359e.C2363d[] a;
        FontVariationAxis[] fromFontVariationSettings;
        if (!m37772p()) {
            return super.mo37780a(context, cVar, resources, i);
        }
        Object k = m37777k();
        if (k == null) {
            return null;
        }
        for (C2359e.C2363d dVar : cVar.m38007a()) {
            String a2 = dVar.m38006a();
            int c = dVar.m38004c();
            int e = dVar.m38002e();
            boolean f = dVar.m38001f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.m38003d());
            if (!m37775m(context, k, a2, c, e, f ? 1 : 0, fromFontVariationSettings)) {
                m37776l(k);
                return null;
            }
        }
        if (!m37773o(k)) {
            return null;
        }
        return mo37765h(k);
    }

    @Override // androidx.core.graphics.C2412f, androidx.core.graphics.C2388c0
    /* renamed from: b */
    public Typeface mo37779b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        Typeface h;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m37772p()) {
            C2476g.C2478b f = mo37911f(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.m37671d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.m37670e());
                italic = weight.setItalic(f.m37669f());
                build = italic.build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C2394d0.m37884h(context, bVarArr, cancellationSignal);
            Object k = m37777k();
            if (k == null) {
                return null;
            }
            boolean z = false;
            for (C2476g.C2478b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.m37671d());
                if (byteBuffer != null) {
                    if (!m37774n(k, byteBuffer, bVar.m37672c(), bVar.m37670e(), bVar.m37669f() ? 1 : 0)) {
                        m37776l(k);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m37776l(k);
                return null;
            } else if (m37773o(k) && (h = mo37765h(k)) != null) {
                return Typeface.create(h, i);
            } else {
                return null;
            }
        }
    }

    @Override // androidx.core.graphics.C2388c0
    /* renamed from: d */
    public Typeface mo37778d(Context context, Resources resources, int i, String str, int i2) {
        if (!m37772p()) {
            return super.mo37778d(context, resources, i, str, i2);
        }
        Object k = m37777k();
        if (k == null) {
            return null;
        }
        if (!m37775m(context, k, str, 0, -1, -1, null)) {
            m37776l(k);
            return null;
        } else if (!m37773o(k)) {
            return null;
        } else {
            return mo37765h(k);
        }
    }

    /* renamed from: h */
    protected Typeface mo37765h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3361g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3367m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: q */
    protected Method m37771q(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: r */
    protected Method m37770r(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: s */
    protected Method m37769s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: t */
    protected Method mo37764t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: u */
    protected Class<?> m37768u() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: v */
    protected Constructor<?> m37767v(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: w */
    protected Method m37766w(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
