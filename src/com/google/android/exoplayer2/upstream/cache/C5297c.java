package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5310e;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.AbstractC5293a;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p081e9.AbstractC6776j;
import p081e9.AbstractC6795x;
import p081e9.C6778l;
import p081e9.C6792u;
import p081e9.C6794w;
import p100f9.AbstractC7091c;
import p100f9.C7092d;
import p100f9.C7093e;
import p100f9.C7095g;
import p119g9.C7510a;
import p119g9.C7511a0;
import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.upstream.cache.c */
/* loaded from: classes5.dex */
public final class C5297c implements DataSource {

    /* renamed from: a */
    private final AbstractC5293a f9805a;

    /* renamed from: b */
    private final DataSource f9806b;

    /* renamed from: c */
    private final DataSource f9807c;

    /* renamed from: d */
    private final DataSource f9808d;

    /* renamed from: e */
    private final AbstractC7091c f9809e;

    /* renamed from: f */
    private final boolean f9810f;

    /* renamed from: g */
    private final boolean f9811g;

    /* renamed from: h */
    private final boolean f9812h;

    /* renamed from: i */
    private Uri f9813i;

    /* renamed from: j */
    private C5288a f9814j;

    /* renamed from: k */
    private DataSource f9815k;

    /* renamed from: l */
    private boolean f9816l;

    /* renamed from: m */
    private long f9817m;

    /* renamed from: n */
    private long f9818n;

    /* renamed from: o */
    private C7092d f9819o;

    /* renamed from: p */
    private boolean f9820p;

    /* renamed from: q */
    private boolean f9821q;

    /* renamed from: r */
    private long f9822r;

    /* renamed from: s */
    private long f9823s;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.c$a */
    /* loaded from: classes5.dex */
    public interface AbstractC5298a {
    }

