package io.sentry;

import io.sentry.protocol.C9005r;
import io.sentry.protocol.C9015w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.p3 */
/* loaded from: classes8.dex */
public final class C8964p3 implements AbstractC9053t {

    /* renamed from: k */
    private final String f19675k;

    /* renamed from: l */
    private final String f19676l;

    public C8964p3(String str, String str2) {
        this.f19675k = str;
        this.f19676l = str2;
    }

    /* renamed from: a */
    private <T extends AbstractC8926l2> T m17547a(T t) {
        if (t.m17668B().m17502d() == null) {
            t.m17668B().m17494m(new C9005r());
        }
        C9005r d = t.m17668B().m17502d();
        if (d != null && d.m17307d() == null && d.m17306e() == null) {
            d.m17305f(this.f19676l);
            d.m17303h(this.f19675k);
        }
        return t;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        return (C8908j3) m17547a(j3Var);
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public C9015w mo17163g(C9015w wVar, C9116v vVar) {
        return (C9015w) m17547a(wVar);
    }

    public C8964p3() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
