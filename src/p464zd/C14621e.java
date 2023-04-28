package p464zd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p066dd.AbstractC6447p;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6436e;
import p137hd.C7997b;

/* renamed from: zd.e */
/* loaded from: classes3.dex */
public class C14621e {

    /* renamed from: a */
    private final C7997b f33100a;

    /* renamed from: c */
    private boolean f33102c;

    /* renamed from: e */
    private final AbstractC6447p f33104e;

    /* renamed from: b */
    private final List<C14620d> f33101b = new ArrayList();

    /* renamed from: d */
    private final int[] f33103d = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.e$b */
    /* loaded from: classes3.dex */
    public static final class C14623b implements Serializable, Comparator<C14620d> {

        /* renamed from: k */
        private final float f33105k;

        /* renamed from: b */
        public int compare(C14620d dVar, C14620d dVar2) {
            int compare = Integer.compare(dVar2.m102h(), dVar.m102h());
            if (compare == 0) {
                return Float.compare(Math.abs(dVar.m101i() - this.f33105k), Math.abs(dVar2.m101i() - this.f33105k));
            }
            return compare;
        }

        private C14623b(float f) {
            this.f33105k = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.e$c */
    /* loaded from: classes3.dex */
    public static final class C14624c implements Serializable, Comparator<C14620d> {

        /* renamed from: k */
        private final float f33106k;

        /* renamed from: b */
        public int compare(C14620d dVar, C14620d dVar2) {
            return Float.compare(Math.abs(dVar2.m101i() - this.f33106k), Math.abs(dVar.m101i() - this.f33106k));
        }

        private C14624c(float f) {
            this.f33106k = f;
        }
    }

    public C14621e(C7997b bVar, AbstractC6447p pVar) {
        this.f33100a = bVar;
        this.f33104e = pVar;
    }

    /* renamed from: a */
    private static float m100a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: c */
    private boolean m98c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = m91j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f33100a.m20923e(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f33100a.m20923e(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f33100a.m20923e(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int j2 = this.f33100a.m20920j();
        int m = this.f33100a.m20917m();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= j2 || (i5 = i2 + i7) >= m || !this.f33100a.m20923e(i5, i8)) {
                break;
            }
            j[2] = j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= j2 || (i4 = i2 + i7) >= m || this.f33100a.m20923e(i4, i9)) {
                break;
            }
            j[3] = j[3] + 1;
            i7++;
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= j2 || (i3 = i2 + i7) >= m || !this.f33100a.m20923e(i3, i10)) {
                break;
            }
            j[4] = j[4] + 1;
            i7++;
        }
        if (j[4] == 0) {
            return false;
        }
        return m92i(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r2[3] < r13) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
        if (r11 >= r1) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r0.m20923e(r11, r12) == false) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
        if (r9 >= r13) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (r12 < r13) goto L_0x009e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L_0x00b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
        if (m93h(r2) == false) goto L_0x00bf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
        return m100a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m97d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            hd.b r0 = r10.f33100a
            int r1 = r0.m20917m()
            int[] r2 = r10.m91j()
            r3 = r11
        L_0x000b:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L_0x001d
            boolean r6 = r0.m20923e(r3, r12)
            if (r6 == 0) goto L_0x001d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto L_0x000b
        L_0x001d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L_0x0022
            return r6
        L_0x0022:
            if (r3 < 0) goto L_0x0035
            boolean r7 = r0.m20923e(r3, r12)
            if (r7 != 0) goto L_0x0035
            r7 = r2[r5]
            if (r7 > r13) goto L_0x0035
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L_0x0022
        L_0x0035:
            if (r3 < 0) goto L_0x00bf
            r7 = r2[r5]
            if (r7 <= r13) goto L_0x003d
            goto L_0x00bf
        L_0x003d:
            r7 = 0
            if (r3 < 0) goto L_0x0051
            boolean r8 = r0.m20923e(r3, r12)
            if (r8 == 0) goto L_0x0051
            r8 = r2[r7]
            if (r8 > r13) goto L_0x0051
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L_0x003d
        L_0x0051:
            r3 = r2[r7]
            if (r3 <= r13) goto L_0x0056
            return r6
        L_0x0056:
            int r11 = r11 + r5
        L_0x0057:
            if (r11 >= r1) goto L_0x0067
            boolean r3 = r0.m20923e(r11, r12)
            if (r3 == 0) goto L_0x0067
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L_0x0057
        L_0x0067:
            if (r11 != r1) goto L_0x006a
            return r6
        L_0x006a:
            r3 = 3
            if (r11 >= r1) goto L_0x007e
            boolean r8 = r0.m20923e(r11, r12)
            if (r8 != 0) goto L_0x007e
            r8 = r2[r3]
            if (r8 >= r13) goto L_0x007e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L_0x006a
        L_0x007e:
            if (r11 == r1) goto L_0x00bf
            r8 = r2[r3]
            if (r8 < r13) goto L_0x0085
            goto L_0x00bf
        L_0x0085:
            r8 = 4
            if (r11 >= r1) goto L_0x0099
            boolean r9 = r0.m20923e(r11, r12)
            if (r9 == 0) goto L_0x0099
            r9 = r2[r8]
            if (r9 >= r13) goto L_0x0099
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L_0x0085
        L_0x0099:
            r12 = r2[r8]
            if (r12 < r13) goto L_0x009e
            return r6
        L_0x009e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto L_0x00b4
            return r6
        L_0x00b4:
            boolean r12 = m93h(r2)
            if (r12 == 0) goto L_0x00bf
            float r11 = m100a(r2, r11)
            return r11
        L_0x00bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p464zd.C14621e.m97d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r2[3] < r13) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
        if (r11 >= r1) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r0.m20923e(r12, r11) == false) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
        if (r9 >= r13) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (r12 < r13) goto L_0x009e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L_0x00b5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
        if (m93h(r2) == false) goto L_0x00c0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
        return m100a(r2, r11);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m96e(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            hd.b r0 = r10.f33100a
            int r1 = r0.m20920j()
            int[] r2 = r10.m91j()
            r3 = r11
        L_0x000b:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L_0x001d
            boolean r6 = r0.m20923e(r12, r3)
            if (r6 == 0) goto L_0x001d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto L_0x000b
        L_0x001d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L_0x0022
            return r6
        L_0x0022:
            if (r3 < 0) goto L_0x0035
            boolean r7 = r0.m20923e(r12, r3)
            if (r7 != 0) goto L_0x0035
            r7 = r2[r5]
            if (r7 > r13) goto L_0x0035
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L_0x0022
        L_0x0035:
            if (r3 < 0) goto L_0x00c0
            r7 = r2[r5]
            if (r7 <= r13) goto L_0x003d
            goto L_0x00c0
        L_0x003d:
            r7 = 0
            if (r3 < 0) goto L_0x0051
            boolean r8 = r0.m20923e(r12, r3)
            if (r8 == 0) goto L_0x0051
            r8 = r2[r7]
            if (r8 > r13) goto L_0x0051
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L_0x003d
        L_0x0051:
            r3 = r2[r7]
            if (r3 <= r13) goto L_0x0056
            return r6
        L_0x0056:
            int r11 = r11 + r5
        L_0x0057:
            if (r11 >= r1) goto L_0x0067
            boolean r3 = r0.m20923e(r12, r11)
            if (r3 == 0) goto L_0x0067
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L_0x0057
        L_0x0067:
            if (r11 != r1) goto L_0x006a
            return r6
        L_0x006a:
            r3 = 3
            if (r11 >= r1) goto L_0x007e
            boolean r8 = r0.m20923e(r12, r11)
            if (r8 != 0) goto L_0x007e
            r8 = r2[r3]
            if (r8 >= r13) goto L_0x007e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L_0x006a
        L_0x007e:
            if (r11 == r1) goto L_0x00c0
            r8 = r2[r3]
            if (r8 < r13) goto L_0x0085
            goto L_0x00c0
        L_0x0085:
            r8 = 4
            if (r11 >= r1) goto L_0x0099
            boolean r9 = r0.m20923e(r12, r11)
            if (r9 == 0) goto L_0x0099
            r9 = r2[r8]
            if (r9 >= r13) goto L_0x0099
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L_0x0085
        L_0x0099:
            r12 = r2[r8]
            if (r12 < r13) goto L_0x009e
            return r6
        L_0x009e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * r4
            if (r12 < r14) goto L_0x00b5
            return r6
        L_0x00b5:
            boolean r12 = m93h(r2)
            if (r12 == 0) goto L_0x00c0
            float r11 = m100a(r2, r11)
            return r11
        L_0x00c0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p464zd.C14621e.m96e(int, int, int, int):float");
    }

    /* renamed from: g */
    private int m94g() {
        if (this.f33101b.size() <= 1) {
            return 0;
        }
        C14620d dVar = null;
        for (C14620d dVar2 : this.f33101b) {
            if (dVar2.m102h() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f33102c = true;
                    return ((int) (Math.abs(dVar.m25545c() - dVar2.m25545c()) - Math.abs(dVar.m25544d() - dVar2.m25544d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    protected static boolean m93h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    protected static boolean m92i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private int[] m91j() {
        m99b(this.f33103d);
        return this.f33103d;
    }

    /* renamed from: l */
    private boolean m89l() {
        int size = this.f33101b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C14620d dVar : this.f33101b) {
            if (dVar.m102h() >= 2) {
                i++;
                f2 += dVar.m101i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C14620d dVar2 : this.f33101b) {
            f += Math.abs(dVar2.m101i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private C14620d[] m88m() {
        float f;
        int size = this.f33101b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (C14620d dVar : this.f33101b) {
                    float i = dVar.m101i();
                    f3 += i;
                    f4 += i * i;
                }
                float f5 = f3 / size;
                float sqrt = (float) Math.sqrt((f4 / f) - (f5 * f5));
                Collections.sort(this.f33101b, new C14624c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i2 = 0;
                while (i2 < this.f33101b.size() && this.f33101b.size() > 3) {
                    if (Math.abs(this.f33101b.get(i2).m101i() - f5) > max) {
                        this.f33101b.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            if (this.f33101b.size() > 3) {
                for (C14620d dVar2 : this.f33101b) {
                    f2 += dVar2.m101i();
                }
                Collections.sort(this.f33101b, new C14623b(f2 / this.f33101b.size()));
                List<C14620d> list = this.f33101b;
                list.subList(3, list.size()).clear();
            }
            return new C14620d[]{this.f33101b.get(0), this.f33101b.get(1), this.f33101b.get(2)};
        }
        throw C6441j.m25551a();
    }

    /* renamed from: b */
    protected final void m99b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C14625f m95f(Map<EnumC6436e, ?> map) {
        boolean z;
        if (map == null || !map.containsKey(EnumC6436e.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        int j = this.f33100a.m20920j();
        int m = this.f33100a.m20917m();
        int i = (j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < j && !z2) {
            m99b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < m) {
                if (this.f33100a.m20923e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m93h(iArr)) {
                        m87n(iArr);
                    } else if (m90k(iArr, i2, i3)) {
                        if (this.f33102c) {
                            z2 = m89l();
                        } else {
                            int g = m94g();
                            int i5 = iArr[2];
                            if (g > i5) {
                                i2 += (g - i5) - 2;
                                i3 = m - 1;
                            }
                        }
                        m99b(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        m87n(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m93h(iArr) && m90k(iArr, i2, m)) {
                i = iArr[0];
                if (this.f33102c) {
                    z2 = m89l();
                }
            }
            i2 += i;
        }
        C14620d[] m2 = m88m();
        C6446o.m25543e(m2);
        return new C14625f(m2);
    }

    /* renamed from: k */
    protected final boolean m90k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m100a(iArr, i2);
        float e = m96e(i, a, iArr[2], i3);
        if (!Float.isNaN(e)) {
            int i4 = (int) e;
            float d = m97d(a, i4, iArr[2], i3);
            if (!Float.isNaN(d) && m98c(i4, (int) d)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f33101b.size()) {
                        break;
                    }
                    C14620d dVar = this.f33101b.get(i5);
                    if (dVar.m104f(f, e, d)) {
                        this.f33101b.set(i5, dVar.m103g(e, d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C14620d dVar2 = new C14620d(d, e, f);
                    this.f33101b.add(dVar2);
                    AbstractC6447p pVar = this.f33104e;
                    if (pVar != null) {
                        pVar.m25542a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    protected final void m87n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
