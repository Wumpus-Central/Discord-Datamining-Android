package p029b9;

import cc.AbstractC3884i0;
import cc.AbstractC3897k1;
import cc.AbstractC3904l1;
import cc.C3976z0;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p081e9.AbstractC6769e;
import p119g9.AbstractC7516c;
import p119g9.C7557q0;
import p153i8.AbstractC8299u;
import p153i8.C8302u0;
import p194k8.AbstractC9838m;
import p194k8.AbstractC9839n;

/* renamed from: b9.a */
/* loaded from: classes5.dex */
public class C3399a extends AbstractC3402c {

    /* renamed from: g */
    private final AbstractC6769e f5436g;

    /* renamed from: h */
    private final long f5437h;

    /* renamed from: i */
    private final long f5438i;

    /* renamed from: j */
    private final long f5439j;

    /* renamed from: k */
    private final float f5440k;

    /* renamed from: l */
    private final float f5441l;

    /* renamed from: m */
    private final AbstractC3884i0<C0079a> f5442m;

    /* renamed from: n */
    private final AbstractC7516c f5443n;

    /* renamed from: p */
    private int f5445p;

    /* renamed from: s */
    private AbstractC9838m f5448s;

    /* renamed from: o */
    private float f5444o = 1.0f;

    /* renamed from: q */
    private int f5446q = 0;

    /* renamed from: r */
    private long f5447r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b9.a$a */
    /* loaded from: classes5.dex */
    public static final class C0079a {

        /* renamed from: a */
        public final long f5449a;

        /* renamed from: b */
        public final long f5450b;

