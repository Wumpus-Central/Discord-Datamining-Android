package p450yj;

import com.facebook.react.uimanager.ViewDefaults;
import fk.C7366m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import p163j$.util.Spliterator;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u000eB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, m15073d2 = {"Lyj/d;", "", "", "Lokio/ByteString;", "", "d", "name", "a", "", "Lyj/c;", "[Lyj/c;", "c", "()[Lyj/c;", "STATIC_HEADER_TABLE", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.d */
/* loaded from: classes8.dex */
public final class C14453d {

    /* renamed from: a */
    private static final C14451c[] f32686a;

    /* renamed from: b */
    private static final Map<ByteString, Integer> f32687b;

    /* renamed from: c */
    public static final C14453d f32688c;

    static {
        C14453d dVar = new C14453d();
        f32688c = dVar;
        ByteString byteString = C14451c.f32678f;
        ByteString byteString2 = C14451c.f32679g;
        ByteString byteString3 = C14451c.f32680h;
        ByteString byteString4 = C14451c.f32677e;
        f32686a = new C14451c[]{new C14451c(C14451c.f32681i, ""), new C14451c(byteString, "GET"), new C14451c(byteString, "POST"), new C14451c(byteString2, "/"), new C14451c(byteString2, "/index.html"), new C14451c(byteString3, "http"), new C14451c(byteString3, "https"), new C14451c(byteString4, "200"), new C14451c(byteString4, "204"), new C14451c(byteString4, "206"), new C14451c(byteString4, "304"), new C14451c(byteString4, "400"), new C14451c(byteString4, "404"), new C14451c(byteString4, "500"), new C14451c("accept-charset", ""), new C14451c("accept-encoding", "gzip, deflate"), new C14451c("accept-language", ""), new C14451c("accept-ranges", ""), new C14451c("accept", ""), new C14451c("access-control-allow-origin", ""), new C14451c("age", ""), new C14451c("allow", ""), new C14451c("authorization", ""), new C14451c("cache-control", ""), new C14451c("content-disposition", ""), new C14451c("content-encoding", ""), new C14451c("content-language", ""), new C14451c("content-length", ""), new C14451c("content-location", ""), new C14451c("content-range", ""), new C14451c("content-type", ""), new C14451c("cookie", ""), new C14451c("date", ""), new C14451c("etag", ""), new C14451c("expect", ""), new C14451c("expires", ""), new C14451c("from", ""), new C14451c("host", ""), new C14451c("if-match", ""), new C14451c("if-modified-since", ""), new C14451c("if-none-match", ""), new C14451c("if-range", ""), new C14451c("if-unmodified-since", ""), new C14451c("last-modified", ""), new C14451c("link", ""), new C14451c("location", ""), new C14451c("max-forwards", ""), new C14451c("proxy-authenticate", ""), new C14451c("proxy-authorization", ""), new C14451c("range", ""), new C14451c("referer", ""), new C14451c("refresh", ""), new C14451c("retry-after", ""), new C14451c("server", ""), new C14451c("set-cookie", ""), new C14451c("strict-transport-security", ""), new C14451c("transfer-encoding", ""), new C14451c("user-agent", ""), new C14451c("vary", ""), new C14451c("via", ""), new C14451c("www-authenticate", "")};
        f32687b = dVar.m569d();
    }

    private C14453d() {
    }

    /* renamed from: d */
    private final Map<ByteString, Integer> m569d() {
        C14451c[] cVarArr = f32686a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            C14451c[] cVarArr2 = f32686a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f32684b)) {
                linkedHashMap.put(cVarArr2[i].f32684b, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9971q.m14634f(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final ByteString m572a(ByteString name) {
        C9971q.m14633g(name, "name");
        int v = name.m9697v();
        for (int i = 0; i < v; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte f = name.m9713f(i);
            if (b <= f && b2 >= f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.m9721B());
            }
        }
        return name;
    }

    /* renamed from: b */
    public final Map<ByteString, Integer> m571b() {
        return f32687b;
    }

    /* renamed from: c */
    public final C14451c[] m570c() {
        return f32686a;
    }

    @Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010$\u001a\u00020.\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0010R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(¨\u00061"}, m15073d2 = {"Lyj/d$a;", "", "", "a", "b", "", "bytesToRecover", "d", "index", "l", "c", "p", "q", "nameIndex", "n", "o", "Lokio/ByteString;", "f", "", "h", "Lyj/c;", "entry", "g", "i", "", "e", "k", "firstByte", "prefixMask", "m", "j", "", "Ljava/util/List;", "headerList", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "", "[Lyj/c;", "dynamicTable", "I", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "maxDynamicTableByteCount", "Lokio/Source;", "<init>", "(Lokio/Source;II)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.d$a */
    /* loaded from: classes8.dex */
    public static final class C14454a {

        /* renamed from: a */
        private final List<C14451c> f32689a;

        /* renamed from: b */
        private final BufferedSource f32690b;

        /* renamed from: c */
        public C14451c[] f32691c;

        /* renamed from: d */
        private int f32692d;

        /* renamed from: e */
        public int f32693e;

        /* renamed from: f */
        public int f32694f;

        /* renamed from: g */
        private final int f32695g;

        /* renamed from: h */
        private int f32696h;

        public C14454a(Source source, int i, int i2) {
            C9971q.m14633g(source, "source");
            this.f32695g = i;
            this.f32696h = i2;
            this.f32689a = new ArrayList();
            this.f32690b = C7366m.m22819d(source);
            C14451c[] cVarArr = new C14451c[8];
            this.f32691c = cVarArr;
            this.f32692d = cVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m568a() {
            int i = this.f32696h;
            int i2 = this.f32694f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m567b();
            } else {
                m565d(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m567b() {
            C9897e.m14982m(this.f32691c, null, 0, 0, 6, null);
            this.f32692d = this.f32691c.length - 1;
            this.f32693e = 0;
            this.f32694f = 0;
        }

        /* renamed from: c */
        private final int m566c(int i) {
            return this.f32692d + 1 + i;
        }

        /* renamed from: d */
        private final int m565d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f32691c.length;
                while (true) {
                    length--;
                    i2 = this.f32692d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C14451c cVar = this.f32691c[length];
                    C9971q.m14636d(cVar);
                    int i4 = cVar.f32683a;
                    i -= i4;
                    this.f32694f -= i4;
                    this.f32693e--;
                    i3++;
                }
                C14451c[] cVarArr = this.f32691c;
                System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f32693e);
                this.f32692d += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final ByteString m563f(int i) {
            if (m561h(i)) {
                return C14453d.f32688c.m570c()[i].f32684b;
            }
            int c = m566c(i - C14453d.f32688c.m570c().length);
            if (c >= 0) {
                C14451c[] cVarArr = this.f32691c;
                if (c < cVarArr.length) {
                    C14451c cVar = cVarArr[c];
                    C9971q.m14636d(cVar);
                    return cVar.f32684b;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        private final void m562g(int i, C14451c cVar) {
            this.f32689a.add(cVar);
            int i2 = cVar.f32683a;
            if (i != -1) {
                C14451c cVar2 = this.f32691c[m566c(i)];
                C9971q.m14636d(cVar2);
                i2 -= cVar2.f32683a;
            }
            int i3 = this.f32696h;
            if (i2 > i3) {
                m567b();
                return;
            }
            int d = m565d((this.f32694f + i2) - i3);
            if (i == -1) {
                int i4 = this.f32693e + 1;
                C14451c[] cVarArr = this.f32691c;
                if (i4 > cVarArr.length) {
                    C14451c[] cVarArr2 = new C14451c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f32692d = this.f32691c.length - 1;
                    this.f32691c = cVarArr2;
                }
                int i5 = this.f32692d;
                this.f32692d = i5 - 1;
                this.f32691c[i5] = cVar;
                this.f32693e++;
            } else {
                this.f32691c[i + m566c(i) + d] = cVar;
            }
            this.f32694f += i2;
        }

        /* renamed from: h */
        private final boolean m561h(int i) {
            return i >= 0 && i <= C14453d.f32688c.m570c().length - 1;
        }

        /* renamed from: i */
        private final int m560i() {
            return C12729c.m5616b(this.f32690b.readByte(), 255);
        }

        /* renamed from: l */
        private final void m557l(int i) {
            if (m561h(i)) {
                this.f32689a.add(C14453d.f32688c.m570c()[i]);
                return;
            }
            int c = m566c(i - C14453d.f32688c.m570c().length);
            if (c >= 0) {
                C14451c[] cVarArr = this.f32691c;
                if (c < cVarArr.length) {
                    List<C14451c> list = this.f32689a;
                    C14451c cVar = cVarArr[c];
                    C9971q.m14636d(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private final void m555n(int i) {
            m562g(-1, new C14451c(m563f(i), m559j()));
        }

        /* renamed from: o */
        private final void m554o() {
            m562g(-1, new C14451c(C14453d.f32688c.m572a(m559j()), m559j()));
        }

        /* renamed from: p */
        private final void m553p(int i) {
            this.f32689a.add(new C14451c(m563f(i), m559j()));
        }

        /* renamed from: q */
        private final void m552q() {
            this.f32689a.add(new C14451c(C14453d.f32688c.m572a(m559j()), m559j()));
        }

        /* renamed from: e */
        public final List<C14451c> m564e() {
            List<C14451c> D0;
            D0 = C9914r.m14790D0(this.f32689a);
            this.f32689a.clear();
            return D0;
        }

        /* renamed from: j */
        public final ByteString m559j() {
            boolean z;
            int i = m560i();
            if ((i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long m = m556m(i, 127);
            if (!z) {
                return this.f32690b.mo9733e0(m);
            }
            Buffer buffer = new Buffer();
            C14488k.f32866d.m364b(this.f32690b, m, buffer);
            return buffer.mo9727o0();
        }

        /* renamed from: k */
        public final void m558k() {
            while (!this.f32690b.mo9731h0()) {
                int b = C12729c.m5616b(this.f32690b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    m557l(m556m(b, 127) - 1);
                } else if (b == 64) {
                    m554o();
                } else if ((b & 64) == 64) {
                    m555n(m556m(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int m = m556m(b, 31);
                    this.f32696h = m;
                    if (m < 0 || m > this.f32695g) {
                        throw new IOException("Invalid dynamic table size update " + this.f32696h);
                    }
                    m568a();
                } else if (b == 16 || b == 0) {
                    m552q();
                } else {
                    m553p(m556m(b, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final int m556m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m560i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public /* synthetic */ C14454a(Source source, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    @Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m15073d2 = {"Lyj/d$b;", "", "", "b", "", "bytesToRecover", "c", "Lyj/c;", "entry", "d", "a", "", "headerBlock", "g", "value", "prefixMask", "bits", "h", "Lokio/ByteString;", "data", "f", "headerTableSizeSetting", "e", "I", "smallestHeaderTableSizeSetting", "", "Z", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lyj/c;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "i", "useCompression", "Lokio/Buffer;", "j", "Lokio/Buffer;", "out", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.d$b */
    /* loaded from: classes8.dex */
    public static final class C14455b {

        /* renamed from: a */
        private int f32697a;

        /* renamed from: b */
        private boolean f32698b;

        /* renamed from: c */
        public int f32699c;

        /* renamed from: d */
        public C14451c[] f32700d;

        /* renamed from: e */
        private int f32701e;

        /* renamed from: f */
        public int f32702f;

        /* renamed from: g */
        public int f32703g;

        /* renamed from: h */
        public int f32704h;

        /* renamed from: i */
        private final boolean f32705i;

        /* renamed from: j */
        private final Buffer f32706j;

        public C14455b(int i, boolean z, Buffer out) {
            C9971q.m14633g(out, "out");
            this.f32704h = i;
            this.f32705i = z;
            this.f32706j = out;
            this.f32697a = ViewDefaults.NUMBER_OF_LINES;
            this.f32699c = i;
            C14451c[] cVarArr = new C14451c[8];
            this.f32700d = cVarArr;
            this.f32701e = cVarArr.length - 1;
        }

        /* renamed from: a */
        private final void m551a() {
            int i = this.f32699c;
            int i2 = this.f32703g;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m550b();
            } else {
                m549c(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m550b() {
            C9897e.m14982m(this.f32700d, null, 0, 0, 6, null);
            this.f32701e = this.f32700d.length - 1;
            this.f32702f = 0;
            this.f32703g = 0;
        }

        /* renamed from: c */
        private final int m549c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f32700d.length;
                while (true) {
                    length--;
                    i2 = this.f32701e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C14451c cVar = this.f32700d[length];
                    C9971q.m14636d(cVar);
                    i -= cVar.f32683a;
                    int i4 = this.f32703g;
                    C14451c cVar2 = this.f32700d[length];
                    C9971q.m14636d(cVar2);
                    this.f32703g = i4 - cVar2.f32683a;
                    this.f32702f--;
                    i3++;
                }
                C14451c[] cVarArr = this.f32700d;
                System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f32702f);
                C14451c[] cVarArr2 = this.f32700d;
                int i5 = this.f32701e;
                Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f32701e += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m548d(C14451c cVar) {
            int i = cVar.f32683a;
            int i2 = this.f32699c;
            if (i > i2) {
                m550b();
                return;
            }
            m549c((this.f32703g + i) - i2);
            int i3 = this.f32702f + 1;
            C14451c[] cVarArr = this.f32700d;
            if (i3 > cVarArr.length) {
                C14451c[] cVarArr2 = new C14451c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f32701e = this.f32700d.length - 1;
                this.f32700d = cVarArr2;
            }
            int i4 = this.f32701e;
            this.f32701e = i4 - 1;
            this.f32700d[i4] = cVar;
            this.f32702f++;
            this.f32703g += i;
        }

        /* renamed from: e */
        public final void m547e(int i) {
            this.f32704h = i;
            int min = Math.min(i, (int) Spliterator.SUBSIZED);
            int i2 = this.f32699c;
            if (i2 != min) {
                if (min < i2) {
                    this.f32697a = Math.min(this.f32697a, min);
                }
                this.f32698b = true;
                this.f32699c = min;
                m551a();
            }
        }

        /* renamed from: f */
        public final void m546f(ByteString data) {
            C9971q.m14633g(data, "data");
            if (this.f32705i) {
                C14488k kVar = C14488k.f32866d;
                if (kVar.m362d(data) < data.m9697v()) {
                    Buffer buffer = new Buffer();
                    kVar.m363c(data, buffer);
                    ByteString o0 = buffer.mo9727o0();
                    m544h(o0.m9697v(), 127, 128);
                    this.f32706j.mo9743u0(o0);
                    return;
                }
            }
            m544h(data.m9697v(), 127, 0);
            this.f32706j.mo9743u0(data);
        }

        /* renamed from: g */
        public final void m545g(List<C14451c> headerBlock) {
            int i;
            int i2;
            C9971q.m14633g(headerBlock, "headerBlock");
            if (this.f32698b) {
                int i3 = this.f32697a;
                if (i3 < this.f32699c) {
                    m544h(i3, 31, 32);
                }
                this.f32698b = false;
                this.f32697a = ViewDefaults.NUMBER_OF_LINES;
                m544h(this.f32699c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i4 = 0; i4 < size; i4++) {
                C14451c cVar = headerBlock.get(i4);
                ByteString y = cVar.f32684b.mo9695y();
                ByteString byteString = cVar.f32685c;
                C14453d dVar = C14453d.f32688c;
                Integer num = dVar.m571b().get(y);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (2 <= i && 7 >= i) {
                        if (C9971q.m14638b(dVar.m570c()[i - 1].f32685c, byteString)) {
                            i2 = i;
                        } else if (C9971q.m14638b(dVar.m570c()[i].f32685c, byteString)) {
                            i++;
                            i2 = i;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i == -1) {
                    int i5 = this.f32701e + 1;
                    int length = this.f32700d.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        C14451c cVar2 = this.f32700d[i5];
                        C9971q.m14636d(cVar2);
                        if (C9971q.m14638b(cVar2.f32684b, y)) {
                            C14451c cVar3 = this.f32700d[i5];
                            C9971q.m14636d(cVar3);
                            if (C9971q.m14638b(cVar3.f32685c, byteString)) {
                                i = C14453d.f32688c.m570c().length + (i5 - this.f32701e);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f32701e) + C14453d.f32688c.m570c().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    m544h(i, 127, 128);
                } else if (i2 == -1) {
                    this.f32706j.writeByte(64);
                    m546f(y);
                    m546f(byteString);
                    m548d(cVar);
                } else if (!y.m9696x(C14451c.f32676d) || !(!C9971q.m14638b(C14451c.f32681i, y))) {
                    m544h(i2, 63, 64);
                    m546f(byteString);
                    m548d(cVar);
                } else {
                    m544h(i2, 15, 0);
                    m546f(byteString);
                }
            }
        }

        /* renamed from: h */
        public final void m544h(int i, int i2, int i3) {
            if (i < i2) {
                this.f32706j.writeByte(i | i3);
                return;
            }
            this.f32706j.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f32706j.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f32706j.writeByte(i4);
        }

        public /* synthetic */ C14455b(int i, boolean z, Buffer buffer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }
    }
}
