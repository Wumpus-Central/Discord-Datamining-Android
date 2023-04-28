package p117g7;

import java.nio.ByteBuffer;
import p117g7.AbstractC7453h;
import p119g9.C7510a;

/* renamed from: g7.x */
/* loaded from: classes7.dex */
final class C7493x extends AbstractC7492w {

    /* renamed from: i */
    private int[] f16246i;

    /* renamed from: j */
    private int[] f16247j;

    @Override // p117g7.AbstractC7453h
    /* renamed from: f */
    public void mo22405f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C7510a.m22367e(this.f16247j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = m22406l(((limit - position) / this.f16239b.f16087d) * this.f16240c.f16087d);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f16239b.f16087d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: h */
    public AbstractC7453h.C7454a mo22404h(AbstractC7453h.C7454a aVar) {
        boolean z;
        boolean z2;
        int[] iArr = this.f16246i;
        if (iArr == null) {
            return AbstractC7453h.C7454a.f16083e;
        }
        if (aVar.f16086c == 2) {
            if (aVar.f16085b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < aVar.f16085b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new AbstractC7453h.C7455b(aVar);
                }
            }
            if (z) {
                return new AbstractC7453h.C7454a(aVar.f16084a, iArr.length, 2);
            }
            return AbstractC7453h.C7454a.f16083e;
        }
        throw new AbstractC7453h.C7455b(aVar);
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: i */
    protected void mo22403i() {
        this.f16247j = this.f16246i;
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: k */
    protected void mo22402k() {
        this.f16247j = null;
        this.f16246i = null;
    }

    /* renamed from: m */
    public void m22401m(int[] iArr) {
        this.f16246i = iArr;
    }
}