        public C0079a(long j, long j2) {
            this.f5449a = j;
            this.f5450b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0079a)) {
                return false;
            }
            C0079a aVar = (C0079a) obj;
            if (this.f5449a == aVar.f5449a && this.f5450b == aVar.f5450b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f5449a) * 31) + ((int) this.f5450b);
        }
    }

    /* renamed from: b9.a$b */
    /* loaded from: classes5.dex */
    public static class C3400b implements AbstractC3415h.AbstractC3417b {

        /* renamed from: a */
        private final int f5451a;

        /* renamed from: b */
        private final int f5452b;

        /* renamed from: c */
        private final int f5453c;

        /* renamed from: d */
        private final float f5454d;

        /* renamed from: e */
        private final float f5455e;

        /* renamed from: f */
        private final AbstractC7516c f5456f;

        public C3400b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, AbstractC7516c.f16293a);
        }

        @Override // p029b9.AbstractC3415h.AbstractC3417b
        /* renamed from: a */
        public final AbstractC3415h[] mo34426a(AbstractC3415h.C3416a[] aVarArr, AbstractC6769e eVar, AbstractC8299u.C8300a aVar, Timeline timeline) {
            AbstractC3415h hVar;
            AbstractC3884i0 z = C3399a.m34504z(aVarArr);
            AbstractC3415h[] hVarArr = new AbstractC3415h[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                AbstractC3415h.C3416a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f5534b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            hVar = new C3418i(aVar2.f5533a, iArr[0], aVar2.f5535c, aVar2.f5536d);
                        } else {
                            hVar = m34503b(aVar2.f5533a, eVar, iArr, (AbstractC3884i0) z.get(i));
                        }
                        hVarArr[i] = hVar;
                    }
                }
            }
            return hVarArr;
        }

        /* renamed from: b */
        protected C3399a m34503b(C8302u0 u0Var, AbstractC6769e eVar, int[] iArr, AbstractC3884i0<C0079a> i0Var) {
            return new C3399a(u0Var, iArr, eVar, this.f5451a, this.f5452b, this.f5453c, this.f5454d, this.f5455e, i0Var, this.f5456f);
        }

        public C3400b(int i, int i2, int i3, float f, float f2, AbstractC7516c cVar) {
            this.f5451a = i;
            this.f5452b = i2;
            this.f5453c = i3;
            this.f5454d = f;
            this.f5455e = f2;
            this.f5456f = cVar;
        }
    }

    protected C3399a(C8302u0 u0Var, int[] iArr, AbstractC6769e eVar, long j, long j2, long j3, float f, float f2, List<C0079a> list, AbstractC7516c cVar) {
        super(u0Var, iArr);
        this.f5436g = eVar;
        this.f5437h = j * 1000;
        this.f5438i = j2 * 1000;
        this.f5439j = j3 * 1000;
        this.f5440k = f;
        this.f5441l = f2;
        this.f5442m = AbstractC3884i0.m33401u(list);
        this.f5443n = cVar;
    }

    /* renamed from: A */
    private long m34514A() {
        long j;
        long d = ((float) this.f5436g.mo24341d()) * this.f5440k;
        if (this.f5442m.isEmpty()) {
            return d;
        }
        int i = 1;
        while (i < this.f5442m.size() - 1 && this.f5442m.get(i).f5449a < d) {
            i++;
        }
        C0079a aVar = this.f5442m.get(i - 1);
        C0079a aVar2 = this.f5442m.get(i);
        long j2 = aVar.f5449a;
        float f = ((float) (d - j2)) / ((float) (aVar2.f5449a - j2));
        return aVar.f5450b + (f * ((float) (aVar2.f5450b - j)));
    }

    /* renamed from: C */
    private static long[][] m34512C(AbstractC3415h.C3416a[] aVarArr) {
        int[] iArr;
        long[][] jArr = new long[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            AbstractC3415h.C3416a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f5534b.length];
                int i2 = 0;
                while (true) {
                    if (i2 >= aVar.f5534b.length) {
                        break;
                    }
                    jArr[i][i2] = aVar.f5533a.m19990a(iArr[i2]).f14325r;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: D */
    private static AbstractC3884i0<Integer> m34511D(long[][] jArr) {
        double d;
        AbstractC3897k1 e = AbstractC3904l1.m33360c().m33357a().mo33354e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d2 = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d2 = Math.log(j);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    e.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return AbstractC3884i0.m33401u(e.values());
    }

    /* renamed from: E */
    private long m34510E(long j) {
        boolean z;
        if (j == -9223372036854775807L || j > this.f5437h) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return ((float) j) * this.f5441l;
        }
        return this.f5437h;
    }

    /* renamed from: w */
    private static void m34507w(List<AbstractC3884i0.C3886b<C0079a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC3884i0.C3886b<C0079a> bVar = list.get(i);
            if (bVar != null) {
                bVar.m33395b(new C0079a(j, jArr[i]));
            }
        }
    }

    /* renamed from: y */
    private int m34505y(long j) {
        long A = m34514A();
        int i = 0;
        for (int i2 = 0; i2 < this.f5458b; i2++) {
            if (j == Long.MIN_VALUE || !m34501t(i2, j)) {
                C6722k c = mo34414c(i2);
                if (m34506x(c, c.f14325r, this.f5444o, A)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static AbstractC3884i0<AbstractC3884i0<C0079a>> m34504z(AbstractC3415h.C3416a[] aVarArr) {
        AbstractC3884i0 i0Var;
        long j;
        ArrayList arrayList = new ArrayList();
        for (AbstractC3415h.C3416a aVar : aVarArr) {
            if (aVar == null || aVar.f5534b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC3884i0.C3886b s = AbstractC3884i0.m33403s();
                s.m33395b(new C0079a(0L, 0L));
                arrayList.add(s);
            }
        }
        long[][] C = m34512C(aVarArr);
        int[] iArr = new int[C.length];
        long[] jArr = new long[C.length];
        for (int i = 0; i < C.length; i++) {
            long[] jArr2 = C[i];
            if (jArr2.length == 0) {
                j = 0;
            } else {
                j = jArr2[0];
            }
            jArr[i] = j;
        }
        m34507w(arrayList, jArr);
        AbstractC3884i0<Integer> D = m34511D(C);
        for (int i2 = 0; i2 < D.size(); i2++) {
            int intValue = D.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = C[intValue][i3];
            m34507w(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m34507w(arrayList, jArr);
        AbstractC3884i0.C3886b s2 = AbstractC3884i0.m33403s();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            AbstractC3884i0.C3886b bVar = (AbstractC3884i0.C3886b) arrayList.get(i5);
            if (bVar == null) {
                i0Var = AbstractC3884i0.m33399x();
            } else {
                i0Var = bVar.m33394c();
            }
            s2.m33395b(i0Var);
        }
        return s2.m33394c();
    }

    /* renamed from: B */
    protected long m34513B() {
        return this.f5439j;
    }

    /* renamed from: F */
    protected boolean m34509F(long j, List<? extends AbstractC9838m> list) {
        long j2 = this.f5447r;
        if (j2 == -9223372036854775807L || j - j2 >= 1000 || (!list.isEmpty() && !((AbstractC9838m) C3976z0.m33215c(list)).equals(this.f5448s))) {
            return true;
        }
        return false;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: a */
    public int mo12503a() {
        return this.f5445p;
    }

    @Override // p029b9.AbstractC3402c, p029b9.AbstractC3415h
    public void disable() {
        this.f5448s = null;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: e */
    public void mo12502e(long j, long j2, long j3, List<? extends AbstractC9838m> list, AbstractC9839n[] nVarArr) {
        int i;
        long b = this.f5443n.mo22292b();
        int i2 = this.f5446q;
        if (i2 == 0) {
            this.f5446q = 1;
            this.f5445p = m34505y(b);
            return;
        }
        int i3 = this.f5445p;
        if (list.isEmpty()) {
            i = -1;
        } else {
            i = mo34410l(((AbstractC9838m) C3976z0.m33215c(list)).f21890d);
        }
        if (i != -1) {
            i2 = ((AbstractC9838m) C3976z0.m33215c(list)).f21891e;
            i3 = i;
        }
        int y = m34505y(b);
        if (!m34501t(i3, b)) {
            C6722k c = mo34414c(i3);
            C6722k c2 = mo34414c(y);
            if ((c2.f14325r > c.f14325r && j2 < m34510E(j3)) || (c2.f14325r < c.f14325r && j2 >= this.f5438i)) {
                y = i3;
            }
        }
        if (y != i3) {
            i2 = 3;
        }
        this.f5446q = i2;
        this.f5445p = y;
    }

    @Override // p029b9.AbstractC3402c, p029b9.AbstractC3415h
    public void enable() {
        this.f5447r = -9223372036854775807L;
        this.f5448s = null;
    }

    @Override // p029b9.AbstractC3402c, p029b9.AbstractC3415h
    /* renamed from: f */
    public void mo34434f(float f) {
        this.f5444o = f;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: g */
    public Object mo12501g() {
        return null;
    }

    @Override // p029b9.AbstractC3402c, p029b9.AbstractC3415h
    /* renamed from: n */
    public int mo34430n(long j, List<? extends AbstractC9838m> list) {
        AbstractC9838m mVar;
        int i;
        int i2;
        long b = this.f5443n.mo22292b();
        if (!m34509F(b, list)) {
            return list.size();
        }
        this.f5447r = b;
        if (list.isEmpty()) {
            mVar = null;
        } else {
            mVar = (AbstractC9838m) C3976z0.m33215c(list);
        }
        this.f5448s = mVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long d0 = C7557q0.m22156d0(((AbstractC9838m) list.get(size - 1)).f21893g - j, this.f5444o);
        long B = m34513B();
        if (d0 < B) {
            return size;
        }
        C6722k c = mo34414c(m34505y(b));
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC9838m mVar2 = (AbstractC9838m) list.get(i3);
            C6722k kVar = mVar2.f21890d;
            if (C7557q0.m22156d0(mVar2.f21893g - j, this.f5444o) >= B && kVar.f14325r < c.f14325r && (i = kVar.f37962B) != -1 && i < 720 && (i2 = kVar.f37961A) != -1 && i2 < 1280 && i < c.f37962B) {
                return i3;
            }
        }
        return size;
    }

    @Override // p029b9.AbstractC3415h
    /* renamed from: q */
    public int mo12500q() {
        return this.f5446q;
    }

    /* renamed from: x */
    protected boolean m34506x(C6722k kVar, int i, float f, long j) {
        return ((long) Math.round(((float) i) * f)) <= j;
    }
}
