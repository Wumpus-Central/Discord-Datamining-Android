package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.AbstractC5232a;
import com.google.android.exoplayer2.source.dash.C5239e;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p029b9.AbstractC3415h;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6736w;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p119g9.C7557q0;
import p119g9.C7562u;
import p153i8.C8232b;
import p194k8.AbstractC9823b;
import p194k8.AbstractC9827e;
import p194k8.AbstractC9828f;
import p194k8.AbstractC9838m;
import p194k8.AbstractC9839n;
import p194k8.C9825d;
import p194k8.C9830g;
import p194k8.C9835j;
import p194k8.C9837l;
import p194k8.C9841o;
import p212l8.AbstractC10357e;
import p212l8.C10358f;
import p212l8.C10359g;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.C10504d;
import p229m8.AbstractC10547i;
import p229m8.C10538a;
import p229m8.C10539b;
import p229m8.C10546h;
import p316r7.C12445e;
import p348t7.C12985g;
import p382v7.C13451a;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* loaded from: classes7.dex */
public class C5235c implements AbstractC5232a {

    /* renamed from: a */
    private final AbstractC6790t f9425a;

    /* renamed from: b */
    private final int[] f9426b;

    /* renamed from: c */
    private final int f9427c;

    /* renamed from: d */
    private final DataSource f9428d;

    /* renamed from: e */
    private final long f9429e;

    /* renamed from: f */
    private final int f9430f;

    /* renamed from: g */
    private final C5239e.C5242c f9431g;

    /* renamed from: h */
    protected final C5237b[] f9432h;

    /* renamed from: i */
    private AbstractC3415h f9433i;

    /* renamed from: j */
    private C10539b f9434j;

    /* renamed from: k */
    private int f9435k;

    /* renamed from: l */
    private IOException f9436l;

    /* renamed from: m */
    private boolean f9437m;

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* loaded from: classes7.dex */
    public static final class C5236a implements AbstractC5232a.AbstractC0140a {

        /* renamed from: a */
        private final DataSource.Factory f9438a;

        /* renamed from: b */
        private final int f9439b;

        public C5236a(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.AbstractC5232a.AbstractC0140a
        /* renamed from: a */
        public AbstractC5232a mo29910a(AbstractC6790t tVar, C10539b bVar, int i, int[] iArr, AbstractC3415h hVar, int i2, long j, boolean z, List<C6722k> list, C5239e.C5242c cVar, AbstractC6795x xVar) {
            DataSource createDataSource = this.f9438a.createDataSource();
            if (xVar != null) {
                createDataSource.mo12541c(xVar);
            }
            return new C5235c(tVar, bVar, i, iArr, hVar, i2, createDataSource, j, this.f9439b, z, list, cVar);
        }

        public C5236a(DataSource.Factory factory, int i) {
            this.f9438a = factory;
            this.f9439b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* loaded from: classes7.dex */
    protected static final class C0141c extends AbstractC9823b {

        /* renamed from: e */
        private final C5237b f9445e;

        /* renamed from: f */
        private final long f9446f;

        public C0141c(C5237b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f9445e = bVar;
            this.f9446f = j3;
        }
    }

    public C5235c(AbstractC6790t tVar, C10539b bVar, int i, int[] iArr, AbstractC3415h hVar, int i2, DataSource dataSource, long j, int i3, boolean z, List<C6722k> list, C5239e.C5242c cVar) {
        this.f9425a = tVar;
        this.f9434j = bVar;
        this.f9426b = iArr;
        this.f9433i = hVar;
        this.f9427c = i2;
        this.f9428d = dataSource;
        this.f9435k = i;
        this.f9429e = j;
        this.f9430f = i3;
        this.f9431g = cVar;
        long g = bVar.m12919g(i);
        ArrayList<AbstractC10547i> m = m29914m();
        this.f9432h = new C5237b[hVar.length()];
        for (int i4 = 0; i4 < this.f9432h.length; i4++) {
            this.f9432h[i4] = new C5237b(g, i2, m.get(hVar.mo34413d(i4)), z, list, cVar);
        }
    }

    /* renamed from: k */
    private long m29916k(long j, long j2) {
        if (!this.f9434j.f23307d) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m29915l(j), this.f9432h[0].m29901i(this.f9432h[0].m29903g(j))) - j2);
    }

