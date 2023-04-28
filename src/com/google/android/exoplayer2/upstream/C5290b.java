package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p081e9.AbstractC6795x;
import p081e9.C6766c;
import p081e9.C6772g;
import p081e9.C6775i;
import p081e9.C6787r;
import p081e9.C6796y;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: com.google.android.exoplayer2.upstream.b */
/* loaded from: classes5.dex */
public final class C5290b implements DataSource {

    /* renamed from: a */
    private final Context f9767a;

    /* renamed from: b */
    private final List<AbstractC6795x> f9768b = new ArrayList();

    /* renamed from: c */
    private final DataSource f9769c;

    /* renamed from: d */
    private DataSource f9770d;

    /* renamed from: e */
    private DataSource f9771e;

    /* renamed from: f */
    private DataSource f9772f;

    /* renamed from: g */
    private DataSource f9773g;

    /* renamed from: h */
    private DataSource f9774h;

    /* renamed from: i */
    private DataSource f9775i;

    /* renamed from: j */
    private DataSource f9776j;

    /* renamed from: k */
    private DataSource f9777k;

    public C5290b(Context context, DataSource dataSource) {
        this.f9767a = context.getApplicationContext();
        this.f9769c = (DataSource) C7510a.m22367e(dataSource);
    }

    /* renamed from: o */
    private void m29612o(DataSource dataSource) {
        for (int i = 0; i < this.f9768b.size(); i++) {
            dataSource.mo12541c(this.f9768b.get(i));
        }
    }

    /* renamed from: p */
    private DataSource m29611p() {
        if (this.f9771e == null) {
            C6766c cVar = new C6766c(this.f9767a);
            this.f9771e = cVar;
            m29612o(cVar);
        }
        return this.f9771e;
    }

    /* renamed from: q */
    private DataSource m29610q() {
        if (this.f9772f == null) {
            C6772g gVar = new C6772g(this.f9767a);
            this.f9772f = gVar;
            m29612o(gVar);
        }
        return this.f9772f;
    }

    /* renamed from: r */
    private DataSource m29609r() {
        if (this.f9775i == null) {
            C6775i iVar = new C6775i();
            this.f9775i = iVar;
            m29612o(iVar);
        }
        return this.f9775i;
    }

    /* renamed from: s */
    private DataSource m29608s() {
        if (this.f9770d == null) {
            C6787r rVar = new C6787r();
            this.f9770d = rVar;
            m29612o(rVar);
        }
        return this.f9770d;
    }

    /* renamed from: t */
    private DataSource m29607t() {
        if (this.f9776j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f9767a);
            this.f9776j = rawResourceDataSource;
            m29612o(rawResourceDataSource);
        }
        return this.f9776j;
    }

    /* renamed from: u */
    private DataSource m29606u() {
        if (this.f9773g == null) {
            try {
                DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f9773g = dataSource;
                m29612o(dataSource);
            } catch (ClassNotFoundException unused) {
                C7558r.m22104h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f9773g == null) {
                this.f9773g = this.f9769c;
            }
        }
        return this.f9773g;
    }

    /* renamed from: v */
    private DataSource m29605v() {
        if (this.f9774h == null) {
            C6796y yVar = new C6796y();
            this.f9774h = yVar;
            m29612o(yVar);
        }
        return this.f9774h;
    }

    /* renamed from: w */
    private void m29604w(DataSource dataSource, AbstractC6795x xVar) {
        if (dataSource != null) {
            dataSource.mo12541c(xVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        boolean z;
        if (this.f9777k == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        String scheme = aVar.f9746a.getScheme();
        if (C7557q0.m22128r0(aVar.f9746a)) {
            String path = aVar.f9746a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f9777k = m29608s();
            } else {
                this.f9777k = m29611p();
            }
        } else if ("asset".equals(scheme)) {
            this.f9777k = m29611p();
        } else if ("content".equals(scheme)) {
            this.f9777k = m29610q();
        } else if ("rtmp".equals(scheme)) {
            this.f9777k = m29606u();
        } else if ("udp".equals(scheme)) {
            this.f9777k = m29605v();
        } else if ("data".equals(scheme)) {
            this.f9777k = m29609r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f9777k = m29607t();
        } else {
            this.f9777k = this.f9769c;
        }
        return this.f9777k.mo12542b(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f9769c.mo12541c(xVar);
        this.f9768b.add(xVar);
        m29604w(this.f9770d, xVar);
        m29604w(this.f9771e, xVar);
        m29604w(this.f9772f, xVar);
        m29604w(this.f9773g, xVar);
        m29604w(this.f9774h, xVar);
        m29604w(this.f9775i, xVar);
        m29604w(this.f9776j, xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        DataSource dataSource = this.f9777k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f9777k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        DataSource dataSource = this.f9777k;
        return dataSource == null ? Collections.emptyMap() : dataSource.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        DataSource dataSource = this.f9777k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.mo12539m();
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        return ((DataSource) C7510a.m22367e(this.f9777k)).read(bArr, i, i2);
    }
}
