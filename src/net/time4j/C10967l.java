package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p143hj.AbstractC8050e;

/* renamed from: net.time4j.l */
/* loaded from: classes8.dex */
final class C10967l extends AbstractC8050e<BigDecimal> implements AbstractC10821c1<BigDecimal> {
    private static final long serialVersionUID = -4837430960549551204L;

    /* renamed from: k */
    private final transient BigDecimal f24351k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10967l(String str, BigDecimal bigDecimal) {
        super(str);
        this.f24351k = bigDecimal;
    }

    private Object readResolve() {
        Object G0 = C10906g0.m11778G0(name());
        if (G0 != null) {
            return G0;
        }
        throw new InvalidObjectException(name());
    }

    /* renamed from: A */
    public BigDecimal mo11059f() {
        return this.f24351k;
    }

    /* renamed from: D */
    public BigDecimal mo11062T() {
        return BigDecimal.ZERO;
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
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
