package p307qj;

import com.facebook.react.uimanager.ViewDefaults;
import fk.AbstractC7358f;
import fk.AbstractC7359g;
import fk.C7366m;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import p015ak.C1457k;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12729c;
import p373uj.C13370e;
import p409wj.C13897f;
import p409wj.C13903k;
import p470zj.AbstractC14668a;
import tj.AbstractC13148b;
import tj.C13149c;
import tj.C13152d;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0004=\u0007>?B!\b\u0000\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:B\u0019\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b9\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0016\u0010/\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u00101\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00102\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%¨\u0006@"}, m15073d2 = {"Lqj/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ltj/d$b;", "Ltj/d;", "editor", "", "b", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "g", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "Ltj/b;", "l", "(Lokhttp3/Response;)Ltj/b;", "n", "(Lokhttp3/Request;)V", "cached", "network", "z", "(Lokhttp3/Response;Lokhttp3/Response;)V", "flush", "close", "Ltj/c;", "cacheStrategy", "t", "(Ltj/c;)V", "s", "()V", "k", "Ltj/d;", "getCache$okhttp", "()Ltj/d;", "cache", "", "I", "i", "()I", "r", "(I)V", "writeSuccessCount", "m", "h", "p", "writeAbortCount", "networkCount", "o", "hitCount", "requestCount", "Ljava/io/File;", "directory", "", "maxSize", "Lzj/a;", "fileSystem", "<init>", "(Ljava/io/File;JLzj/a;)V", "(Ljava/io/File;J)V", "q", "a", "c", "d", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.c */
/* loaded from: classes8.dex */
public final class C12211c implements Closeable, Flushable {

    /* renamed from: q */
    public static final C12213b f27384q = new C12213b(null);

    /* renamed from: k */
    private final C13152d f27385k;

    /* renamed from: l */
    private int f27386l;

    /* renamed from: m */
    private int f27387m;

    /* renamed from: n */
    private int f27388n;

    /* renamed from: o */
    private int f27389o;

    /* renamed from: p */
    private int f27390p;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0011\u001a\u00060\u000bR\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0011\u001a\u00060\u000bR\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lqj/c$a;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "k", "Lokio/BufferedSource;", "bodySource", "Ltj/d$d;", "Ltj/d;", "l", "Ltj/d$d;", "b", "()Ltj/d$d;", "snapshot", "", "m", "Ljava/lang/String;", "n", "<init>", "(Ltj/d$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.c$a */
    /* loaded from: classes8.dex */
    public static final class C12212a extends ResponseBody {

        /* renamed from: k */
        private final BufferedSource f27391k;

        /* renamed from: l */
        private final C13152d.C0425d f27392l;

        /* renamed from: m */
        private final String f27393m;

        /* renamed from: n */
        private final String f27394n;

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"qj/c$a$a", "Lfk/g;", "", "close", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: qj.c$a$a */
        /* loaded from: classes8.dex */
        public static final class C0391a extends AbstractC7359g {

            /* renamed from: l */
            final /* synthetic */ Source f27396l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0391a(Source source, Source source2) {
                super(source2);
                this.f27396l = source;
            }

            @Override // fk.AbstractC7359g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C12212a.this.m7387b().close();
                super.close();
            }
        }

        public C12212a(C13152d.C0425d snapshot, String str, String str2) {
            C9971q.m14633g(snapshot, "snapshot");
            this.f27392l = snapshot;
            this.f27393m = str;
            this.f27394n = str2;
            Source g = snapshot.m4439g(1);
            this.f27391k = C7366m.m22819d(new C0391a(g, g));
        }

