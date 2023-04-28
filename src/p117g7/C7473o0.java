package p117g7;

import java.nio.ByteBuffer;
import p117g7.AbstractC7453h;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: g7.o0 */
/* loaded from: classes7.dex */
public final class C7473o0 extends AbstractC7492w {

    /* renamed from: i */
    private final long f16129i;

    /* renamed from: j */
    private final long f16130j;

    /* renamed from: k */
    private final short f16131k;

    /* renamed from: l */
    private int f16132l;

    /* renamed from: m */
    private boolean f16133m;

    /* renamed from: n */
    private byte[] f16134n;

    /* renamed from: o */
    private byte[] f16135o;

    /* renamed from: p */
    private int f16136p;

    /* renamed from: q */
    private int f16137q;

    /* renamed from: r */
    private int f16138r;

    /* renamed from: s */
    private boolean f16139s;

    /* renamed from: t */
    private long f16140t;

    public C7473o0() {
        this(150000L, 20000L, (short) 1024);
    }

    /* renamed from: m */
    private int m22557m(long j) {
        return (int) ((j * this.f16239b.f16084a) / 1000000);
    }

    /* renamed from: n */
    private int m22556n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f16131k) {
                int i = this.f16132l;
                return ((limit / i) * i) + i;
            }
        }
    }

    /* renamed from: o */
    private int m22555o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f16131k) {
                int i = this.f16132l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private void m22553q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m22406l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f16139s = true;
        }
    }

    /* renamed from: r */
    private void m22552r(byte[] bArr, int i) {
        m22406l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f16139s = true;
        }
    }

    /* renamed from: s */
    private void m22551s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m22555o(byteBuffer);
        int position = o - byteBuffer.position();
        byte[] bArr = this.f16134n;
        int length = bArr.length;
        int i = this.f16137q;
        int i2 = length - i;
        if (o >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f16134n, this.f16137q, min);
            int i3 = this.f16137q + min;
            this.f16137q = i3;
            byte[] bArr2 = this.f16134n;
            if (i3 == bArr2.length) {
                if (this.f16139s) {
                    m22552r(bArr2, this.f16138r);
                    this.f16140t += (this.f16137q - (this.f16138r * 2)) / this.f16132l;
                } else {
                    this.f16140t += (i3 - this.f16138r) / this.f16132l;
                }
                m22547w(byteBuffer, this.f16134n, this.f16137q);
                this.f16137q = 0;
                this.f16136p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m22552r(bArr, i);
        this.f16137q = 0;
        this.f16136p = 0;
    }

    /* renamed from: t */
    private void m22550t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f16134n.length));
        int n = m22556n(byteBuffer);
        if (n == byteBuffer.position()) {
            this.f16136p = 1;
        } else {
            byteBuffer.limit(n);
            m22553q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    private void m22549u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m22555o(byteBuffer);
        byteBuffer.limit(o);
        this.f16140t += byteBuffer.remaining() / this.f16132l;
        m22547w(byteBuffer, this.f16135o, this.f16138r);
        if (o < limit) {
            m22552r(this.f16135o, this.f16138r);
            this.f16136p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: w */
    private void m22547w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f16138r);
        int i2 = this.f16138r - min;
        System.arraycopy(bArr, i - i2, this.f16135o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f16135o, i2, min);
    }

    @Override // p117g7.AbstractC7492w, p117g7.AbstractC7453h
    /* renamed from: b */
    public boolean mo22412b() {
        return this.f16133m;
    }

    @Override // p117g7.AbstractC7453h
    /* renamed from: f */
    public void mo22405f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m22413a()) {
            int i = this.f16136p;
            if (i == 0) {
                m22550t(byteBuffer);
            } else if (i == 1) {
                m22551s(byteBuffer);
            } else if (i == 2) {
                m22549u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: h */
    public AbstractC7453h.C7454a mo22404h(AbstractC7453h.C7454a aVar) {
        if (aVar.f16086c != 2) {
            throw new AbstractC7453h.C7455b(aVar);
        } else if (this.f16133m) {
            return aVar;
        } else {
            return AbstractC7453h.C7454a.f16083e;
        }
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: i */
    protected void mo22403i() {
        if (this.f16133m) {
            this.f16132l = this.f16239b.f16087d;
            int m = m22557m(this.f16129i) * this.f16132l;
            if (this.f16134n.length != m) {
                this.f16134n = new byte[m];
            }
            int m2 = m22557m(this.f16130j) * this.f16132l;
            this.f16138r = m2;
            if (this.f16135o.length != m2) {
                this.f16135o = new byte[m2];
            }
        }
        this.f16136p = 0;
        this.f16140t = 0L;
        this.f16137q = 0;
        this.f16139s = false;
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: j */
    protected void mo22407j() {
        int i = this.f16137q;
        if (i > 0) {
            m22552r(this.f16134n, i);
        }
        if (!this.f16139s) {
            this.f16140t += this.f16138r / this.f16132l;
        }
    }

    @Override // p117g7.AbstractC7492w
    /* renamed from: k */
    protected void mo22402k() {
        this.f16133m = false;
        this.f16138r = 0;
        byte[] bArr = C7557q0.f16373f;
        this.f16134n = bArr;
        this.f16135o = bArr;
    }

    /* renamed from: p */
    public long m22554p() {
        return this.f16140t;
    }

    /* renamed from: v */
    public void m22548v(boolean z) {
        this.f16133m = z;
    }

    public C7473o0(long j, long j2, short s) {
        C7510a.m22371a(j2 <= j);
        this.f16129i = j;
        this.f16130j = j2;
        this.f16131k = s;
        byte[] bArr = C7557q0.f16373f;
        this.f16134n = bArr;
        this.f16135o = bArr;
    }
}
