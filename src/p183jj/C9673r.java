package p183jj;

import com.facebook.react.uimanager.ViewDefaults;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8079p;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p161ij.EnumC8641j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.r */
/* loaded from: classes8.dex */
public class C9673r<V> implements AbstractC9657h<V> {

    /* renamed from: y */
    private static final int[] f21490y = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, ViewDefaults.NUMBER_OF_LINES};

    /* renamed from: k */
    private final AbstractC8079p<V> f21491k;

    /* renamed from: l */
    private final boolean f21492l;

    /* renamed from: m */
    private final int f21493m;

    /* renamed from: n */
    private final int f21494n;

    /* renamed from: o */
    private final EnumC9684x f21495o;

    /* renamed from: p */
    private final boolean f21496p;

    /* renamed from: q */
    private final boolean f21497q;

    /* renamed from: r */
    private final EnumC8637g f21498r;

    /* renamed from: s */
    private final int f21499s;

    /* renamed from: t */
    private final char f21500t;

    /* renamed from: u */
    private final EnumC8641j f21501u;

    /* renamed from: v */
    private final int f21502v;

    /* renamed from: w */
    private final int f21503w;

    /* renamed from: x */
    private final boolean f21504x;

    /* renamed from: jj.r$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class C9674a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21505a;

        static {
            int[] iArr = new int[EnumC9684x.values().length];
            f21505a = iArr;
            try {
                iArr[EnumC9684x.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21505a[EnumC9684x.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9673r(AbstractC8079p<V> pVar, boolean z, int i, int i2, EnumC9684x xVar, boolean z2) {
        this(pVar, z, i, i2, xVar, z2, 0, '0', EnumC8641j.f19112k, EnumC8637g.SMART, 0, false);
    }

    /* renamed from: a */
    private static void m15672a(int i, Appendable appendable, char c) {
        int i2 = (i * 103) >>> 10;
        appendable.append((char) (i2 + c));
        appendable.append((char) ((i - ((i2 << 3) + (i2 << 1))) + c));
    }

    /* renamed from: h */
    private int m15671h(EnumC8641j jVar) {
        if (!jVar.mo18426l()) {
            return 100;
        }
        Class<V> type = this.f21491k.getType();
        if (type == Integer.class) {
            return 10;
        }
        if (type == Long.class) {
            return 18;
        }
        return 9;
    }

    /* renamed from: i */
    private static int m15670i(int i) {
        int i2 = 0;
        while (i > f21490y[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<V> mo15599b() {
        return this.f21491k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d0  */
    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo15598c(p143hj.AbstractC8077o r23, java.lang.Appendable r24, p143hj.AbstractC8048d r25, java.util.Set<p183jj.C9653g> r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9673r.mo15598c(hj.o, java.lang.Appendable, hj.d, java.util.Set, boolean):int");
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<V> mo15597d(AbstractC8079p<V> pVar) {
        if (this.f21496p || this.f21491k == pVar) {
            return this;
        }
        return new C9673r(pVar, this.f21492l, this.f21493m, this.f21494n, this.f21495o, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0370  */
    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15596e(java.lang.CharSequence r26, p183jj.C9675s r27, p143hj.AbstractC8048d r28, p183jj.AbstractC9676t<?> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.C9673r.mo15596e(java.lang.CharSequence, jj.s, hj.d, jj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9673r)) {
            return false;
        }
        C9673r rVar = (C9673r) obj;
        if (this.f21491k.equals(rVar.f21491k) && this.f21492l == rVar.f21492l && this.f21493m == rVar.f21493m && this.f21494n == rVar.f21494n && this.f21495o == rVar.f21495o && this.f21496p == rVar.f21496p) {
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
    public AbstractC9657h<V> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        char c;
        boolean z;
        char charAt;
        AbstractC8046c<EnumC8641j> cVar2 = C8627a.f19063l;
        EnumC8641j jVar = EnumC8641j.f19112k;
        EnumC8641j jVar2 = (EnumC8641j) dVar.mo15674c(cVar2, jVar);
        AbstractC8046c<Character> cVar3 = C8627a.f19064m;
        if (dVar.mo15676a(cVar3)) {
            charAt = ((Character) dVar.mo15675b(cVar3)).charValue();
        } else if (jVar2.mo18426l()) {
            charAt = jVar2.mo18427j().charAt(0);
        } else {
            c = '0';
            int intValue = ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue();
            if (jVar2 == jVar || c != '0' || !this.f21492l || intValue != 0 || this.f21491k.getType() != Integer.class || this.f21497q) {
                z = false;
            } else {
                z = true;
            }
            return new C9673r(this.f21491k, this.f21492l, this.f21493m, this.f21494n, this.f21495o, this.f21496p, i, c, jVar2, (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART), intValue, z);
        }
        c = charAt;
        int intValue2 = ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue();
        if (jVar2 == jVar) {
        }
        z = false;
        return new C9673r(this.f21491k, this.f21492l, this.f21493m, this.f21494n, this.f21495o, this.f21496p, i, c, jVar2, (EnumC8637g) dVar.mo15674c(C8627a.f19057f, EnumC8637g.SMART), intValue2, z);
    }

    public int hashCode() {
        return (this.f21491k.hashCode() * 7) + ((this.f21493m + (this.f21494n * 10)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(getClass().getName());
        sb2.append("[element=");
        sb2.append(this.f21491k.name());
        sb2.append(", fixed-width-mode=");
        sb2.append(this.f21492l);
        sb2.append(", min-digits=");
        sb2.append(this.f21493m);
        sb2.append(", max-digits=");
        sb2.append(this.f21494n);
        sb2.append(", sign-policy=");
        sb2.append(this.f21495o);
        sb2.append(", protected-mode=");
        sb2.append(this.f21496p);
        sb2.append(']');
        return sb2.toString();
    }

    private C9673r(AbstractC8079p<V> pVar, boolean z, int i, int i2, EnumC9684x xVar, boolean z2, int i3, char c, EnumC8641j jVar, EnumC8637g gVar, int i4, boolean z3) {
        this.f21491k = pVar;
        this.f21492l = z;
        this.f21493m = i;
        this.f21494n = i2;
        this.f21495o = xVar;
        this.f21496p = z2;
        this.f21504x = z3;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        } else if (xVar == null) {
            throw new NullPointerException("Missing sign policy.");
        } else if (i < 1) {
            throw new IllegalArgumentException("Not positive: " + i);
        } else if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        } else if (z && i != i2) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i2 + " != " + i);
        } else if (!z || xVar == EnumC9684x.SHOW_NEVER) {
            int h = m15671h(jVar);
            if (jVar.mo18426l()) {
                if (i > h) {
                    throw new IllegalArgumentException("Min digits out of range: " + i);
                } else if (i2 > h) {
                    throw new IllegalArgumentException("Max digits out of range: " + i2);
                }
            }
            this.f21497q = pVar.name().equals("YEAR_OF_ERA");
            this.f21499s = i3;
            this.f21500t = c;
            this.f21501u = jVar;
            this.f21498r = gVar;
            this.f21502v = i4;
            this.f21503w = h;
        } else {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        }
    }
}
