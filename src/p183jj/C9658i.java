package p183jj;

import java.util.LinkedHashSet;
import java.util.Set;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p201kj.AbstractC9886a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.i */
/* loaded from: classes8.dex */
public final class C9658i {

    /* renamed from: a */
    private final AbstractC9657h<?> f21418a;

    /* renamed from: b */
    private final int f21419b;

    /* renamed from: c */
    private final int f21420c;

    /* renamed from: d */
    private final C9634b f21421d;

    /* renamed from: e */
    private final AbstractC8048d f21422e;

    /* renamed from: f */
    private final int f21423f;

    /* renamed from: g */
    private final int f21424g;

    /* renamed from: h */
    private final int f21425h;

    /* renamed from: i */
    private final boolean f21426i;

    /* renamed from: j */
    private final int f21427j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9658i(AbstractC9657h<?> hVar, int i, int i2, C9634b bVar) {
        this(hVar, i, i2, bVar, null, 0, 0, 0, false, -1);
    }

    /* renamed from: a */
    private void m15750a(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        int f = sVar.m15664f();
        try {
            this.f21418a.mo15596e(charSequence, sVar, dVar, tVar, z);
        } catch (RuntimeException e) {
            sVar.m15659k(f, e.getMessage());
        }
    }

    /* renamed from: c */
    private char m15748c(AbstractC8048d dVar) {
        return ((Character) dVar.mo15674c(C8627a.f19067p, ' ')).charValue();
    }

    /* renamed from: e */
    private AbstractC8048d m15746e(AbstractC8048d dVar) {
        C9634b bVar = this.f21421d;
        if (bVar == null) {
            return dVar;
        }
        return new C9671p(bVar, dVar);
    }

