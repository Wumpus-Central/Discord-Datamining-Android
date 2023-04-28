package p081e9;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7511a0;

/* renamed from: e9.u */
/* loaded from: classes5.dex */
public final class C6792u implements DataSource {

    /* renamed from: a */
    private final DataSource f14497a;

    /* renamed from: b */
    private final C7511a0 f14498b;

    /* renamed from: c */
    private final int f14499c;

    public C6792u(DataSource dataSource, C7511a0 a0Var, int i) {
        this.f14497a = (DataSource) C7510a.m22367e(dataSource);
        this.f14498b = (C7511a0) C7510a.m22367e(a0Var);
        this.f14499c = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        this.f14498b.m22361b(this.f14499c);
        return this.f14497a.mo12542b(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f14497a.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14497a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        return this.f14497a.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14497a.mo12539m();
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        this.f14498b.m22361b(this.f14499c);
        return this.f14497a.read(bArr, i, i2);
    }
}
