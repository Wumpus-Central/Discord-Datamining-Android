package p187k1;

import java.nio.ByteBuffer;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C9716a extends C9718c {
    /* renamed from: f */
    public C9716a m15533f(int i, ByteBuffer byteBuffer) {
        m15532g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m15532g(int i, ByteBuffer byteBuffer) {
        m15515c(i, byteBuffer);
    }

    /* renamed from: h */
    public int m15531h(int i) {
        int b = m15516b(16);
        if (b != 0) {
            return this.f21601b.getInt(m15514d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m15530i() {
        int b = m15516b(16);
        if (b != 0) {
            return m15513e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m15529j() {
        int b = m15516b(6);
        return (b == 0 || this.f21601b.get(b + this.f21600a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m15528k() {
        int b = m15516b(14);
        if (b != 0) {
            return this.f21601b.getShort(b + this.f21600a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m15527l() {
        int b = m15516b(4);
        if (b != 0) {
            return this.f21601b.getInt(b + this.f21600a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m15526m() {
        int b = m15516b(8);
        if (b != 0) {
            return this.f21601b.getShort(b + this.f21600a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m15525n() {
        int b = m15516b(12);
        if (b != 0) {
            return this.f21601b.getShort(b + this.f21600a);
        }
        return (short) 0;
    }
}
