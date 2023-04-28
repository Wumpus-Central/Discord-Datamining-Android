package p318r9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5376c;
import p011aa.C1350a;
import p384v9.AbstractC13470f;
import p384v9.AbstractC13473g;
import p384v9.C13475h;

/* renamed from: r9.o */
/* loaded from: classes5.dex */
public final class C12481o {

    /* renamed from: a */
    private static final C1350a f28138a = new C1350a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static AbstractC13473g m6636a(AbstractC13470f fVar, Context context, boolean z) {
        f28138a.m41258a("Revoking access", new Object[0]);
        String e = C12469c.m6649b(context).m6646e();
        m6634c(context);
        if (z) {
            return RunnableC12472f.m6641a(e);
        }
        return fVar.mo2546b(new C12479m(fVar));
    }

    /* renamed from: b */
    public static AbstractC13473g m6635b(AbstractC13470f fVar, Context context, boolean z) {
        f28138a.m41258a("Signing out", new Object[0]);
        m6634c(context);
        if (z) {
            return C13475h.m3610b(Status.f10101p, fVar);
        }
        return fVar.mo2546b(new C12477k(fVar));
    }

    /* renamed from: c */
    private static void m6634c(Context context) {
        C12482p.m6633a(context).m6632b();
        for (AbstractC13470f fVar : AbstractC13470f.m3614c()) {
            fVar.m3612f();
        }
        C5376c.m29082a();
    }
}
