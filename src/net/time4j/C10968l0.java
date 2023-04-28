package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.l0 */
/* loaded from: classes8.dex */
public final class C10968l0 implements AbstractC8083t<AbstractC8080q<?>, BigDecimal> {

    /* renamed from: a */
    private final AbstractC8079p<? extends Number> f24352a;

    /* renamed from: b */
    private final boolean f24353b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10968l0(AbstractC8079p<? extends Number> pVar, boolean z) {
        this.f24352a = pVar;
        this.f24353b = z;
    }

    /* renamed from: a */
    public BigDecimal apply(AbstractC8080q<?> qVar) {
        long longValue = ((Number) qVar.mo11371r(this.f24352a)).longValue();
        long longValue2 = ((Number) qVar.mo11373k(this.f24352a)).longValue();
        long longValue3 = ((Number) qVar.mo11380b(this.f24352a)).longValue();
        if (longValue > longValue3) {
            longValue = longValue3;
        }
        if (longValue == longValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f24353b && (qVar instanceof C10906g0) && !((C10906g0) C10906g0.class.cast(qVar)).m11729z0(this.f24352a)) {
            if (longValue == longValue3) {
                return BigDecimal.ONE;
            }
            longValue3--;
        }
        return new BigDecimal(longValue - longValue2).setScale(15).divide(new BigDecimal((longValue3 - longValue2) + 1), RoundingMode.HALF_UP).stripTrailingZeros();
    }
}
