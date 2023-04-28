package p153i8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6774h;
import p081e9.C6764a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p152i7.C8216b;
import p152i7.C8223h;
import p153i8.C8274n0;
import p228m7.AbstractC10500b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.m0 */
/* loaded from: classes7.dex */
public class C8271m0 {

    /* renamed from: a */
    private final AbstractC6765b f17968a;

    /* renamed from: b */
    private final int f17969b;

    /* renamed from: c */
    private final C7570y f17970c = new C7570y(32);

    /* renamed from: d */
    private C8272a f17971d;

    /* renamed from: e */
    private C8272a f17972e;

    /* renamed from: f */
    private C8272a f17973f;

    /* renamed from: g */
    private long f17974g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.m0$a */
    /* loaded from: classes7.dex */
    public static final class C8272a {

        /* renamed from: a */
        public final long f17975a;

        /* renamed from: b */
        public final long f17976b;

        /* renamed from: c */
        public boolean f17977c;

        /* renamed from: d */
        public C6764a f17978d;

        /* renamed from: e */
        public C8272a f17979e;

        public C8272a(long j, int i) {
            this.f17975a = j;
            this.f17976b = j + i;
        }

        /* renamed from: a */
        public C8272a m20111a() {
            this.f17978d = null;
            C8272a aVar = this.f17979e;
            this.f17979e = null;
            return aVar;
        }

        /* renamed from: b */
        public void m20110b(C6764a aVar, C8272a aVar2) {
            this.f17978d = aVar;
            this.f17979e = aVar2;
            this.f17977c = true;
        }

        /* renamed from: c */
        public int m20109c(long j) {
            return ((int) (j - this.f17975a)) + this.f17978d.f14418b;
        }
    }

    public C8271m0(AbstractC6765b bVar) {
        this.f17968a = bVar;
        int e = bVar.mo24347e();
        this.f17969b = e;
        C8272a aVar = new C8272a(0L, e);
        this.f17971d = aVar;
        this.f17972e = aVar;
        this.f17973f = aVar;
    }

