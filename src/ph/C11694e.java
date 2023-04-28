package ph;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InputStream;
import java.util.ArrayList;
import ph.AbstractC11724q;

/* renamed from: ph.e */
/* loaded from: classes8.dex */
public final class C11694e {

    /* renamed from: a */
    private final byte[] f26115a;

    /* renamed from: b */
    private final boolean f26116b;

    /* renamed from: c */
    private int f26117c;

    /* renamed from: d */
    private int f26118d;

    /* renamed from: e */
    private int f26119e;

    /* renamed from: f */
    private final InputStream f26120f;

    /* renamed from: g */
    private int f26121g;

    /* renamed from: h */
    private boolean f26122h;

    /* renamed from: i */
    private int f26123i;

    /* renamed from: j */
    private int f26124j;

    /* renamed from: k */
    private int f26125k;

    /* renamed from: l */
    private int f26126l;

    /* renamed from: m */
    private int f26127m;

    private C11694e(InputStream inputStream) {
        this.f26122h = false;
        this.f26124j = ViewDefaults.NUMBER_OF_LINES;
        this.f26126l = 64;
        this.f26127m = 67108864;
        this.f26115a = new byte[4096];
        this.f26117c = 0;
        this.f26119e = 0;
        this.f26123i = 0;
        this.f26120f = inputStream;
        this.f26116b = false;
    }

    /* renamed from: B */
    public static int m9005B(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C11713k.m8800k();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C11713k.m8800k();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw C11713k.m8805f();
    }

