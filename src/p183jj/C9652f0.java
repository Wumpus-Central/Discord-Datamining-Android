package p183jj;

import java.util.Set;
import net.time4j.base.C10813c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.EnumC8637g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.f0 */
/* loaded from: classes8.dex */
public final class C9652f0 implements AbstractC9657h<Integer> {

    /* renamed from: k */
    private final AbstractC8079p<Integer> f21403k;

    /* renamed from: l */
    private final int f21404l;

    /* renamed from: m */
    private final char f21405m;

    /* renamed from: n */
    private final EnumC8637g f21406n;

    /* renamed from: o */
    private final int f21407o;

    /* renamed from: p */
    private final int f21408p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9652f0(AbstractC8079p<Integer> pVar) {
        if (pVar.name().startsWith("YEAR")) {
            this.f21403k = pVar;
            this.f21404l = 0;
            this.f21405m = '0';
            this.f21406n = EnumC8637g.SMART;
            this.f21407o = 0;
            this.f21408p = 100;
            return;
        }
        throw new IllegalArgumentException("Year element required: " + pVar);
    }

    /* renamed from: a */
    private int m15774a(boolean z, AbstractC8048d dVar) {
        int i;
        if (z) {
            i = this.f21408p;
        } else {
            i = ((Integer) dVar.mo15674c(C8627a.f19068q, Integer.valueOf(this.f21408p))).intValue();
        }
        if (i >= 100) {
            return i;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + i);
    }

    /* renamed from: h */
    private static int m15773h(int i, int i2) {
        int i3;
        if (i >= i2 % 100) {
            i3 = (i2 / 100) - 1;
        } else {
            i3 = i2 / 100;
        }
        return (i3 * 100) + i;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<Integer> mo15599b() {
        return this.f21403k;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        char c;
        int i;
        int s = oVar.mo11370s(this.f21403k);
        if (s >= 0) {
            if (m15774a(z, dVar) != 100) {
                s = C10813c.m12200c(s, 100);
            }
            String num = Integer.toString(s);
            if (z) {
                c = this.f21405m;
            } else {
                c = ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue();
            }
            int i2 = 0;
            if (c != '0') {
                int i3 = c - '0';
                char[] charArray = num.toCharArray();
                for (int i4 = 0; i4 < charArray.length; i4++) {
                    charArray[i4] = (char) (charArray[i4] + i3);
                }
                num = new String(charArray);
            }
            if (appendable instanceof CharSequence) {
                i = ((CharSequence) appendable).length();
            } else {
                i = -1;
            }
            if (s < 10) {
                appendable.append(c);
                i2 = 1;
            }
            appendable.append(num);
            int length = i2 + num.length();
            if (!(i == -1 || length <= 0 || set == null)) {
                set.add(new C9653g(this.f21403k, i, i + length));
            }
            return length;
        } else if (s == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Format context has no year: " + oVar);
        } else {
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + s);
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<Integer> mo15597d(AbstractC8079p<Integer> pVar) {
        if (this.f21403k == pVar) {
            return this;
        }
        return new C9652f0(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15596e(java.lang.CharSequence r11, p183jj.C9675s r12, p143hj.AbstractC8048d r13, p183jj.AbstractC9676t<?> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9652f0.mo15596e(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9652f0) {
            return this.f21403k.equals(((C9652f0) obj).f21403k);
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
        return new C9652f0(this.f21403k, i, ((Character) dVar.mo15674c(C8627a.f19064m, '0')).charValue(), (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART), ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue(), ((Integer) dVar.mo15674c(C8627a.f19068q, Integer.valueOf(cVar.m15860q().mo11618d()))).intValue());
    }

    public int hashCode() {
        return this.f21403k.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9652f0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21403k.name());
        sb2.append(']');
        return sb2.toString();
    }

    private C9652f0(AbstractC8079p<Integer> pVar, int i, char c, EnumC8637g gVar, int i2, int i3) {
        this.f21403k = pVar;
        this.f21404l = i;
        this.f21405m = c;
        this.f21406n = gVar;
        this.f21407o = i2;
        this.f21408p = i3;
    }
}
