package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import java.util.ArrayList;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8282p0;
import p153i8.AbstractC8287r;
import p153i8.C8302u0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p194k8.C9831h;
import p297q8.C12041a;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* loaded from: classes7.dex */
final class C5250c implements AbstractC8287r, AbstractC8282p0.AbstractC8283a<C9831h<AbstractC5248b>> {

    /* renamed from: k */
    private final AbstractC5248b.AbstractC5249a f9529k;

    /* renamed from: l */
    private final AbstractC6795x f9530l;

    /* renamed from: m */
    private final AbstractC6790t f9531m;

    /* renamed from: n */
    private final AbstractC9818x f9532n;

    /* renamed from: o */
    private final AbstractC9815v.C9816a f9533o;

    /* renamed from: p */
    private final AbstractC5318g f9534p;

    /* renamed from: q */
    private final AbstractC8233b0.C8234a f9535q;

    /* renamed from: r */
    private final AbstractC6765b f9536r;

    /* renamed from: s */
    private final TrackGroupArray f9537s;

    /* renamed from: t */
    private final AbstractC8252h f9538t;

    /* renamed from: u */
    private AbstractC8287r.AbstractC8288a f9539u;

    /* renamed from: v */
    private C12041a f9540v;

    /* renamed from: w */
    private C9831h<AbstractC5248b>[] f9541w;

    /* renamed from: x */
    private AbstractC8282p0 f9542x;

    public C5250c(C12041a aVar, AbstractC5248b.AbstractC5249a aVar2, AbstractC6795x xVar, AbstractC8252h hVar, AbstractC9818x xVar2, AbstractC9815v.C9816a aVar3, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar4, AbstractC6790t tVar, AbstractC6765b bVar) {
        this.f9540v = aVar;
        this.f9529k = aVar2;
        this.f9530l = xVar;
        this.f9531m = tVar;
        this.f9532n = xVar2;
        this.f9533o = aVar3;
        this.f9534p = gVar;
        this.f9535q = aVar4;
        this.f9536r = bVar;
        this.f9538t = hVar;
        this.f9537s = m29835k(aVar, xVar2);
        C9831h<AbstractC5248b>[] p = m29834p(0);
        this.f9541w = p;
        this.f9542x = hVar.mo20192a(p);
    }

    /* renamed from: e */
    private C9831h<AbstractC5248b> m29836e(AbstractC3415h hVar, long j) {
        int b = this.f9537s.m29996b(hVar.mo34411k());
        return new C9831h<>(this.f9540v.f27028f[b].f27034a, null, null, this.f9529k.mo29837a(this.f9531m, this.f9540v, b, hVar, this.f9530l), this, this.f9536r, j, this.f9532n, this.f9533o, this.f9534p, this.f9535q);
    }

    /* renamed from: k */
    private static TrackGroupArray m29835k(C12041a aVar, AbstractC9818x xVar) {
        C8302u0[] u0VarArr = new C8302u0[aVar.f27028f.length];
        int i = 0;
        while (true) {
            C12041a.C12042b[] bVarArr = aVar.f27028f;
            if (i >= bVarArr.length) {
                return new TrackGroupArray(u0VarArr);
            }
            C6722k[] kVarArr = bVarArr[i].f27043j;
            C6722k[] kVarArr2 = new C6722k[kVarArr.length];
            for (int i2 = 0; i2 < kVarArr.length; i2++) {
                C6722k kVar = kVarArr[i2];
                kVarArr2[i2] = kVar.m24530b(xVar.mo15277a(kVar));
            }
            u0VarArr[i] = new C8302u0(kVarArr2);
            i++;
        }
    }

    /* renamed from: p */
    private static C9831h<AbstractC5248b>[] m29834p(int i) {
        return new C9831h[i];
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        return this.f9542x.mo12421b();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f9542x.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        C9831h<AbstractC5248b>[] hVarArr;
        for (C9831h<AbstractC5248b> hVar : this.f9541w) {
            if (hVar.f21898k == 2) {
                return hVar.m15226d(j, wVar);
            }
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        return this.f9542x.mo12415f(j);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        return this.f9542x.mo12413g();
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        this.f9542x.mo12411h(j);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        for (C9831h<AbstractC5248b> hVar : this.f9541w) {
            hVar.m15228S(j);
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f9539u = aVar;
        aVar.mo20028j(this);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        return -9223372036854775807L;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        AbstractC3415h hVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < hVarArr.length; i++) {
            AbstractC8278o0 o0Var = o0VarArr[i];
            if (o0Var != null) {
                C9831h hVar2 = (C9831h) o0Var;
                if (hVarArr[i] == null || !zArr[i]) {
                    hVar2.m15231P();
                    o0VarArr[i] = null;
                } else {
                    ((AbstractC5248b) hVar2.m15242E()).mo29839b(hVarArr[i]);
                    arrayList.add(hVar2);
                }
            }
            if (o0VarArr[i] == null && (hVar = hVarArr[i]) != null) {
                C9831h<AbstractC5248b> e = m29836e(hVar, j);
                arrayList.add(e);
                o0VarArr[i] = e;
                zArr2[i] = true;
            }
        }
        C9831h<AbstractC5248b>[] p = m29834p(arrayList.size());
        this.f9541w = p;
        arrayList.toArray(p);
        this.f9542x = this.f9538t.mo20192a(this.f9541w);
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        this.f9531m.mo24321a();
    }

    /* renamed from: s */
    public void mo12471i(C9831h<AbstractC5248b> hVar) {
        this.f9539u.mo12471i(this);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return this.f9537s;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        for (C9831h<AbstractC5248b> hVar : this.f9541w) {
            hVar.m15225u(j, z);
        }
    }

    /* renamed from: v */
    public void m29832v() {
        for (C9831h<AbstractC5248b> hVar : this.f9541w) {
            hVar.m15231P();
        }
        this.f9539u = null;
    }

    /* renamed from: w */
    public void m29831w(C12041a aVar) {
        this.f9540v = aVar;
        for (C9831h<AbstractC5248b> hVar : this.f9541w) {
            hVar.m15242E().mo29838g(aVar);
        }
        this.f9539u.mo12471i(this);
    }
}
