package io.sentry;

import io.sentry.protocol.EnumC9019y;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.n4 */
/* loaded from: classes8.dex */
public final class C8944n4 extends C8815c4 {

    /* renamed from: t */
    private final String f19652t;

    /* renamed from: u */
    private final EnumC9019y f19653u;

    /* renamed from: v */
    private C8937m4 f19654v;

    /* renamed from: w */
    private C8810c f19655w;

    /* renamed from: x */
    private EnumC8961p0 f19656x;

    public C8944n4(String str, String str2) {
        this(str, str2, (C8937m4) null);
    }

    /* renamed from: o */
    public C8810c m17591o() {
        return this.f19655w;
    }

    /* renamed from: p */
    public EnumC8961p0 m17590p() {
        return this.f19656x;
    }

    /* renamed from: q */
    public String m17589q() {
        return this.f19652t;
    }

    /* renamed from: r */
    public C8937m4 m17588r() {
        return this.f19654v;
    }

    /* renamed from: s */
    public EnumC9019y m17587s() {
        return this.f19653u;
    }

    public C8944n4(String str, EnumC9019y yVar, String str2) {
        this(str, yVar, str2, null);
    }

    public C8944n4(String str, String str2, C8937m4 m4Var) {
        this(str, EnumC9019y.CUSTOM, str2, m4Var);
    }

    public C8944n4(String str, EnumC9019y yVar, String str2, C8937m4 m4Var) {
        super(str2);
        this.f19656x = EnumC8961p0.SENTRY;
        this.f19652t = (String) C9111k.m16995a(str, "name is required");
        this.f19653u = yVar;
        m17985l(m4Var);
    }
}
