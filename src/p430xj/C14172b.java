package p430xj;

import com.facebook.react.uimanager.ViewDefaults;
import fk.C7360h;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p326ri.C12718u;
import p327rj.C12729c;
import p389vj.C13549f;
import p409wj.AbstractC13895d;
import p409wj.C13896e;
import p409wj.C13900i;
import p409wj.C13903k;

@Metadata(m15074d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0007\u001c\u001a-\u0019\u0014\u0016%B)\u0012\b\u00102\u001a\u0004\u0018\u000100\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010<\u001a\u00020:¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u001a\u00106\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b-\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010;R\u0018\u0010?\u001a\u00020\"*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010?\u001a\u00020\"*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, m15073d2 = {"Lxj/b;", "Lwj/d;", "Lokio/Sink;", "u", "x", "", "length", "Lokio/Source;", "w", "Lokhttp3/HttpUrl;", "url", "v", "y", "Lfk/h;", "timeout", "", "r", "Lokhttp3/Request;", "request", "contentLength", "e", "cancel", "f", "Lokhttp3/Response;", "response", "d", "b", "h", "a", "Lokhttp3/Headers;", "headers", "", "requestLine", "A", "", "expectContinue", "Lokhttp3/Response$a;", "g", "z", "", "I", "state", "Lxj/a;", "Lxj/a;", "headersReader", "c", "Lokhttp3/Headers;", "trailers", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "client", "Lvj/f;", "Lvj/f;", "()Lvj/f;", "connection", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "Lokio/BufferedSink;", "sink", "t", "(Lokhttp3/Response;)Z", "isChunked", "s", "(Lokhttp3/Request;)Z", "<init>", "(Lokhttp3/OkHttpClient;Lvj/f;Lokio/BufferedSource;Lokio/BufferedSink;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: xj.b */
/* loaded from: classes8.dex */
public final class C14172b implements AbstractC13895d {

    /* renamed from: h */
    public static final C14175d f31994h = new C14175d(null);

    /* renamed from: a */
    private int f31995a;

    /* renamed from: b */
    private final C14171a f31996b;

    /* renamed from: c */
    private Headers f31997c;

    /* renamed from: d */
    private final OkHttpClient f31998d;

    /* renamed from: e */
    private final C13549f f31999e;

    /* renamed from: f */
    private final BufferedSource f32000f;

    /* renamed from: g */
    private final BufferedSink f32001g;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m15073d2 = {"Lxj/b$a;", "Lokio/Source;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "g", "Lfk/h;", "k", "Lfk/h;", "getTimeout", "()Lfk/h;", "", "l", "Z", "b", "()Z", "h", "(Z)V", "closed", "<init>", "(Lxj/b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$a */
    /* loaded from: classes8.dex */
    public abstract class AbstractC14173a implements Source {

        /* renamed from: k */
        private final C7360h f32002k;

        /* renamed from: l */
        private boolean f32003l;

        public AbstractC14173a() {
            this.f32002k = new C7360h(C14172b.this.f32000f.timeout());
        }

        /* renamed from: b */
        protected final boolean m1440b() {
            return this.f32003l;
        }

        /* renamed from: g */
        public final void m1439g() {
            if (C14172b.this.f31995a != 6) {
                if (C14172b.this.f31995a == 5) {
                    C14172b.this.m1449r(this.f32002k);
                    C14172b.this.f31995a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C14172b.this.f31995a);
            }
        }

        /* renamed from: h */
        protected final void m1438h(boolean z) {
            this.f32003l = z;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9971q.m14633g(sink, "sink");
            try {
                return C14172b.this.f32000f.read(sink, j);
            } catch (IOException e) {
                C14172b.this.mo466c().m3365z();
                m1439g();
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f32002k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lxj/b$b;", "Lokio/Sink;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "Lfk/h;", "k", "Lfk/h;", "", "l", "Z", "closed", "<init>", "(Lxj/b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$b */
    /* loaded from: classes8.dex */
    public final class C0460b implements Sink {

        /* renamed from: k */
        private final C7360h f32005k;

        /* renamed from: l */
        private boolean f32006l;

        public C0460b() {
            this.f32005k = new C7360h(C14172b.this.f32001g.timeout());
        }

        @Override // okio.Sink
        /* renamed from: K */
        public void mo392K(Buffer source, long j) {
            C9971q.m14633g(source, "source");
            if (!(!this.f32006l)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C14172b.this.f32001g.mo9745n0(j);
                C14172b.this.f32001g.mo9750J("\r\n");
                C14172b.this.f32001g.mo392K(source, j);
                C14172b.this.f32001g.mo9750J("\r\n");
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.f32006l) {
                this.f32006l = true;
                C14172b.this.f32001g.mo9750J("0\r\n\r\n");
                C14172b.this.m1449r(this.f32005k);
                C14172b.this.f31995a = 3;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (!this.f32006l) {
                C14172b.this.f32001g.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f32005k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lxj/b$c;", "Lxj/b$a;", "Lxj/b;", "", "i", "Lokio/Buffer;", "sink", "", "byteCount", "read", "close", "n", "J", "bytesRemainingInChunk", "", "o", "Z", "hasMoreChunks", "Lokhttp3/HttpUrl;", "p", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lxj/b;Lokhttp3/HttpUrl;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$c */
    /* loaded from: classes8.dex */
    public final class C14174c extends AbstractC14173a {

        /* renamed from: n */
        private long f32008n = -1;

        /* renamed from: o */
        private boolean f32009o = true;

        /* renamed from: p */
        private final HttpUrl f32010p;

        /* renamed from: q */
        final /* synthetic */ C14172b f32011q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14174c(C14172b bVar, HttpUrl url) {
            super();
            C9971q.m14633g(url, "url");
            this.f32011q = bVar;
            this.f32010p = url;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
            if (r1 != false) goto L_0x004f;
         */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m1437i() {
            /*
                r7 = this;
                long r0 = r7.f32008n
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x0011
                xj.b r0 = r7.f32011q
                okio.BufferedSource r0 = p430xj.C14172b.m1454m(r0)
                r0.mo9737T()
            L_0x0011:
                xj.b r0 = r7.f32011q     // Catch: NumberFormatException -> 0x00b1
                okio.BufferedSource r0 = p430xj.C14172b.m1454m(r0)     // Catch: NumberFormatException -> 0x00b1
                long r0 = r0.mo9741B0()     // Catch: NumberFormatException -> 0x00b1
                r7.f32008n = r0     // Catch: NumberFormatException -> 0x00b1
                xj.b r0 = r7.f32011q     // Catch: NumberFormatException -> 0x00b1
                okio.BufferedSource r0 = p430xj.C14172b.m1454m(r0)     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r0 = r0.mo9737T()     // Catch: NumberFormatException -> 0x00b1
                if (r0 == 0) goto L_0x00a9
                java.lang.CharSequence r0 = p326ri.C12707l.m5797V0(r0)     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r0 = r0.toString()     // Catch: NumberFormatException -> 0x00b1
                long r1 = r7.f32008n     // Catch: NumberFormatException -> 0x00b1
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x0083
                int r1 = r0.length()     // Catch: NumberFormatException -> 0x00b1
                r2 = 0
                if (r1 <= 0) goto L_0x0042
                r1 = 1
                goto L_0x0043
            L_0x0042:
                r1 = r2
            L_0x0043:
                if (r1 == 0) goto L_0x004f
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = p326ri.C12707l.m5813H(r0, r1, r2, r5, r6)     // Catch: NumberFormatException -> 0x00b1
                if (r1 == 0) goto L_0x0083
            L_0x004f:
                long r0 = r7.f32008n
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x0082
                r7.f32009o = r2
                xj.b r0 = r7.f32011q
                xj.a r1 = p430xj.C14172b.m1456k(r0)
                okhttp3.Headers r1 = r1.m1461a()
                p430xj.C14172b.m1450q(r0, r1)
                xj.b r0 = r7.f32011q
                okhttp3.OkHttpClient r0 = p430xj.C14172b.m1457j(r0)
                kotlin.jvm.internal.C9971q.m14636d(r0)
                okhttp3.CookieJar r0 = r0.m9942q()
                okhttp3.HttpUrl r1 = r7.f32010p
                xj.b r2 = r7.f32011q
                okhttp3.Headers r2 = p430xj.C14172b.m1452o(r2)
                kotlin.jvm.internal.C9971q.m14636d(r2)
                p409wj.C13896e.m2368f(r0, r1, r2)
                r7.m1439g()
            L_0x0082:
                return
            L_0x0083:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: NumberFormatException -> 0x00b1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: NumberFormatException -> 0x00b1
                r2.<init>()     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r3 = "expected chunk size and optional extensions"
                r2.append(r3)     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r3 = " but was \""
                r2.append(r3)     // Catch: NumberFormatException -> 0x00b1
                long r3 = r7.f32008n     // Catch: NumberFormatException -> 0x00b1
                r2.append(r3)     // Catch: NumberFormatException -> 0x00b1
                r2.append(r0)     // Catch: NumberFormatException -> 0x00b1
                r0 = 34
                r2.append(r0)     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r0 = r2.toString()     // Catch: NumberFormatException -> 0x00b1
                r1.<init>(r0)     // Catch: NumberFormatException -> 0x00b1
                throw r1     // Catch: NumberFormatException -> 0x00b1
            L_0x00a9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: NumberFormatException -> 0x00b1
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)     // Catch: NumberFormatException -> 0x00b1
                throw r0     // Catch: NumberFormatException -> 0x00b1
            L_0x00b1:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p430xj.C14172b.C14174c.m1437i():void");
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!m1440b()) {
                if (this.f32009o && !C12729c.m5602p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f32011q.mo466c().m3365z();
                    m1439g();
                }
                m1438h(true);
            }
        }

        @Override // p430xj.C14172b.AbstractC14173a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9971q.m14633g(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!m1440b())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f32009o) {
                return -1L;
            } else {
                long j2 = this.f32008n;
                if (j2 == 0 || j2 == -1) {
                    m1437i();
                    if (!this.f32009o) {
                        return -1L;
                    }
                }
                long read = super.read(sink, Math.min(j, this.f32008n));
                if (read != -1) {
                    this.f32008n -= read;
                    return read;
                }
                this.f32011q.mo466c().m3365z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m1439g();
                throw protocolException;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, m15073d2 = {"Lxj/b$d;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$d */
    /* loaded from: classes8.dex */
    public static final class C14175d {
        private C14175d() {
        }

        public /* synthetic */ C14175d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lxj/b$e;", "Lxj/b$a;", "Lxj/b;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "n", "J", "bytesRemaining", "<init>", "(Lxj/b;J)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$e */
    /* loaded from: classes8.dex */
    public final class C14176e extends AbstractC14173a {

        /* renamed from: n */
        private long f32012n;

        public C14176e(long j) {
            super();
            this.f32012n = j;
            if (j == 0) {
                m1439g();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!m1440b()) {
                if (this.f32012n != 0 && !C12729c.m5602p(this, 100, TimeUnit.MILLISECONDS)) {
                    C14172b.this.mo466c().m3365z();
                    m1439g();
                }
                m1438h(true);
            }
        }

        @Override // p430xj.C14172b.AbstractC14173a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9971q.m14633g(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!m1440b()) {
                long j2 = this.f32012n;
                if (j2 == 0) {
                    return -1L;
                }
                long read = super.read(sink, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.f32012n - read;
                    this.f32012n = j3;
                    if (j3 == 0) {
                        m1439g();
                    }
                    return read;
                }
                C14172b.this.mo466c().m3365z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m1439g();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lxj/b$f;", "Lokio/Sink;", "Lokio/Timeout;", "timeout", "Lokio/Buffer;", "source", "", "byteCount", "", "K", "flush", "close", "Lfk/h;", "k", "Lfk/h;", "", "l", "Z", "closed", "<init>", "(Lxj/b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$f */
    /* loaded from: classes8.dex */
    public final class C14177f implements Sink {

        /* renamed from: k */
        private final C7360h f32014k;

        /* renamed from: l */
        private boolean f32015l;

        public C14177f() {
            this.f32014k = new C7360h(C14172b.this.f32001g.timeout());
        }

        @Override // okio.Sink
        /* renamed from: K */
        public void mo392K(Buffer source, long j) {
            C9971q.m14633g(source, "source");
            if (!this.f32015l) {
                C12729c.m5609i(source.size(), 0L, j);
                C14172b.this.f32001g.mo392K(source, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f32015l) {
                this.f32015l = true;
                C14172b.this.m1449r(this.f32014k);
                C14172b.this.f31995a = 3;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (!this.f32015l) {
                C14172b.this.f32001g.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f32014k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lxj/b$g;", "Lxj/b$a;", "Lxj/b;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "", "n", "Z", "inputExhausted", "<init>", "(Lxj/b;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: xj.b$g */
    /* loaded from: classes8.dex */
    public final class C14178g extends AbstractC14173a {

        /* renamed from: n */
        private boolean f32017n;

        public C14178g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!m1440b()) {
                if (!this.f32017n) {
                    m1439g();
                }
                m1438h(true);
            }
        }

        @Override // p430xj.C14172b.AbstractC14173a, okio.Source
        public long read(Buffer sink, long j) {
            boolean z;
            C9971q.m14633g(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!m1440b())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f32017n) {
                return -1L;
            } else {
                long read = super.read(sink, j);
                if (read != -1) {
                    return read;
                }
                this.f32017n = true;
                m1439g();
                return -1L;
            }
        }
    }

    public C14172b(OkHttpClient okHttpClient, C13549f connection, BufferedSource source, BufferedSink sink) {
        C9971q.m14633g(connection, "connection");
        C9971q.m14633g(source, "source");
        C9971q.m14633g(sink, "sink");
        this.f31998d = okHttpClient;
        this.f31999e = connection;
        this.f32000f = source;
        this.f32001g = sink;
        this.f31996b = new C14171a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m1449r(C7360h hVar) {
        Timeout i = hVar.m22833i();
        hVar.m22832j(Timeout.f25546d);
        i.mo9686a();
        i.mo9685b();
    }

    /* renamed from: s */
    private final boolean m1448s(Request request) {
        boolean t;
        t = C12718u.m5732t("chunked", request.m9885d("Transfer-Encoding"), true);
        return t;
    }

    /* renamed from: t */
    private final boolean m1447t(Response response) {
        boolean t;
        t = C12718u.m5732t("chunked", Response.m9834t(response, "Transfer-Encoding", null, 2, null), true);
        return t;
    }

    /* renamed from: u */
    private final Sink m1446u() {
        boolean z = true;
        if (this.f31995a != 1) {
            z = false;
        }
        if (z) {
            this.f31995a = 2;
            return new C0460b();
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    /* renamed from: v */
    private final Source m1445v(HttpUrl httpUrl) {
        boolean z;
        if (this.f31995a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31995a = 5;
            return new C14174c(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    /* renamed from: w */
    private final Source m1444w(long j) {
        boolean z;
        if (this.f31995a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31995a = 5;
            return new C14176e(j);
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    /* renamed from: x */
    private final Sink m1443x() {
        boolean z = true;
        if (this.f31995a != 1) {
            z = false;
        }
        if (z) {
            this.f31995a = 2;
            return new C14177f();
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    /* renamed from: y */
    private final Source m1442y() {
        boolean z;
        if (this.f31995a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31995a = 5;
            mo466c().m3365z();
            return new C14178g();
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    /* renamed from: A */
    public final void m1459A(Headers headers, String requestLine) {
        boolean z;
        C9971q.m14633g(headers, "headers");
        C9971q.m14633g(requestLine, "requestLine");
        if (this.f31995a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f32001g.mo9750J(requestLine).mo9750J("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.f32001g.mo9750J(headers.m10071b(i)).mo9750J(": ").mo9750J(headers.m10067j(i)).mo9750J("\r\n");
            }
            this.f32001g.mo9750J("\r\n");
            this.f31995a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f31995a).toString());
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: a */
    public void mo468a() {
        this.f32001g.flush();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: b */
    public Source mo467b(Response response) {
        C9971q.m14633g(response, "response");
        if (!C13896e.m2372b(response)) {
            return m1444w(0L);
        }
        if (m1447t(response)) {
            return m1445v(response.m9844b0().m9877l());
        }
        long s = C12729c.m5599s(response);
        if (s != -1) {
            return m1444w(s);
        }
        return m1442y();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: c */
    public C13549f mo466c() {
        return this.f31999e;
    }

    @Override // p409wj.AbstractC13895d
    public void cancel() {
        mo466c().m3387d();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: d */
    public long mo465d(Response response) {
        C9971q.m14633g(response, "response");
        if (!C13896e.m2372b(response)) {
            return 0L;
        }
        if (m1447t(response)) {
            return -1L;
        }
        return C12729c.m5599s(response);
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: e */
    public Sink mo464e(Request request, long j) {
        C9971q.m14633g(request, "request");
        if (request.m9888a() != null && request.m9888a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m1448s(request)) {
            return m1446u();
        } else {
            if (j != -1) {
                return m1443x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: f */
    public void mo463f(Request request) {
        C9971q.m14633g(request, "request");
        C13900i iVar = C13900i.f31341a;
        Proxy.Type type = mo466c().m3396A().m7267b().type();
        C9971q.m14634f(type, "connection.route().proxy.type()");
        m1459A(request.m9883f(), iVar.m2349a(request, type));
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: g */
    public Response.C11430a mo462g(boolean z) {
        int i = this.f31995a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C13903k a = C13903k.f31344d.m2340a(this.f31996b.m1460b());
                Response.C11430a k = new Response.C11430a().m9817p(a.f31345a).m9826g(a.f31346b).m9820m(a.f31347c).m9822k(this.f31996b.m1461a());
                if (z && a.f31346b == 100) {
                    return null;
                }
                if (a.f31346b == 100) {
                    this.f31995a = 3;
                    return k;
                }
                this.f31995a = 4;
                return k;
            } catch (EOFException e) {
                String o = mo466c().m3396A().m7268a().m7399l().m10035o();
                throw new IOException("unexpected end of stream on " + o, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f31995a).toString());
        }
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: h */
    public void mo461h() {
        this.f32001g.flush();
    }

    /* renamed from: z */
    public final void m1441z(Response response) {
        C9971q.m14633g(response, "response");
        long s = C12729c.m5599s(response);
        if (s != -1) {
            Source w = m1444w(s);
            C12729c.m5633J(w, ViewDefaults.NUMBER_OF_LINES, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}