    /* renamed from: N */
    private void m8993N() {
        int i = this.f26117c + this.f26118d;
        this.f26117c = i;
        int i2 = this.f26123i + i;
        int i3 = this.f26124j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f26118d = i4;
            this.f26117c = i - i4;
            return;
        }
        this.f26118d = 0;
    }

    /* renamed from: O */
    private void m8992O(int i) {
        if (!m8987T(i)) {
            throw C11713k.m8800k();
        }
    }

    /* renamed from: S */
    private void m8988S(int i) {
        if (i >= 0) {
            int i2 = this.f26123i;
            int i3 = this.f26119e;
            int i4 = i2 + i3 + i;
            int i5 = this.f26124j;
            if (i4 <= i5) {
                int i6 = this.f26117c;
                int i7 = i6 - i3;
                this.f26119e = i6;
                m8992O(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f26117c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f26119e = i9;
                        m8992O(1);
                    } else {
                        this.f26119e = i8;
                        return;
                    }
                }
            } else {
                m8989R((i5 - i2) - i3);
                throw C11713k.m8800k();
            }
        } else {
            throw C11713k.m8804g();
        }
    }

    /* renamed from: T */
    private boolean m8987T(int i) {
        int i2 = this.f26119e;
        int i3 = i2 + i;
        int i4 = this.f26117c;
        if (i3 > i4) {
            if (this.f26123i + i2 + i <= this.f26124j && this.f26120f != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f26115a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f26123i += i2;
                    this.f26117c -= i2;
                    this.f26119e = 0;
                }
                InputStream inputStream = this.f26120f;
                byte[] bArr2 = this.f26115a;
                int i5 = this.f26117c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f26115a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f26117c += read;
                    if ((this.f26123i + i) - this.f26127m <= 0) {
                        m8993N();
                        if (this.f26117c >= i) {
                            return true;
                        }
                        return m8987T(i);
                    }
                    throw C11713k.m8801j();
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: b */
    public static int m8985b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m8984c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: d */
    private void m8983d(int i) {
        if (this.f26117c - this.f26119e < i) {
            m8992O(i);
        }
    }

    /* renamed from: g */
    public static C11694e m8980g(InputStream inputStream) {
        return new C11694e(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C11694e m8979h(C11721p pVar) {
        C11694e eVar = new C11694e(pVar);
        try {
            eVar.m8977j(pVar.size());
            return eVar;
        } catch (C11713k e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    private byte[] m8963x(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f26123i;
            int i4 = this.f26119e;
            int i5 = i3 + i4 + i;
            int i6 = this.f26124j;
            if (i5 > i6) {
                m8989R((i6 - i3) - i4);
                throw C11713k.m8800k();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i7 = this.f26117c - i4;
                System.arraycopy(this.f26115a, i4, bArr, 0, i7);
                this.f26119e = this.f26117c;
                int i8 = i - i7;
                m8983d(i8);
                System.arraycopy(this.f26115a, 0, bArr, i7, i8);
                this.f26119e = i8;
                return bArr;
            } else {
                int i9 = this.f26117c;
                this.f26123i = i3 + i9;
                this.f26119e = 0;
                this.f26117c = 0;
                int i10 = i9 - i4;
                int i11 = i - i10;
                ArrayList<byte[]> arrayList = new ArrayList();
                while (i11 > 0) {
                    int min = Math.min(i11, 4096);
                    byte[] bArr2 = new byte[min];
                    int i12 = 0;
                    while (i12 < min) {
                        InputStream inputStream = this.f26120f;
                        if (inputStream == null) {
                            i2 = -1;
                        } else {
                            i2 = inputStream.read(bArr2, i12, min - i12);
                        }
                        if (i2 != -1) {
                            this.f26123i += i2;
                            i12 += i2;
                        } else {
                            throw C11713k.m8800k();
                        }
                    }
                    i11 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f26115a, i4, bArr3, 0, i10);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
                    i10 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C11710j.f26163a;
        } else {
            throw C11713k.m8804g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m9006A() {
        /*
            r9 = this;
            int r0 = r9.f26119e
            int r1 = r9.f26117c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f26115a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f26119e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.m9003D()
            int r0 = (int) r0
            return r0
        L_0x0082:
            r9.f26119e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C11694e.m9006A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r2[r0] < 0) goto L_0x00b8;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m9004C() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C11694e.m9004C():long");
    }

    /* renamed from: D */
    long m9003D() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte w = m8964w();
            j |= (w & Byte.MAX_VALUE) << i;
            if ((w & 128) == 0) {
                return j;
            }
        }
        throw C11713k.m8805f();
    }

    /* renamed from: E */
    public int m9002E() {
        return m8962y();
    }

    /* renamed from: F */
    public long m9001F() {
        return m8961z();
    }

    /* renamed from: G */
    public int m9000G() {
        return m8985b(m9006A());
    }

    /* renamed from: H */
    public long m8999H() {
        return m8984c(m9004C());
    }

    /* renamed from: I */
    public String m8998I() {
        int A = m9006A();
        int i = this.f26117c;
        int i2 = this.f26119e;
        if (A <= i - i2 && A > 0) {
            String str = new String(this.f26115a, i2, A, "UTF-8");
            this.f26119e += A;
            return str;
        } else if (A == 0) {
            return "";
        } else {
            return new String(m8963x(A), "UTF-8");
        }
    }

    /* renamed from: J */
    public String m8997J() {
        byte[] bArr;
        int A = m9006A();
        int i = this.f26119e;
        if (A <= this.f26117c - i && A > 0) {
            bArr = this.f26115a;
            this.f26119e = i + A;
        } else if (A == 0) {
            return "";
        } else {
            bArr = m8963x(A);
            i = 0;
        }
        if (C11746y.m8699f(bArr, i, i + A)) {
            return new String(bArr, i, A, "UTF-8");
        }
        throw C11713k.m8807d();
    }

    /* renamed from: K */
    public int m8996K() {
        if (m8981f()) {
            this.f26121g = 0;
            return 0;
        }
        int A = m9006A();
        this.f26121g = A;
        if (C11747z.m8695a(A) != 0) {
            return this.f26121g;
        }
        throw C11713k.m8808c();
    }

    /* renamed from: L */
    public int m8995L() {
        return m9006A();
    }

    /* renamed from: M */
    public long m8994M() {
        return m9004C();
    }

    /* renamed from: P */
    public boolean m8991P(int i, C11695f fVar) {
        int b = C11747z.m8694b(i);
        if (b == 0) {
            long t = m8967t();
            fVar.m8905o0(i);
            fVar.m8883z0(t);
            return true;
        } else if (b == 1) {
            long z = m8961z();
            fVar.m8905o0(i);
            fVar.m8939V(z);
            return true;
        } else if (b == 2) {
            AbstractC11691d l = m8975l();
            fVar.m8905o0(i);
            fVar.m8945P(l);
            return true;
        } else if (b == 3) {
            fVar.m8905o0(i);
            m8990Q(fVar);
            int c = C11747z.m8693c(C11747z.m8695a(i), 4);
            m8986a(c);
            fVar.m8905o0(c);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                int y = m8962y();
                fVar.m8905o0(i);
                fVar.m8940U(y);
                return true;
            }
            throw C11713k.m8806e();
        }
    }

    /* renamed from: Q */
    public void m8990Q(C11695f fVar) {
        int K;
        do {
            K = m8996K();
            if (K == 0) {
                return;
            }
        } while (m8991P(K, fVar));
    }

    /* renamed from: R */
    public void m8989R(int i) {
        int i2 = this.f26117c;
        int i3 = this.f26119e;
        if (i > i2 - i3 || i < 0) {
            m8988S(i);
        } else {
            this.f26119e = i3 + i;
        }
    }

    /* renamed from: a */
    public void m8986a(int i) {
        if (this.f26121g != i) {
            throw C11713k.m8809b();
        }
    }

    /* renamed from: e */
    public int m8982e() {
        int i = this.f26124j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f26123i + this.f26119e);
    }

    /* renamed from: f */
    public boolean m8981f() {
        return this.f26119e == this.f26117c && !m8987T(1);
    }

    /* renamed from: i */
    public void m8978i(int i) {
        this.f26124j = i;
        m8993N();
    }

    /* renamed from: j */
    public int m8977j(int i) {
        if (i >= 0) {
            int i2 = i + this.f26123i + this.f26119e;
            int i3 = this.f26124j;
            if (i2 <= i3) {
                this.f26124j = i2;
                m8993N();
                return i3;
            }
            throw C11713k.m8800k();
        }
        throw C11713k.m8804g();
    }

    /* renamed from: k */
    public boolean m8976k() {
        return m9004C() != 0;
    }

    /* renamed from: l */
    public AbstractC11691d m8975l() {
        AbstractC11691d dVar;
        int A = m9006A();
        int i = this.f26117c;
        int i2 = this.f26119e;
        if (A <= i - i2 && A > 0) {
            if (!this.f26116b || !this.f26122h) {
                dVar = AbstractC11691d.m9014g(this.f26115a, i2, A);
            } else {
                dVar = new C11688c(this.f26115a, this.f26119e, A);
            }
            this.f26119e += A;
            return dVar;
        } else if (A == 0) {
            return AbstractC11691d.f26108k;
        } else {
            return new C11721p(m8963x(A));
        }
    }

    /* renamed from: m */
    public double m8974m() {
        return Double.longBitsToDouble(m8961z());
    }

    /* renamed from: n */
    public int m8973n() {
        return m9006A();
    }

    /* renamed from: o */
    public int m8972o() {
        return m8962y();
    }

    /* renamed from: p */
    public long m8971p() {
        return m8961z();
    }

    /* renamed from: q */
    public float m8970q() {
        return Float.intBitsToFloat(m8962y());
    }

    /* renamed from: r */
    public void m8969r(int i, AbstractC11724q.AbstractC11725a aVar, C11697g gVar) {
        int i2 = this.f26125k;
        if (i2 < this.f26126l) {
            this.f26125k = i2 + 1;
            aVar.mo8777g(this, gVar);
            m8986a(C11747z.m8693c(i, 4));
            this.f26125k--;
            return;
        }
        throw C11713k.m8803h();
    }

    /* renamed from: s */
    public int m8968s() {
        return m9006A();
    }

    /* renamed from: t */
    public long m8967t() {
        return m9004C();
    }

    /* renamed from: u */
    public <T extends AbstractC11724q> T m8966u(AbstractC11727s<T> sVar, C11697g gVar) {
        int A = m9006A();
        if (this.f26125k < this.f26126l) {
            int j = m8977j(A);
            this.f26125k++;
            T d = sVar.mo8771d(this, gVar);
            m8986a(0);
            this.f26125k--;
            m8978i(j);
            return d;
        }
        throw C11713k.m8803h();
    }

    /* renamed from: v */
    public void m8965v(AbstractC11724q.AbstractC11725a aVar, C11697g gVar) {
        int A = m9006A();
        if (this.f26125k < this.f26126l) {
            int j = m8977j(A);
            this.f26125k++;
            aVar.mo8777g(this, gVar);
            m8986a(0);
            this.f26125k--;
            m8978i(j);
            return;
        }
        throw C11713k.m8803h();
    }

    /* renamed from: w */
    public byte m8964w() {
        if (this.f26119e == this.f26117c) {
            m8992O(1);
        }
        byte[] bArr = this.f26115a;
        int i = this.f26119e;
        this.f26119e = i + 1;
        return bArr[i];
    }

    /* renamed from: y */
    public int m8962y() {
        int i = this.f26119e;
        if (this.f26117c - i < 4) {
            m8992O(4);
            i = this.f26119e;
        }
        byte[] bArr = this.f26115a;
        this.f26119e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long m8961z() {
        int i = this.f26119e;
        if (this.f26117c - i < 8) {
            m8992O(8);
            i = this.f26119e;
        }
        byte[] bArr = this.f26115a;
        this.f26119e = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private C11694e(C11721p pVar) {
        this.f26122h = false;
        this.f26124j = ViewDefaults.NUMBER_OF_LINES;
        this.f26126l = 64;
        this.f26127m = 67108864;
        this.f26115a = pVar.f26175l;
        int H = pVar.mo8785H();
        this.f26119e = H;
        this.f26117c = H + pVar.size();
        this.f26123i = -this.f26119e;
        this.f26120f = null;
        this.f26116b = true;
    }
}
