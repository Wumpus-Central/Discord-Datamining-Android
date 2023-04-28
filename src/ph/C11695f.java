package ph;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: ph.f */
/* loaded from: classes8.dex */
public final class C11695f {

    /* renamed from: a */
    private final byte[] f26128a;

    /* renamed from: b */
    private final int f26129b;

    /* renamed from: e */
    private final OutputStream f26132e;

    /* renamed from: d */
    private int f26131d = 0;

    /* renamed from: c */
    private int f26130c = 0;

    /* renamed from: ph.f$a */
    /* loaded from: classes8.dex */
    public static class C11696a extends IOException {
        C11696a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C11695f(OutputStream outputStream, byte[] bArr) {
        this.f26132e = outputStream;
        this.f26128a = bArr;
        this.f26129b = bArr.length;
    }

    /* renamed from: A */
    public static int m8960A(int i, long j) {
        return m8957D(i) + m8959B(j);
    }

    /* renamed from: B */
    public static int m8959B(long j) {
        return m8890w(m8953H(j));
    }

    /* renamed from: C */
    public static int m8958C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m8892v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: D */
    public static int m8957D(int i) {
        return m8892v(C11747z.m8693c(i, 0));
    }

    /* renamed from: E */
    public static int m8956E(int i) {
        return m8892v(i);
    }

    /* renamed from: F */
    public static int m8955F(long j) {
        return m8890w(j);
    }

