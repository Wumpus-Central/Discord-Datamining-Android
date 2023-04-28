package p081e9;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.C5288a;
import java.net.URLDecoder;
import p030bc.C3452d;
import p079e7.C6728o;
import p119g9.C7557q0;

/* renamed from: e9.i */
/* loaded from: classes5.dex */
public final class C6775i extends AbstractC6771f {

    /* renamed from: e */
    private C5288a f14442e;

    /* renamed from: f */
    private byte[] f14443f;

    /* renamed from: g */
    private int f14444g;

    /* renamed from: h */
    private int f14445h;

    public C6775i() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        int i;
        m24358q(aVar);
        this.f14442e = aVar;
        this.f14445h = (int) aVar.f9752g;
        Uri uri = aVar.f9746a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] N0 = C7557q0.m22188N0(uri.getSchemeSpecificPart(), ",");
            if (N0.length == 2) {
                String str = N0[1];
                if (N0[0].contains(";base64")) {
                    try {
                        this.f14443f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C6728o("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.f14443f = C7557q0.m22140l0(URLDecoder.decode(str, C3452d.f5593a.name()));
                }
                long j = aVar.f9753h;
                if (j != -1) {
                    i = ((int) j) + this.f14445h;
                } else {
                    i = this.f14443f.length;
                }
                this.f14444g = i;
                if (i > this.f14443f.length || this.f14445h > i) {
                    this.f14443f = null;
                    throw new C6778l(0);
                }
                m24357r(aVar);
                return this.f14444g - this.f14445h;
            }
            throw new C6728o("Unexpected URI format: " + uri);
        }
        throw new C6728o("Unsupported scheme: " + scheme);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f14443f != null) {
            this.f14443f = null;
            m24359p();
        }
        this.f14442e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        C5288a aVar = this.f14442e;
        if (aVar != null) {
            return aVar.f9746a;
        }
        return null;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f14444g - this.f14445h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C7557q0.m22145j(this.f14443f), this.f14445h, bArr, i, min);
        this.f14445h += min;
        m24360o(min);
        return min;
    }
}
