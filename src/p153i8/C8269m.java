package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p119g9.C7570y;

/* renamed from: i8.m */
/* loaded from: classes7.dex */
final class C8269m implements DataSource {

    /* renamed from: a */
    private final DataSource f17963a;

    /* renamed from: b */
    private final int f17964b;

    /* renamed from: c */
    private final AbstractC8270a f17965c;

    /* renamed from: d */
    private final byte[] f17966d;

    /* renamed from: e */
    private int f17967e;

    /* renamed from: i8.m$a */
    /* loaded from: classes7.dex */
    public interface AbstractC8270a {
        /* renamed from: b */
        void mo20128b(C7570y yVar);
    }

    public C8269m(DataSource dataSource, int i, AbstractC8270a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f17963a = dataSource;
        this.f17964b = i;
        this.f17965c = aVar;
        this.f17966d = new byte[1];
        this.f17967e = i;
    }

    /* renamed from: o */
    private boolean m20129o() {
        if (this.f17963a.read(this.f17966d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f17966d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f17963a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f17965c.mo20128b(new C7570y(bArr, i));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        this.f17963a.mo12541c(xVar);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        return this.f17963a.mo12540e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f17963a.mo12539m();
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (this.f17967e == 0) {
            if (!m20129o()) {
                return -1;
            }
            this.f17967e = this.f17964b;
        }
        int read = this.f17963a.read(bArr, i, Math.min(this.f17967e, i2));
        if (read != -1) {
            this.f17967e -= read;
        }
        return read;
    }
}