    /* renamed from: l */
    private long m29915l(long j) {
        C10539b bVar = this.f9434j;
        long j2 = bVar.f23304a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - C6713c.m24566c(j2 + bVar.m12922d(this.f9435k).f23338b);
    }

    /* renamed from: m */
    private ArrayList<AbstractC10547i> m29914m() {
        List<C10538a> list = this.f9434j.m12922d(this.f9435k).f23339c;
        ArrayList<AbstractC10547i> arrayList = new ArrayList<>();
        for (int i : this.f9426b) {
            arrayList.addAll(list.get(i).f23300c);
        }
        return arrayList;
    }

    /* renamed from: n */
    private long m29913n(C5237b bVar, AbstractC9838m mVar, long j, long j2, long j3) {
        if (mVar != null) {
            return mVar.mo15205g();
        }
        return C7557q0.m22127s(bVar.m29900j(j), j2, j3);
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: a */
    public void mo15216a() {
        IOException iOException = this.f9436l;
        if (iOException == null) {
            this.f9425a.mo24321a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.AbstractC5232a
    /* renamed from: b */
    public void mo29918b(AbstractC3415h hVar) {
        this.f9433i = hVar;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: c */
    public boolean mo15215c(AbstractC9827e eVar, boolean z, Exception exc, long j) {
        C5237b bVar;
        int h;
        if (!z) {
            return false;
        }
        C5239e.C5242c cVar = this.f9431g;
        if (cVar != null && cVar.m29871j(eVar)) {
            return true;
        }
        if (!this.f9434j.f23307d && (eVar instanceof AbstractC9838m) && (exc instanceof AbstractC5311f.C0146f) && ((AbstractC5311f.C0146f) exc).f9864m == 404 && (h = (bVar = this.f9432h[this.f9433i.mo34410l(eVar.f21890d)]).m29902h()) != -1 && h != 0) {
            if (((AbstractC9838m) eVar).mo15205g() > (bVar.m29904f() + h) - 1) {
                this.f9437m = true;
                return true;
            }
        }
        if (j == -9223372036854775807L) {
            return false;
        }
        AbstractC3415h hVar = this.f9433i;
        if (hVar.mo34435b(hVar.mo34410l(eVar.f21890d), j)) {
            return true;
        }
        return false;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: d */
    public long mo15214d(long j, C6736w wVar) {
        C5237b[] bVarArr;
        long j2;
        for (C5237b bVar : this.f9432h) {
            if (bVar.f9442c != null) {
                long j3 = bVar.m29900j(j);
                long k = bVar.m29899k(j3);
                int h = bVar.m29902h();
                if (k >= j || (h != -1 && j3 >= (bVar.m29904f() + h) - 1)) {
                    j2 = k;
                } else {
                    j2 = bVar.m29899k(j3 + 1);
                }
                return wVar.m24422a(j, k, j2);
            }
        }
        return j;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: e */
    public boolean mo15213e(long j, AbstractC9827e eVar, List<? extends AbstractC9838m> list) {
        if (this.f9436l != null) {
            return false;
        }
        return this.f9433i.mo34432j(j, eVar, list);
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: f */
    public void mo15212f(AbstractC9827e eVar) {
        C10504d c;
        if (eVar instanceof C9837l) {
            int l = this.f9433i.mo34410l(((C9837l) eVar).f21890d);
            C5237b bVar = this.f9432h[l];
            if (bVar.f9442c == null && (c = bVar.f9440a.mo15250c()) != null) {
                this.f9432h[l] = bVar.m29907c(new C10359g(c, bVar.f9441b.f23354d));
            }
        }
        C5239e.C5242c cVar = this.f9431g;
        if (cVar != null) {
            cVar.m29872i(eVar);
        }
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: h */
    public void mo15211h(long j, long j2, List<? extends AbstractC9838m> list, C9830g gVar) {
        int i;
        if (this.f9436l == null) {
            long j3 = j2 - j;
            long c = C6713c.m24566c(this.f9434j.f23304a) + C6713c.m24566c(this.f9434j.m12922d(this.f9435k).f23338b) + j2;
            C5239e.C5242c cVar = this.f9431g;
            if (cVar == null || !cVar.m29873h(c)) {
                long c2 = C6713c.m24566c(C7557q0.m22165Z(this.f9429e));
                long l = m29915l(c2);
                boolean z = true;
                AbstractC9838m mVar = list.isEmpty() ? null : (AbstractC9838m) list.get(list.size() - 1);
                int length = this.f9433i.length();
                AbstractC9839n[] nVarArr = new AbstractC9839n[length];
                int i2 = 0;
                while (i2 < length) {
                    C5237b bVar = this.f9432h[i2];
                    if (bVar.f9442c == null) {
                        nVarArr[i2] = AbstractC9839n.f21932a;
                        i = i2;
                        length = length;
                        nVarArr = nVarArr;
                        z = z;
                        j3 = j3;
                        c2 = c2;
                    } else {
                        long e = bVar.m29905e(c2);
                        long g = bVar.m29903g(c2);
                        i = i2;
                        length = length;
                        nVarArr = nVarArr;
                        z = z;
                        j3 = j3;
                        c2 = c2;
                        long n = m29913n(bVar, mVar, j2, e, g);
                        if (n < e) {
                            nVarArr[i] = AbstractC9839n.f21932a;
                        } else {
                            nVarArr[i] = new C0141c(bVar, n, g, l);
                        }
                    }
                    i2 = i + 1;
                }
                this.f9433i.mo12502e(j, j3, m29916k(c2, j), list, nVarArr);
                C5237b bVar2 = this.f9432h[this.f9433i.mo12503a()];
                AbstractC9828f fVar = bVar2.f9440a;
                if (fVar != null) {
                    AbstractC10547i iVar = bVar2.f9441b;
                    C10546h n2 = fVar.mo15249d() == null ? iVar.m12845n() : null;
                    C10546h m = bVar2.f9442c == null ? iVar.mo12840m() : null;
                    if (!(n2 == null && m == null)) {
                        gVar.f21896a = m29912o(bVar2, this.f9428d, this.f9433i.mo34428p(), this.f9433i.mo12500q(), this.f9433i.mo12501g(), n2, m);
                        return;
                    }
                }
                long j4 = bVar2.f9443d;
                long j5 = -9223372036854775807L;
                int i3 = (j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1));
                boolean z2 = i3 != 0 ? z : false;
                if (bVar2.m29902h() == 0) {
                    gVar.f21897b = z2;
                    return;
                }
                long e2 = bVar2.m29905e(c2);
                long g2 = bVar2.m29903g(c2);
                long n3 = m29913n(bVar2, mVar, j2, e2, g2);
                if (n3 < e2) {
                    this.f9436l = new C8232b();
                    return;
                }
                int i4 = (n3 > g2 ? 1 : (n3 == g2 ? 0 : -1));
                if (i4 > 0 || (this.f9437m && i4 >= 0)) {
                    gVar.f21897b = z2;
                } else if (!z2 || bVar2.m29899k(n3) < j4) {
                    int min = (int) Math.min(this.f9430f, (g2 - n3) + 1);
                    if (i3 != 0) {
                        while (min > 1 && bVar2.m29899k((min + n3) - 1) >= j4) {
                            min--;
                        }
                    }
                    if (list.isEmpty()) {
                        j5 = j2;
                    }
                    gVar.f21896a = m29911p(bVar2, this.f9428d, this.f9427c, this.f9433i.mo34428p(), this.f9433i.mo12500q(), this.f9433i.mo12501g(), n3, min, j5, l);
                } else {
                    gVar.f21897b = true;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.AbstractC5232a
    /* renamed from: i */
    public void mo29917i(C10539b bVar, int i) {
        try {
            this.f9434j = bVar;
            this.f9435k = i;
            long g = bVar.m12919g(i);
            ArrayList<AbstractC10547i> m = m29914m();
            for (int i2 = 0; i2 < this.f9432h.length; i2++) {
                C5237b[] bVarArr = this.f9432h;
                bVarArr[i2] = bVarArr[i2].m29908b(g, m.get(this.f9433i.mo34413d(i2)));
            }
        } catch (C8232b e) {
            this.f9436l = e;
        }
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: j */
    public int mo15210j(long j, List<? extends AbstractC9838m> list) {
        if (this.f9436l != null || this.f9433i.length() < 2) {
            return list.size();
        }
        return this.f9433i.mo34430n(j, list);
    }

    /* renamed from: o */
    protected AbstractC9827e m29912o(C5237b bVar, DataSource dataSource, C6722k kVar, int i, Object obj, C10546h hVar, C10546h hVar2) {
        AbstractC10547i iVar = bVar.f9441b;
        if (hVar == null || (hVar2 = hVar.m12848a(hVar2, iVar.f23353c)) != null) {
            hVar = hVar2;
        }
        return new C9837l(dataSource, C10358f.m13546a(iVar, hVar, 0), kVar, i, obj, bVar.f9440a);
    }

    /* renamed from: p */
    protected AbstractC9827e m29911p(C5237b bVar, DataSource dataSource, int i, C6722k kVar, int i2, Object obj, long j, int i3, long j2, long j3) {
        long j4;
        int i4;
        int i5;
        AbstractC10547i iVar = bVar.f9441b;
        long k = bVar.m29899k(j);
        C10546h l = bVar.m29898l(j);
        String str = iVar.f23353c;
        if (bVar.f9440a == null) {
            long i6 = bVar.m29901i(j);
            if (bVar.m29897m(j, j3)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            return new C9841o(dataSource, C10358f.m13546a(iVar, l, i5), kVar, i2, obj, k, i6, j, i, kVar);
        }
        int i7 = 1;
        int i8 = 1;
        while (i7 < i3) {
            C10546h a = l.m12848a(bVar.m29898l(i7 + j), str);
            if (a == null) {
                break;
            }
            i8++;
            i7++;
            l = a;
        }
        long j5 = (i8 + j) - 1;
        long i9 = bVar.m29901i(j5);
        long j6 = bVar.f9443d;
        if (j6 == -9223372036854775807L || j6 > i9) {
            j4 = -9223372036854775807L;
        } else {
            j4 = j6;
        }
        if (bVar.m29897m(j5, j3)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        return new C9835j(dataSource, C10358f.m13546a(iVar, l, i4), kVar, i2, obj, k, i9, j2, j4, j, i8, -iVar.f23354d, bVar.f9440a);
    }

    @Override // p194k8.AbstractC9834i
    public void release() {
        for (C5237b bVar : this.f9432h) {
            AbstractC9828f fVar = bVar.f9440a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.exoplayer2.source.dash.c$b */
    /* loaded from: classes7.dex */
    public static final class C5237b {

        /* renamed from: a */
        final AbstractC9828f f9440a;

        /* renamed from: b */
        public final AbstractC10547i f9441b;

        /* renamed from: c */
        public final AbstractC10357e f9442c;

        /* renamed from: d */
        private final long f9443d;

        /* renamed from: e */
        private final long f9444e;

        C5237b(long j, int i, AbstractC10547i iVar, boolean z, List<C6722k> list, AbstractC10500b0 b0Var) {
            this(j, iVar, m29906d(i, iVar, z, list, b0Var), 0L, iVar.mo12841b());
        }

        /* renamed from: d */
        private static AbstractC9828f m29906d(int i, AbstractC10547i iVar, boolean z, List<C6722k> list, AbstractC10500b0 b0Var) {
            AbstractC10514i iVar2;
            int i2;
            String str = iVar.f23352b.f14328u;
            if (C7562u.m22070r(str)) {
                if (!"application/x-rawcc".equals(str)) {
                    return null;
                }
                iVar2 = new C13451a(iVar.f23352b);
            } else if (C7562u.m22071q(str)) {
                iVar2 = new C12445e(1);
            } else {
                if (z) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                iVar2 = new C12985g(i2, null, null, list, b0Var);
            }
            return new C9825d(iVar2, i, iVar.f23352b);
        }

        /* renamed from: b */
        C5237b m29908b(long j, AbstractC10547i iVar) {
            long j2;
            long j3;
            AbstractC10357e b = this.f9441b.mo12841b();
            AbstractC10357e b2 = iVar.mo12841b();
            if (b == null) {
                return new C5237b(j, iVar, this.f9440a, this.f9444e, b);
            }
            if (!b.mo12819j()) {
                return new C5237b(j, iVar, this.f9440a, this.f9444e, b2);
            }
            int i = b.mo12820i(j);
            if (i == 0) {
                return new C5237b(j, iVar, this.f9440a, this.f9444e, b2);
            }
            long k = b.mo12818k();
            long c = b.mo12826c(k);
            long j4 = (i + k) - 1;
            long k2 = b2.mo12818k();
            long c2 = b2.mo12826c(k2);
            long j5 = this.f9444e;
            int i2 = ((b.mo12826c(j4) + b.mo12825d(j4, j)) > c2 ? 1 : ((b.mo12826c(j4) + b.mo12825d(j4, j)) == c2 ? 0 : -1));
            if (i2 == 0) {
                j2 = j5 + ((j4 + 1) - k2);
            } else if (i2 >= 0) {
                if (c2 < c) {
                    j3 = j5 - (b2.mo12821h(c, j) - k);
                } else {
                    j3 = (b.mo12821h(c2, j) - k2) + j5;
                }
                j2 = j3;
            } else {
                throw new C8232b();
            }
            return new C5237b(j, iVar, this.f9440a, j2, b2);
        }

        /* renamed from: c */
        C5237b m29907c(AbstractC10357e eVar) {
            return new C5237b(this.f9443d, this.f9441b, this.f9440a, this.f9444e, eVar);
        }

        /* renamed from: e */
        public long m29905e(long j) {
            return this.f9442c.mo12824e(this.f9443d, j) + this.f9444e;
        }

        /* renamed from: f */
        public long m29904f() {
            return this.f9442c.mo12818k() + this.f9444e;
        }

        /* renamed from: g */
        public long m29903g(long j) {
            return (m29905e(j) + this.f9442c.mo12817l(this.f9443d, j)) - 1;
        }

        /* renamed from: h */
        public int m29902h() {
            return this.f9442c.mo12820i(this.f9443d);
        }

        /* renamed from: i */
        public long m29901i(long j) {
            return m29899k(j) + this.f9442c.mo12825d(j - this.f9444e, this.f9443d);
        }

        /* renamed from: j */
        public long m29900j(long j) {
            return this.f9442c.mo12821h(j, this.f9443d) + this.f9444e;
        }

        /* renamed from: k */
        public long m29899k(long j) {
            return this.f9442c.mo12826c(j - this.f9444e);
        }

        /* renamed from: l */
        public C10546h m29898l(long j) {
            return this.f9442c.mo12822g(j - this.f9444e);
        }

        /* renamed from: m */
        public boolean m29897m(long j, long j2) {
            return j2 == -9223372036854775807L || m29901i(j) <= j2;
        }

        private C5237b(long j, AbstractC10547i iVar, AbstractC9828f fVar, long j2, AbstractC10357e eVar) {
            this.f9443d = j;
            this.f9441b = iVar;
            this.f9444e = j2;
            this.f9440a = fVar;
            this.f9442c = eVar;
        }
    }
}
