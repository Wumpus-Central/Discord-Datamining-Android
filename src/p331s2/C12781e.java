package p331s2;

import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p331s2.AbstractC12777c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s2.e */
/* loaded from: classes.dex */
public final class C12781e extends AbstractC12777c {

    /* renamed from: r */
    private final BufferedSource f28700r;

    /* renamed from: s */
    private final Buffer f28701s;

    /* renamed from: t */
    private int f28702t = 0;

    /* renamed from: u */
    private long f28703u;

    /* renamed from: v */
    private int f28704v;

    /* renamed from: w */
    private String f28705w;

    /* renamed from: x */
    private static final ByteString f28697x = ByteString.m9714e("'\\");

    /* renamed from: y */
    private static final ByteString f28698y = ByteString.m9714e("\"\\");

    /* renamed from: z */
    private static final ByteString f28699z = ByteString.m9714e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: A */
    private static final ByteString f39341A = ByteString.m9714e("\n\r");

    /* renamed from: B */
    private static final ByteString f39342B = ByteString.m9714e("*/");

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12781e(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f28700r = bufferedSource;
            this.f28701s = bufferedSource.mo9728o();
            m5516R(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: F0 */
    private boolean m5508F0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m5490j0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r6.f28701s.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r6.f28700r.mo9738P(2) != false) goto L_0x003c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        m5490j0();
        r3 = r6.f28701s.m9792C(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6.f28701s.readByte();
        r6.f28701s.readByte();
        m5499O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r6.f28701s.readByte();
        r6.f28701s.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (m5500N0() == false) goto L_0x006d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        throw m5513f0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        m5490j0();
        m5499O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        return r1;
     */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m5507G0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            okio.BufferedSource r2 = r6.f28700r
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo9738P(r4)
            if (r2 == 0) goto L_0x0082
            okio.Buffer r2 = r6.f28701s
            long r4 = (long) r1
            byte r1 = r2.m9792C(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            okio.Buffer r2 = r6.f28701s
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            okio.BufferedSource r3 = r6.f28700r
            r4 = 2
            boolean r3 = r3.mo9738P(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m5490j0()
            okio.Buffer r3 = r6.f28701s
            r4 = 1
            byte r3 = r3.m9792C(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            okio.Buffer r1 = r6.f28701s
            r1.readByte()
            okio.Buffer r1 = r6.f28701s
            r1.readByte()
            r6.m5499O0()
            goto L_0x0001
        L_0x005c:
            okio.Buffer r1 = r6.f28701s
            r1.readByte()
            okio.Buffer r1 = r6.f28701s
            r1.readByte()
            boolean r1 = r6.m5500N0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            s2.b r7 = r6.m5513f0(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m5490j0()
            r6.m5499O0()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p331s2.C12781e.m5507G0(boolean):int");
    }

    /* renamed from: H0 */
    private String m5506H0(ByteString byteString) {
        StringBuilder sb2 = null;
        while (true) {
            long A = this.f28700r.mo9742A(byteString);
            if (A == -1) {
                throw m5513f0("Unterminated string");
            } else if (this.f28701s.m9792C(A) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f28701s.m9756z0(A));
                this.f28701s.readByte();
                sb2.append(m5502L0());
            } else if (sb2 == null) {
                String z0 = this.f28701s.m9756z0(A);
                this.f28701s.readByte();
                return z0;
            } else {
                sb2.append(this.f28701s.m9756z0(A));
                this.f28701s.readByte();
                return sb2.toString();
            }
        }
    }

    /* renamed from: I0 */
    private String m5505I0() {
        long A = this.f28700r.mo9742A(f28699z);
        if (A != -1) {
            return this.f28701s.m9756z0(A);
        }
        return this.f28701s.mo9726s0();
    }

    /* renamed from: J0 */
    private int m5504J0() {
        int i;
        String str;
        String str2;
        byte C = this.f28701s.m9792C(0L);
        if (C == 116 || C == 84) {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (C == 102 || C == 70) {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (C != 110 && C != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f28700r.mo9738P(i3)) {
                return 0;
            }
            byte C2 = this.f28701s.m9792C(i2);
            if (C2 != str2.charAt(i2) && C2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f28700r.mo9738P(length + 1) && m5508F0(this.f28701s.m9792C(length))) {
            return 0;
        }
        this.f28701s.skip(length);
        this.f28702t = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
        if (m5508F0(r11) != false) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r6 != 2) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
        if (r7 == false) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
        if (r8 != Long.MIN_VALUE) goto L_0x008f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
        if (r10 == false) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
        if (r8 != 0) goto L_0x0095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r10 != false) goto L_0x00a6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
        if (r10 == false) goto L_0x0098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
        r16.f28703u = r8;
        r16.f28701s.skip(r5);
        r16.f28702t = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a6, code lost:
        if (r6 == 2) goto L_0x00b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        if (r6 == 4) goto L_0x00b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ac, code lost:
        if (r6 != 7) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b0, code lost:
        r16.f28704v = r5;
        r16.f28702t = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
        return 0;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m5503K0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331s2.C12781e.m5503K0():int");
    }

    /* renamed from: L0 */
    private char m5502L0() {
        int i;
        int i2;
        if (this.f28700r.mo9738P(1L)) {
            byte readByte = this.f28701s.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                if (this.f28682o) {
                    return (char) readByte;
                }
                throw m5513f0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f28700r.mo9738P(4L)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte C = this.f28701s.m9792C(i3);
                    char c2 = (char) (c << 4);
                    if (C < 48 || C > 57) {
                        if (C >= 97 && C <= 102) {
                            i = C - 97;
                        } else if (C < 65 || C > 70) {
                            throw m5513f0("\\u" + this.f28701s.m9756z0(4L));
                        } else {
                            i = C - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = C - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f28701s.skip(4L);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + m5512n());
            }
        } else {
            throw m5513f0("Unterminated escape sequence");
        }
    }

    /* renamed from: M0 */
    private void m5501M0(ByteString byteString) {
        while (true) {
            long A = this.f28700r.mo9742A(byteString);
            if (A == -1) {
                throw m5513f0("Unterminated string");
            } else if (this.f28701s.m9792C(A) == 92) {
                this.f28701s.skip(A + 1);
                m5502L0();
            } else {
                this.f28701s.skip(A + 1);
                return;
            }
        }
    }

    /* renamed from: N0 */
    private boolean m5500N0() {
        boolean z;
        long j;
        BufferedSource bufferedSource = this.f28700r;
        ByteString byteString = f39342B;
        long v = bufferedSource.mo9724v(byteString);
        if (v != -1) {
            z = true;
        } else {
            z = false;
        }
        Buffer buffer = this.f28701s;
        if (z) {
            j = v + byteString.m9697v();
        } else {
            j = buffer.size();
        }
        buffer.skip(j);
        return z;
    }

    /* renamed from: O0 */
    private void m5499O0() {
        long j;
        long A = this.f28700r.mo9742A(f39341A);
        Buffer buffer = this.f28701s;
        if (A != -1) {
            j = A + 1;
        } else {
            j = buffer.size();
        }
        buffer.skip(j);
    }

    /* renamed from: P0 */
    private void m5498P0() {
        long A = this.f28700r.mo9742A(f28699z);
        Buffer buffer = this.f28701s;
        if (A == -1) {
            A = buffer.size();
        }
        buffer.skip(A);
    }

    /* renamed from: j0 */
    private void m5490j0() {
        if (!this.f28682o) {
            throw m5513f0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: w0 */
    private int m5484w0() {
        int[] iArr = this.f28679l;
        int i = this.f28678k;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int G0 = m5507G0(true);
            this.f28701s.readByte();
            if (G0 != 44) {
                if (G0 == 59) {
                    m5490j0();
                } else if (G0 == 93) {
                    this.f28702t = 4;
                    return 4;
                } else {
                    throw m5513f0("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int G02 = m5507G0(true);
                this.f28701s.readByte();
                if (G02 != 44) {
                    if (G02 == 59) {
                        m5490j0();
                    } else if (G02 == 125) {
                        this.f28702t = 2;
                        return 2;
                    } else {
                        throw m5513f0("Unterminated object");
                    }
                }
            }
            int G03 = m5507G0(true);
            if (G03 == 34) {
                this.f28701s.readByte();
                this.f28702t = 13;
                return 13;
            } else if (G03 == 39) {
                this.f28701s.readByte();
                m5490j0();
                this.f28702t = 12;
                return 12;
            } else if (G03 != 125) {
                m5490j0();
                if (m5508F0((char) G03)) {
                    this.f28702t = 14;
                    return 14;
                }
                throw m5513f0("Expected name");
            } else if (i2 != 5) {
                this.f28701s.readByte();
                this.f28702t = 2;
                return 2;
            } else {
                throw m5513f0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int G04 = m5507G0(true);
            this.f28701s.readByte();
            if (G04 != 58) {
                if (G04 == 61) {
                    m5490j0();
                    if (this.f28700r.mo9738P(1L) && this.f28701s.m9792C(0L) == 62) {
                        this.f28701s.readByte();
                    }
                } else {
                    throw m5513f0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m5507G0(false) == -1) {
                this.f28702t = 18;
                return 18;
            }
            m5490j0();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int G05 = m5507G0(true);
        if (G05 == 34) {
            this.f28701s.readByte();
            this.f28702t = 9;
            return 9;
        } else if (G05 != 39) {
            if (!(G05 == 44 || G05 == 59)) {
                if (G05 == 91) {
                    this.f28701s.readByte();
                    this.f28702t = 3;
                    return 3;
                } else if (G05 != 93) {
                    if (G05 != 123) {
                        int J0 = m5504J0();
                        if (J0 != 0) {
                            return J0;
                        }
                        int K0 = m5503K0();
                        if (K0 != 0) {
                            return K0;
                        }
                        if (m5508F0(this.f28701s.m9792C(0L))) {
                            m5490j0();
                            this.f28702t = 10;
                            return 10;
                        }
                        throw m5513f0("Expected value");
                    }
                    this.f28701s.readByte();
                    this.f28702t = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f28701s.readByte();
                    this.f28702t = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m5490j0();
                this.f28702t = 7;
                return 7;
            }
            throw m5513f0("Unexpected value");
        } else {
            m5490j0();
            this.f28701s.readByte();
            this.f28702t = 8;
            return 8;
        }
    }

    /* renamed from: z0 */
    private int m5482z0(String str, AbstractC12777c.C12778a aVar) {
        int length = aVar.f28684a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f28684a[i])) {
                this.f28702t = 0;
                this.f28680m[this.f28678k - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: C */
    public String mo5509C() {
        String str;
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 10) {
            str = m5505I0();
        } else if (i == 9) {
            str = m5506H0(f28698y);
        } else if (i == 8) {
            str = m5506H0(f28697x);
        } else if (i == 11) {
            str = this.f28705w;
            this.f28705w = null;
        } else if (i == 16) {
            str = Long.toString(this.f28703u);
        } else if (i == 17) {
            str = this.f28701s.m9756z0(this.f28704v);
        } else {
            throw new C12775a("Expected a string but was " + mo5497Q() + " at path " + m5512n());
        }
        this.f28702t = 0;
        int[] iArr = this.f28681n;
        int i2 = this.f28678k - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: Q */
    public AbstractC12777c.EnumC12779b mo5497Q() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        switch (i) {
            case 1:
                return AbstractC12777c.EnumC12779b.BEGIN_OBJECT;
            case 2:
                return AbstractC12777c.EnumC12779b.END_OBJECT;
            case 3:
                return AbstractC12777c.EnumC12779b.BEGIN_ARRAY;
            case 4:
                return AbstractC12777c.EnumC12779b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC12777c.EnumC12779b.BOOLEAN;
            case 7:
                return AbstractC12777c.EnumC12779b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC12777c.EnumC12779b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC12777c.EnumC12779b.NAME;
            case 16:
            case 17:
                return AbstractC12777c.EnumC12779b.NUMBER;
            case 18:
                return AbstractC12777c.EnumC12779b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: S */
    public int mo5496S(AbstractC12777c.C12778a aVar) {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m5482z0(this.f28705w, aVar);
        }
        int t0 = this.f28700r.mo9725t0(aVar.f28685b);
        if (t0 != -1) {
            this.f28702t = 0;
            this.f28680m[this.f28678k - 1] = aVar.f28684a[t0];
            return t0;
        }
        String str = this.f28680m[this.f28678k - 1];
        String z = mo5483z();
        int z0 = m5482z0(z, aVar);
        if (z0 == -1) {
            this.f28702t = 15;
            this.f28705w = z;
            this.f28680m[this.f28678k - 1] = str;
        }
        return z0;
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: U */
    public void mo5495U() {
        if (!this.f28683p) {
            int i = this.f28702t;
            if (i == 0) {
                i = m5484w0();
            }
            if (i == 14) {
                m5498P0();
            } else if (i == 13) {
                m5501M0(f28698y);
            } else if (i == 12) {
                m5501M0(f28697x);
            } else if (i != 15) {
                throw new C12775a("Expected a name but was " + mo5497Q() + " at path " + m5512n());
            }
            this.f28702t = 0;
            this.f28680m[this.f28678k - 1] = "null";
            return;
        }
        throw new C12775a("Cannot skip unexpected " + mo5497Q() + " at " + m5512n());
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: Y */
    public void mo5494Y() {
        if (!this.f28683p) {
            int i = 0;
            do {
                int i2 = this.f28702t;
                if (i2 == 0) {
                    i2 = m5484w0();
                }
                if (i2 == 3) {
                    m5516R(1);
                } else if (i2 == 1) {
                    m5516R(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f28678k--;
                        } else {
                            throw new C12775a("Expected a value but was " + mo5497Q() + " at path " + m5512n());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f28678k--;
                        } else {
                            throw new C12775a("Expected a value but was " + mo5497Q() + " at path " + m5512n());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m5498P0();
                    } else if (i2 == 9 || i2 == 13) {
                        m5501M0(f28698y);
                    } else if (i2 == 8 || i2 == 12) {
                        m5501M0(f28697x);
                    } else if (i2 == 17) {
                        this.f28701s.skip(this.f28704v);
                    } else if (i2 == 18) {
                        throw new C12775a("Expected a value but was " + mo5497Q() + " at path " + m5512n());
                    }
                    this.f28702t = 0;
                }
                i++;
                this.f28702t = 0;
            } while (i != 0);
            int[] iArr = this.f28681n;
            int i3 = this.f28678k;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f28680m[i3 - 1] = "null";
            return;
        }
        throw new C12775a("Cannot skip unexpected " + mo5497Q() + " at " + m5512n());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28702t = 0;
        this.f28679l[0] = 8;
        this.f28678k = 1;
        this.f28701s.m9765h();
        this.f28700r.close();
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: g */
    public void mo5493g() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 3) {
            m5516R(1);
            this.f28681n[this.f28678k - 1] = 0;
            this.f28702t = 0;
            return;
        }
        throw new C12775a("Expected BEGIN_ARRAY but was " + mo5497Q() + " at path " + m5512n());
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: h */
    public void mo5492h() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 1) {
            m5516R(3);
            this.f28702t = 0;
            return;
        }
        throw new C12775a("Expected BEGIN_OBJECT but was " + mo5497Q() + " at path " + m5512n());
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: i */
    public void mo5491i() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 4) {
            int i2 = this.f28678k - 1;
            this.f28678k = i2;
            int[] iArr = this.f28681n;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f28702t = 0;
            return;
        }
        throw new C12775a("Expected END_ARRAY but was " + mo5497Q() + " at path " + m5512n());
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: l */
    public void mo5489l() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 2) {
            int i2 = this.f28678k - 1;
            this.f28678k = i2;
            this.f28680m[i2] = null;
            int[] iArr = this.f28681n;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f28702t = 0;
            return;
        }
        throw new C12775a("Expected END_OBJECT but was " + mo5497Q() + " at path " + m5512n());
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: p */
    public boolean mo5488p() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: r */
    public boolean mo5487r() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 5) {
            this.f28702t = 0;
            int[] iArr = this.f28681n;
            int i2 = this.f28678k - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f28702t = 0;
            int[] iArr2 = this.f28681n;
            int i3 = this.f28678k - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C12775a("Expected a boolean but was " + mo5497Q() + " at path " + m5512n());
        }
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: s */
    public double mo5486s() {
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 16) {
            this.f28702t = 0;
            int[] iArr = this.f28681n;
            int i2 = this.f28678k - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f28703u;
        }
        if (i == 17) {
            this.f28705w = this.f28701s.m9756z0(this.f28704v);
        } else if (i == 9) {
            this.f28705w = m5506H0(f28698y);
        } else if (i == 8) {
            this.f28705w = m5506H0(f28697x);
        } else if (i == 10) {
            this.f28705w = m5505I0();
        } else if (i != 11) {
            throw new C12775a("Expected a double but was " + mo5497Q() + " at path " + m5512n());
        }
        this.f28702t = 11;
        try {
            double parseDouble = Double.parseDouble(this.f28705w);
            if (this.f28682o || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f28705w = null;
                this.f28702t = 0;
                int[] iArr2 = this.f28681n;
                int i3 = this.f28678k - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C12776b("JSON forbids NaN and infinities: " + parseDouble + " at path " + m5512n());
        } catch (NumberFormatException unused) {
            throw new C12775a("Expected a double but was " + this.f28705w + " at path " + m5512n());
        }
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: t */
    public int mo5485t() {
        String str;
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 16) {
            long j = this.f28703u;
            int i2 = (int) j;
            if (j == i2) {
                this.f28702t = 0;
                int[] iArr = this.f28681n;
                int i3 = this.f28678k - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C12775a("Expected an int but was " + this.f28703u + " at path " + m5512n());
        }
        if (i == 17) {
            this.f28705w = this.f28701s.m9756z0(this.f28704v);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m5506H0(f28698y);
            } else {
                str = m5506H0(f28697x);
            }
            this.f28705w = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f28702t = 0;
                int[] iArr2 = this.f28681n;
                int i4 = this.f28678k - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C12775a("Expected an int but was " + mo5497Q() + " at path " + m5512n());
        }
        this.f28702t = 11;
        try {
            double parseDouble = Double.parseDouble(this.f28705w);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f28705w = null;
                this.f28702t = 0;
                int[] iArr3 = this.f28681n;
                int i6 = this.f28678k - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C12775a("Expected an int but was " + this.f28705w + " at path " + m5512n());
        } catch (NumberFormatException unused2) {
            throw new C12775a("Expected an int but was " + this.f28705w + " at path " + m5512n());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f28700r + ")";
    }

    @Override // p331s2.AbstractC12777c
    /* renamed from: z */
    public String mo5483z() {
        String str;
        int i = this.f28702t;
        if (i == 0) {
            i = m5484w0();
        }
        if (i == 14) {
            str = m5505I0();
        } else if (i == 13) {
            str = m5506H0(f28698y);
        } else if (i == 12) {
            str = m5506H0(f28697x);
        } else if (i == 15) {
            str = this.f28705w;
        } else {
            throw new C12775a("Expected a name but was " + mo5497Q() + " at path " + m5512n());
        }
        this.f28702t = 0;
        this.f28680m[this.f28678k - 1] = str;
        return str;
    }
}
