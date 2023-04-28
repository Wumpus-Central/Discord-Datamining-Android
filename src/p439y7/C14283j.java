package p439y7;

import java.nio.ByteBuffer;
import p079e7.C6722k;
import p117g7.C7466l0;
import p119g9.C7510a;
import p119g9.C7558r;
import p152i7.C8223h;

/* renamed from: y7.j */
/* loaded from: classes7.dex */
final class C14283j {

    /* renamed from: a */
    private long f32298a;

    /* renamed from: b */
    private long f32299b;

    /* renamed from: c */
    private boolean f32300c;

    /* renamed from: a */
    private long m1145a(C6722k kVar) {
        return (this.f32298a * 1000000) / kVar.f37970J;
    }

    /* renamed from: b */
    public void m1144b() {
        this.f32298a = 0L;
        this.f32299b = 0L;
        this.f32300c = false;
    }

    /* renamed from: c */
    public long m1143c(C6722k kVar, C8223h hVar) {
        if (this.f32300c) {
            return hVar.f17800o;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C7510a.m22367e(hVar.f17798m);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m = C7466l0.m22564m(i);
        if (m == -1) {
            this.f32300c = true;
            C7558r.m22104h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return hVar.f17800o;
        } else if (this.f32298a == 0) {
            long j = hVar.f17800o;
            this.f32299b = j;
            this.f32298a = m - 529;
            return j;
        } else {
            long a = m1145a(kVar);
            this.f32298a += m;
            return this.f32299b + a;
        }
    }
}
