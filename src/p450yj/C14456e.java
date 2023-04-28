package p450yj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.ByteString;
import p163j$.util.Spliterator;
import p326ri.C12718u;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, m15073d2 = {"Lyj/e;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "Lokio/ByteString;", "Lokio/ByteString;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "FLAGS", "d", "BINARY", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.e */
/* loaded from: classes8.dex */
public final class C14456e {

    /* renamed from: d */
    private static final String[] f32710d;

    /* renamed from: e */
    public static final C14456e f32711e = new C14456e();

    /* renamed from: a */
    public static final ByteString f32707a = ByteString.f25542o.m9690d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f32708b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static final String[] f32709c = new String[64];

    static {
        String C;
        String[] strArr = new String[Spliterator.NONNULL];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C9971q.m14634f(binaryString, "Integer.toBinaryString(it)");
            C = C12718u.m5741C(C12729c.m5601q("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i] = C;
        }
        f32710d = strArr;
        String[] strArr2 = f32709c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = C9971q.m14624p("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr2[i2];
            int i4 = iArr[0];
            String[] strArr3 = f32709c;
            int i5 = i4 | i3;
            strArr3[i5] = strArr3[i4] + "|" + strArr3[i3];
            strArr3[i5 | 8] = strArr3[i4] + "|" + strArr3[i3] + "|PADDED";
        }
        int length = f32709c.length;
        for (int i6 = 0; i6 < length; i6++) {
            String[] strArr4 = f32709c;
            if (strArr4[i6] == null) {
                strArr4[i6] = f32710d[i6];
            }
        }
    }

    private C14456e() {
    }

    /* renamed from: a */
    public final String m543a(int i, int i2) {
        String str;
        String D;
        String D2;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                if (i2 == 1) {
                    return "ACK";
                }
                return f32710d[i2];
            } else if (!(i == 7 || i == 8)) {
                String[] strArr = f32709c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C9971q.m14636d(str);
                } else {
                    str = f32710d[i2];
                }
                if (i == 5 && (i2 & 4) != 0) {
                    D2 = C12718u.m5740D(str, "HEADERS", "PUSH_PROMISE", false, 4, null);
                    return D2;
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str;
                } else {
                    D = C12718u.m5740D(str, "PRIORITY", "COMPRESSED", false, 4, null);
                    return D;
                }
            }
        }
        return f32710d[i2];
    }

    /* renamed from: b */
    public final String m542b(int i) {
        String[] strArr = f32708b;
        return i < strArr.length ? strArr[i] : C12729c.m5601q("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String m541c(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String b = m542b(i3);
        String a = m543a(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return C12729c.m5601q("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), b, a);
    }
}
