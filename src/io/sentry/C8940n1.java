package io.sentry;

import io.sentry.protocol.C9001p;

/* renamed from: io.sentry.n1 */
/* loaded from: classes8.dex */
public final class C8940n1 implements ISpan {

    /* renamed from: a */
    private static final C8940n1 f19648a = new C8940n1();

    private C8940n1() {
    }

    /* renamed from: n */
    public static C8940n1 m17594n() {
        return f19648a;
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo16843a() {
        return false;
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo16840d() {
    }

    @Override // io.sentry.ISpan
    /* renamed from: e */
    public void mo16839e(String str) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: g */
    public ISpan mo16837g(String str) {
        return m17594n();
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo16834j(EnumC8866f4 f4Var) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public C8815c4 mo16831m() {
        return new C8815c4(C9001p.f19786l, C8856e4.f19548l, "op", null, null);
    }
}
