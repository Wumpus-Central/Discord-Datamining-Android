package p117g7;

import java.nio.ByteBuffer;
import p117g7.AbstractC7453h;
import p119g9.C7557q0;

/* renamed from: g7.r0 */
/* loaded from: classes7.dex */
final class C7480r0 extends AbstractC7492w {

    /* renamed from: i */
    private int f16186i;

    /* renamed from: j */
    private int f16187j;

    /* renamed from: k */
    private boolean f16188k;

    /* renamed from: l */
    private int f16189l;

    /* renamed from: m */
    private byte[] f16190m = C7557q0.f16373f;

    /* renamed from: n */
    private int f16191n;

    /* renamed from: o */
    private long f16192o;

    @Override // p117g7.AbstractC7492w, p117g7.AbstractC7453h
    /* renamed from: c */
    public boolean mo22411c() {
        return super.mo22411c() && this.f16191n == 0;
    }

    @Override // p117g7.AbstractC7492w, p117g7.AbstractC7453h
    /* renamed from: d */
    public ByteBuffer mo22410d() {
        int i;
        if (super.mo22411c() && (i = this.f16191n) > 0) {
            m22406l(i).put(this.f16190m, 0, this.f16191n).flip();
            this.f16191n = 0;
        }
        return super.mo22410d();
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: f */
    public void mo22405f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f16189l);
            this.f16192o += min / this.f16239b.f16087d;
            this.f16189l -= min;
            byteBuffer.position(position + min);
            if (this.f16189l <= 0) {
                int i2 = i - min;
                int length = (this.f16191n + i2) - this.f16190m.length;
                ByteBuffer l = m22406l(length);
                int r = C7557q0.m22129r(length, 0, this.f16191n);
                l.put(this.f16190m, 0, r);
                int r2 = C7557q0.m22129r(length - r, 0, i2);
                byteBuffer.limit(byteBuffer.position() + r2);
                l.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - r2;
                int i4 = this.f16191n - r;
                this.f16191n = i4;
                byte[] bArr = this.f16190m;
                System.arraycopy(bArr, r, bArr, 0, i4);
                byteBuffer.get(this.f16190m, this.f16191n, i3);
                this.f16191n += i3;
                l.flip();
            }
        }
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: h */
    public AbstractC7453h.C7454a mo22404h(AbstractC7453h.C7454a aVar) {
        if (aVar.f16086c == 2) {
            this.f16188k = true;
            if (this.f16186i == 0 && this.f16187j == 0) {
                return AbstractC7453h.C7454a.f16083e;
            }
            return aVar;
        }
        throw new AbstractC7453h.C7455b(aVar);
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: i */
    protected void mo22403i() {
        if (this.f16188k) {
            this.f16188k = false;
            int i = this.f16187j;
            int i2 = this.f16239b.f16087d;
            this.f16190m = new byte[i * i2];
            this.f16189l = this.f16186i * i2;
        }
        this.f16191n = 0;
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: j */
    protected void mo22407j() {
        int i;
        if (this.f16188k) {
            if (this.f16191n > 0) {
                this.f16192o += i / this.f16239b.f16087d;
            }
            this.f16191n = 0;
        }
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: k */
    protected void mo22402k() {
        this.f16190m = C7557q0.f16373f;
    }

    /* renamed from: m */
    public long m22484m() {
        return this.f16192o;
    }

    /* renamed from: n */
    public void m22483n() {
        this.f16192o = 0L;
    }

    /* renamed from: o */
    public void m22482o(int i, int i2) {
        this.f16186i = i;
        this.f16187j = i2;
    }
}
