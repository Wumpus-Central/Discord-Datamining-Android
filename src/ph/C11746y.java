package ph;

/* renamed from: ph.y */
/* loaded from: classes8.dex */
final class C11746y {
    /* renamed from: a */
    private static int m8704a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: b */
    private static int m8703b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: c */
    private static int m8702c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: d */
    private static int m8701d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m8704a(b);
        }
        if (i3 == 1) {
            return m8703b(b, bArr[i]);
        }
        if (i3 == 2) {
            return m8702c(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public static boolean m8700e(byte[] bArr) {
        return m8699f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static boolean m8699f(byte[] bArr, int i, int i2) {
        return m8697h(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r7[r8] > (-65)) goto L_0x001b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r7[r8] > (-65)) goto L_0x0048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
        if (r7[r6] > (-65)) goto L_0x0085;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8698g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L_0x0086
            if (r8 < r9) goto L_0x0005
            return r6
        L_0x0005:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L_0x001c
            r6 = -62
            if (r0 < r6) goto L_0x001b
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r8 = r6
            goto L_0x0086
        L_0x001b:
            return r2
        L_0x001c:
            r4 = -16
            if (r0 >= r4) goto L_0x0049
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L_0x0034
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r6 < r9) goto L_0x0031
            int r6 = m8703b(r0, r8)
            return r6
        L_0x0031:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0034:
            if (r6 > r3) goto L_0x0048
            r4 = -96
            if (r0 != r1) goto L_0x003c
            if (r6 < r4) goto L_0x0048
        L_0x003c:
            r1 = -19
            if (r0 != r1) goto L_0x0042
            if (r6 >= r4) goto L_0x0048
        L_0x0042:
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
        L_0x0048:
            return r2
        L_0x0049:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L_0x005c
            int r6 = r8 + 1
            byte r1 = r7[r8]
            if (r6 < r9) goto L_0x005a
            int r6 = m8703b(r0, r1)
            return r6
        L_0x005a:
            r8 = 0
            goto L_0x0062
        L_0x005c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0062:
            if (r8 != 0) goto L_0x0072
            int r8 = r6 + 1
            byte r6 = r7[r6]
            if (r8 < r9) goto L_0x006f
            int r6 = m8702c(r0, r1, r6)
            return r6
        L_0x006f:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0072:
            if (r1 > r3) goto L_0x0085
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L_0x0085
            if (r8 > r3) goto L_0x0085
            int r8 = r6 + 1
            byte r6 = r7[r6]
            if (r6 <= r3) goto L_0x0086
        L_0x0085:
            return r2
        L_0x0086:
            int r6 = m8697h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C11746y.m8698g(int, byte[], int, int):int");
    }

    /* renamed from: h */
    public static int m8697h(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return m8696i(bArr, i, i2);
    }

    /* renamed from: i */
    private static int m8696i(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return m8701d(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return m8701d(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }
}
