package tj;

import com.discord.nearby.NearbyManager;
import fk.C7366m;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p307qj.AbstractC12237n;
import p307qj.C12211c;
import p307qj.EnumC12246q;
import p326ri.C12718u;
import p327rj.C12729c;
import p389vj.C13545e;
import p409wj.C13896e;
import p409wj.C13897f;
import p409wj.C13899h;
import tj.C13149c;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m15073d2 = {"Ltj/a;", "Lokhttp3/Interceptor;", "Ltj/b;", "cacheRequest", "Lokhttp3/Response;", "response", "a", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lqj/c;", "Lqj/c;", "getCache$okhttp", "()Lqj/c;", "cache", "<init>", "(Lqj/c;)V", "b", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: tj.a */
/* loaded from: classes8.dex */
public final class C13146a implements Interceptor {

    /* renamed from: b */
    public static final C0424a f29452b = new C0424a(null);

    /* renamed from: a */
    private final C12211c f29453a;

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, m15073d2 = {"Ltj/a$a;", "", "Lokhttp3/Response;", "response", "f", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.a$a */
    /* loaded from: classes8.dex */
    public static final class C0424a {
        private C0424a() {
        }

        public /* synthetic */ C0424a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final Headers m4511c(Headers headers, Headers headers2) {
            boolean t;
            boolean H;
            Headers.C11418a aVar = new Headers.C11418a();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String b = headers.m10071b(i);
                String j = headers.m10067j(i);
                t = C12718u.m5732t("Warning", b, true);
                if (t) {
                    H = C12718u.m5736H(j, NearbyManager.PERMISSION_DENIED, false, 2, null);
                    if (H) {
                    }
                }
                if (m4510d(b) || !m4509e(b) || headers2.m10072a(b) == null) {
                    aVar.m10063c(b, j);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String b2 = headers2.m10071b(i2);
                if (!m4510d(b2) && m4509e(b2)) {
                    aVar.m10063c(b2, headers2.m10067j(i2));
                }
            }
            return aVar.m10062d();
        }

        /* renamed from: d */
        private final boolean m4510d(String str) {
            boolean t;
            boolean t2;
            boolean t3;
            t = C12718u.m5732t("Content-Length", str, true);
            if (t) {
                return true;
            }
            t2 = C12718u.m5732t("Content-Encoding", str, true);
            if (t2) {
                return true;
            }
            t3 = C12718u.m5732t("Content-Type", str, true);
            if (t3) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final boolean m4509e(String str) {
            boolean t;
            boolean t2;
            boolean t3;
            boolean t4;
            boolean t5;
            boolean t6;
            boolean t7;
            boolean t8;
            t = C12718u.m5732t("Connection", str, true);
            if (!t) {
                t2 = C12718u.m5732t("Keep-Alive", str, true);
                if (!t2) {
                    t3 = C12718u.m5732t("Proxy-Authenticate", str, true);
                    if (!t3) {
                        t4 = C12718u.m5732t("Proxy-Authorization", str, true);
                        if (!t4) {
                            t5 = C12718u.m5732t("TE", str, true);
                            if (!t5) {
                                t6 = C12718u.m5732t("Trailers", str, true);
                                if (!t6) {
                                    t7 = C12718u.m5732t("Transfer-Encoding", str, true);
                                    if (!t7) {
                                        t8 = C12718u.m5732t("Upgrade", str, true);
                                        if (!t8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final Response m4508f(Response response) {
            ResponseBody responseBody;
            if (response != null) {
                responseBody = response.m9845b();
            } else {
                responseBody = null;
            }
            if (responseBody != null) {
                return response.m9850R().m9831b(null).m9830c();
            }
            return response;
        }
    }

    @Metadata(m15074d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m15073d2 = {"tj/a$b", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", "close", "", "k", "Z", "cacheRequestClosed", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: tj.a$b */
    /* loaded from: classes8.dex */
    public static final class C13147b implements Source {

        /* renamed from: k */
        private boolean f29454k;

        /* renamed from: l */
        final /* synthetic */ BufferedSource f29455l;

        /* renamed from: m */
        final /* synthetic */ AbstractC13148b f29456m;

        /* renamed from: n */
        final /* synthetic */ BufferedSink f29457n;

        C13147b(BufferedSource bufferedSource, AbstractC13148b bVar, BufferedSink bufferedSink) {
            this.f29455l = bufferedSource;
            this.f29456m = bVar;
            this.f29457n = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f29454k && !C12729c.m5602p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f29454k = true;
                this.f29456m.mo4507a();
            }
            this.f29455l.close();
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            C9971q.m14633g(sink, "sink");
            try {
                long read = this.f29455l.read(sink, j);
                if (read == -1) {
                    if (!this.f29454k) {
                        this.f29454k = true;
                        this.f29457n.close();
                    }
                    return -1L;
                }
                sink.m9760s(this.f29457n.mo9747c(), sink.size() - read, read);
                this.f29457n.mo9751B();
                return read;
            } catch (IOException e) {
                if (!this.f29454k) {
                    this.f29454k = true;
                    this.f29456m.mo4507a();
                }
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f29455l.timeout();
        }
    }

    public C13146a(C12211c cVar) {
        this.f29453a = cVar;
    }

    /* renamed from: a */
    private final Response m4514a(AbstractC13148b bVar, Response response) {
        if (bVar == null) {
            return response;
        }
        Sink b = bVar.mo4506b();
        ResponseBody b2 = response.m9845b();
        C9971q.m14636d(b2);
        C13147b bVar2 = new C13147b(b2.source(), bVar, C7366m.m22820c(b));
        return response.m9850R().m9831b(new C13899h(Response.m9834t(response, "Content-Type", null, 2, null), response.m9845b().contentLength(), C7366m.m22819d(bVar2))).m9830c();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response response;
        AbstractC12237n nVar;
        ResponseBody b;
        ResponseBody b2;
        C9971q.m14633g(chain, "chain");
        Call call = chain.call();
        C12211c cVar = this.f29453a;
        C13545e eVar = null;
        if (cVar != null) {
            response = cVar.m7397g(chain.mo2359b());
        } else {
            response = null;
        }
        C13149c b3 = new C13149c.C13151b(System.currentTimeMillis(), chain.mo2359b(), response).m4501b();
        Request b4 = b3.m4504b();
        Response a = b3.m4505a();
        C12211c cVar2 = this.f29453a;
        if (cVar2 != null) {
            cVar2.m7389t(b3);
        }
        if (call instanceof C13545e) {
            eVar = call;
        }
        C13545e eVar2 = eVar;
        if (eVar2 == null || (nVar = eVar2.m3414o()) == null) {
            nVar = AbstractC12237n.f27542a;
        }
        if (!(response == null || a != null || (b2 = response.m9845b()) == null)) {
            C12729c.m5608j(b2);
        }
        if (b4 == null && a == null) {
            Response c = new Response.C11430a().m9815r(chain.mo2359b()).m9817p(EnumC12246q.HTTP_1_1).m9826g(504).m9820m("Unsatisfiable Request (only-if-cached)").m9831b(C12729c.f28584c).m9814s(-1L).m9816q(System.currentTimeMillis()).m9830c();
            nVar.m7308A(call, c);
            return c;
        } else if (b4 == null) {
            C9971q.m14636d(a);
            Response c2 = a.m9850R().m9829d(f29452b.m4508f(a)).m9830c();
            nVar.m7304b(call, c2);
            return c2;
        } else {
            if (a != null) {
                nVar.m7305a(call, a);
            } else if (this.f29453a != null) {
                nVar.m7303c(call);
            }
            try {
                Response a2 = chain.mo2360a(b4);
                if (!(a2 != null || response == null || b == null)) {
                }
                if (a != null) {
                    if (a2 == null || a2.m9839l() != 304) {
                        ResponseBody b5 = a.m9845b();
                        if (b5 != null) {
                            C12729c.m5608j(b5);
                        }
                    } else {
                        Response.C11430a R = a.m9850R();
                        C0424a aVar = f29452b;
                        Response c3 = R.m9822k(aVar.m4511c(a.m9833z(), a2.m9833z())).m9814s(a2.m9843f0()).m9816q(a2.m9846Y()).m9829d(aVar.m4508f(a)).m9819n(aVar.m4508f(a2)).m9830c();
                        ResponseBody b6 = a2.m9845b();
                        C9971q.m14636d(b6);
                        b6.close();
                        C12211c cVar3 = this.f29453a;
                        C9971q.m14636d(cVar3);
                        cVar3.m7390s();
                        this.f29453a.m7388z(a, c3);
                        nVar.m7304b(call, c3);
                        return c3;
                    }
                }
                C9971q.m14636d(a2);
                Response.C11430a R2 = a2.m9850R();
                C0424a aVar2 = f29452b;
                Response c4 = R2.m9829d(aVar2.m4508f(a)).m9819n(aVar2.m4508f(a2)).m9830c();
                if (this.f29453a != null) {
                    if (C13896e.m2372b(c4) && C13149c.f29458c.m4503a(c4, b4)) {
                        Response a3 = m4514a(this.f29453a.m7394l(c4), c4);
                        if (a != null) {
                            nVar.m7303c(call);
                        }
                        return a3;
                    } else if (C13897f.f31328a.m2365a(b4.m9881h())) {
                        try {
                            this.f29453a.m7393n(b4);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c4;
            } finally {
                if (!(response == null || (b = response.m9845b()) == null)) {
                    C12729c.m5608j(b);
                }
            }
        }
    }
}
