package p187k1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: k1.b */
/* loaded from: classes.dex */
public final class C9717b extends C9718c {
    /* renamed from: h */
    public static C9717b m15522h(ByteBuffer byteBuffer) {
        return m15521i(byteBuffer, new C9717b());
    }

    /* renamed from: i */
    public static C9717b m15521i(ByteBuffer byteBuffer, C9717b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.m15524f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C9717b m15524f(int i, ByteBuffer byteBuffer) {
        m15523g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m15523g(int i, ByteBuffer byteBuffer) {
        m15515c(i, byteBuffer);
    }

    /* renamed from: j */
    public C9716a m15520j(C9716a aVar, int i) {
        int b = m15516b(6);
        if (b != 0) {
            return aVar.m15533f(m15517a(m15514d(b) + (i * 4)), this.f21601b);
        }
        return null;
    }

    /* renamed from: k */
    public int m15519k() {
        int b = m15516b(6);
        if (b != 0) {
            return m15513e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m15518l() {
        int b = m15516b(4);
        if (b != 0) {
            return this.f21601b.getInt(b + this.f21600a);
        }
        return 0;
    }
}