    /* renamed from: a */
    private void m20127a(C8272a aVar) {
        if (aVar.f17977c) {
            C8272a aVar2 = this.f17973f;
            int i = (aVar2.f17977c ? 1 : 0) + (((int) (aVar2.f17975a - aVar.f17975a)) / this.f17969b);
            C6764a[] aVarArr = new C6764a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f17978d;
                aVar = aVar.m20111a();
            }
            this.f17968a.mo24349c(aVarArr);
        }
    }

    /* renamed from: d */
    private static C8272a m20124d(C8272a aVar, long j) {
        while (j >= aVar.f17976b) {
            aVar = aVar.f17979e;
        }
        return aVar;
    }

    /* renamed from: f */
    private void m20122f(int i) {
        long j = this.f17974g + i;
        this.f17974g = j;
        C8272a aVar = this.f17973f;
        if (j == aVar.f17976b) {
            this.f17973f = aVar.f17979e;
        }
    }

    /* renamed from: g */
    private int m20121g(int i) {
        C8272a aVar = this.f17973f;
        if (!aVar.f17977c) {
            aVar.m20110b(this.f17968a.mo24350b(), new C8272a(this.f17973f.f17976b, this.f17969b));
        }
        return Math.min(i, (int) (this.f17973f.f17976b - this.f17974g));
    }

    /* renamed from: h */
    private static C8272a m20120h(C8272a aVar, long j, ByteBuffer byteBuffer, int i) {
        C8272a d = m20124d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.f17976b - j));
            byteBuffer.put(d.f17978d.f14417a, d.m20109c(j), min);
            i -= min;
            j += min;
            if (j == d.f17976b) {
                d = d.f17979e;
            }
        }
        return d;
    }

    /* renamed from: i */
    private static C8272a m20119i(C8272a aVar, long j, byte[] bArr, int i) {
        C8272a d = m20124d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.f17976b - j));
            System.arraycopy(d.f17978d.f14417a, d.m20109c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == d.f17976b) {
                d = d.f17979e;
            }
        }
        return d;
    }

    /* renamed from: j */
    private static C8272a m20118j(C8272a aVar, C8223h hVar, C8274n0.C8275a aVar2, C7570y yVar) {
        boolean z;
        long j = aVar2.f18015b;
        int i = 1;
        yVar.m22021L(1);
        C8272a i2 = m20119i(aVar, j, yVar.m22012d(), 1);
        long j2 = j + 1;
        byte b = yVar.m22012d()[0];
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = b & Byte.MAX_VALUE;
        C8216b bVar = hVar.f17797l;
        byte[] bArr = bVar.f17774a;
        if (bArr == null) {
            bVar.f17774a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C8272a i4 = m20119i(i2, j2, bVar.f17774a, i3);
        long j3 = j2 + i3;
        if (z) {
            yVar.m22021L(2);
            i4 = m20119i(i4, j3, yVar.m22012d(), 2);
            j3 += 2;
            i = yVar.m22023J();
        }
        int[] iArr = bVar.f17777d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = bVar.f17778e;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
        }
        if (z) {
            int i5 = i * 6;
            yVar.m22021L(i5);
            i4 = m20119i(i4, j3, yVar.m22012d(), i5);
            j3 += i5;
            yVar.m22017P(0);
            for (int i6 = 0; i6 < i; i6++) {
                iArr[i6] = yVar.m22023J();
                iArr2[i6] = yVar.m22025H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = aVar2.f18014a - ((int) (j3 - aVar2.f18015b));
        }
        AbstractC10500b0.C10501a aVar3 = (AbstractC10500b0.C10501a) C7557q0.m22145j(aVar2.f18016c);
        bVar.m20294c(i, iArr, iArr2, aVar3.f23199b, bVar.f17774a, aVar3.f23198a, aVar3.f23200c, aVar3.f23201d);
        long j4 = aVar2.f18015b;
        int i7 = (int) (j3 - j4);
        aVar2.f18015b = j4 + i7;
        aVar2.f18014a -= i7;
        return i4;
    }

    /* renamed from: k */
    private static C8272a m20117k(C8272a aVar, C8223h hVar, C8274n0.C8275a aVar2, C7570y yVar) {
        if (hVar.m20283q()) {
            aVar = m20118j(aVar, hVar, aVar2, yVar);
        }
        if (hVar.m20301i()) {
            yVar.m22021L(4);
            C8272a i = m20119i(aVar, aVar2.f18015b, yVar.m22012d(), 4);
            int H = yVar.m22025H();
            aVar2.f18015b += 4;
            aVar2.f18014a -= 4;
            hVar.m20285o(H);
            C8272a h = m20120h(i, aVar2.f18015b, hVar.f17798m, H);
            aVar2.f18015b += H;
            int i2 = aVar2.f18014a - H;
            aVar2.f18014a = i2;
            hVar.m20280t(i2);
            return m20120h(h, aVar2.f18015b, hVar.f17801p, aVar2.f18014a);
        }
        hVar.m20285o(aVar2.f18014a);
        return m20120h(aVar, aVar2.f18015b, hVar.f17798m, aVar2.f18014a);
    }

    /* renamed from: b */
    public void m20126b(long j) {
        C8272a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f17971d;
                if (j < aVar.f17976b) {
                    break;
                }
                this.f17968a.mo24351a(aVar.f17978d);
                this.f17971d = this.f17971d.m20111a();
            }
            if (this.f17972e.f17975a < aVar.f17975a) {
                this.f17972e = aVar;
            }
        }
    }

    /* renamed from: c */
    public void m20125c(long j) {
        this.f17974g = j;
        if (j != 0) {
            C8272a aVar = this.f17971d;
            if (j != aVar.f17975a) {
                while (this.f17974g > aVar.f17976b) {
                    aVar = aVar.f17979e;
                }
                C8272a aVar2 = aVar.f17979e;
                m20127a(aVar2);
                C8272a aVar3 = new C8272a(aVar.f17976b, this.f17969b);
                aVar.f17979e = aVar3;
                if (this.f17974g == aVar.f17976b) {
                    aVar = aVar3;
                }
                this.f17973f = aVar;
                if (this.f17972e == aVar2) {
                    this.f17972e = aVar3;
                    return;
                }
                return;
            }
        }
        m20127a(this.f17971d);
        C8272a aVar4 = new C8272a(this.f17974g, this.f17969b);
        this.f17971d = aVar4;
        this.f17972e = aVar4;
        this.f17973f = aVar4;
    }

    /* renamed from: e */
    public long m20123e() {
        return this.f17974g;
    }

    /* renamed from: l */
    public void m20116l(C8223h hVar, C8274n0.C8275a aVar) {
        this.f17972e = m20117k(this.f17972e, hVar, aVar, this.f17970c);
    }

    /* renamed from: m */
    public void m20115m() {
        m20127a(this.f17971d);
        C8272a aVar = new C8272a(0L, this.f17969b);
        this.f17971d = aVar;
        this.f17972e = aVar;
        this.f17973f = aVar;
        this.f17974g = 0L;
        this.f17968a.mo24348d();
    }

    /* renamed from: n */
    public void m20114n() {
        this.f17972e = this.f17971d;
    }

    /* renamed from: o */
    public int m20113o(AbstractC6774h hVar, int i, boolean z) {
        int g = m20121g(i);
        C8272a aVar = this.f17973f;
        int read = hVar.read(aVar.f17978d.f14417a, aVar.m20109c(this.f17974g), g);
        if (read != -1) {
            m20122f(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: p */
    public void m20112p(C7570y yVar, int i) {
        while (i > 0) {
            int g = m20121g(i);
            C8272a aVar = this.f17973f;
            yVar.m22006j(aVar.f17978d.f14417a, aVar.m20109c(this.f17974g), g);
            i -= g;
            m20122f(g);
        }
    }
}
