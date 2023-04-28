package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p163j$.util.Spliterator;

/* renamed from: io.sentry.vendor.gson.stream.a */
/* loaded from: classes8.dex */
public class C9124a implements Closeable {

    /* renamed from: k */
    private final Reader f20004k;

    /* renamed from: s */
    private long f20012s;

    /* renamed from: t */
    private int f20013t;

    /* renamed from: u */
    private String f20014u;

    /* renamed from: v */
    private int[] f20015v;

    /* renamed from: l */
    private boolean f20005l = false;

    /* renamed from: m */
    private final char[] f20006m = new char[Spliterator.IMMUTABLE];

    /* renamed from: n */
    private int f20007n = 0;

    /* renamed from: o */
    private int f20008o = 0;

    /* renamed from: p */
    private int f20009p = 0;

    /* renamed from: q */
    private int f20010q = 0;

    /* renamed from: r */
    int f20011r = 0;

    /* renamed from: w */
    private int f20016w = 0 + 1;

    /* renamed from: x */
    private String[] f20017x = new String[32];

    /* renamed from: y */
    private int[] f20018y = new int[32];

    public C9124a(Reader reader) {
        int[] iArr = new int[32];
        this.f20015v = iArr;
        iArr[0] = 6;
        if (reader != null) {
            this.f20004k = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
        if (m16931t(r14) != false) goto L_0x00c9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r9 != 2) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
        if (r10 == false) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x009f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
        if (r13 == false) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (r11 != 0) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
        if (r13 != false) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a7, code lost:
        if (r13 == false) goto L_0x00aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ab, code lost:
        r18.f20012s = r11;
        r18.f20007n += r8;
        r18.f20011r = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
        if (r9 == 2) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
        if (r9 == 4) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        if (r9 != 7) goto L_0x00c0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c2, code lost:
        r18.f20013t = r8;
        r18.f20011r = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
        return 0;
     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m16958F0() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9124a.m16958F0():int");
    }

