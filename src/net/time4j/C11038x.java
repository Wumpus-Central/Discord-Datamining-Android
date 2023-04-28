package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.x */
/* loaded from: classes8.dex */
public final class C11038x extends AbstractC10808b<Long> implements AbstractC10966k0<Long, C10906g0> {

    /* renamed from: q */
    static final AbstractC8079p<Long> f24521q = new C11038x();
    private static final long serialVersionUID = 5930990958663061693L;

    /* renamed from: n */
    private final transient Long f24522n;

    /* renamed from: o */
    private final transient Long f24523o;

    /* renamed from: p */
    private final transient AbstractC8083t<AbstractC8080q<?>, BigDecimal> f24524p;

    private C11038x() {
        this("DAY_OVERFLOW", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static C11038x m11162D(String str, long j, long j2) {
        return new C11038x(str, j, j2);
    }

    private Object readResolve() {
        Object G0 = C10906g0.m11778G0(name());
        if (G0 != null) {
            return G0;
        }
        if (name().equals("DAY_OVERFLOW")) {
            return f24521q;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.AbstractC10966k0
    /* renamed from: B */
    public /* bridge */ /* synthetic */ AbstractC10975o<C10906g0> mo11163B(Long l) {
        return super.m12223A(l);
    }

    /* renamed from: E */
    public Long mo11059f() {
        return this.f24523o;
    }

    /* renamed from: F */
    public Long mo11062T() {
        return this.f24522n;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    public Class<Long> getType() {
        return Long.class;
    }

    private C11038x(String str, long j, long j2) {
        super(str);
        this.f24522n = Long.valueOf(j);
        this.f24523o = Long.valueOf(j2);
        this.f24524p = new C10968l0(this, true);
    }
}
