package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.C2367h;
import androidx.core.util.C2513d;
import androidx.core.util.C2517g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
/* loaded from: classes.dex */
public final class C2367h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3299a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C2371d, SparseArray<C2370c>> f3300b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3301c = new Object();

    /* renamed from: androidx.core.content.res.h$a */
    /* loaded from: classes.dex */
    static class C2368a {
        /* renamed from: a */
        static Drawable m37974a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m37973b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.h$b */
    /* loaded from: classes.dex */
    public static class C2369b {
        /* renamed from: a */
        static int m37972a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m37971b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.res.h$c */
    /* loaded from: classes.dex */
    public static class C2370c {

        /* renamed from: a */
        final ColorStateList f3302a;

        /* renamed from: b */
        final Configuration f3303b;

        /* renamed from: c */
        final int f3304c;

        C2370c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.f3302a = colorStateList;
            this.f3303b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f3304c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.content.res.h$d */
    /* loaded from: classes.dex */
    public static final class C2371d {

        /* renamed from: a */
        final Resources f3305a;

        /* renamed from: b */
        final Resources.Theme f3306b;

        C2371d(Resources resources, Resources.Theme theme) {
            this.f3305a = resources;
            this.f3306b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2371d.class != obj.getClass()) {
                return false;
            }
            C2371d dVar = (C2371d) obj;
            if (!this.f3305a.equals(dVar.f3305a) || !C2513d.m37601a(this.f3306b, dVar.f3306b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C2513d.m37600b(this.f3305a, this.f3306b);
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2372e {
        /* renamed from: e */
        public static Handler m37966e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m37968c(final int i, Handler handler) {
            m37966e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    C2367h.AbstractC2372e.this.m37965f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m37967d(final Typeface typeface, Handler handler) {
            m37966e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2367h.AbstractC2372e.this.m37964g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void m37965f(int i);

        /* renamed from: i */
        public abstract void m37964g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$f */
    /* loaded from: classes.dex */
    public static final class C2373f {

        /* renamed from: androidx.core.content.res.h$f$a */
        /* loaded from: classes.dex */
        static class C2374a {

            /* renamed from: a */
            private static final Object f3307a = new Object();

            /* renamed from: b */
            private static Method f3308b;

            /* renamed from: c */
            private static boolean f3309c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m37962a(Resources.Theme theme) {
                synchronized (f3307a) {
                    if (!f3309c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3308b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3309c = true;
                    }
                    Method method = f3308b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3308b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.h$f$b */
        /* loaded from: classes.dex */
        static class C2375b {
            /* renamed from: a */
            static void m37961a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m37963a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C2375b.m37961a(theme);
            } else {
                C2374a.m37962a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m37989a(C2371d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3301c) {
            WeakHashMap<C2371d, SparseArray<C2370c>> weakHashMap = f3300b;
            SparseArray<C2370c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i, new C2370c(colorStateList, dVar.f3305a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    private static ColorStateList m37988b(C2371d dVar, int i) {
        C2370c cVar;
        Resources.Theme theme;
        synchronized (f3301c) {
            SparseArray<C2370c> sparseArray = f3300b.get(dVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i)) == null)) {
                if (cVar.f3303b.equals(dVar.f3305a.getConfiguration()) && (((theme = dVar.f3306b) == null && cVar.f3304c == 0) || (theme != null && cVar.f3304c == theme.hashCode()))) {
                    return cVar.f3302a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m37987c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m37976n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static int m37986d(Resources resources, int i, Resources.Theme theme) {
        return C2369b.m37972a(resources, i, theme);
    }

    /* renamed from: e */
    public static ColorStateList m37985e(Resources resources, int i, Resources.Theme theme) {
        C2371d dVar = new C2371d(resources, theme);
        ColorStateList b = m37988b(dVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList l = m37978l(resources, i, theme);
        if (l == null) {
            return C2369b.m37971b(resources, i, theme);
        }
        m37989a(dVar, i, l, theme);
        return l;
    }

    /* renamed from: f */
    public static Drawable m37984f(Resources resources, int i, Resources.Theme theme) {
        return C2368a.m37974a(resources, i, theme);
    }

    /* renamed from: g */
    public static Drawable m37983g(Resources resources, int i, int i2, Resources.Theme theme) {
        return C2368a.m37973b(resources, i, i2, theme);
    }

    /* renamed from: h */
    public static Typeface m37982h(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m37976n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: i */
    public static Typeface m37981i(Context context, int i, TypedValue typedValue, int i2, AbstractC2372e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m37976n(context, i, typedValue, i2, eVar, null, true, false);
    }

    /* renamed from: j */
    public static void m37980j(Context context, int i, AbstractC2372e eVar, Handler handler) {
        C2517g.m37588g(eVar);
        if (context.isRestricted()) {
            eVar.m37968c(-4, handler);
        } else {
            m37976n(context, i, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    /* renamed from: k */
    private static TypedValue m37979k() {
        ThreadLocal<TypedValue> threadLocal = f3299a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: l */
    private static ColorStateList m37978l(Resources resources, int i, Resources.Theme theme) {
        if (m37977m(resources, i)) {
            return null;
        }
        try {
            return C2357c.m38036a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: m */
    private static boolean m37977m(Resources resources, int i) {
        TypedValue k = m37979k();
        resources.getValue(i, k, true);
        int i2 = k.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static Typeface m37976n(Context context, int i, TypedValue typedValue, int i2, AbstractC2372e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface o = m37975o(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (o != null || eVar != null || z2) {
            return o;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m37975o(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C2367h.AbstractC2372e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00bb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.m37968c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C2410e.m37795f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.m37967d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C2359e.m38015b(r2, r0)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            if (r11 == 0) goto L_0x0058
            r11.m37968c(r15, r12)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C2410e.m37798c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C2410e.m37797d(r1, r2, r3, r4, r5, r6)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.m37967d(r0, r12)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
            goto L_0x0089
        L_0x0086:
            r11.m37968c(r15, r12)     // Catch: IOException -> 0x008a, XmlPullParserException -> 0x00a0
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00b5
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            r11.m37968c(r15, r12)
        L_0x00ba:
            return r16
        L_0x00bb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C2367h.m37975o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