        /* renamed from: b */
        public final C13152d.C0425d m7387b() {
            return this.f27392l;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.f27394n;
            if (str != null) {
                return C12729c.m5623T(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.f27393m;
            if (str != null) {
                return MediaType.f25402g.m9979b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.f27391k;
        }
    }

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, m15073d2 = {"Lqj/c$b;", "", "Lokhttp3/Headers;", "", "", "d", "requestHeaders", "responseHeaders", "e", "Lokhttp3/HttpUrl;", "url", "b", "Lokio/BufferedSource;", "source", "", "c", "(Lokio/BufferedSource;)I", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.c$b */
    /* loaded from: classes8.dex */
    public static final class C12213b {
        private C12213b() {
        }

        public /* synthetic */ C12213b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final Set<String> m7383d(Headers headers) {
            Set<String> d;
            boolean t;
            List<String> y0;
            CharSequence V0;
            Comparator v;
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                t = C12718u.m5732t("Vary", headers.m10071b(i), true);
                if (t) {
                    String j = headers.m10067j(i);
                    if (treeSet == null) {
                        v = C12718u.m5730v(C9962k0.f22091a);
                        treeSet = new TreeSet(v);
                    }
                    y0 = C12719v.m5661y0(j, new char[]{','}, false, 0, 6, null);
                    for (String str : y0) {
                        if (str != null) {
                            V0 = C12719v.m5690V0(str);
                            treeSet.add(V0.toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            d = C9921w.m14722d();
            return d;
        }

        /* renamed from: e */
        private final Headers m7382e(Headers headers, Headers headers2) {
            Set<String> d = m7383d(headers2);
            if (d.isEmpty()) {
                return C12729c.f28583b;
            }
            Headers.C11418a aVar = new Headers.C11418a();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String b = headers.m10071b(i);
                if (d.contains(b)) {
                    aVar.m10065a(b, headers.m10067j(i));
                }
            }
            return aVar.m10062d();
        }

        /* renamed from: a */
        public final boolean m7386a(Response hasVaryAll) {
            C9971q.m14633g(hasVaryAll, "$this$hasVaryAll");
            return m7383d(hasVaryAll.m9833z()).contains("*");
        }

        /* renamed from: b */
        public final String m7385b(HttpUrl url) {
            C9971q.m14633g(url, "url");
            return ByteString.f25542o.m9690d(url.toString()).m9705n().mo9708k();
        }

        /* renamed from: c */
        public final int m7384c(BufferedSource source) {
            boolean z;
            C9971q.m14633g(source, "source");
            try {
                long i0 = source.mo9730i0();
                String T = source.mo9737T();
                if (i0 >= 0 && i0 <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    if (T.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) i0;
                    }
                }
                throw new IOException("expected an int but was \"" + i0 + T + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: f */
        public final Headers m7381f(Response varyHeaders) {
            C9971q.m14633g(varyHeaders, "$this$varyHeaders");
            Response Q = varyHeaders.m9851Q();
            C9971q.m14636d(Q);
            return m7382e(Q.m9844b0().m9883f(), varyHeaders.m9833z());
        }

        /* renamed from: g */
        public final boolean m7380g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            C9971q.m14633g(cachedResponse, "cachedResponse");
            C9971q.m14633g(cachedRequest, "cachedRequest");
            C9971q.m14633g(newRequest, "newRequest");
            Set<String> d = m7383d(cachedResponse.m9833z());
            if ((d instanceof Collection) && d.isEmpty()) {
                return true;
            }
            for (String str : d) {
                if (!C9971q.m14638b(cachedRequest.m10066p(str), newRequest.m9884e(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u00060\u0011R\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lqj/c$d;", "Ltj/b;", "", "a", "Lokio/Sink;", "b", "Lokio/Sink;", "cacheOut", "body", "", "c", "Z", "d", "()Z", "e", "(Z)V", "done", "Ltj/d$b;", "Ltj/d;", "Ltj/d$b;", "editor", "<init>", "(Lqj/c;Ltj/d$b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.c$d */
    /* loaded from: classes8.dex */
    private final class C12214d implements AbstractC13148b {

        /* renamed from: a */
        private final Sink f27410a;

        /* renamed from: b */
        private final Sink f27411b;

        /* renamed from: c */
        private boolean f27412c;

        /* renamed from: d */
        private final C13152d.C13154b f27413d;

        /* renamed from: e */
        final /* synthetic */ C12211c f27414e;

        @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"qj/c$d$a", "Lfk/f;", "", "close", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: qj.c$d$a */
        /* loaded from: classes8.dex */
        public static final class C12215a extends AbstractC7358f {
            C12215a(Sink sink) {
                super(sink);
            }

            @Override // fk.AbstractC7358f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (C12214d.this.f27414e) {
                    if (!C12214d.this.m7372d()) {
                        C12214d.this.m7371e(true);
                        C12211c cVar = C12214d.this.f27414e;
                        cVar.m7391r(cVar.m7395i() + 1);
                        super.close();
                        C12214d.this.f27413d.m4465b();
                    }
                }
            }
        }

        public C12214d(C12211c cVar, C13152d.C13154b editor) {
            C9971q.m14633g(editor, "editor");
            this.f27414e = cVar;
            this.f27413d = editor;
            Sink f = editor.m4461f(1);
            this.f27410a = f;
            this.f27411b = new C12215a(f);
        }

        @Override // tj.AbstractC13148b
        /* renamed from: a */
        public void mo4507a() {
            synchronized (this.f27414e) {
                if (!this.f27412c) {
                    this.f27412c = true;
                    C12211c cVar = this.f27414e;
                    cVar.m7392p(cVar.m7396h() + 1);
                    C12729c.m5608j(this.f27410a);
                    try {
                        this.f27413d.m4466a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @Override // tj.AbstractC13148b
        /* renamed from: b */
        public Sink mo4506b() {
            return this.f27411b;
        }

        /* renamed from: d */
        public final boolean m7372d() {
            return this.f27412c;
        }

        /* renamed from: e */
        public final void m7371e(boolean z) {
            this.f27412c = z;
        }
    }

    public C12211c(File directory, long j, AbstractC14668a fileSystem) {
        C9971q.m14633g(directory, "directory");
        C9971q.m14633g(fileSystem, "fileSystem");
        this.f27385k = new C13152d(fileSystem, directory, 201105, 2, j, C13370e.f29933h);
    }

    /* renamed from: b */
    private final void m7398b(C13152d.C13154b bVar) {
        if (bVar != null) {
            try {
                bVar.m4466a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27385k.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f27385k.flush();
    }

    /* renamed from: g */
    public final Response m7397g(Request request) {
        C9971q.m14633g(request, "request");
        try {
            C13152d.C0425d Q = this.f27385k.m4487Q(f27384q.m7385b(request.m9877l()));
            if (Q != null) {
                try {
                    C0392c cVar = new C0392c(Q.m4439g(0));
                    Response d = cVar.m7376d(Q);
                    if (cVar.m7378b(request, d)) {
                        return d;
                    }
                    ResponseBody b = d.m9845b();
                    if (b != null) {
                        C12729c.m5608j(b);
                    }
                    return null;
                } catch (IOException unused) {
                    C12729c.m5608j(Q);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    /* renamed from: h */
    public final int m7396h() {
        return this.f27387m;
    }

    /* renamed from: i */
    public final int m7395i() {
        return this.f27386l;
    }

    /* renamed from: l */
    public final AbstractC13148b m7394l(Response response) {
        C13152d.C13154b bVar;
        C9971q.m14633g(response, "response");
        String h = response.m9844b0().m9881h();
        if (C13897f.f31328a.m2365a(response.m9844b0().m9881h())) {
            try {
                m7393n(response.m9844b0());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C9971q.m14638b(h, "GET")) {
            return null;
        } else {
            C12213b bVar2 = f27384q;
            if (bVar2.m7386a(response)) {
                return null;
            }
            C0392c cVar = new C0392c(response);
            try {
                bVar = C13152d.m4493H(this.f27385k, bVar2.m7385b(response.m9844b0().m9877l()), 0L, 2, null);
                if (bVar == null) {
                    return null;
                }
                try {
                    cVar.m7374f(bVar);
                    return new C12214d(this, bVar);
                } catch (IOException unused2) {
                    m7398b(bVar);
                    return null;
                }
            } catch (IOException unused3) {
                bVar = null;
            }
        }
    }

    /* renamed from: n */
    public final void m7393n(Request request) {
        C9971q.m14633g(request, "request");
        this.f27385k.m4492H0(f27384q.m7385b(request.m9877l()));
    }

    /* renamed from: p */
    public final void m7392p(int i) {
        this.f27387m = i;
    }

    /* renamed from: r */
    public final void m7391r(int i) {
        this.f27386l = i;
    }

    /* renamed from: s */
    public final synchronized void m7390s() {
        this.f27389o++;
    }

    /* renamed from: t */
    public final synchronized void m7389t(C13149c cacheStrategy) {
        C9971q.m14633g(cacheStrategy, "cacheStrategy");
        this.f27390p++;
        if (cacheStrategy.m4504b() != null) {
            this.f27388n++;
        } else if (cacheStrategy.m4505a() != null) {
            this.f27389o++;
        }
    }

    /* renamed from: z */
    public final void m7388z(Response cached, Response network) {
        C13152d.C13154b bVar;
        C9971q.m14633g(cached, "cached");
        C9971q.m14633g(network, "network");
        C0392c cVar = new C0392c(network);
        ResponseBody b = cached.m9845b();
        if (b != null) {
            try {
                bVar = ((C12212a) b).m7387b().m4440b();
                if (bVar != null) {
                    try {
                        cVar.m7374f(bVar);
                        bVar.m4465b();
                    } catch (IOException unused) {
                        m7398b(bVar);
                    }
                }
            } catch (IOException unused2) {
                bVar = null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12211c(File directory, long j) {
        this(directory, j, AbstractC14668a.f33143a);
        C9971q.m14633g(directory, "directory");
    }

    @Metadata(m15074d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00104¨\u0006<"}, m15073d2 = {"Lqj/c$c;", "", "Lokio/BufferedSource;", "source", "", "Ljava/security/cert/Certificate;", "c", "Lokio/BufferedSink;", "sink", "certificates", "", "e", "Ltj/d$b;", "Ltj/d;", "editor", "f", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "b", "Ltj/d$d;", "snapshot", "d", "", "a", "Ljava/lang/String;", "url", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "varyHeaders", "requestMethod", "Lqj/q;", "Lqj/q;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Lqj/o;", "h", "Lqj/o;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "Lokio/Source;", "rawSource", "<init>", "(Lokio/Source;)V", "(Lokhttp3/Response;)V", "m", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.c$c */
    /* loaded from: classes8.dex */
    private static final class C0392c {

        /* renamed from: k */
        private static final String f27397k;

        /* renamed from: l */
        private static final String f27398l;

        /* renamed from: m */
        public static final a f27399m = new a(null);

        /* renamed from: a */
        private final String f27400a;

        /* renamed from: b */
        private final Headers f27401b;

        /* renamed from: c */
        private final String f27402c;

        /* renamed from: d */
        private final EnumC12246q f27403d;

        /* renamed from: e */
        private final int f27404e;

        /* renamed from: f */
        private final String f27405f;

        /* renamed from: g */
        private final Headers f27406g;

        /* renamed from: h */
        private final C12241o f27407h;

        /* renamed from: i */
        private final long f27408i;

        /* renamed from: j */
        private final long f27409j;

        @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lqj/c$c$a;", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: qj.c$c$a */
        /* loaded from: classes8.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            C1457k.C1458a aVar;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1457k.f517c.m41079g().m41095g());
            sb2.append("-Sent-Millis");
            f27397k = sb2.toString();
            f27398l = aVar.m41079g().m41095g() + "-Received-Millis";
        }

        public C0392c(Source rawSource) {
            EnumC12249s sVar;
            C9971q.m14633g(rawSource, "rawSource");
            try {
                BufferedSource d = C7366m.m22819d(rawSource);
                this.f27400a = d.mo9737T();
                this.f27402c = d.mo9737T();
                Headers.C11418a aVar = new Headers.C11418a();
                int c = C12211c.f27384q.m7384c(d);
                boolean z = false;
                for (int i = 0; i < c; i++) {
                    aVar.m10064b(d.mo9737T());
                }
                this.f27401b = aVar.m10062d();
                C13903k a2 = C13903k.f31344d.m2340a(d.mo9737T());
                this.f27403d = a2.f31345a;
                this.f27404e = a2.f31346b;
                this.f27405f = a2.f31347c;
                Headers.C11418a aVar2 = new Headers.C11418a();
                int c2 = C12211c.f27384q.m7384c(d);
                for (int i2 = 0; i2 < c2; i2++) {
                    aVar2.m10064b(d.mo9737T());
                }
                String str = f27397k;
                String e = aVar2.m10061e(str);
                String str2 = f27398l;
                String e2 = aVar2.m10061e(str2);
                aVar2.m10059g(str);
                aVar2.m10059g(str2);
                long j = 0;
                this.f27408i = e != null ? Long.parseLong(e) : 0L;
                this.f27409j = e2 != null ? Long.parseLong(e2) : j;
                this.f27406g = aVar2.m10062d();
                if (m7379a()) {
                    String T = d.mo9737T();
                    if (!(T.length() > 0 ? true : z)) {
                        C12223g b = C12223g.f27484s1.m7350b(d.mo9737T());
                        List<Certificate> c3 = m7377c(d);
                        List<Certificate> c4 = m7377c(d);
                        if (!d.mo9731h0()) {
                            sVar = EnumC12249s.f27571r.m7263a(d.mo9737T());
                        } else {
                            sVar = EnumC12249s.SSL_3_0;
                        }
                        this.f27407h = C12241o.f27544e.m7273b(sVar, b, c3, c4);
                    } else {
                        throw new IOException("expected \"\" but was \"" + T + '\"');
                    }
                } else {
                    this.f27407h = null;
                }
            } finally {
                rawSource.close();
            }
        }

        /* renamed from: a */
        private final boolean m7379a() {
            boolean H;
            H = C12718u.m5736H(this.f27400a, "https://", false, 2, null);
            return H;
        }

        /* renamed from: c */
        private final List<Certificate> m7377c(BufferedSource bufferedSource) {
            List<Certificate> i;
            int c = C12211c.f27384q.m7384c(bufferedSource);
            if (c == -1) {
                i = C9906j.m14820i();
                return i;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c);
                for (int i2 = 0; i2 < c; i2++) {
                    String T = bufferedSource.mo9737T();
                    Buffer buffer = new Buffer();
                    ByteString a2 = ByteString.f25542o.m9693a(T);
                    C9971q.m14636d(a2);
                    buffer.mo9743u0(a2);
                    arrayList.add(instance.generateCertificate(buffer.mo9739E0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private final void m7375e(BufferedSink bufferedSink, List<? extends Certificate> list) {
            try {
                bufferedSink.mo9746c0(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] bytes = ((Certificate) list.get(i)).getEncoded();
                    ByteString.C11437a aVar = ByteString.f25542o;
                    C9971q.m14634f(bytes, "bytes");
                    bufferedSink.mo9750J(ByteString.C11437a.m9687g(aVar, bytes, 0, 0, 3, null).mo9718a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public final boolean m7378b(Request request, Response response) {
            C9971q.m14633g(request, "request");
            C9971q.m14633g(response, "response");
            if (!C9971q.m14638b(this.f27400a, request.m9877l().toString()) || !C9971q.m14638b(this.f27402c, request.m9881h()) || !C12211c.f27384q.m7380g(response, this.f27401b, request)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final Response m7376d(C13152d.C0425d snapshot) {
            C9971q.m14633g(snapshot, "snapshot");
            String a2 = this.f27406g.m10072a("Content-Type");
            String a3 = this.f27406g.m10072a("Content-Length");
            return new Response.C11430a().m9815r(new Request.Builder().m9865l(this.f27400a).m9870g(this.f27402c, null).m9871f(this.f27401b).m9875b()).m9817p(this.f27403d).m9826g(this.f27404e).m9820m(this.f27405f).m9822k(this.f27406g).m9831b(new C12212a(snapshot, a2, a3)).m9824i(this.f27407h).m9814s(this.f27408i).m9816q(this.f27409j).m9830c();
        }

        /* renamed from: f */
        public final void m7374f(C13152d.C13154b editor) {
            C9971q.m14633g(editor, "editor");
            BufferedSink c = C7366m.m22820c(editor.m4461f(0));
            try {
                c.mo9750J(this.f27400a).writeByte(10);
                c.mo9750J(this.f27402c).writeByte(10);
                c.mo9746c0(this.f27401b.size()).writeByte(10);
                int size = this.f27401b.size();
                for (int i = 0; i < size; i++) {
                    c.mo9750J(this.f27401b.m10071b(i)).mo9750J(": ").mo9750J(this.f27401b.m10067j(i)).writeByte(10);
                }
                c.mo9750J(new C13903k(this.f27403d, this.f27404e, this.f27405f).toString()).writeByte(10);
                c.mo9746c0(this.f27406g.size() + 2).writeByte(10);
                int size2 = this.f27406g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c.mo9750J(this.f27406g.m10071b(i2)).mo9750J(": ").mo9750J(this.f27406g.m10067j(i2)).writeByte(10);
                }
                c.mo9750J(f27397k).mo9750J(": ").mo9746c0(this.f27408i).writeByte(10);
                c.mo9750J(f27398l).mo9750J(": ").mo9746c0(this.f27409j).writeByte(10);
                if (m7379a()) {
                    c.writeByte(10);
                    C12241o oVar = this.f27407h;
                    C9971q.m14636d(oVar);
                    c.mo9750J(oVar.m7279a().m7353c()).writeByte(10);
                    m7375e(c, this.f27407h.m7276d());
                    m7375e(c, this.f27407h.m7277c());
                    c.mo9750J(this.f27407h.m7275e().m7264a()).writeByte(10);
                }
                Unit unit = Unit.f22042a;
                th = null;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }

        public C0392c(Response response) {
            C9971q.m14633g(response, "response");
            this.f27400a = response.m9844b0().m9877l().toString();
            this.f27401b = C12211c.f27384q.m7381f(response);
            this.f27402c = response.m9844b0().m9881h();
            this.f27403d = response.m9848U();
            this.f27404e = response.m9839l();
            this.f27405f = response.m9852H();
            this.f27406g = response.m9833z();
            this.f27407h = response.m9837p();
            this.f27408i = response.m9843f0();
            this.f27409j = response.m9846Y();
        }
    }
}