    public C5297c(AbstractC5293a aVar, DataSource dataSource, DataSource dataSource2, AbstractC6776j jVar, int i, AbstractC5298a aVar2) {
        this(aVar, dataSource, dataSource2, jVar, i, aVar2, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f9.d, com.google.android.exoplayer2.upstream.DataSource] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29574o() {
        /*
            r4 = this;
            com.google.android.exoplayer2.upstream.DataSource r0 = r4.f9815k
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            r2 = 0
            r0.close()     // Catch: all -> 0x001a
            r4.f9815k = r2
            r4.f9816l = r1
            f9.d r0 = r4.f9819o
            if (r0 == 0) goto L_0x0019
            com.google.android.exoplayer2.upstream.cache.a r1 = r4.f9805a
            r1.mo29581d(r0)
            r4.f9819o = r2
        L_0x0019:
            return
        L_0x001a:
            r0 = move-exception
            r4.f9815k = r2
            r4.f9816l = r1
            f9.d r1 = r4.f9819o
            if (r1 == 0) goto L_0x002a
            com.google.android.exoplayer2.upstream.cache.a r3 = r4.f9805a
            r3.mo29581d(r1)
            r4.f9819o = r2
        L_0x002a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.C5297c.m29574o():void");
    }

    /* renamed from: p */
    private static Uri m29573p(AbstractC5293a aVar, String str, Uri uri) {
        Uri b = C7093e.m23428b(aVar.mo29583b(str));
        return b != null ? b : uri;
    }

    /* renamed from: q */
    private void m29572q(Throwable th2) {
        if (m29570s() || (th2 instanceof AbstractC5293a.C0145a)) {
            this.f9820p = true;
        }
    }

    /* renamed from: r */
    private boolean m29571r() {
        return this.f9815k == this.f9808d;
    }

    /* renamed from: s */
    private boolean m29570s() {
        return this.f9815k == this.f9806b;
    }

    /* renamed from: t */
    private boolean m29569t() {
        return !m29570s();
    }

    /* renamed from: u */
    private boolean m29568u() {
        return this.f9815k == this.f9807c;
    }

    /* renamed from: v */
    private void m29567v() {
    }

    /* renamed from: w */
    private void m29566w(int i) {
    }

    /* renamed from: x */
    private void m29565x(C5288a aVar, boolean z) {
        C7092d dVar;
        C5288a aVar2;
        DataSource dataSource;
        long j;
        boolean z2;
        Uri m;
        long j2;
        String str = (String) C7557q0.m22145j(aVar.f9754i);
        Uri uri = null;
        if (this.f9821q) {
            dVar = null;
        } else if (this.f9810f) {
            try {
                dVar = this.f9805a.mo29578g(str, this.f9817m, this.f9818n);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            dVar = this.f9805a.mo29582c(str, this.f9817m, this.f9818n);
        }
        if (dVar == null) {
            dataSource = this.f9808d;
            aVar2 = aVar.m29629a().m29616h(this.f9817m).m29617g(this.f9818n).m29623a();
        } else if (dVar.f15474n) {
            Uri fromFile = Uri.fromFile((File) C7557q0.m22145j(dVar.f15475o));
            long j3 = dVar.f15472l;
            long j4 = this.f9817m - j3;
            long j5 = dVar.f15473m - j4;
            long j6 = this.f9818n;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            aVar2 = aVar.m29629a().m29615i(fromFile).m29613k(j3).m29616h(j4).m29617g(j5).m29623a();
            dataSource = this.f9806b;
        } else {
            if (dVar.m23430c()) {
                j2 = this.f9818n;
            } else {
                j2 = dVar.f15473m;
                long j7 = this.f9818n;
                if (j7 != -1) {
                    j2 = Math.min(j2, j7);
                }
            }
            aVar2 = aVar.m29629a().m29616h(this.f9817m).m29617g(j2).m29623a();
            dataSource = this.f9807c;
            if (dataSource == null) {
                dataSource = this.f9808d;
                this.f9805a.mo29581d(dVar);
                dVar = null;
            }
        }
        if (this.f9821q || dataSource != this.f9808d) {
            j = Long.MAX_VALUE;
        } else {
            j = this.f9817m + 102400;
        }
        this.f9823s = j;
        if (z) {
            C7510a.m22366f(m29571r());
            if (dataSource != this.f9808d) {
                try {
                    m29574o();
                } catch (Throwable th2) {
                    if (((C7092d) C7557q0.m22145j(dVar)).m23431b()) {
                        this.f9805a.mo29581d(dVar);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (dVar != null && dVar.m23431b()) {
            this.f9819o = dVar;
        }
        this.f9815k = dataSource;
        if (aVar2.f9753h == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f9816l = z2;
        long b = dataSource.mo12542b(aVar2);
        C7095g gVar = new C7095g();
        if (this.f9816l && b != -1) {
            this.f9818n = b;
            C7095g.m23421g(gVar, this.f9817m + b);
        }
        if (m29569t()) {
            this.f9813i = dataSource.mo12539m();
            if (!aVar.f9746a.equals(m)) {
                uri = this.f9813i;
            }
            C7095g.m23420h(gVar, uri);
        }
        if (m29568u()) {
            this.f9805a.mo29579f(str, gVar);
        }
    }

    /* renamed from: y */
    private void m29564y(String str) {
        this.f9818n = 0L;
        if (m29568u()) {
            C7095g gVar = new C7095g();
            C7095g.m23421g(gVar, this.f9817m);
            this.f9805a.mo29579f(str, gVar);
        }
    }

    /* renamed from: z */
    private int m29563z(C5288a aVar) {
        if (this.f9811g && this.f9820p) {
            return 0;
        }
        if (!this.f9812h || aVar.f9753h != -1) {
            return -1;
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        boolean z;
        try {
            String a = this.f9809e.mo23433a(aVar);
            C5288a a2 = aVar.m29629a().m29618f(a).m29623a();
            this.f9814j = a2;
            this.f9813i = m29573p(this.f9805a, a, a2.f9746a);
            this.f9817m = aVar.f9752g;
            int z2 = m29563z(aVar);
            if (z2 != -1) {
                z = true;
            } else {
                z = false;
            }
            this.f9821q = z;
            if (z) {
                m29566w(z2);
            }
            long j = aVar.f9753h;
            if (j == -1 && !this.f9821q) {
                long a3 = C7093e.m23429a(this.f9805a.mo29583b(a));
                this.f9818n = a3;
                if (a3 != -1) {
                    long j2 = a3 - aVar.f9752g;
                    this.f9818n = j2;
                    if (j2 <= 0) {
                        throw new C6778l(0);
                    }
                }
                m29565x(a2, false);
                return this.f9818n;
            }
            this.f9818n = j;
            m29565x(a2, false);
            return this.f9818n;
        } catch (Throwable th2) {
            m29572q(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f9806b.mo12541c(xVar);
        this.f9808d.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f9814j = null;
        this.f9813i = null;
        this.f9817m = 0L;
        m29567v();
        try {
            m29574o();
        } catch (Throwable th2) {
            m29572q(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        if (m29569t()) {
            return this.f9808d.mo12540e();
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f9813i;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        C5288a aVar = (C5288a) C7510a.m22367e(this.f9814j);
        if (i2 == 0) {
            return 0;
        }
        if (this.f9818n == 0) {
            return -1;
        }
        try {
            if (this.f9817m >= this.f9823s) {
                m29565x(aVar, true);
            }
            int read = ((DataSource) C7510a.m22367e(this.f9815k)).read(bArr, i, i2);
            if (read != -1) {
                if (m29570s()) {
                    this.f9822r += read;
                }
                long j = read;
                this.f9817m += j;
                long j2 = this.f9818n;
                if (j2 != -1) {
                    this.f9818n = j2 - j;
                }
            } else if (this.f9816l) {
                m29564y((String) C7557q0.m22145j(aVar.f9754i));
            } else {
                long j3 = this.f9818n;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                m29574o();
                m29565x(aVar, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (!this.f9816l || !C6778l.m24354a(e)) {
                m29572q(e);
                throw e;
            }
            m29564y((String) C7557q0.m22145j(aVar.f9754i));
            return -1;
        } catch (Throwable th2) {
            m29572q(th2);
            throw th2;
        }
    }

    public C5297c(AbstractC5293a aVar, DataSource dataSource, DataSource dataSource2, AbstractC6776j jVar, int i, AbstractC5298a aVar2, AbstractC7091c cVar) {
        this(aVar, dataSource, dataSource2, jVar, cVar, i, null, 0, aVar2);
    }

    private C5297c(AbstractC5293a aVar, DataSource dataSource, DataSource dataSource2, AbstractC6776j jVar, AbstractC7091c cVar, int i, C7511a0 a0Var, int i2, AbstractC5298a aVar2) {
        this.f9805a = aVar;
        this.f9806b = dataSource2;
        this.f9809e = cVar == null ? AbstractC7091c.f15470a : cVar;
        boolean z = false;
        this.f9810f = (i & 1) != 0;
        this.f9811g = (i & 2) != 0;
        this.f9812h = (i & 4) != 0 ? true : z;
        C6794w wVar = null;
        if (dataSource != null) {
            dataSource = a0Var != null ? new C6792u(dataSource, a0Var, i2) : dataSource;
            this.f9808d = dataSource;
            this.f9807c = jVar != null ? new C6794w(dataSource, jVar) : wVar;
            return;
        }
        this.f9808d = C5310e.f9858a;
        this.f9807c = null;
    }
}
