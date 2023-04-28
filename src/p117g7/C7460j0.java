package p117g7;

import java.nio.ByteBuffer;
import p117g7.AbstractC7453h;
import p119g9.C7557q0;

/* renamed from: g7.j0 */
/* loaded from: classes7.dex */
final class C7460j0 extends AbstractC7492w {

    /* renamed from: i */
    private static final int f16097i = Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    private static void m22587m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f16097i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: f */
    public void mo22405f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f16239b.f16086c;
        if (i2 == 536870912) {
            byteBuffer2 = m22406l((i / 3) * 4);
            while (position < limit) {
                m22587m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = m22406l(i);
            while (position < limit) {
                m22587m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: h */
    public AbstractC7453h.C7454a mo22404h(AbstractC7453h.C7454a aVar) {
        int i = aVar.f16086c;
        if (!C7557q0.m22134o0(i)) {
            throw new AbstractC7453h.C7455b(aVar);
        } else if (i != 4) {
            return new AbstractC7453h.C7454a(aVar.f16084a, aVar.f16085b, 4);
        } else {
            return AbstractC7453h.C7454a.f16083e;
        }
    }
}
