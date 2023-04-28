package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.List;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p079e7.C6736w;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p153i8.C8232b;
import p194k8.AbstractC9823b;
import p194k8.AbstractC9827e;
import p194k8.AbstractC9828f;
import p194k8.AbstractC9838m;
import p194k8.AbstractC9839n;
import p194k8.C9825d;
import p194k8.C9830g;
import p194k8.C9835j;
import p297q8.C12041a;
import p348t7.C12985g;
import p348t7.C12998o;
import p348t7.C12999p;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* loaded from: classes7.dex */
public class C5246a implements AbstractC5248b {

    /* renamed from: a */
    private final AbstractC6790t f9518a;

    /* renamed from: b */
    private final int f9519b;

    /* renamed from: c */
    private final AbstractC9828f[] f9520c;

    /* renamed from: d */
    private final DataSource f9521d;

    /* renamed from: e */
    private AbstractC3415h f9522e;

    /* renamed from: f */
    private C12041a f9523f;

    /* renamed from: g */
    private int f9524g;

    /* renamed from: h */
    private IOException f9525h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* loaded from: classes7.dex */
    public static final class C0142a implements AbstractC5248b.AbstractC5249a {

        /* renamed from: a */
        private final DataSource.Factory f9526a;

        public C0142a(DataSource.Factory factory) {
            this.f9526a = factory;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b.AbstractC5249a
        /* renamed from: a */
        public AbstractC5248b mo29837a(AbstractC6790t tVar, C12041a aVar, int i, AbstractC3415h hVar, AbstractC6795x xVar) {
            DataSource createDataSource = this.f9526a.createDataSource();
            if (xVar != null) {
                createDataSource.mo12541c(xVar);
            }
            return new C5246a(tVar, aVar, i, hVar, createDataSource);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    /* loaded from: classes7.dex */
    private static final class C5247b extends AbstractC9823b {

        /* renamed from: e */
        private final C12041a.C12042b f9527e;

        /* renamed from: f */
        private final int f9528f;

        public C5247b(C12041a.C12042b bVar, int i, int i2) {
            super(i2, bVar.f27044k - 1);
            this.f9527e = bVar;
            this.f9528f = i;
        }
    }

    public C5246a(AbstractC6790t tVar, C12041a aVar, int i, AbstractC3415h hVar, DataSource dataSource) {
        C12999p[] pVarArr;
        int i2;
        this.f9518a = tVar;
        this.f9523f = aVar;
        this.f9519b = i;
        this.f9522e = hVar;
        this.f9521d = dataSource;
        C12041a.C12042b bVar = aVar.f27028f[i];
        this.f9520c = new AbstractC9828f[hVar.length()];
        for (int i3 = 0; i3 < this.f9520c.length; i3++) {
            int d = hVar.mo34413d(i3);
            C6722k kVar = bVar.f27043j[d];
            if (kVar.f14332y != null) {
                pVarArr = ((C12041a.C0383a) C7510a.m22367e(aVar.f27027e)).f27033c;
            } else {
                pVarArr = null;
            }
            int i4 = bVar.f27034a;
            if (i4 == 2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            this.f9520c[i3] = new C9825d(new C12985g(3, null, new C12998o(d, i4, bVar.f27036c, -9223372036854775807L, aVar.f27029g, kVar, 0, pVarArr, i2, null, null)), bVar.f27034a, kVar);
        }
    }

    /* renamed from: k */
    private static AbstractC9838m m29841k(C6722k kVar, DataSource dataSource, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, AbstractC9828f fVar) {
        return new C9835j(dataSource, new C5288a(uri), kVar, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, fVar);
    }

    /* renamed from: l */
    private long m29840l(long j) {
        C12041a aVar = this.f9523f;
        if (!aVar.f27026d) {
            return -9223372036854775807L;
        }
        C12041a.C12042b bVar = aVar.f27028f[this.f9519b];
        int i = bVar.f27044k - 1;
        return (bVar.m7922e(i) + bVar.m7924c(i)) - j;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: a */
    public void mo15216a() {
        IOException iOException = this.f9525h;
        if (iOException == null) {
            this.f9518a.mo24321a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b
    /* renamed from: b */
    public void mo29839b(AbstractC3415h hVar) {
        this.f9522e = hVar;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: c */
    public boolean mo15215c(AbstractC9827e eVar, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            AbstractC3415h hVar = this.f9522e;
            if (hVar.mo34435b(hVar.mo34410l(eVar.f21890d), j)) {
                return true;
            }
        }
        return false;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: d */
    public long mo15214d(long j, C6736w wVar) {
        long j2;
        C12041a.C12042b bVar = this.f9523f.f27028f[this.f9519b];
        int d = bVar.m7923d(j);
        long e = bVar.m7922e(d);
        if (e >= j || d >= bVar.f27044k - 1) {
            j2 = e;
        } else {
            j2 = bVar.m7922e(d + 1);
        }
        return wVar.m24422a(j, e, j2);
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: e */
    public boolean mo15213e(long j, AbstractC9827e eVar, List<? extends AbstractC9838m> list) {
        if (this.f9525h != null) {
            return false;
        }
        return this.f9522e.mo34432j(j, eVar, list);
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: f */
    public void mo15212f(AbstractC9827e eVar) {
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.AbstractC5248b
    /* renamed from: g */
    public void mo29838g(C12041a aVar) {
        C12041a.C12042b[] bVarArr = this.f9523f.f27028f;
        int i = this.f9519b;
        C12041a.C12042b bVar = bVarArr[i];
        int i2 = bVar.f27044k;
        C12041a.C12042b bVar2 = aVar.f27028f[i];
        if (i2 == 0 || bVar2.f27044k == 0) {
            this.f9524g += i2;
        } else {
            int i3 = i2 - 1;
            long e = bVar.m7922e(i3) + bVar.m7924c(i3);
            long e2 = bVar2.m7922e(0);
            if (e <= e2) {
                this.f9524g += i2;
            } else {
                this.f9524g += bVar.m7923d(e2);
            }
        }
        this.f9523f = aVar;
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: h */
    public final void mo15211h(long j, long j2, List<? extends AbstractC9838m> list, C9830g gVar) {
        int i;
        long j3 = j2;
        if (this.f9525h == null) {
            C12041a aVar = this.f9523f;
            C12041a.C12042b bVar = aVar.f27028f[this.f9519b];
            if (bVar.f27044k == 0) {
                gVar.f21897b = !aVar.f27026d;
                return;
            }
            if (list.isEmpty()) {
                i = bVar.m7923d(j3);
            } else {
                i = (int) (((AbstractC9838m) list.get(list.size() - 1)).mo15205g() - this.f9524g);
                if (i < 0) {
                    this.f9525h = new C8232b();
                    return;
                }
            }
            if (i >= bVar.f27044k) {
                gVar.f21897b = !this.f9523f.f27026d;
                return;
            }
            long j4 = j3 - j;
            long l = m29840l(j);
            int length = this.f9522e.length();
            AbstractC9839n[] nVarArr = new AbstractC9839n[length];
            for (int i2 = 0; i2 < length; i2++) {
                nVarArr[i2] = new C5247b(bVar, this.f9522e.mo34413d(i2), i);
            }
            this.f9522e.mo12502e(j, j4, l, list, nVarArr);
            long e = bVar.m7922e(i);
            long c = e + bVar.m7924c(i);
            if (!list.isEmpty()) {
                j3 = -9223372036854775807L;
            }
            int i3 = i + this.f9524g;
            int a = this.f9522e.mo12503a();
            AbstractC9828f fVar = this.f9520c[a];
            gVar.f21896a = m29841k(this.f9522e.mo34428p(), this.f9521d, bVar.m7926a(this.f9522e.mo34413d(a), i), i3, e, c, j3, this.f9522e.mo12500q(), this.f9522e.mo12501g(), fVar);
        }
    }

    @Override // p194k8.AbstractC9834i
    /* renamed from: j */
    public int mo15210j(long j, List<? extends AbstractC9838m> list) {
        if (this.f9525h != null || this.f9522e.length() < 2) {
            return list.size();
        }
        return this.f9522e.mo34430n(j, list);
    }

    @Override // p194k8.AbstractC9834i
    public void release() {
        for (AbstractC9828f fVar : this.f9520c) {
            fVar.release();
        }
    }
}
