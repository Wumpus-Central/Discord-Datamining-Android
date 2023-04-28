package net.time4j.base;

/* renamed from: net.time4j.base.c */
/* loaded from: classes8.dex */
public final class C10813c {
    /* renamed from: a */
    public static int m12202a(int i, int i2) {
        if (i >= 0) {
            return i / i2;
        }
        return ((i + 1) / i2) - 1;
    }

    /* renamed from: b */
    public static long m12201b(long j, int i) {
        if (j >= 0) {
            return j / i;
        }
        return ((j + 1) / i) - 1;
    }

    /* renamed from: c */
    public static int m12200c(int i, int i2) {
        return i - (i2 * m12202a(i, i2));
    }

    /* renamed from: d */
    public static int m12199d(long j, int i) {
        return (int) (j - (i * m12201b(j, i)));
    }

    /* renamed from: e */
    public static int m12198e(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        long j = i + i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i);
        sb2.append(',');
        sb2.append(i2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    /* renamed from: f */
    public static long m12197f(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i == 0) {
            return j;
        }
        if (i <= 0 ? j >= Long.MIN_VALUE - j2 : j <= Long.MAX_VALUE - j2) {
            return j + j2;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    /* renamed from: g */
    public static int m12196g(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Out of range: " + j);
    }

    /* renamed from: h */
    public static int m12195h(int i, int i2) {
        if (i2 == 1) {
            return i;
        }
        long j = i * i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i);
        sb2.append(',');
        sb2.append(i2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    /* renamed from: i */
    public static long m12194i(long j, long j2) {
        int i;
        if (j2 == 1) {
            return j;
        }
        if (j2 <= 0 ? j2 >= -1 ? !(i == 0 && j == Long.MIN_VALUE) : j <= Long.MIN_VALUE / j2 && j >= Long.MAX_VALUE / j2 : j <= Long.MAX_VALUE / j2 && j >= Long.MIN_VALUE / j2) {
            return j * j2;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    /* renamed from: j */
    public static int m12193j(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Not negatable: " + i);
    }

    /* renamed from: k */
    public static long m12192k(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("Not negatable: " + j);
    }

    /* renamed from: l */
    public static int m12191l(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        long j = i - i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i);
        sb2.append(',');
        sb2.append(i2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    /* renamed from: m */
    public static long m12190m(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i == 0) {
            return j;
        }
        if (i <= 0 ? j <= Long.MAX_VALUE + j2 : j >= Long.MIN_VALUE + j2) {
            return j - j2;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j);
        sb2.append(',');
        sb2.append(j2);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }
}
