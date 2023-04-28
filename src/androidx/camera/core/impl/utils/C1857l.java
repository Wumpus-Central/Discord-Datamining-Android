package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: androidx.camera.core.impl.utils.l */
/* loaded from: classes.dex */
final class C1857l {

    /* renamed from: e */
    static final Charset f1802e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    static final String[] f1803f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    static final int[] f1804g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    static final byte[] f1805h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f1806a;

    /* renamed from: b */
    public final int f1807b;

    /* renamed from: c */
    public final long f1808c;

    /* renamed from: d */
    public final byte[] f1809d;

    C1857l(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* renamed from: a */
    public static C1857l m39650a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C1857l(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f1802e);
        return new C1857l(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C1857l m39649b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C1857l(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C1857l m39648c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new C1857l(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C1857l m39647d(C1867p[] pVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[10] * pVarArr.length]);
        wrap.order(byteOrder);
        for (C1867p pVar : pVarArr) {
            wrap.putInt((int) pVar.m39616b());
            wrap.putInt((int) pVar.m39617a());
        }
        return new C1857l(10, pVarArr.length, wrap.array());
    }

    /* renamed from: e */
    public static C1857l m39646e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f1802e);
        return new C1857l(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C1857l m39645f(long j, ByteOrder byteOrder) {
        return m39644g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static C1857l m39644g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C1857l(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C1857l m39643h(C1867p[] pVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[5] * pVarArr.length]);
        wrap.order(byteOrder);
        for (C1867p pVar : pVarArr) {
            wrap.putInt((int) pVar.m39616b());
            wrap.putInt((int) pVar.m39617a());
        }
        return new C1857l(5, pVarArr.length, wrap.array());
    }

    /* renamed from: i */
    public static C1857l m39642i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1804g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C1857l(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public int m39641j() {
        return f1804g[this.f1806a] * this.f1807b;
    }

    public String toString() {
        return "(" + f1803f[this.f1806a] + ", data length:" + this.f1809d.length + ")";
    }

    C1857l(int i, int i2, long j, byte[] bArr) {
        this.f1806a = i;
        this.f1807b = i2;
        this.f1808c = j;
        this.f1809d = bArr;
    }
}