    /* renamed from: G */
    public static int m8954G(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: H */
    public static long m8953H(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: J */
    public static C11695f m8951J(OutputStream outputStream, int i) {
        return new C11695f(outputStream, new byte[i]);
    }

    /* renamed from: K */
    private void m8950K() {
        OutputStream outputStream = this.f26132e;
        if (outputStream != null) {
            outputStream.write(this.f26128a, 0, this.f26130c);
            this.f26130c = 0;
            return;
        }
        throw new C11696a();
    }

    /* renamed from: a */
    public static int m8934a(int i, boolean z) {
        return m8957D(i) + m8932b(z);
    }

    /* renamed from: b */
    public static int m8932b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m8930c(byte[] bArr) {
        return m8892v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m8928d(int i, AbstractC11691d dVar) {
        return m8957D(i) + m8926e(dVar);
    }

    /* renamed from: e */
    public static int m8926e(AbstractC11691d dVar) {
        return m8892v(dVar.size()) + dVar.size();
    }

    /* renamed from: f */
    public static int m8924f(int i, double d) {
        return m8957D(i) + m8922g(d);
    }

    /* renamed from: g */
    public static int m8922g(double d) {
        return 8;
    }

    /* renamed from: h */
    public static int m8920h(int i, int i2) {
        return m8957D(i) + m8918i(i2);
    }

    /* renamed from: i */
    public static int m8918i(int i) {
        return m8904p(i);
    }

    /* renamed from: j */
    public static int m8916j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m8914k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m8912l(int i, float f) {
        return m8957D(i) + m8910m(f);
    }

    /* renamed from: m */
    public static int m8910m(float f) {
        return 4;
    }

    /* renamed from: n */
    public static int m8908n(AbstractC11724q qVar) {
        return qVar.mo8781c();
    }

    /* renamed from: o */
    public static int m8906o(int i, int i2) {
        return m8957D(i) + m8904p(i2);
    }

    /* renamed from: p */
    public static int m8904p(int i) {
        if (i >= 0) {
            return m8892v(i);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m8902q(long j) {
        return m8890w(j);
    }

    /* renamed from: r */
    public static int m8900r(C11718m mVar) {
        int b = mVar.m8796b();
        return m8892v(b) + b;
    }

    /* renamed from: s */
    public static int m8898s(int i, AbstractC11724q qVar) {
        return m8957D(i) + m8896t(qVar);
    }

    /* renamed from: t */
    public static int m8896t(AbstractC11724q qVar) {
        int c = qVar.mo8781c();
        return m8892v(c) + c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m8894u(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: v */
    public static int m8892v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m8890w(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m8888x(int i) {
        return 4;
    }

    /* renamed from: y */
    public static int m8886y(long j) {
        return 8;
    }

    /* renamed from: z */
    public static int m8884z(int i) {
        return m8892v(m8954G(i));
    }

    /* renamed from: I */
    public void m8952I() {
        if (this.f26132e != null) {
            m8950K();
        }
    }

    /* renamed from: L */
    public void m8949L(int i, boolean z) {
        m8889w0(i, 0);
        m8948M(z);
    }

    /* renamed from: M */
    public void m8948M(boolean z) {
        m8919h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void m8947N(byte[] bArr) {
        m8905o0(bArr.length);
        m8913k0(bArr);
    }

    /* renamed from: O */
    public void m8946O(int i, AbstractC11691d dVar) {
        m8889w0(i, 2);
        m8945P(dVar);
    }

    /* renamed from: P */
    public void m8945P(AbstractC11691d dVar) {
        m8905o0(dVar.size());
        m8917i0(dVar);
    }

    /* renamed from: Q */
    public void m8944Q(int i, double d) {
        m8889w0(i, 1);
        m8943R(d);
    }

    /* renamed from: R */
    public void m8943R(double d) {
        m8907n0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: S */
    public void m8942S(int i, int i2) {
        m8889w0(i, 0);
        m8941T(i2);
    }

    /* renamed from: T */
    public void m8941T(int i) {
        m8931b0(i);
    }

    /* renamed from: U */
    public void m8940U(int i) {
        m8909m0(i);
    }

    /* renamed from: V */
    public void m8939V(long j) {
        m8907n0(j);
    }

    /* renamed from: W */
    public void m8938W(int i, float f) {
        m8889w0(i, 5);
        m8937X(f);
    }

    /* renamed from: X */
    public void m8937X(float f) {
        m8909m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: Y */
    public void m8936Y(int i, AbstractC11724q qVar) {
        m8889w0(i, 3);
        m8935Z(qVar);
        m8889w0(i, 4);
    }

    /* renamed from: Z */
    public void m8935Z(AbstractC11724q qVar) {
        qVar.mo8780d(this);
    }

    /* renamed from: a0 */
    public void m8933a0(int i, int i2) {
        m8889w0(i, 0);
        m8931b0(i2);
    }

    /* renamed from: b0 */
    public void m8931b0(int i) {
        if (i >= 0) {
            m8905o0(i);
        } else {
            m8903p0(i);
        }
    }

    /* renamed from: c0 */
    public void m8929c0(long j) {
        m8903p0(j);
    }

    /* renamed from: d0 */
    public void m8927d0(int i, AbstractC11724q qVar) {
        m8889w0(i, 2);
        m8925e0(qVar);
    }

    /* renamed from: e0 */
    public void m8925e0(AbstractC11724q qVar) {
        m8905o0(qVar.mo8781c());
        qVar.mo8780d(this);
    }

    /* renamed from: f0 */
    public void m8923f0(int i, AbstractC11724q qVar) {
        m8889w0(1, 3);
        m8887x0(2, i);
        m8927d0(3, qVar);
        m8889w0(1, 4);
    }

    /* renamed from: g0 */
    public void m8921g0(byte b) {
        if (this.f26130c == this.f26129b) {
            m8950K();
        }
        byte[] bArr = this.f26128a;
        int i = this.f26130c;
        this.f26130c = i + 1;
        bArr[i] = b;
        this.f26131d++;
    }

    /* renamed from: h0 */
    public void m8919h0(int i) {
        m8921g0((byte) i);
    }

    /* renamed from: i0 */
    public void m8917i0(AbstractC11691d dVar) {
        m8915j0(dVar, 0, dVar.size());
    }

    /* renamed from: j0 */
    public void m8915j0(AbstractC11691d dVar, int i, int i2) {
        int i3 = this.f26129b;
        int i4 = this.f26130c;
        if (i3 - i4 >= i2) {
            dVar.m9012j(this.f26128a, i, i4, i2);
            this.f26130c += i2;
            this.f26131d += i2;
            return;
        }
        int i5 = i3 - i4;
        dVar.m9012j(this.f26128a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f26130c = this.f26129b;
        this.f26131d += i5;
        m8950K();
        if (i7 <= this.f26129b) {
            dVar.m9012j(this.f26128a, i6, 0, i7);
            this.f26130c = i7;
        } else {
            dVar.m9019D(this.f26132e, i6, i7);
        }
        this.f26131d += i7;
    }

    /* renamed from: k0 */
    public void m8913k0(byte[] bArr) {
        m8911l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void m8911l0(byte[] bArr, int i, int i2) {
        int i3 = this.f26129b;
        int i4 = this.f26130c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f26128a, i4, i2);
            this.f26130c += i2;
            this.f26131d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f26128a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f26130c = this.f26129b;
        this.f26131d += i5;
        m8950K();
        if (i7 <= this.f26129b) {
            System.arraycopy(bArr, i6, this.f26128a, 0, i7);
            this.f26130c = i7;
        } else {
            this.f26132e.write(bArr, i6, i7);
        }
        this.f26131d += i7;
    }

    /* renamed from: m0 */
    public void m8909m0(int i) {
        m8919h0(i & 255);
        m8919h0((i >> 8) & 255);
        m8919h0((i >> 16) & 255);
        m8919h0((i >> 24) & 255);
    }

    /* renamed from: n0 */
    public void m8907n0(long j) {
        m8919h0(((int) j) & 255);
        m8919h0(((int) (j >> 8)) & 255);
        m8919h0(((int) (j >> 16)) & 255);
        m8919h0(((int) (j >> 24)) & 255);
        m8919h0(((int) (j >> 32)) & 255);
        m8919h0(((int) (j >> 40)) & 255);
        m8919h0(((int) (j >> 48)) & 255);
        m8919h0(((int) (j >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void m8905o0(int i) {
        while ((i & (-128)) != 0) {
            m8919h0((i & 127) | 128);
            i >>>= 7;
        }
        m8919h0(i);
    }

    /* renamed from: p0 */
    public void m8903p0(long j) {
        while (((-128) & j) != 0) {
            m8919h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m8919h0((int) j);
    }

    /* renamed from: q0 */
    public void m8901q0(int i) {
        m8909m0(i);
    }

    /* renamed from: r0 */
    public void m8899r0(long j) {
        m8907n0(j);
    }

    /* renamed from: s0 */
    public void m8897s0(int i) {
        m8905o0(m8954G(i));
    }

    /* renamed from: t0 */
    public void m8895t0(int i, long j) {
        m8889w0(i, 0);
        m8893u0(j);
    }

    /* renamed from: u0 */
    public void m8893u0(long j) {
        m8903p0(m8953H(j));
    }

    /* renamed from: v0 */
    public void m8891v0(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m8905o0(bytes.length);
        m8913k0(bytes);
    }

    /* renamed from: w0 */
    public void m8889w0(int i, int i2) {
        m8905o0(C11747z.m8693c(i, i2));
    }

    /* renamed from: x0 */
    public void m8887x0(int i, int i2) {
        m8889w0(i, 0);
        m8885y0(i2);
    }

    /* renamed from: y0 */
    public void m8885y0(int i) {
        m8905o0(i);
    }

    /* renamed from: z0 */
    public void m8883z0(long j) {
        m8903p0(j);
    }
}
