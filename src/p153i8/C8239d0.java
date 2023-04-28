package p153i8;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import p029b9.AbstractC3415h;
import p079e7.C6725l;
import p079e7.C6736w;
import p119g9.C7510a;
import p152i7.C8223h;
import p153i8.AbstractC8287r;

/* renamed from: i8.d0 */
/* loaded from: classes7.dex */
final class C8239d0 implements AbstractC8287r, AbstractC8287r.AbstractC8288a {

    /* renamed from: k */
    private final AbstractC8287r[] f17855k;

    /* renamed from: m */
    private final AbstractC8252h f17857m;

    /* renamed from: o */
    private AbstractC8287r.AbstractC8288a f17859o;

    /* renamed from: p */
    private TrackGroupArray f17860p;

    /* renamed from: r */
    private AbstractC8282p0 f17862r;

    /* renamed from: n */
    private final ArrayList<AbstractC8287r> f17858n = new ArrayList<>();

    /* renamed from: l */
    private final IdentityHashMap<AbstractC8278o0, Integer> f17856l = new IdentityHashMap<>();

    /* renamed from: q */
    private AbstractC8287r[] f17861q = new AbstractC8287r[0];

    /* renamed from: i8.d0$a */
    /* loaded from: classes7.dex */
    private static final class C8240a implements AbstractC8287r, AbstractC8287r.AbstractC8288a {

        /* renamed from: k */
        private final AbstractC8287r f17863k;

        /* renamed from: l */
        private final long f17864l;

        /* renamed from: m */
        private AbstractC8287r.AbstractC8288a f17865m;

        public C8240a(AbstractC8287r rVar, long j) {
            this.f17863k = rVar;
            this.f17864l = j;
        }

