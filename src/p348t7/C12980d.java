package p348t7;

import p119g9.C7557q0;

/* renamed from: t7.d */
/* loaded from: classes7.dex */
final class C12980d {

    /* renamed from: t7.d$b */
    /* loaded from: classes7.dex */
    public static final class C12982b {

        /* renamed from: a */
        public final long[] f29098a;

        /* renamed from: b */
        public final int[] f29099b;

        /* renamed from: c */
        public final int f29100c;

        /* renamed from: d */
        public final long[] f29101d;

        /* renamed from: e */
        public final int[] f29102e;

        /* renamed from: f */
        public final long f29103f;

        private C12982b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f29098a = jArr;
            this.f29099b = iArr;
            this.f29100c = i;
            this.f29101d = jArr2;
            this.f29102e = iArr2;
            this.f29103f = j;
        }
    }

    /* renamed from: a */
    public static C12982b m4884a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += C7557q0.m22141l(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                int i10 = i * min;
                iArr2[i6] = i10;
                i7 = Math.max(i7, i10);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new C12982b(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}
