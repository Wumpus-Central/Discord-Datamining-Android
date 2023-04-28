package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5310e;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Map;
import p081e9.AbstractC6795x;
import p081e9.C6777k;

/* renamed from: com.google.android.exoplayer2.upstream.e */
/* loaded from: classes5.dex */
public final class C5310e implements DataSource {

    /* renamed from: a */
    public static final C5310e f9858a = new C5310e();

    /* renamed from: b */
    public static final DataSource.Factory f9859b = new DataSource.Factory() { // from class: e9.q
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return C5310e.m29493o();
        }
    };

    private C5310e() {
    }

    /* renamed from: o */
    public static /* synthetic */ C5310e m29493o() {
        return new C5310e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo12541c(AbstractC6795x xVar) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public /* synthetic */ Map mo12540e() {
        return C6777k.m24355a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return null;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
