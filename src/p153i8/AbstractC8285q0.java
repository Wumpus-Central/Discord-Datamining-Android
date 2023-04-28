package p153i8;

import java.util.Arrays;
import java.util.Random;

/* renamed from: i8.q0 */
/* loaded from: classes7.dex */
public interface AbstractC8285q0 {

    /* renamed from: i8.q0$a */
    /* loaded from: classes7.dex */
    public static class C8286a implements AbstractC8285q0 {

        /* renamed from: a */
        private final Random f18042a;

        /* renamed from: b */
        private final int[] f18043b;

        /* renamed from: c */
        private final int[] f18044c;

        public C8286a(int i) {
            this(i, new Random());
        }

        /* renamed from: h */
        private static int[] m20029h(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: a */
        public AbstractC8285q0 mo20036a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f18043b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f18043b;
                if (i4 >= iArr2.length) {
                    return new C8286a(iArr, new Random(this.f18042a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: b */
        public int mo20035b(int i) {
            int i2 = this.f18044c[i] - 1;
            if (i2 >= 0) {
                return this.f18043b[i2];
            }
            return -1;
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: c */
        public int mo20034c(int i) {
            int i2 = this.f18044c[i] + 1;
            int[] iArr = this.f18043b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: d */
        public int mo20033d() {
            int[] iArr = this.f18043b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: e */
        public AbstractC8285q0 mo20032e() {
            return new C8286a(0, new Random(this.f18042a.nextLong()));
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: f */
        public int mo20031f() {
            int[] iArr = this.f18043b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p153i8.AbstractC8285q0
        /* renamed from: g */
        public AbstractC8285q0 mo20030g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f18042a.nextInt(this.f18043b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f18042a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f18043b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f18043b;
                if (i3 >= iArr4.length + i2) {
                    return new C8286a(iArr3, new Random(this.f18042a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // p153i8.AbstractC8285q0
        public int getLength() {
            return this.f18043b.length;
        }

        private C8286a(int i, Random random) {
            this(m20029h(i, random), random);
        }

        private C8286a(int[] iArr, Random random) {
            this.f18043b = iArr;
            this.f18042a = random;
            this.f18044c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f18044c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    AbstractC8285q0 mo20036a(int i, int i2);

    /* renamed from: b */
    int mo20035b(int i);

    /* renamed from: c */
    int mo20034c(int i);

    /* renamed from: d */
    int mo20033d();

    /* renamed from: e */
    AbstractC8285q0 mo20032e();

    /* renamed from: f */
    int mo20031f();

    /* renamed from: g */
    AbstractC8285q0 mo20030g(int i, int i2);

    int getLength();
}
