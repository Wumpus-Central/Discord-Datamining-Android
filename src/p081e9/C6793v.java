package p081e9;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p119g9.C7510a;

/* renamed from: e9.v */
/* loaded from: classes5.dex */
public final class C6793v implements DataSource {

    /* renamed from: a */
    private final DataSource f14500a;

    /* renamed from: b */
    private long f14501b;

    /* renamed from: c */
    private Uri f14502c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f14503d = Collections.emptyMap();

    public C6793v(DataSource dataSource) {
        this.f14500a = (DataSource) C7510a.m22367e(dataSource);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        this.f14502c = aVar.f9746a;
        this.f14503d = Collections.emptyMap();
        long b = this.f14500a.mo12542b(aVar);
        this.f14502c = (Uri) C7510a.m22367e(mo12539m());
        this.f14503d = mo12540e();
        return b;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f14500a.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14500a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        return this.f14500a.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14500a.mo12539m();
    }

    /* renamed from: o */
    public long m24320o() {
        return this.f14501b;
    }

    /* renamed from: p */
    public Uri m24319p() {
        return this.f14502c;
    }

    /* renamed from: q */
    public Map<String, List<String>> m24318q() {
        return this.f14503d;
    }

    /* renamed from: r */
    public void m24317r() {
        this.f14501b = 0L;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f14500a.read(bArr, i, i2);
        if (read != -1) {
            this.f14501b += read;
        }
        return read;
    }
}
