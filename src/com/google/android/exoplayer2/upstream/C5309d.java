package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5320h;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import p079e7.C6728o;
import p081e9.C6789s;

/* renamed from: com.google.android.exoplayer2.upstream.d */
/* loaded from: classes5.dex */
public class C5309d implements AbstractC5318g {

    /* renamed from: a */
    private final int f9857a;

    public C5309d() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.AbstractC5318g
    /* renamed from: a */
    public long mo29489a(AbstractC5318g.C5319a aVar) {
        IOException iOException = aVar.f9872c;
        if ((iOException instanceof C6728o) || (iOException instanceof FileNotFoundException) || (iOException instanceof AbstractC5311f.C5313b) || (iOException instanceof C5320h.C0147h)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f9873d - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
    }

    @Override // com.google.android.exoplayer2.upstream.AbstractC5318g
    /* renamed from: b */
    public long mo29488b(AbstractC5318g.C5319a aVar) {
        IOException iOException = aVar.f9872c;
        if (!(iOException instanceof AbstractC5311f.C0146f)) {
            return -9223372036854775807L;
        }
        int i = ((AbstractC5311f.C0146f) iOException).f9864m;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return 60000L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.AbstractC5318g
    /* renamed from: c */
    public int mo29487c(int i) {
        int i2 = this.f9857a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // com.google.android.exoplayer2.upstream.AbstractC5318g
    /* renamed from: d */
    public /* synthetic */ void mo29486d(long j) {
        C6789s.m24322a(this, j);
    }

    public C5309d(int i) {
        this.f9857a = i;
    }
}
