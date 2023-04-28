package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C2359e;
import androidx.core.content.res.C2367h;
import androidx.core.provider.C2476g;
import p341t0.C12936a;

/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
public class C2410e {

    /* renamed from: a */
    private static final C2388c0 f3349a;

    /* renamed from: b */
    private static final C12936a<String, Typeface> f3350b;

    /* renamed from: androidx.core.graphics.e$a */
    /* loaded from: classes.dex */
    public static class C2411a extends C2476g.C2479c {

        /* renamed from: a */
        private C2367h.AbstractC2372e f3351a;

        public C2411a(C2367h.AbstractC2372e eVar) {
            this.f3351a = eVar;
        }

        @Override // androidx.core.provider.C2476g.C2479c
        /* renamed from: a */
        public void mo37668a(int i) {
            C2367h.AbstractC2372e eVar = this.f3351a;
            if (eVar != null) {
                eVar.m37965f(i);
            }
        }

        @Override // androidx.core.provider.C2476g.C2479c
        /* renamed from: b */
        public void mo37667b(Typeface typeface) {
            C2367h.AbstractC2372e eVar = this.f3351a;
            if (eVar != null) {
                eVar.m37964g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3349a = new C2385b0();
        } else if (i >= 28) {
            f3349a = new C2419m();
        } else if (i >= 26) {
            f3349a = new C2418l();
        } else if (i < 24 || !C2413g.m37786i()) {
            f3349a = new C2412f();
        } else {
            f3349a = new C2413g();
        }
        f3350b = new C12936a<>(16);
    }

    /* renamed from: a */
    public static Typeface m37800a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m37799b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        return f3349a.mo37779b(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m37798c(Context context, C2359e.AbstractC2361b bVar, Resources resources, int i, String str, int i2, int i3, C2367h.AbstractC2372e eVar, Handler handler, boolean z) {
        Typeface typeface;
        boolean z2;
        int i4;
        if (bVar instanceof C2359e.C0037e) {
            C2359e.C0037e eVar2 = (C2359e.C0037e) bVar;
            Typeface g = m37794g(eVar2.m37998c());
            if (g != null) {
                if (eVar != null) {
                    eVar.m37967d(g, handler);
                }
                return g;
            }
            if (!z ? eVar != null : eVar2.m38000a() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i4 = eVar2.m37997d();
            } else {
                i4 = -1;
            }
            typeface = C2476g.m37678c(context, eVar2.m37999b(), i3, z2, i4, C2367h.AbstractC2372e.m37966e(handler), new C2411a(eVar));
        } else {
            typeface = f3349a.mo37780a(context, (C2359e.C2362c) bVar, resources, i3);
            if (eVar != null) {
                if (typeface != null) {
                    eVar.m37967d(typeface, handler);
                } else {
                    eVar.m37968c(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3350b.m5031d(m37796e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m37797d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = f3349a.mo37778d(context, resources, i, str, i3);
        if (d != null) {
            f3350b.m5031d(m37796e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    /* renamed from: e */
    private static String m37796e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m37795f(Resources resources, int i, String str, int i2, int i3) {
        return f3350b.m5032c(m37796e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m37794g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
