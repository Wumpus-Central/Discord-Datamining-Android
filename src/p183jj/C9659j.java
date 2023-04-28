package p183jj;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p161ij.C8627a;
import p161ij.EnumC8637g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.j */
/* loaded from: classes8.dex */
public final class C9659j implements AbstractC9657h<Integer> {

    /* renamed from: k */
    private final AbstractC9657h<Void> f21428k;

    /* renamed from: l */
    private final AbstractC8079p<Integer> f21429l;

    /* renamed from: m */
    private final int f21430m;

    /* renamed from: n */
    private final int f21431n;

    /* renamed from: o */
    private final boolean f21432o;

    /* renamed from: p */
    private final char f21433p;

    /* renamed from: q */
    private final EnumC8637g f21434q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9659j(AbstractC8079p<Integer> pVar, int i, int i2, boolean z) {
        this.f21429l = pVar;
        this.f21430m = i;
        this.f21431n = i2;
        this.f21432o = !z && i == i2;
        this.f21428k = z ? new C9667m(C8627a.f19066o) : null;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i);
        } else if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        } else if (i > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i);
        } else if (i2 <= 9) {
            this.f21433p = '0';
            this.f21434q = EnumC8637g.SMART;
        } else {
            throw new IllegalArgumentException("Max digits out of range: " + i2);
        }
    }

    /* renamed from: a */
    private int m15726a(BigDecimal bigDecimal, int i, int i2) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        return bigDecimal.multiply(BigDecimal.valueOf(i2).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    /* renamed from: h */
    private boolean m15725h() {
        return this.f21428k != null;
    }

    /* renamed from: i */
    private static BigDecimal m15724i(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<Integer> mo15599b() {
        return this.f21429l;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        BigDecimal bigDecimal;
        char c;
        int i;
        int i2;
        int i3;
        BigDecimal i4 = m15724i((Number) oVar.mo11371r(this.f21429l));
        BigDecimal i5 = m15724i((Number) oVar.mo11373k(this.f21429l));
        BigDecimal i6 = m15724i((Number) oVar.mo11380b(this.f21429l));
        if (i4.compareTo(i6) > 0) {
            i4 = i6;
        }
        BigDecimal divide = i4.subtract(i5).divide(i6.subtract(i5).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        if (divide.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimal = BigDecimal.ZERO;
        } else {
            bigDecimal = divide.stripTrailingZeros();
        }
        if (z) {
            c = this.f21433p;
        } else {
            c = ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue();
        }
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        int i7 = 0;
        if (bigDecimal.scale() != 0) {
            if (m15725h()) {
                this.f21428k.mo15598c(oVar, appendable, dVar, set, z);
                i7 = 1;
            }
            String plainString = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), this.f21430m), this.f21431n), RoundingMode.FLOOR).toPlainString();
            int i8 = c - '0';
            int length = plainString.length();
            for (int i9 = 2; i9 < length; i9++) {
                appendable.append((char) (plainString.charAt(i9) + i8));
                i7++;
            }
        } else if (this.f21430m > 0) {
            if (m15725h()) {
                this.f21428k.mo15598c(oVar, appendable, dVar, set, z);
                i2 = 1;
            } else {
                i2 = 0;
            }
            while (true) {
                i3 = this.f21430m;
                if (i7 >= i3) {
                    break;
                }
                appendable.append(c);
                i7++;
            }
            i7 = i2 + i3;
        }
        if (!(i == -1 || i7 <= 1 || set == null)) {
            set.add(new C9653g(this.f21429l, i + 1, i + i7));
        }
        return i7;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<Integer> mo15597d(AbstractC8079p<Integer> pVar) {
        if (this.f21429l == pVar) {
            return this;
        }
        return new C9659j(pVar, this.f21430m, this.f21431n, m15725h());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15596e(java.lang.CharSequence r20, p183jj.C9675s r21, p143hj.AbstractC8048d r22, p183jj.AbstractC9676t<?> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9659j.mo15596e(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9659j)) {
            return false;
        }
        C9659j jVar = (C9659j) obj;
        if (this.f21429l.equals(jVar.f21429l) && this.f21430m == jVar.f21430m && this.f21431n == jVar.f21431n && m15725h() == jVar.m15725h()) {
            return true;
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return true;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<Integer> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return new C9659j(this.f21428k, this.f21429l, this.f21430m, this.f21431n, this.f21432o, ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue(), (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART));
    }

    public int hashCode() {
        return (this.f21429l.hashCode() * 7) + ((this.f21430m + (this.f21431n * 10)) * 31);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public AbstractC8080q<?> m15723j(AbstractC8080q<?> qVar, AbstractC8080q<?> qVar2) {
        EnumC9660k kVar = EnumC9660k.FRACTION;
        if (!qVar2.mo11377e(kVar)) {
            return qVar;
        }
        int a = m15726a((BigDecimal) qVar2.mo11371r(kVar), ((Integer) qVar.mo11373k(this.f21429l)).intValue(), ((Integer) qVar.mo11380b(this.f21429l)).intValue());
        qVar2.mo15654D(kVar, null);
        qVar2.mo15655B(this.f21429l, a);
        return qVar.mo15655B(this.f21429l, a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9659j.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21429l.name());
        sb2.append(", min-digits=");
        sb2.append(this.f21430m);
        sb2.append(", max-digits=");
        sb2.append(this.f21431n);
        sb2.append(']');
        return sb2.toString();
    }

    private C9659j(AbstractC9657h<Void> hVar, AbstractC8079p<Integer> pVar, int i, int i2, boolean z, char c, EnumC8637g gVar) {
        this.f21428k = hVar;
        this.f21429l = pVar;
        this.f21430m = i;
        this.f21431n = i2;
        this.f21432o = z;
        this.f21433p = c;
        this.f21434q = gVar;
    }
}
