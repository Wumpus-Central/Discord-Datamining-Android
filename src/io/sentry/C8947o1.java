package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.protocol.EnumC9019y;
import java.util.Date;

/* renamed from: io.sentry.o1 */
/* loaded from: classes8.dex */
public final class C8947o1 implements AbstractC8932m0 {

    /* renamed from: a */
    private static final C8947o1 f19658a = new C8947o1();

    private C8947o1() {
    }

    /* renamed from: n */
    public static C8947o1 m17586n() {
        return f19658a;
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo16843a() {
        return true;
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC8866f4 mo16842b() {
        return null;
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public ISpan mo16841c(String str, String str2, Date date, EnumC8961p0 p0Var) {
        return C8940n1.m17594n();
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo16840d() {
    }

    @Override // io.sentry.ISpan
    /* renamed from: e */
    public void mo16839e(String str) {
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: f */
    public C9001p mo16838f() {
        return C9001p.f19786l;
    }

    @Override // io.sentry.ISpan
    /* renamed from: g */
    public ISpan mo16837g(String str) {
        return C8940n1.m17594n();
    }

    @Override // io.sentry.AbstractC8932m0
    public String getName() {
        return "";
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: h */
    public EnumC9019y mo16836h() {
        return EnumC9019y.CUSTOM;
    }

    @Override // io.sentry.ISpan
    /* renamed from: i */
    public C8918k4 mo16835i() {
        return new C8918k4(C9001p.f19786l, "");
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo16834j(EnumC8866f4 f4Var) {
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: k */
    public C8809b4 mo16833k() {
        return null;
    }

    @Override // io.sentry.AbstractC8932m0
    /* renamed from: l */
    public void mo16832l() {
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public C8815c4 mo16831m() {
        return new C8815c4(C9001p.f19786l, C8856e4.f19548l, "op", null, null);
    }
}