    /* renamed from: h */
    private static boolean m15743h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: k */
    private boolean m15740k(AbstractC8077o oVar) {
        AbstractC8075n<AbstractC8077o> f;
        C9634b bVar = this.f21421d;
        if (bVar == null || (f = bVar.m15913f()) == null || f.test(oVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m15739l(AbstractC8048d dVar) {
        return ((EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART)).m18441c();
    }

    /* renamed from: o */
    private String m15736o() {
        return "Pad width exceeded: " + this.f21418a.mo15599b().name();
    }

    /* renamed from: p */
    private String m15735p() {
        return "Pad width mismatched: " + this.f21418a.mo15599b().name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private static <V> AbstractC9657h<V> m15728w(AbstractC9657h<V> hVar, AbstractC8079p<?> pVar) {
        if (hVar.mo15599b() == null) {
            return hVar;
        }
        if (hVar.mo15599b().getType() == pVar.getType() || (pVar instanceof AbstractC9886a)) {
            return hVar.mo15597d(pVar);
        }
        throw new IllegalArgumentException("Cannot change element value type: " + pVar.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15749b() {
        return this.f21419b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC9657h<?> m15747d() {
        return this.f21418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9658i)) {
            return false;
        }
        C9658i iVar = (C9658i) obj;
        if (this.f21418a.equals(iVar.f21418a) && this.f21419b == iVar.f21419b && this.f21420c == iVar.f21420c && m15743h(this.f21421d, iVar.f21421d) && m15743h(this.f21422e, iVar.f21422e) && this.f21423f == iVar.f21423f && this.f21424g == iVar.f21424g && this.f21425h == iVar.f21425h && this.f21426i == iVar.f21426i && this.f21427j == iVar.f21427j) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m15745f() {
        return this.f21420c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m15744g() {
        return this.f21418a instanceof C9659j;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f21418a.hashCode() * 7;
        C9634b bVar = this.f21421d;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        return hashCode + (i * 31);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m15742i() {
        return this.f21426i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m15741j() {
        return this.f21418a.mo15595f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C9658i m15738m(int i) {
        if (this.f21426i) {
            return new C9658i(this.f21418a, this.f21419b, this.f21420c, this.f21421d, this.f21422e, this.f21423f, this.f21424g, this.f21425h, true, i);
        }
        throw new IllegalStateException("This step is not starting an or-block.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C9658i m15737n(int i, int i2) {
        return new C9658i(this.f21418a, this.f21419b, this.f21420c, this.f21421d, null, this.f21423f, this.f21424g + i, this.f21425h + i2, this.f21426i, this.f21427j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        r11 = r10.f21425h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r11 <= 0) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
        if ((r15 + r0) == r11) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
        r12.m15659k(r14 - r0, m15735p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
        return;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15734q(java.lang.CharSequence r11, p183jj.C9675s r12, p143hj.AbstractC8048d r13, p183jj.AbstractC9676t<?> r14, boolean r15) {
        /*
            r10 = this;
            if (r15 == 0) goto L_0x0005
            hj.d r13 = r10.f21422e
            goto L_0x0009
        L_0x0005:
            hj.d r13 = r10.m15746e(r13)
        L_0x0009:
            r3 = r13
            int r13 = r10.f21424g
            if (r13 != 0) goto L_0x001b
            int r13 = r10.f21425h
            if (r13 != 0) goto L_0x001b
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.m15750a(r1, r2, r3, r4, r5)
            return
        L_0x001b:
            boolean r13 = r10.m15739l(r3)
            char r6 = r10.m15748c(r3)
            int r7 = r12.m15664f()
            int r8 = r11.length()
            r0 = r7
        L_0x002c:
            if (r0 >= r8) goto L_0x0037
            char r1 = r11.charAt(r0)
            if (r1 != r6) goto L_0x0037
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0037:
            int r9 = r0 - r7
            if (r13 == 0) goto L_0x0047
            int r1 = r10.f21424g
            if (r9 <= r1) goto L_0x0047
            java.lang.String r11 = r10.m15736o()
            r12.m15659k(r7, r11)
            return
        L_0x0047:
            r12.m15658l(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.m15750a(r1, r2, r3, r4, r5)
            boolean r14 = r12.m15661i()
            if (r14 == 0) goto L_0x0059
            return
        L_0x0059:
            int r14 = r12.m15664f()
            int r15 = r14 - r7
            int r15 = r15 - r9
            if (r13 == 0) goto L_0x0071
            int r0 = r10.f21424g
            if (r0 <= 0) goto L_0x0071
            int r9 = r9 + r15
            if (r9 == r0) goto L_0x0071
            java.lang.String r11 = r10.m15735p()
            r12.m15659k(r7, r11)
            return
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r14 >= r8) goto L_0x0087
            if (r13 == 0) goto L_0x007c
            int r1 = r15 + r0
            int r2 = r10.f21425h
            if (r1 >= r2) goto L_0x0087
        L_0x007c:
            char r1 = r11.charAt(r14)
            if (r1 != r6) goto L_0x0087
            int r14 = r14 + 1
            int r0 = r0 + 1
            goto L_0x0072
        L_0x0087:
            if (r13 == 0) goto L_0x0099
            int r11 = r10.f21425h
            if (r11 <= 0) goto L_0x0099
            int r15 = r15 + r0
            if (r15 == r11) goto L_0x0099
            int r14 = r14 - r0
            java.lang.String r11 = r10.m15735p()
            r12.m15659k(r14, r11)
            return
        L_0x0099:
            r12.m15658l(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9658i.m15734q(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m15733r(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        AbstractC8048d dVar2;
        int i;
        StringBuilder sb2;
        int i2;
        LinkedHashSet linkedHashSet;
        int i3;
        if (!m15740k(oVar)) {
            return 0;
        }
        if (z) {
            dVar2 = this.f21422e;
        } else {
            dVar2 = m15746e(dVar);
        }
        if (this.f21424g == 0 && this.f21425h == 0) {
            return this.f21418a.mo15598c(oVar, appendable, dVar2, set, z);
        }
        if (appendable instanceof StringBuilder) {
            sb2 = (StringBuilder) appendable;
            i = sb2.length();
        } else {
            sb2 = new StringBuilder();
            i = -1;
        }
        if (!(appendable instanceof CharSequence) || set == null) {
            linkedHashSet = null;
            i2 = -1;
        } else {
            if (sb2 == appendable) {
                AbstractC9657h<?> hVar = this.f21418a;
                if ((hVar instanceof C9650f) || (hVar instanceof C9686z)) {
                    i3 = 0;
                    linkedHashSet = new LinkedHashSet();
                    i2 = i3;
                }
            }
            i3 = ((CharSequence) appendable).length();
            linkedHashSet = new LinkedHashSet();
            i2 = i3;
        }
        boolean l = m15739l(dVar2);
        char c = m15748c(dVar2);
        int length = sb2.length();
        this.f21418a.mo15598c(oVar, sb2, dVar2, linkedHashSet, z);
        int length2 = sb2.length() - length;
        int i4 = this.f21424g;
        if (i4 > 0) {
            if (!l || length2 <= i4) {
                int i5 = length2;
                int i6 = 0;
                while (i5 < this.f21424g) {
                    if (i == -1) {
                        appendable.append(c);
                    } else {
                        sb2.insert(i, c);
                    }
                    i5++;
                    i6++;
                }
                if (i == -1) {
                    appendable.append(sb2);
                }
                if (i2 != -1) {
                    int i7 = i2 + i6;
                    for (C9653g gVar : linkedHashSet) {
                        set.add(new C9653g(gVar.m15772a(), gVar.m15770c() + i7, gVar.m15771b() + i7));
                    }
                }
                int i8 = this.f21425h;
                if (i8 <= 0) {
                    return i5;
                }
                if (!l || length2 <= i8) {
                    while (length2 < this.f21425h) {
                        appendable.append(c);
                        length2++;
                        i5++;
                    }
                    return i5;
                }
                throw new IllegalArgumentException(m15736o());
            }
            throw new IllegalArgumentException(m15736o());
        } else if (!l || length2 <= this.f21425h) {
            if (i == -1) {
                appendable.append(sb2);
            }
            while (length2 < this.f21425h) {
                appendable.append(c);
                length2++;
            }
            if (i2 != -1) {
                for (C9653g gVar2 : linkedHashSet) {
                    set.add(new C9653g(gVar2.m15772a(), gVar2.m15770c() + i2, gVar2.m15771b() + i2));
                }
            }
            return length2;
        } else {
            throw new IllegalArgumentException(m15736o());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C9658i m15732s(C9637c<?> cVar) {
        C9634b p = cVar.m15861p();
        if (this.f21421d != null) {
            p = p.m15907l(new C8627a.C8628b().m18475f(p.m15914e()).m18475f(this.f21421d.m15914e()).m18480a());
        }
        return new C9658i(this.f21418a.mo15594g(cVar, p, this.f21423f), this.f21419b, this.f21420c, this.f21421d, p, this.f21423f, this.f21424g, this.f21425h, this.f21426i, this.f21427j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C9658i m15731t(int i) {
        return new C9658i(this.f21418a, this.f21419b, this.f21420c, this.f21421d, null, this.f21423f + i, this.f21424g, this.f21425h, this.f21426i, this.f21427j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[processor=");
        sb2.append(this.f21418a);
        sb2.append(", level=");
        sb2.append(this.f21419b);
        sb2.append(", section=");
        sb2.append(this.f21420c);
        if (this.f21421d != null) {
            sb2.append(", attributes=");
            sb2.append(this.f21421d);
        }
        sb2.append(", reserved=");
        sb2.append(this.f21423f);
        sb2.append(", pad-left=");
        sb2.append(this.f21424g);
        sb2.append(", pad-right=");
        sb2.append(this.f21425h);
        if (this.f21426i) {
            sb2.append(", or-block-started");
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public int m15730u() {
        return this.f21427j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C9658i m15729v() {
        if (!this.f21426i) {
            return new C9658i(this.f21418a, this.f21419b, this.f21420c, this.f21421d, null, this.f21423f, this.f21424g, this.f21425h, true, -1);
        }
        throw new IllegalStateException("Cannot start or-block twice.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public C9658i m15727x(AbstractC8079p<?> pVar) {
        AbstractC9657h<?> w = m15728w(this.f21418a, pVar);
        if (this.f21418a == w) {
            return this;
        }
        return new C9658i(w, this.f21419b, this.f21420c, this.f21421d, this.f21422e, this.f21423f, this.f21424g, this.f21425h, this.f21426i, this.f21427j);
    }

    private C9658i(AbstractC9657h<?> hVar, int i, int i2, C9634b bVar, AbstractC8048d dVar, int i3, int i4, int i5, boolean z, int i6) {
        if (hVar == null) {
            throw new NullPointerException("Missing format processor.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Invalid level: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i2);
        } else if (i3 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i3);
        } else if (i4 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i4);
        } else if (i5 >= 0) {
            this.f21418a = hVar;
            this.f21419b = i;
            this.f21420c = i2;
            this.f21421d = bVar;
            this.f21422e = dVar;
            this.f21423f = i3;
            this.f21424g = i4;
            this.f21425h = i5;
            this.f21426i = z;
            this.f21427j = i6;
        } else {
            throw new IllegalArgumentException("Invalid pad-width: " + i5);
        }
    }
}
