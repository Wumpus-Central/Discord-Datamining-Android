package p081e9;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p119g9.C7510a;

/* renamed from: e9.w */
/* loaded from: classes5.dex */
public final class C6794w implements DataSource {

    /* renamed from: a */
    private final DataSource f14504a;

    /* renamed from: b */
    private final AbstractC6776j f14505b;

    /* renamed from: c */
    private boolean f14506c;

    /* renamed from: d */
    private long f14507d;

    public C6794w(DataSource dataSource, AbstractC6776j jVar) {
        this.f14504a = (DataSource) C7510a.m22367e(dataSource);
        this.f14505b = (AbstractC6776j) C7510a.m22367e(jVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        long b = this.f14504a.mo12542b(aVar);
        this.f14507d = b;
        if (b == 0) {
            return 0L;
        }
        if (aVar.f9753h == -1 && b != -1) {
            aVar = aVar.m29624f(0L, b);
        }
        this.f14506c = true;
        this.f14505b.mo24356b(aVar);
        return this.f14507d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f14504a.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            this.f14504a.close();
        } finally {
            if (this.f14506c) {
                this.f14506c = false;
                this.f14505b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        return this.f14504a.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14504a.mo12539m();
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (this.f14507d == 0) {
            return -1;
        }
        int read = this.f14504a.read(bArr, i, i2);
        if (read > 0) {
            this.f14505b.write(bArr, i, read);
            long j = this.f14507d;
            if (j != -1) {
                this.f14507d = j - read;
            }
        }
        return read;
    }
}
