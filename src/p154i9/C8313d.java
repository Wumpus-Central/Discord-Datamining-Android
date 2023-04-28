package p154i9;

import p119g9.C7510a;

/* renamed from: i9.d */
/* loaded from: classes5.dex */
public final class C8313d {

    /* renamed from: a */
    public final C8314a f18132a;

    /* renamed from: b */
    public final C8314a f18133b;

    /* renamed from: c */
    public final int f18134c;

    /* renamed from: d */
    public final boolean f18135d;

    /* renamed from: i9.d$a */
    /* loaded from: classes5.dex */
    public static final class C8314a {

        /* renamed from: a */
        private final C8315b[] f18136a;

        public C8314a(C8315b... bVarArr) {
            this.f18136a = bVarArr;
        }

        /* renamed from: a */
        public C8315b m19974a(int i) {
            return this.f18136a[i];
        }

        /* renamed from: b */
        public int m19973b() {
            return this.f18136a.length;
        }
    }

    /* renamed from: i9.d$b */
    /* loaded from: classes5.dex */
    public static final class C8315b {

        /* renamed from: a */
        public final int f18137a;

        /* renamed from: b */
        public final int f18138b;

        /* renamed from: c */
        public final float[] f18139c;

        /* renamed from: d */
        public final float[] f18140d;

        public C8315b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f18137a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22371a(z);
            this.f18139c = fArr;
            this.f18140d = fArr2;
            this.f18138b = i2;
        }

        /* renamed from: a */
        public int m19972a() {
            return this.f18139c.length / 3;
        }
    }

    public C8313d(C8314a aVar, int i) {
        this(aVar, aVar, i);
    }

    /* renamed from: a */
    public static C8313d m19976a(float f, int i, int i2, float f2, float f3, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float f4;
        int i5;
        float[] fArr;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (i9 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7510a.m22371a(z2);
        if (i10 >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C7510a.m22371a(z3);
        if (f2 <= 0.0f || f2 > 180.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        C7510a.m22371a(z4);
        if (f3 <= 0.0f || f3 > 360.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        C7510a.m22371a(z5);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i9;
        float f6 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f7 = radians / 2.0f;
            float f8 = (i13 * f5) - f7;
            int i16 = i13 + 1;
            float f9 = (i16 * f5) - f7;
            int i17 = 0;
            while (i17 < i11) {
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    if (i18 == 0) {
                        f4 = f8;
                        i4 = i11;
                    } else {
                        i4 = i11;
                        f4 = f9;
                    }
                    float f10 = i17 * f6;
                    int i20 = i14 + 1;
                    double d = f;
                    double d2 = (f10 + 3.1415927f) - (radians2 / 2.0f);
                    double d3 = f4;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i21 = i20 + 1;
                    fArr2[i20] = (float) (d * Math.sin(d3));
                    int i22 = i21 + 1;
                    fArr2[i21] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i23 = i15 + 1;
                    fArr3[i15] = f10 / radians2;
                    int i24 = i23 + 1;
                    fArr3[i23] = ((i13 + i18) * f5) / radians;
                    if (i17 == 0 && i18 == 0) {
                        i8 = i2;
                        i7 = i17;
                        i6 = i18;
                    } else {
                        i8 = i2;
                        i7 = i17;
                        i6 = i18;
                        if (!(i7 == i8 && i6 == 1)) {
                            fArr = fArr3;
                            i5 = 2;
                            i15 = i24;
                            i14 = i22;
                            i18 = i6 + 1;
                            i10 = i8;
                            i17 = i7;
                            fArr3 = fArr;
                            i19 = i5;
                            i13 = i13;
                            i11 = i4;
                            f6 = f6;
                            f5 = f5;
                            f9 = f9;
                        }
                    }
                    System.arraycopy(fArr2, i22 - 3, fArr2, i22, 3);
                    i22 += 3;
                    fArr = fArr3;
                    i5 = 2;
                    System.arraycopy(fArr, i24 - 2, fArr, i24, 2);
                    i24 += 2;
                    i15 = i24;
                    i14 = i22;
                    i18 = i6 + 1;
                    i10 = i8;
                    i17 = i7;
                    fArr3 = fArr;
                    i19 = i5;
                    i13 = i13;
                    i11 = i4;
                    f6 = f6;
                    f5 = f5;
                    f9 = f9;
                }
                f8 = f8;
                i16 = i16;
                i11 = i11;
                f5 = f5;
                f9 = f9;
                i10 = i10;
                i17++;
            }
            i9 = i;
            i13 = i16;
        }
        return new C8313d(new C8314a(new C8315b(0, fArr2, fArr3, 1)), i3);
    }

    /* renamed from: b */
    public static C8313d m19975b(int i) {
        return m19976a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public C8313d(C8314a aVar, C8314a aVar2, int i) {
        this.f18132a = aVar;
        this.f18133b = aVar2;
        this.f18134c = i;
        this.f18135d = aVar == aVar2;
    }
}
