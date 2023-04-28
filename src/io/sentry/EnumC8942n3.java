package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.n3 */
/* loaded from: classes8.dex */
public enum EnumC8942n3 implements AbstractC8806b1 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* renamed from: io.sentry.n3$a */
    /* loaded from: classes8.dex */
    static final class C8943a implements AbstractC9030r0<EnumC8942n3> {
        /* renamed from: b */
        public EnumC8942n3 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            return EnumC8942n3.valueOf(x0Var.m16941f0().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16918f0(name().toLowerCase(Locale.ROOT));
    }
}
