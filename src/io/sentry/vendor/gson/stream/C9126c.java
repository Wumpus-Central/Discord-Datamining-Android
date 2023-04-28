package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: io.sentry.vendor.gson.stream.c */
/* loaded from: classes8.dex */
public class C9126c implements Closeable, Flushable {

    /* renamed from: t */
    private static final String[] f20019t = new String[128];

    /* renamed from: u */
    private static final String[] f20020u;

    /* renamed from: k */
    private final Writer f20021k;

    /* renamed from: n */
    private String f20024n;

    /* renamed from: p */
    private boolean f20026p;

    /* renamed from: q */
    private boolean f20027q;

    /* renamed from: r */
    private String f20028r;

    /* renamed from: l */
    private int[] f20022l = new int[32];

    /* renamed from: m */
    private int f20023m = 0;

    /* renamed from: o */
    private String f20025o = ":";

    /* renamed from: s */
    private boolean f20029s = true;

    static {
        for (int i = 0; i <= 31; i++) {
            f20019t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f20019t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f20020u = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9126c(Writer writer) {
        m16926H(6);
        if (writer != null) {
            this.f20021k = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: C */
    private int m16927C() {
        int i = this.f20023m;
        if (i != 0) {
            return this.f20022l[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: H */
    private void m16926H(int i) {
        int i2 = this.f20023m;
        int[] iArr = this.f20022l;
        if (i2 == iArr.length) {
            this.f20022l = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f20022l;
        int i3 = this.f20023m;
        this.f20023m = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: Q */
    private void m16925Q(int i) {
        this.f20022l[this.f20023m - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16923S(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f20027q
            if (r0 == 0) goto L_0x0007
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C9126c.f20020u
            goto L_0x0009
        L_0x0007:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C9126c.f20019t
        L_0x0009:
            java.io.Writer r1 = r8.f20021k
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L_0x0016:
            if (r3 >= r1) goto L_0x0045
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x0025
            r5 = r0[r5]
            if (r5 != 0) goto L_0x0032
            goto L_0x0042
        L_0x0025:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x002c
            java.lang.String r5 = "\\u2028"
            goto L_0x0032
        L_0x002c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x0042
            java.lang.String r5 = "\\u2029"
        L_0x0032:
            if (r4 >= r3) goto L_0x003b
            java.io.Writer r6 = r8.f20021k
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L_0x003b:
            java.io.Writer r4 = r8.f20021k
            r4.write(r5)
            int r4 = r3 + 1
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0045:
            if (r4 >= r1) goto L_0x004d
            java.io.Writer r0 = r8.f20021k
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L_0x004d:
            java.io.Writer r9 = r8.f20021k
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9126c.m16923S(java.lang.String):void");
    }

    /* renamed from: b */
    private void m16920b() {
        int C = m16927C();
        if (C == 5) {
            this.f20021k.write(44);
        } else if (C != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m16909s();
        m16925Q(4);
    }

    /* renamed from: g */
    private void m16917g() {
        int C = m16927C();
        if (C == 1) {
            m16925Q(2);
            m16909s();
        } else if (C == 2) {
            this.f20021k.append(',');
            m16909s();
        } else if (C != 4) {
            if (C != 6) {
                if (C != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f20026p) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m16925Q(7);
        } else {
            this.f20021k.append((CharSequence) this.f20025o);
            m16925Q(5);
        }
    }

    /* renamed from: l */
    private C9126c m16913l(int i, int i2, char c) {
        int C = m16927C();
        if (C != i2 && C != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f20028r == null) {
            this.f20023m--;
            if (C == i2) {
                m16909s();
            }
            this.f20021k.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f20028r);
        }
    }

    /* renamed from: s */
    private void m16909s() {
        if (this.f20024n != null) {
            this.f20021k.write(10);
            int i = this.f20023m;
            for (int i2 = 1; i2 < i; i2++) {
                this.f20021k.write(this.f20024n);
            }
        }
    }

    /* renamed from: w0 */
    private void m16907w0() {
        if (this.f20028r != null) {
            m16920b();
            m16923S(this.f20028r);
            this.f20028r = null;
        }
    }

    /* renamed from: z */
    private C9126c m16906z(int i, char c) {
        m16917g();
        m16926H(i);
        this.f20021k.write(c);
        return this;
    }

    /* renamed from: R */
    public final void m16924R(String str) {
        if (str.length() == 0) {
            this.f20024n = null;
            this.f20025o = ":";
            return;
        }
        this.f20024n = str;
        this.f20025o = ": ";
    }

    /* renamed from: U */
    public C9126c m16922U(long j) {
        m16907w0();
        m16917g();
        this.f20021k.write(Long.toString(j));
        return this;
    }

    /* renamed from: Y */
    public C9126c m16921Y(Boolean bool) {
        String str;
        if (bool == null) {
            return m16908t();
        }
        m16907w0();
        m16917g();
        Writer writer = this.f20021k;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: b0 */
    public C9126c m16919b0(Number number) {
        if (number == null) {
            return m16908t();
        }
        m16907w0();
        String obj = number.toString();
        if (this.f20026p || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m16917g();
            this.f20021k.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20021k.close();
        int i = this.f20023m;
        if (i > 1 || (i == 1 && this.f20022l[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f20023m = 0;
    }

    /* renamed from: f0 */
    public C9126c m16918f0(String str) {
        if (str == null) {
            return m16908t();
        }
        m16907w0();
        m16917g();
        m16923S(str);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f20023m != 0) {
            this.f20021k.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public C9126c m16916h() {
        m16907w0();
        return m16906z(1, '[');
    }

    /* renamed from: i */
    public C9126c m16915i() {
        m16907w0();
        return m16906z(3, '{');
    }

    /* renamed from: j0 */
    public C9126c m16914j0(boolean z) {
        String str;
        m16907w0();
        m16917g();
        Writer writer = this.f20021k;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: n */
    public C9126c m16912n() {
        return m16913l(1, 2, ']');
    }

    /* renamed from: p */
    public C9126c m16911p() {
        return m16913l(3, 5, '}');
    }

    /* renamed from: r */
    public C9126c m16910r(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f20028r != null) {
            throw new IllegalStateException();
        } else if (this.f20023m != 0) {
            this.f20028r = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: t */
    public C9126c m16908t() {
        if (this.f20028r != null) {
            if (this.f20029s) {
                m16907w0();
            } else {
                this.f20028r = null;
                return this;
            }
        }
        m16917g();
        this.f20021k.write("null");
        return this;
    }
}