    /* renamed from: G0 */
    private void m16957G0(int i) {
        int i2 = this.f20016w;
        int[] iArr = this.f20015v;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f20015v = Arrays.copyOf(iArr, i3);
            this.f20018y = Arrays.copyOf(this.f20018y, i3);
            this.f20017x = (String[]) Arrays.copyOf(this.f20017x, i3);
        }
        int[] iArr2 = this.f20015v;
        int i4 = this.f20016w;
        this.f20016w = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: H0 */
    private char m16955H0() {
        int i;
        int i2;
        if (this.f20007n != this.f20008o || m16933r(1)) {
            char[] cArr = this.f20006m;
            int i3 = this.f20007n;
            int i4 = i3 + 1;
            this.f20007n = i4;
            char c = cArr[i3];
            if (c == '\n') {
                this.f20009p++;
                this.f20010q = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    throw m16949N0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f20008o || m16933r(4)) {
                    int i5 = this.f20007n;
                    int i6 = i5 + 4;
                    char c2 = 0;
                    while (i5 < i6) {
                        char c3 = this.f20006m[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f20006m, this.f20007n, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f20007n += 4;
                    return c2;
                } else {
                    throw m16949N0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m16949N0("Unterminated escape sequence");
    }

    /* renamed from: I0 */
    private void m16954I0(char c) {
        char[] cArr = this.f20006m;
        do {
            int i = this.f20007n;
            int i2 = this.f20008o;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f20007n = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f20007n = i3;
                    m16955H0();
                    i = this.f20007n;
                    i2 = this.f20008o;
                } else {
                    if (c2 == '\n') {
                        this.f20009p++;
                        this.f20010q = i3;
                    }
                    i = i3;
                }
            }
            this.f20007n = i;
        } while (m16933r(1));
        throw m16949N0("Unterminated string");
    }

    /* renamed from: J0 */
    private boolean m16953J0(String str) {
        int length = str.length();
        while (true) {
            if (this.f20007n + length > this.f20008o && !m16933r(length)) {
                return false;
            }
            char[] cArr = this.f20006m;
            int i = this.f20007n;
            if (cArr[i] == '\n') {
                this.f20009p++;
                this.f20010q = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f20006m[this.f20007n + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f20007n++;
        }
    }

    /* renamed from: K0 */
    private void m16952K0() {
        char c;
        do {
            if (this.f20007n < this.f20008o || m16933r(1)) {
                char[] cArr = this.f20006m;
                int i = this.f20007n;
                int i2 = i + 1;
                this.f20007n = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f20009p++;
                    this.f20010q = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m16939h();
     */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16951L0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f20007n
            int r2 = r1 + r0
            int r3 = r4.f20008o
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f20006m
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.m16939h()
        L_0x004b:
            int r1 = r4.f20007n
            int r1 = r1 + r0
            r4.f20007n = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f20007n = r1
            r0 = 1
            boolean r0 = r4.m16933r(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9124a.m16951L0():void");
    }

    /* renamed from: N0 */
    private IOException m16949N0(String str) {
        throw new C9127d(str + m16929z());
    }

    /* renamed from: U */
    private int m16945U(boolean z) {
        char[] cArr = this.f20006m;
        int i = this.f20007n;
        int i2 = this.f20008o;
        while (true) {
            if (i == i2) {
                this.f20007n = i;
                if (m16933r(1)) {
                    i = this.f20007n;
                    i2 = this.f20008o;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + m16929z());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f20009p++;
                this.f20010q = i3;
            } else if (!(c == ' ' || c == '\r' || c == '\t')) {
                if (c == '/') {
                    this.f20007n = i3;
                    if (i3 == i2) {
                        this.f20007n = i3 - 1;
                        boolean r = m16933r(2);
                        this.f20007n++;
                        if (!r) {
                            return c;
                        }
                    }
                    m16939h();
                    int i4 = this.f20007n;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f20007n = i4 + 1;
                        if (m16953J0("*/")) {
                            i = this.f20007n + 2;
                            i2 = this.f20008o;
                        } else {
                            throw m16949N0("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f20007n = i4 + 1;
                        m16952K0();
                        i = this.f20007n;
                        i2 = this.f20008o;
                    }
                } else if (c == '#') {
                    this.f20007n = i3;
                    m16939h();
                    m16952K0();
                    i = this.f20007n;
                    i2 = this.f20008o;
                } else {
                    this.f20007n = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r2, r2 - r2);
        r9.f20007n = r2;
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m16942b0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f20006m
            r1 = 0
        L_0x0003:
            int r2 = r9.f20007n
            int r3 = r9.f20008o
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f20007n = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f20007n = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.m16955H0()
            r1.append(r2)
            int r2 = r9.f20007n
            int r3 = r9.f20008o
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f20009p
            int r2 = r2 + r6
            r9.f20009p = r2
            r9.f20010q = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f20007n = r2
            boolean r2 = r9.m16933r(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m16949N0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9124a.m16942b0(char):java.lang.String");
    }

    /* renamed from: h */
    private void m16939h() {
        if (!this.f20005l) {
            throw m16949N0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: i */
    private void m16938i() {
        m16945U(true);
        int i = this.f20007n - 1;
        this.f20007n = i;
        if (i + 5 <= this.f20008o || m16933r(5)) {
            char[] cArr = this.f20006m;
            if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == '\n') {
                this.f20007n += 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m16939h();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m16937j0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f20007n
            int r4 = r3 + r2
            int r5 = r6.f20008o
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f20006m
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m16939h()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f20006m
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m16933r(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f20006m
            int r4 = r6.f20007n
            r0.append(r3, r4, r2)
            int r3 = r6.f20007n
            int r3 = r3 + r2
            r6.f20007n = r3
            r2 = 1
            boolean r2 = r6.m16933r(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f20006m
            int r3 = r6.f20007n
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f20006m
            int r3 = r6.f20007n
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f20007n
            int r2 = r2 + r1
            r6.f20007n = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9124a.m16937j0():java.lang.String");
    }

    /* renamed from: r */
    private boolean m16933r(int i) {
        int i2;
        int i3;
        char[] cArr = this.f20006m;
        int i4 = this.f20010q;
        int i5 = this.f20007n;
        this.f20010q = i4 - i5;
        int i6 = this.f20008o;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f20008o = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f20008o = 0;
        }
        this.f20007n = 0;
        do {
            Reader reader = this.f20004k;
            int i8 = this.f20008o;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f20008o + read;
            this.f20008o = i2;
            if (this.f20009p == 0 && (i3 = this.f20010q) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f20007n++;
                this.f20010q = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: t */
    private boolean m16931t(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m16939h();
        return false;
    }

    /* renamed from: z0 */
    private int m16928z0() {
        int i;
        String str;
        String str2;
        char c = this.f20006m[this.f20007n];
        if (c == 't' || c == 'T') {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f20007n + i2 >= this.f20008o && !m16933r(i2 + 1)) {
                return 0;
            }
            char c2 = this.f20006m[this.f20007n + i2];
            if (!(c2 == str2.charAt(i2) || c2 == str.charAt(i2))) {
                return 0;
            }
        }
        if ((this.f20007n + length < this.f20008o || m16933r(length + 1)) && m16931t(this.f20006m[this.f20007n + length])) {
            return 0;
        }
        this.f20007n += length;
        this.f20011r = i;
        return i;
    }

    /* renamed from: C */
    public boolean m16959C() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 5) {
            this.f20011r = 0;
            int[] iArr = this.f20018y;
            int i2 = this.f20016w - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f20011r = 0;
            int[] iArr2 = this.f20018y;
            int i3 = this.f20016w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + m16930w0() + m16929z());
        }
    }

    /* renamed from: H */
    public double m16956H() {
        char c;
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 15) {
            this.f20011r = 0;
            int[] iArr = this.f20018y;
            int i2 = this.f20016w - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f20012s;
        }
        if (i == 16) {
            this.f20014u = new String(this.f20006m, this.f20007n, this.f20013t);
            this.f20007n += this.f20013t;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f20014u = m16942b0(c);
        } else if (i == 10) {
            this.f20014u = m16937j0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + m16930w0() + m16929z());
        }
        this.f20011r = 11;
        double parseDouble = Double.parseDouble(this.f20014u);
        if (this.f20005l || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f20014u = null;
            this.f20011r = 0;
            int[] iArr2 = this.f20018y;
            int i3 = this.f20016w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C9127d("JSON forbids NaN and infinities: " + parseDouble + m16929z());
    }

    /* renamed from: M0 */
    public void m16950M0() {
        int i = 0;
        do {
            int i2 = this.f20011r;
            if (i2 == 0) {
                i2 = m16936l();
            }
            if (i2 == 3) {
                m16957G0(1);
            } else if (i2 == 1) {
                m16957G0(3);
            } else {
                if (i2 == 4) {
                    this.f20016w--;
                } else if (i2 == 2) {
                    this.f20016w--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        m16951L0();
                    } else if (i2 == 8 || i2 == 12) {
                        m16954I0('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        m16954I0('\"');
                    } else if (i2 == 16) {
                        this.f20007n += this.f20013t;
                    }
                    this.f20011r = 0;
                }
                i--;
                this.f20011r = 0;
            }
            i++;
            this.f20011r = 0;
        } while (i != 0);
        int[] iArr = this.f20018y;
        int i3 = this.f20016w;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f20017x[i3 - 1] = "null";
    }

    /* renamed from: Q */
    public int m16948Q() {
        char c;
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 15) {
            long j = this.f20012s;
            int i2 = (int) j;
            if (j == i2) {
                this.f20011r = 0;
                int[] iArr = this.f20018y;
                int i3 = this.f20016w - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f20012s + m16929z());
        }
        if (i == 16) {
            this.f20014u = new String(this.f20006m, this.f20007n, this.f20013t);
            this.f20007n += this.f20013t;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f20014u = m16937j0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f20014u = m16942b0(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f20014u);
                this.f20011r = 0;
                int[] iArr2 = this.f20018y;
                int i4 = this.f20016w - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + m16930w0() + m16929z());
        }
        this.f20011r = 11;
        double parseDouble = Double.parseDouble(this.f20014u);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f20014u = null;
            this.f20011r = 0;
            int[] iArr3 = this.f20018y;
            int i6 = this.f20016w - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f20014u + m16929z());
    }

    /* renamed from: R */
    public long m16947R() {
        char c;
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 15) {
            this.f20011r = 0;
            int[] iArr = this.f20018y;
            int i2 = this.f20016w - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f20012s;
        }
        if (i == 16) {
            this.f20014u = new String(this.f20006m, this.f20007n, this.f20013t);
            this.f20007n += this.f20013t;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f20014u = m16937j0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f20014u = m16942b0(c);
            }
            try {
                long parseLong = Long.parseLong(this.f20014u);
                this.f20011r = 0;
                int[] iArr2 = this.f20018y;
                int i3 = this.f20016w - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + m16930w0() + m16929z());
        }
        this.f20011r = 11;
        double parseDouble = Double.parseDouble(this.f20014u);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f20014u = null;
            this.f20011r = 0;
            int[] iArr3 = this.f20018y;
            int i4 = this.f20016w - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f20014u + m16929z());
    }

    /* renamed from: S */
    public String m16946S() {
        String str;
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 14) {
            str = m16937j0();
        } else if (i == 12) {
            str = m16942b0('\'');
        } else if (i == 13) {
            str = m16942b0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + m16930w0() + m16929z());
        }
        this.f20011r = 0;
        this.f20017x[this.f20016w - 1] = str;
        return str;
    }

    /* renamed from: Y */
    public void m16944Y() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 7) {
            this.f20011r = 0;
            int[] iArr = this.f20018y;
            int i2 = this.f20016w - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m16930w0() + m16929z());
    }

    /* renamed from: b */
    public void m16943b() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 3) {
            m16957G0(1);
            this.f20018y[this.f20016w - 1] = 0;
            this.f20011r = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m16930w0() + m16929z());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20011r = 0;
        this.f20015v[0] = 8;
        this.f20016w = 1;
        this.f20004k.close();
    }

    /* renamed from: f0 */
    public String m16941f0() {
        String str;
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 10) {
            str = m16937j0();
        } else if (i == 8) {
            str = m16942b0('\'');
        } else if (i == 9) {
            str = m16942b0('\"');
        } else if (i == 11) {
            str = this.f20014u;
            this.f20014u = null;
        } else if (i == 15) {
            str = Long.toString(this.f20012s);
        } else if (i == 16) {
            str = new String(this.f20006m, this.f20007n, this.f20013t);
            this.f20007n += this.f20013t;
        } else {
            throw new IllegalStateException("Expected a string but was " + m16930w0() + m16929z());
        }
        this.f20011r = 0;
        int[] iArr = this.f20018y;
        int i2 = this.f20016w - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: g */
    public void m16940g() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 1) {
            m16957G0(3);
            this.f20011r = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m16930w0() + m16929z());
    }

    /* renamed from: l */
    int m16936l() {
        int U;
        int[] iArr = this.f20015v;
        int i = this.f20016w;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int U2 = m16945U(true);
            if (U2 != 44) {
                if (U2 == 59) {
                    m16939h();
                } else if (U2 == 93) {
                    this.f20011r = 4;
                    return 4;
                } else {
                    throw m16949N0("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (U = m16945U(true)) != 44) {
                if (U == 59) {
                    m16939h();
                } else if (U == 125) {
                    this.f20011r = 2;
                    return 2;
                } else {
                    throw m16949N0("Unterminated object");
                }
            }
            int U3 = m16945U(true);
            if (U3 == 34) {
                this.f20011r = 13;
                return 13;
            } else if (U3 == 39) {
                m16939h();
                this.f20011r = 12;
                return 12;
            } else if (U3 != 125) {
                m16939h();
                this.f20007n--;
                if (m16931t((char) U3)) {
                    this.f20011r = 14;
                    return 14;
                }
                throw m16949N0("Expected name");
            } else if (i2 != 5) {
                this.f20011r = 2;
                return 2;
            } else {
                throw m16949N0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int U4 = m16945U(true);
            if (U4 != 58) {
                if (U4 == 61) {
                    m16939h();
                    if (this.f20007n < this.f20008o || m16933r(1)) {
                        char[] cArr = this.f20006m;
                        int i3 = this.f20007n;
                        if (cArr[i3] == '>') {
                            this.f20007n = i3 + 1;
                        }
                    }
                } else {
                    throw m16949N0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f20005l) {
                m16938i();
            }
            this.f20015v[this.f20016w - 1] = 7;
        } else if (i2 == 7) {
            if (m16945U(false) == -1) {
                this.f20011r = 17;
                return 17;
            }
            m16939h();
            this.f20007n--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int U5 = m16945U(true);
        if (U5 == 34) {
            this.f20011r = 9;
            return 9;
        } else if (U5 != 39) {
            if (!(U5 == 44 || U5 == 59)) {
                if (U5 == 91) {
                    this.f20011r = 3;
                    return 3;
                } else if (U5 != 93) {
                    if (U5 != 123) {
                        this.f20007n--;
                        int z0 = m16928z0();
                        if (z0 != 0) {
                            return z0;
                        }
                        int F0 = m16958F0();
                        if (F0 != 0) {
                            return F0;
                        }
                        if (m16931t(this.f20006m[this.f20007n])) {
                            m16939h();
                            this.f20011r = 10;
                            return 10;
                        }
                        throw m16949N0("Expected value");
                    }
                    this.f20011r = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f20011r = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m16939h();
                this.f20007n--;
                this.f20011r = 7;
                return 7;
            }
            throw m16949N0("Unexpected value");
        } else {
            m16939h();
            this.f20011r = 8;
            return 8;
        }
    }

    /* renamed from: n */
    public void m16935n() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 4) {
            int i2 = this.f20016w - 1;
            this.f20016w = i2;
            int[] iArr = this.f20018y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f20011r = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + m16930w0() + m16929z());
    }

    /* renamed from: p */
    public void m16934p() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        if (i == 2) {
            int i2 = this.f20016w - 1;
            this.f20016w = i2;
            this.f20017x[i2] = null;
            int[] iArr = this.f20018y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f20011r = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + m16930w0() + m16929z());
    }

    /* renamed from: s */
    public String m16932s() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = this.f20016w;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f20015v[i2];
            if (i3 == 1 || i3 == 2) {
                sb2.append('[');
                sb2.append(this.f20018y[i2]);
                sb2.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb2.append('.');
                String str = this.f20017x[i2];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + m16929z();
    }

    /* renamed from: w0 */
    public EnumC9125b m16930w0() {
        int i = this.f20011r;
        if (i == 0) {
            i = m16936l();
        }
        switch (i) {
            case 1:
                return EnumC9125b.BEGIN_OBJECT;
            case 2:
                return EnumC9125b.END_OBJECT;
            case 3:
                return EnumC9125b.BEGIN_ARRAY;
            case 4:
                return EnumC9125b.END_ARRAY;
            case 5:
            case 6:
                return EnumC9125b.BOOLEAN;
            case 7:
                return EnumC9125b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC9125b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC9125b.NAME;
            case 15:
            case 16:
                return EnumC9125b.NUMBER;
            case 17:
                return EnumC9125b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: z */
    String m16929z() {
        return " at line " + (this.f20009p + 1) + " column " + ((this.f20007n - this.f20010q) + 1) + " path " + m16932s();
    }
}
