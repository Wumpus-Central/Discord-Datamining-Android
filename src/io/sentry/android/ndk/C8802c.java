package io.sentry.android.ndk;

import io.sentry.AbstractC8876h0;
import io.sentry.C8843d;
import io.sentry.C8875h;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.protocol.C9020z;
import io.sentry.util.C9111k;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.android.ndk.c */
/* loaded from: classes8.dex */
public final class C8802c implements AbstractC8876h0 {

    /* renamed from: a */
    private final C8951o3 f19455a;

    /* renamed from: b */
    private final AbstractC8801b f19456b;

    public C8802c(C8951o3 o3Var) {
        this(o3Var, new NativeScope());
    }

    @Override // io.sentry.AbstractC8876h0
    /* renamed from: a */
    public void mo17839a(String str, String str2) {
        try {
            this.f19456b.mo18055a(str, str2);
        } catch (Throwable th2) {
            this.f19455a.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC8876h0
    /* renamed from: b */
    public void mo17838b(String str, String str2) {
        try {
            this.f19456b.mo18054b(str, str2);
        } catch (Throwable th2) {
            this.f19455a.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC8876h0
    /* renamed from: c */
    public void mo17837c(C9020z zVar) {
        try {
            if (zVar == null) {
                this.f19456b.mo18052d();
            } else {
                this.f19456b.mo18051e(zVar.m17222j(), zVar.m17223i(), zVar.m17221k(), zVar.m17219m());
            }
        } catch (Throwable th2) {
            this.f19455a.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC8876h0
    /* renamed from: e */
    public void mo17836e(C8843d dVar) {
        String str;
        try {
            String str2 = null;
            if (dVar.m17913h() != null) {
                str = dVar.m17913h().name().toLowerCase(Locale.ROOT);
            } else {
                str = null;
            }
            String f = C8875h.m17842f(dVar.m17911j());
            Map<String, Object> g = dVar.m17914g();
            if (!g.isEmpty()) {
                str2 = this.f19455a.getSerializer().mo17603e(g);
            }
            this.f19456b.mo18053c(str, dVar.m17912i(), dVar.m17915f(), dVar.m17910k(), f, str2);
        } catch (Throwable th2) {
            this.f19455a.getLogger().mo17724a(EnumC8942n3.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    C8802c(C8951o3 o3Var, AbstractC8801b bVar) {
        this.f19455a = (C8951o3) C9111k.m16995a(o3Var, "The SentryOptions object is required.");
        this.f19456b = (AbstractC8801b) C9111k.m16995a(bVar, "The NativeScope object is required.");
    }
}
