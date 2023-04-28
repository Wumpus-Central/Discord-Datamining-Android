package p418x7;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;
import p079e7.C6722k;
import p079e7.C6728o;
import p117g7.C7486s0;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.C10520n;
import p228m7.C10533x;

/* renamed from: x7.b */
/* loaded from: classes7.dex */
public final class C13942b implements AbstractC10514i {

    /* renamed from: f */
    public static final AbstractC10521o f31405f = new AbstractC10521o() { // from class: x7.a
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] g;
            g = C13942b.m2222g();
            return g;
        }
    };

    /* renamed from: a */
    private AbstractC10516k f31406a;

    /* renamed from: b */
    private AbstractC10500b0 f31407b;

    /* renamed from: c */
    private AbstractC0451b f31408c;

    /* renamed from: d */
    private int f31409d = -1;

    /* renamed from: e */
    private long f31410e = -1;

    /* renamed from: x7.b$a */
    /* loaded from: classes7.dex */
    private static final class C13943a implements AbstractC0451b {

        /* renamed from: m */
        private static final int[] f31411m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f31412n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final AbstractC10516k f31413a;

        /* renamed from: b */
        private final AbstractC10500b0 f31414b;

        /* renamed from: c */
        private final C13945c f31415c;

        /* renamed from: d */
        private final int f31416d;

        /* renamed from: e */
        private final byte[] f31417e;

        /* renamed from: f */
        private final C7570y f31418f;

        /* renamed from: g */
        private final int f31419g;

        /* renamed from: h */
        private final C6722k f31420h;

        /* renamed from: i */
        private int f31421i;

        /* renamed from: j */
        private long f31422j;

        /* renamed from: k */
        private int f31423k;

        /* renamed from: l */
        private long f31424l;

        public C13943a(AbstractC10516k kVar, AbstractC10500b0 b0Var, C13945c cVar) {
            this.f31413a = kVar;
            this.f31414b = b0Var;
            this.f31415c = cVar;
            int max = Math.max(1, cVar.f31435c / 10);
            this.f31419g = max;
            C7570y yVar = new C7570y(cVar.f31439g);
            yVar.m21994v();
            int v = yVar.m21994v();
            this.f31416d = v;
            int i = cVar.f31434b;
            int i2 = (((cVar.f31437e - (i * 4)) * 8) / (cVar.f31438f * i)) + 1;
            if (v == i2) {
                int l = C7557q0.m22141l(max, v);
                this.f31417e = new byte[cVar.f31437e * l];
                this.f31418f = new C7570y(l * m2217h(v, i));
                int i3 = ((cVar.f31435c * cVar.f31437e) * 8) / v;
                this.f31420h = new C6722k.C6724b().m24488e0("audio/raw").m24517G(i3).m24498Z(i3).m24501W(m2217h(max, i)).m24516H(cVar.f31434b).m24486f0(cVar.f31435c).m24499Y(2).m24519E();
                return;
            }
            throw new C6728o("Expected frames per block: " + i2 + "; got: " + v);
        }

        /* renamed from: d */
        private void m2221d(byte[] bArr, int i, C7570y yVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f31415c.f31434b; i3++) {
                    m2220e(bArr, i2, i3, yVar.m22012d());
                }
            }
            int g = m2218g(this.f31416d * i);
            yVar.m22017P(0);
            yVar.m22018O(g);
        }

        /* renamed from: e */
        private void m2220e(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            C13945c cVar = this.f31415c;
            int i4 = cVar.f31437e;
            int i5 = cVar.f31434b;
            int i6 = (i * i4) + (i2 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = f31412n[min];
            int i11 = ((i * this.f31416d * i5) + i2) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                int i13 = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)] & 255;
                if (i12 % 2 == 0) {
                    i3 = i13 & 15;
                } else {
                    i3 = i13 >> 4;
                }
                int i14 = ((((i3 & 7) * 2) + 1) * i10) >> 3;
                if ((i3 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = C7557q0.m22129r(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                int i15 = min + f31411m[i3];
                int[] iArr = f31412n;
                min = C7557q0.m22129r(i15, 0, iArr.length - 1);
                i10 = iArr[min];
            }
        }

        /* renamed from: f */
        private int m2219f(int i) {
            return i / (this.f31415c.f31434b * 2);
        }

        /* renamed from: g */
        private int m2218g(int i) {
            return m2217h(i, this.f31415c.f31434b);
        }

        /* renamed from: h */
        private static int m2217h(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: i */
        private void m2216i(int i) {
            long I0 = this.f31422j + C7557q0.m22198I0(this.f31424l, 1000000L, this.f31415c.f31435c);
            int g = m2218g(i);
            this.f31414b.mo12382c(I0, 1, g, this.f31423k - g, null);
            this.f31424l += i;
            this.f31423k -= g;
        }

        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: a */
        public void mo2215a(int i, long j) {
            this.f31413a.mo7936j(new C13948e(this.f31415c, this.f31416d, i, j));
            this.f31414b.mo12388d(this.f31420h);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please submit an issue!!! */
        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo2214b(p228m7.AbstractC10515j r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f31419g
                int r1 = r6.f31423k
                int r1 = r6.m2219f(r1)
                int r0 = r0 - r1
                int r1 = r6.f31416d
                int r0 = p119g9.C7557q0.m22141l(r0, r1)
                x7.c r1 = r6.f31415c
                int r1 = r1.f31437e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L_0x001d
            L_0x001b:
                r1 = r2
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x003e
                int r3 = r6.f31421i
                if (r3 >= r0) goto L_0x003e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f31417e
                int r5 = r6.f31421i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                int r4 = r6.f31421i
                int r4 = r4 + r3
                r6.f31421i = r4
                goto L_0x001e
            L_0x003e:
                int r7 = r6.f31421i
                x7.c r8 = r6.f31415c
                int r8 = r8.f31437e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0075
                byte[] r8 = r6.f31417e
                g9.y r9 = r6.f31418f
                r6.m2221d(r8, r7, r9)
                int r8 = r6.f31421i
                x7.c r9 = r6.f31415c
                int r9 = r9.f31437e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f31421i = r8
                g9.y r7 = r6.f31418f
                int r7 = r7.m22010f()
                m7.b0 r8 = r6.f31414b
                g9.y r9 = r6.f31418f
                r8.mo12386f(r9, r7)
                int r8 = r6.f31423k
                int r8 = r8 + r7
                r6.f31423k = r8
                int r7 = r6.m2219f(r8)
                int r8 = r6.f31419g
                if (r7 < r8) goto L_0x0075
                r6.m2216i(r8)
            L_0x0075:
                if (r1 == 0) goto L_0x0082
                int r7 = r6.f31423k
                int r7 = r6.m2219f(r7)
                if (r7 <= 0) goto L_0x0082
                r6.m2216i(r7)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p418x7.C13942b.C13943a.mo2214b(m7.j, long):boolean");
        }

        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: c */
        public void mo2213c(long j) {
            this.f31421i = 0;
            this.f31422j = j;
            this.f31423k = 0;
            this.f31424l = 0L;
        }
    }

    /* renamed from: x7.b$b */
    /* loaded from: classes7.dex */
    private interface AbstractC0451b {
        /* renamed from: a */
        void mo2215a(int i, long j);

        /* renamed from: b */
        boolean mo2214b(AbstractC10515j jVar, long j);

        /* renamed from: c */
        void mo2213c(long j);
    }

    /* renamed from: x7.b$c */
    /* loaded from: classes7.dex */
    private static final class C13944c implements AbstractC0451b {

        /* renamed from: a */
        private final AbstractC10516k f31425a;

        /* renamed from: b */
        private final AbstractC10500b0 f31426b;

        /* renamed from: c */
        private final C13945c f31427c;

        /* renamed from: d */
        private final C6722k f31428d;

        /* renamed from: e */
        private final int f31429e;

        /* renamed from: f */
        private long f31430f;

        /* renamed from: g */
        private int f31431g;

        /* renamed from: h */
        private long f31432h;

        public C13944c(AbstractC10516k kVar, AbstractC10500b0 b0Var, C13945c cVar, String str, int i) {
            this.f31425a = kVar;
            this.f31426b = b0Var;
            this.f31427c = cVar;
            int i2 = (cVar.f31434b * cVar.f31438f) / 8;
            if (cVar.f31437e == i2) {
                int i3 = cVar.f31435c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.f31429e = max;
                this.f31428d = new C6722k.C6724b().m24488e0(str).m24517G(i4).m24498Z(i4).m24501W(max).m24516H(cVar.f31434b).m24486f0(cVar.f31435c).m24499Y(i).m24519E();
                return;
            }
            throw new C6728o("Expected block size: " + i2 + "; got: " + cVar.f31437e);
        }

        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: a */
        public void mo2215a(int i, long j) {
            this.f31425a.mo7936j(new C13948e(this.f31427c, 1, i, j));
            this.f31426b.mo12388d(this.f31428d);
        }

        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: b */
        public boolean mo2214b(AbstractC10515j jVar, long j) {
            int i;
            C13945c cVar;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.f31431g) >= (i3 = this.f31429e)) {
                    break;
                }
                int e = this.f31426b.mo12387e(jVar, (int) Math.min(i3 - i2, j2), true);
                if (e == -1) {
                    j2 = 0;
                } else {
                    this.f31431g += e;
                    j2 -= e;
                }
            }
            int i4 = this.f31427c.f31437e;
            int i5 = this.f31431g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.f31431g - i6;
                this.f31426b.mo12382c(this.f31430f + C7557q0.m22198I0(this.f31432h, 1000000L, cVar.f31435c), 1, i6, i7, null);
                this.f31432h += i5;
                this.f31431g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        @Override // p418x7.C13942b.AbstractC0451b
        /* renamed from: c */
        public void mo2213c(long j) {
            this.f31430f = j;
            this.f31431g = 0;
            this.f31432h = 0L;
        }
    }

    /* renamed from: f */
    private void m2223f() {
        C7510a.m22364h(this.f31407b);
        C7557q0.m22145j(this.f31406a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ AbstractC10514i[] m2222g() {
        return new AbstractC10514i[]{new C13942b()};
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        AbstractC0451b bVar = this.f31408c;
        if (bVar != null) {
            bVar.mo2213c(j2);
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f31406a = kVar;
        this.f31407b = kVar.mo7937e(0, 1);
        kVar.mo7935s();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        return C13946d.m2212a(jVar) != null;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        boolean z;
        m2223f();
        if (this.f31408c == null) {
            C13945c a = C13946d.m2212a(jVar);
            if (a != null) {
                int i = a.f31433a;
                if (i == 17) {
                    this.f31408c = new C13943a(this.f31406a, this.f31407b, a);
                } else if (i == 6) {
                    this.f31408c = new C13944c(this.f31406a, this.f31407b, a, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.f31408c = new C13944c(this.f31406a, this.f31407b, a, "audio/g711-mlaw", -1);
                } else {
                    int a2 = C7486s0.m22452a(i, a.f31438f);
                    if (a2 != 0) {
                        this.f31408c = new C13944c(this.f31406a, this.f31407b, a, "audio/raw", a2);
                    } else {
                        throw new C6728o("Unsupported WAV format type: " + a.f31433a);
                    }
                }
            } else {
                throw new C6728o("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f31409d == -1) {
            Pair<Long, Long> b = C13946d.m2211b(jVar);
            this.f31409d = ((Long) b.first).intValue();
            long longValue = ((Long) b.second).longValue();
            this.f31410e = longValue;
            this.f31408c.mo2215a(this.f31409d, longValue);
        } else if (jVar.getPosition() == 0) {
            jVar.mo12932k(this.f31409d);
        }
        if (this.f31410e != -1) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        if (this.f31408c.mo2214b(jVar, this.f31410e - jVar.getPosition())) {
            return -1;
        }
        return 0;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