        @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
        /* renamed from: b */
        public long mo12421b() {
            long b = this.f17863k.mo12421b();
            if (b == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f17864l + b;
        }

        @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
        /* renamed from: c */
        public boolean mo12419c() {
            return this.f17863k.mo12419c();
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: d */
        public long mo12472d(long j, C6736w wVar) {
            return this.f17863k.mo12472d(j - this.f17864l, wVar) + this.f17864l;
        }

        @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
        /* renamed from: f */
        public boolean mo12415f(long j) {
            return this.f17863k.mo12415f(j - this.f17864l);
        }

        @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
        /* renamed from: g */
        public long mo12413g() {
            long g = this.f17863k.mo12413g();
            if (g == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f17864l + g;
        }

        @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
        /* renamed from: h */
        public void mo12411h(long j) {
            this.f17863k.mo12411h(j - this.f17864l);
        }

        @Override // p153i8.AbstractC8287r.AbstractC8288a
        /* renamed from: j */
        public void mo20028j(AbstractC8287r rVar) {
            ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17865m)).mo20028j(this);
        }

        /* renamed from: k */
        public void mo12471i(AbstractC8287r rVar) {
            ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17865m)).mo12471i(this);
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: l */
        public long mo12470l(long j) {
            return this.f17863k.mo12470l(j - this.f17864l) + this.f17864l;
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: m */
        public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
            this.f17865m = aVar;
            this.f17863k.mo12469m(this, j - this.f17864l);
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: n */
        public long mo12468n() {
            long n = this.f17863k.mo12468n();
            if (n == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f17864l + n;
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: q */
        public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
            AbstractC8278o0[] o0VarArr2 = new AbstractC8278o0[o0VarArr.length];
            int i = 0;
            while (true) {
                AbstractC8278o0 o0Var = null;
                if (i >= o0VarArr.length) {
                    break;
                }
                C8241b bVar = (C8241b) o0VarArr[i];
                if (bVar != null) {
                    o0Var = bVar.m20217b();
                }
                o0VarArr2[i] = o0Var;
                i++;
            }
            long q = this.f17863k.mo12466q(hVarArr, zArr, o0VarArr2, zArr2, j - this.f17864l);
            for (int i2 = 0; i2 < o0VarArr.length; i2++) {
                AbstractC8278o0 o0Var2 = o0VarArr2[i2];
                if (o0Var2 == null) {
                    o0VarArr[i2] = null;
                } else {
                    AbstractC8278o0 o0Var3 = o0VarArr[i2];
                    if (o0Var3 == null || ((C8241b) o0Var3).m20217b() != o0Var2) {
                        o0VarArr[i2] = new C8241b(o0Var2, this.f17864l);
                    }
                }
            }
            return q + this.f17864l;
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: r */
        public void mo12465r() {
            this.f17863k.mo12465r();
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: t */
        public TrackGroupArray mo12463t() {
            return this.f17863k.mo12463t();
        }

        @Override // p153i8.AbstractC8287r
        /* renamed from: u */
        public void mo12462u(long j, boolean z) {
            this.f17863k.mo12462u(j - this.f17864l, z);
        }
    }

    /* renamed from: i8.d0$b */
    /* loaded from: classes7.dex */
    private static final class C8241b implements AbstractC8278o0 {

        /* renamed from: k */
        private final AbstractC8278o0 f17866k;

        /* renamed from: l */
        private final long f17867l;

        public C8241b(AbstractC8278o0 o0Var, long j) {
            this.f17866k = o0Var;
            this.f17867l = j;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: a */
        public void mo12456a() {
            this.f17866k.mo12456a();
        }

        /* renamed from: b */
        public AbstractC8278o0 m20217b() {
            return this.f17866k;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: e */
        public boolean mo12452e() {
            return this.f17866k.mo12452e();
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: j */
        public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
            int j = this.f17866k.mo12451j(lVar, hVar, z);
            if (j == -4) {
                hVar.f17800o = Math.max(0L, hVar.f17800o + this.f17867l);
            }
            return j;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: s */
        public int mo12450s(long j) {
            return this.f17866k.mo12450s(j - this.f17867l);
        }
    }

    public C8239d0(AbstractC8252h hVar, long[] jArr, AbstractC8287r... rVarArr) {
        this.f17857m = hVar;
        this.f17855k = rVarArr;
        this.f17862r = hVar.mo20192a(new AbstractC8282p0[0]);
        for (int i = 0; i < rVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f17855k[i] = new C8240a(rVarArr[i], j);
            }
        }
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return this.f17862r.mo12421b();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f17862r.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        AbstractC8287r rVar;
        AbstractC8287r[] rVarArr = this.f17861q;
        if (rVarArr.length > 0) {
            rVar = rVarArr[0];
        } else {
            rVar = this.f17855k[0];
        }
        return rVar.mo12472d(j, wVar);
    }

    /* renamed from: e */
    public AbstractC8287r m20221e(int i) {
        AbstractC8287r rVar = this.f17855k[i];
        if (rVar instanceof C8240a) {
            return ((C8240a) rVar).f17863k;
        }
        return rVar;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        if (this.f17858n.isEmpty()) {
            return this.f17862r.mo12415f(j);
        }
        int size = this.f17858n.size();
        for (int i = 0; i < size; i++) {
            this.f17858n.get(i).mo12415f(j);
        }
        return false;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return this.f17862r.mo12413g();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        this.f17862r.mo12411h(j);
    }

    @Override // p153i8.AbstractC8287r.AbstractC8288a
    /* renamed from: j */
    public void mo20028j(AbstractC8287r rVar) {
        this.f17858n.remove(rVar);
        if (this.f17858n.isEmpty()) {
            int i = 0;
            for (AbstractC8287r rVar2 : this.f17855k) {
                i += rVar2.mo12463t().f9362k;
            }
            C8302u0[] u0VarArr = new C8302u0[i];
            int i2 = 0;
            for (AbstractC8287r rVar3 : this.f17855k) {
                TrackGroupArray t = rVar3.mo12463t();
                int i3 = t.f9362k;
                int i4 = 0;
                while (i4 < i3) {
                    u0VarArr[i2] = t.m29997a(i4);
                    i4++;
                    i2++;
                }
            }
            this.f17860p = new TrackGroupArray(u0VarArr);
            ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17859o)).mo20028j(this);
        }
    }

    /* renamed from: k */
    public void mo12471i(AbstractC8287r rVar) {
        ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17859o)).mo12471i(this);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        long l = this.f17861q[0].mo12470l(j);
        int i = 1;
        while (true) {
            AbstractC8287r[] rVarArr = this.f17861q;
            if (i >= rVarArr.length) {
                return l;
            }
            if (rVarArr[i].mo12470l(l) == l) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f17859o = aVar;
        Collections.addAll(this.f17858n, this.f17855k);
        for (AbstractC8287r rVar : this.f17855k) {
            rVar.mo12469m(this, j);
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        AbstractC8287r[] rVarArr;
        AbstractC8287r[] rVarArr2;
        long j = -9223372036854775807L;
        for (AbstractC8287r rVar : this.f17861q) {
            long n = rVar.mo12468n();
            if (n != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (AbstractC8287r rVar2 : this.f17861q) {
                        if (rVar2 == rVar) {
                            break;
                        } else if (rVar2.mo12470l(n) != n) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = n;
                } else if (n != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || rVar.mo12470l(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        AbstractC8278o0 o0Var;
        AbstractC3415h hVar;
        Integer num;
        int i;
        int[] iArr = new int[hVarArr.length];
        int[] iArr2 = new int[hVarArr.length];
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            AbstractC8278o0 o0Var2 = o0VarArr[i2];
            if (o0Var2 == null) {
                num = null;
            } else {
                num = this.f17856l.get(o0Var2);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            AbstractC3415h hVar2 = hVarArr[i2];
            if (hVar2 != null) {
                C8302u0 k = hVar2.mo34411k();
                int i3 = 0;
                while (true) {
                    AbstractC8287r[] rVarArr = this.f17855k;
                    if (i3 >= rVarArr.length) {
                        break;
                    } else if (rVarArr[i3].mo12463t().m29996b(k) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f17856l.clear();
        int length = hVarArr.length;
        AbstractC8278o0[] o0VarArr2 = new AbstractC8278o0[length];
        AbstractC8278o0[] o0VarArr3 = new AbstractC8278o0[hVarArr.length];
        AbstractC3415h[] hVarArr2 = new AbstractC3415h[hVarArr.length];
        ArrayList arrayList = new ArrayList(this.f17855k.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f17855k.length) {
            for (int i5 = 0; i5 < hVarArr.length; i5++) {
                if (iArr[i5] == i4) {
                    o0Var = o0VarArr[i5];
                } else {
                    o0Var = null;
                }
                o0VarArr3[i5] = o0Var;
                if (iArr2[i5] == i4) {
                    hVar = hVarArr[i5];
                } else {
                    hVar = null;
                }
                hVarArr2[i5] = hVar;
            }
            long q = this.f17855k[i4].mo12466q(hVarArr2, zArr, o0VarArr3, zArr2, j2);
            if (i4 == 0) {
                j2 = q;
            } else if (q != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < hVarArr.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i4) {
                    o0VarArr2[i6] = o0VarArr3[i6];
                    this.f17856l.put((AbstractC8278o0) C7510a.m22367e(o0VarArr3[i6]), Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i6] == i4) {
                    if (o0VarArr3[i6] != null) {
                        z2 = false;
                    }
                    C7510a.m22366f(z2);
                }
            }
            if (z) {
                arrayList.add(this.f17855k[i4]);
            }
            i4++;
            arrayList = arrayList;
            hVarArr2 = hVarArr2;
        }
        System.arraycopy(o0VarArr2, 0, o0VarArr, 0, length);
        AbstractC8287r[] rVarArr2 = (AbstractC8287r[]) arrayList.toArray(new AbstractC8287r[0]);
        this.f17861q = rVarArr2;
        this.f17862r = this.f17857m.mo20192a(rVarArr2);
        return j2;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        for (AbstractC8287r rVar : this.f17855k) {
            rVar.mo12465r();
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return (TrackGroupArray) C7510a.m22367e(this.f17860p);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        for (AbstractC8287r rVar : this.f17861q) {
            rVar.mo12462u(j, z);
        }
    }
}
