package p163j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p163j$.time.temporal.AbstractC9224l;
import p163j$.time.temporal.C9229q;
import p163j$.time.temporal.EnumC9213a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h */
/* loaded from: classes2.dex */
public final class C9187h implements AbstractC9186g {

    /* renamed from: a */
    private final AbstractC9224l f20162a;

    /* renamed from: b */
    private final int f20163b;

    /* renamed from: c */
    private final int f20164c;

    /* renamed from: d */
    private final boolean f20165d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9187h(EnumC9213a aVar) {
        if (aVar == null) {
            throw new NullPointerException("field");
        } else if (aVar.mo16627d().m16618f()) {
            this.f20162a = aVar;
            this.f20163b = 0;
            this.f20164c = 9;
            this.f20165d = true;
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        AbstractC9224l lVar = this.f20162a;
        Long e = rVar.m16688e(lVar);
        if (e == null) {
            return false;
        }
        C9199t b = rVar.m16691b();
        long longValue = e.longValue();
        C9229q d = lVar.mo16627d();
        d.m16622b(longValue, lVar);
        BigDecimal valueOf = BigDecimal.valueOf(d.m16619e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(d.m16620d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z = this.f20165d;
        int i = this.f20163b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.f20164c), RoundingMode.FLOOR).toPlainString().substring(2);
            b.getClass();
            if (z) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (i <= 0) {
            return true;
        } else {
            if (z) {
                b.getClass();
                sb2.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                b.getClass();
                sb2.append('0');
            }
            return true;
        }
    }

    public final String toString() {
        String str = this.f20165d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f20162a + "," + this.f20163b + "," + this.f20164c + str + ")";
    }
}
