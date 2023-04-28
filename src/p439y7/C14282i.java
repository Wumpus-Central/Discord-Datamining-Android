package p439y7;

import java.nio.ByteBuffer;
import p119g9.C7510a;
import p152i7.C8223h;

/* renamed from: y7.i */
/* loaded from: classes7.dex */
final class C14282i extends C8223h {

    /* renamed from: s */
    private long f32295s;

    /* renamed from: t */
    private int f32296t;

    /* renamed from: u */
    private int f32297u = 32;

    public C14282i() {
        super(2);
    }

    /* renamed from: v */
    private boolean m1149v(C8223h hVar) {
        ByteBuffer byteBuffer;
        if (!m1153B()) {
            return true;
        }
        if (this.f32296t >= this.f32297u || hVar.m20300j() != m20300j()) {
            return false;
        }
        ByteBuffer byteBuffer2 = hVar.f17798m;
        if (byteBuffer2 == null || (byteBuffer = this.f17798m) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1153B() {
        return this.f32296t > 0;
    }

    /* renamed from: C */
    public void m1152C(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f32297u = i;
    }

    @Override // p152i7.C8223h, p152i7.AbstractC8215a
    /* renamed from: f */
    public void mo1151f() {
        super.mo1151f();
        this.f32296t = 0;
    }

    /* renamed from: u */
    public boolean m1150u(C8223h hVar) {
        C7510a.m22371a(!hVar.m20283q());
        C7510a.m22371a(!hVar.m20301i());
        C7510a.m22371a(!hVar.m20299k());
        if (!m1149v(hVar)) {
            return false;
        }
        int i = this.f32296t;
        this.f32296t = i + 1;
        if (i == 0) {
            this.f17800o = hVar.f17800o;
            if (hVar.m20298l()) {
                m20297m(1);
            }
        }
        if (hVar.m20300j()) {
            m20297m(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = hVar.f17798m;
        if (byteBuffer != null) {
            m20285o(byteBuffer.remaining());
            this.f17798m.put(byteBuffer);
        }
        this.f32295s = hVar.f17800o;
        return true;
    }

    /* renamed from: x */
    public long m1148x() {
        return this.f17800o;
    }

    /* renamed from: y */
    public long m1147y() {
        return this.f32295s;
    }

    /* renamed from: z */
    public int m1146z() {
        return this.f32296t;
    }
}
