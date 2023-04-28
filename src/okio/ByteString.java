package okio;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import fk.C7353a;
import fk.C7354b;
import fk.C7355c;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p122gk.C7709b;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\u0011\b\u0000\u0012\u0006\u0010=\u001a\u00020\u0017¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\u0007\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0000J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u000f\u0010\u0019\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J'\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0010¢\u0006\u0004\b#\u0010$J(\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016J(\u0010)\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u000e\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0000J\u0013\u0010-\u001a\u00020'2\b\u0010%\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010.\u001a\u00020\u000eH\u0016J\u0011\u0010/\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0000H\u0096\u0002J\b\u00100\u001a\u00020\u0003H\u0016R\"\u0010.\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R$\u0010:\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010=\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010\u001aR\u0011\u0010?\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b>\u0010\u0016¨\u0006C"}, m15073d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "", "B", "a", "n", "t", "u", "algorithm", "d", "(Ljava/lang/String;)Lokio/ByteString;", "k", "y", "", "pos", "", "m", "(I)B", "index", "f", "i", "()I", "", "z", "l", "()[B", "Ljava/io/OutputStream;", "out", "", "C", "Lokio/Buffer;", "buffer", "offset", "byteCount", "D", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "p", "q", "prefix", "x", "", "equals", "hashCode", "b", "toString", "I", "h", "r", "(I)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "utf8", "[B", "g", "data", "v", "size", "<init>", "([B)V", "o", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: k */
    private transient int f25543k;

    /* renamed from: l */
    private transient String f25544l;

    /* renamed from: m */
    private final byte[] f25545m;

    /* renamed from: o */
    public static final C11437a f25542o = new C11437a(null);

    /* renamed from: n */
    public static final ByteString f25541n = new ByteString(new byte[0]);

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0005*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\fH\u0007J\f\u0010\u0013\u001a\u00020\u0005*\u00020\fH\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m15073d2 = {"Lokio/ByteString$a;", "", "", "", "data", "Lokio/ByteString;", "e", "", "offset", "byteCount", "f", "([BII)Lokio/ByteString;", "", "d", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "a", "b", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okio.ByteString$a */
    /* loaded from: classes8.dex */
    public static final class C11437a {
        private C11437a() {
        }

        public /* synthetic */ C11437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ ByteString m9687g(C11437a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.m9688f(bArr, i, i2);
        }

        /* renamed from: a */
        public final ByteString m9693a(String decodeBase64) {
            C9971q.m14633g(decodeBase64, "$this$decodeBase64");
            byte[] a = C7353a.m22846a(decodeBase64);
            if (a != null) {
                return new ByteString(a);
            }
            return null;
        }

        /* renamed from: b */
        public final ByteString m9692b(String decodeHex) {
            boolean z;
            int g;
            int g2;
            C9971q.m14633g(decodeHex, "$this$decodeHex");
            if (decodeHex.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = decodeHex.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    g = C7709b.m21580g(decodeHex.charAt(i2));
                    g2 = C7709b.m21580g(decodeHex.charAt(i2 + 1));
                    bArr[i] = (byte) ((g << 4) + g2);
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
        }

        /* renamed from: c */
        public final ByteString m9691c(String encode, Charset charset) {
            C9971q.m14633g(encode, "$this$encode");
            C9971q.m14633g(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            C9971q.m14634f(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        /* renamed from: d */
        public final ByteString m9690d(String encodeUtf8) {
            C9971q.m14633g(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(C7354b.m22843a(encodeUtf8));
            byteString.m9700s(encodeUtf8);
            return byteString;
        }

        /* renamed from: e */
        public final ByteString m9689e(byte... data) {
            C9971q.m14633g(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            C9971q.m14634f(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        /* renamed from: f */
        public final ByteString m9688f(byte[] toByteString, int i, int i2) {
            byte[] i3;
            C9971q.m14633g(toByteString, "$this$toByteString");
            C7355c.m22840b(toByteString.length, i, i2);
            i3 = C9897e.m14986i(toByteString, i, i2 + i);
            return new ByteString(i3);
        }
    }

    public ByteString(byte[] data) {
        C9971q.m14633g(data, "data");
        this.f25545m = data;
    }

    /* renamed from: c */
    public static final ByteString m9716c(String str) {
        return f25542o.m9693a(str);
    }

    /* renamed from: e */
    public static final ByteString m9714e(String str) {
        return f25542o.m9690d(str);
    }

    /* renamed from: o */
    public static final ByteString m9704o(byte... bArr) {
        return f25542o.m9689e(bArr);
    }

    /* renamed from: B */
    public String m9721B() {
        String j = m9709j();
        if (j != null) {
            return j;
        }
        String b = C7354b.m22842b(mo9707l());
        m9700s(b);
        return b;
    }

    /* renamed from: C */
    public void mo9720C(OutputStream out) {
        C9971q.m14633g(out, "out");
        out.write(this.f25545m);
    }

    /* renamed from: D */
    public void mo9719D(Buffer buffer, int i, int i2) {
        C9971q.m14633g(buffer, "buffer");
        C7709b.m21581f(this, buffer, i, i2);
    }

    /* renamed from: a */
    public String mo9718a() {
        return C7353a.m22844c(m9712g(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9971q.m14633g(r10, r0)
            int r0 = r9.m9697v()
            int r1 = r10.m9697v()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.m9713f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m9713f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    /* renamed from: d */
    public ByteString mo9715d(String algorithm) {
        C9971q.m14633g(algorithm, "algorithm");
        return C7709b.m21583d(this, algorithm);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.m9697v() == m9712g().length && byteString.mo9702q(0, m9712g(), 0, m9712g().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte m9713f(int i) {
        return mo9706m(i);
    }

    /* renamed from: g */
    public final byte[] m9712g() {
        return this.f25545m;
    }

    /* renamed from: h */
    public final int m9711h() {
        return this.f25543k;
    }

    public int hashCode() {
        int h = m9711h();
        if (h != 0) {
            return h;
        }
        int hashCode = Arrays.hashCode(m9712g());
        m9701r(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public int mo9710i() {
        return m9712g().length;
    }

    /* renamed from: j */
    public final String m9709j() {
        return this.f25544l;
    }

    /* renamed from: k */
    public String mo9708k() {
        byte[] g;
        char[] cArr = new char[m9712g().length * 2];
        int i = 0;
        for (byte b : m9712g()) {
            int i2 = i + 1;
            cArr[i] = C7709b.m21579h()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C7709b.m21579h()[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: l */
    public byte[] mo9707l() {
        return m9712g();
    }

    /* renamed from: m */
    public byte mo9706m(int i) {
        return m9712g()[i];
    }

    /* renamed from: n */
    public final ByteString m9705n() {
        return mo9715d("MD5");
    }

    /* renamed from: p */
    public boolean mo9703p(int i, ByteString other, int i2, int i3) {
        C9971q.m14633g(other, "other");
        return other.mo9702q(i2, m9712g(), i, i3);
    }

    /* renamed from: q */
    public boolean mo9702q(int i, byte[] other, int i2, int i3) {
        C9971q.m14633g(other, "other");
        if (i < 0 || i > m9712g().length - i3 || i2 < 0 || i2 > other.length - i3 || !C7355c.m22841a(m9712g(), i, other, i2, i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void m9701r(int i) {
        this.f25543k = i;
    }

    /* renamed from: s */
    public final void m9700s(String str) {
        this.f25544l = str;
    }

    /* renamed from: t */
    public final ByteString m9699t() {
        return mo9715d("SHA-1");
    }

    public String toString() {
        boolean z;
        int c;
        String D;
        String D2;
        String D3;
        ByteString byteString;
        byte[] i;
        boolean z2 = true;
        if (m9712g().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "[size=0]";
        }
        c = C7709b.m21584c(m9712g(), 64);
        if (c != -1) {
            String B = m9721B();
            if (B != null) {
                String substring = B.substring(0, c);
                C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                D = C12718u.m5740D(substring, "\\", "\\\\", false, 4, null);
                D2 = C12718u.m5740D(D, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, null);
                D3 = C12718u.m5740D(D2, "\r", "\\r", false, 4, null);
                if (c < B.length()) {
                    return "[size=" + m9712g().length + " text=" + D3 + "…]";
                }
                return "[text=" + D3 + ']';
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (m9712g().length <= 64) {
            return "[hex=" + mo9708k() + ']';
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(m9712g().length);
            sb2.append(" hex=");
            if (64 > m9712g().length) {
                z2 = false;
            }
            if (z2) {
                if (64 == m9712g().length) {
                    byteString = this;
                } else {
                    i = C9897e.m14986i(m9712g(), 0, 64);
                    byteString = new ByteString(i);
                }
                sb2.append(byteString.mo9708k());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + m9712g().length + ')').toString());
        }
    }

    /* renamed from: u */
    public final ByteString m9698u() {
        return mo9715d("SHA-256");
    }

    /* renamed from: v */
    public final int m9697v() {
        return mo9710i();
    }

    /* renamed from: x */
    public final boolean m9696x(ByteString prefix) {
        C9971q.m14633g(prefix, "prefix");
        return mo9703p(0, prefix, 0, prefix.m9697v());
    }

    /* renamed from: y */
    public ByteString mo9695y() {
        byte b;
        for (int i = 0; i < m9712g().length; i++) {
            byte b2 = m9712g()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] g = m9712g();
                byte[] copyOf = Arrays.copyOf(g, g.length);
                C9971q.m14634f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    /* renamed from: z */
    public byte[] mo9694z() {
        byte[] g = m9712g();
        byte[] copyOf = Arrays.copyOf(g, g.length);
        C9971q.m14634f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }
}
