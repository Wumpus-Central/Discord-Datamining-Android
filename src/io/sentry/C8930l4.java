package io.sentry;

import io.sentry.util.C9111k;
import java.security.SecureRandom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.l4 */
/* loaded from: classes8.dex */
public final class C8930l4 {

    /* renamed from: a */
    private final C8951o3 f19637a;

    /* renamed from: b */
    private final SecureRandom f19638b;

    public C8930l4(C8951o3 o3Var) {
        this((C8951o3) C9111k.m16995a(o3Var, "options are required"), new SecureRandom());
    }

    /* renamed from: b */
    private boolean m17610b(Double d) {
        return d.doubleValue() >= this.f19638b.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8937m4 m17611a(C8692a2 a2Var) {
        boolean z;
        C8937m4 f = a2Var.m18348a().m17991f();
        if (f != null) {
            return f;
        }
        this.f19637a.getProfilesSampler();
        Double profilesSampleRate = this.f19637a.getProfilesSampleRate();
        if (profilesSampleRate == null || !m17610b(profilesSampleRate)) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.f19637a.getTracesSampler();
        C8937m4 r = a2Var.m18348a().m17588r();
        if (r != null) {
            return r;
        }
        Double tracesSampleRate = this.f19637a.getTracesSampleRate();
        if (tracesSampleRate != null) {
            return new C8937m4(Boolean.valueOf(m17610b(tracesSampleRate)), tracesSampleRate, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new C8937m4(bool, null, bool, null);
    }

    C8930l4(C8951o3 o3Var, SecureRandom secureRandom) {
        this.f19637a = o3Var;
        this.f19638b = secureRandom;
    }
}
