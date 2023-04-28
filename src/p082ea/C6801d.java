package p082ea;

import android.content.Context;

/* renamed from: ea.d */
/* loaded from: classes5.dex */
public class C6801d {

    /* renamed from: b */
    private static C6801d f14521b = new C6801d();

    /* renamed from: a */
    private C6800c f14522a = null;

    /* renamed from: a */
    public static C6800c m24304a(Context context) {
        return f14521b.m24303b(context);
    }

    /* renamed from: b */
    public final synchronized C6800c m24303b(Context context) {
        if (this.f14522a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f14522a = new C6800c(context);
        }
        return this.f14522a;
    }
}
