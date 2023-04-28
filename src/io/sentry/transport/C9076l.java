package io.sentry.transport;

import java.net.Authenticator;

/* renamed from: io.sentry.transport.l */
/* loaded from: classes8.dex */
final class C9076l {

    /* renamed from: a */
    private static final C9076l f19926a = new C9076l();

    private C9076l() {
    }

    /* renamed from: a */
    public static C9076l m17128a() {
        return f19926a;
    }

    /* renamed from: b */
    public void m17127b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
