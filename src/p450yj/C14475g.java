package p450yj;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Sink;
import okio.Source;
import p307qj.EnumC12246q;
import p327rj.C12729c;
import p389vj.C13549f;
import p409wj.AbstractC13895d;
import p409wj.C13896e;
import p409wj.C13898g;
import p409wj.C13900i;
import p409wj.C13903k;

@Metadata(m15074d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b\u001c\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006."}, m15073d2 = {"Lyj/g;", "Lwj/d;", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "e", "", "f", "h", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "Lokhttp3/Response;", "response", "d", "Lokio/Source;", "b", "cancel", "Lyj/i;", "Lyj/i;", "stream", "Lqj/q;", "Lqj/q;", "protocol", "c", "Z", "canceled", "Lvj/f;", "Lvj/f;", "()Lvj/f;", "connection", "Lwj/g;", "Lwj/g;", "chain", "Lyj/f;", "Lyj/f;", "http2Connection", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;Lvj/f;Lwj/g;Lyj/f;)V", "i", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: yj.g */
/* loaded from: classes8.dex */
public final class C14475g implements AbstractC13895d {

    /* renamed from: a */
    private volatile C14481i f32809a;

    /* renamed from: b */
    private final EnumC12246q f32810b;

    /* renamed from: c */
    private volatile boolean f32811c;

    /* renamed from: d */
    private final C13549f f32812d;

    /* renamed from: e */
    private final C13898g f32813e;

    /* renamed from: f */
    private final C14457f f32814f;

    /* renamed from: i */
    public static final C14476a f32808i = new C14476a(null);

    /* renamed from: g */
    private static final List<String> f32806g = C12729c.m5598t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f32807h = C12729c.m5598t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, m15073d2 = {"Lyj/g$a;", "", "Lokhttp3/Request;", "request", "", "Lyj/c;", "a", "Lokhttp3/Headers;", "headerBlock", "Lqj/q;", "protocol", "Lokhttp3/Response$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: yj.g$a */
    /* loaded from: classes8.dex */
    public static final class C14476a {
        private C14476a() {
        }

        public /* synthetic */ C14476a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C14451c> m458a(Request request) {
            C9971q.m14633g(request, "request");
            Headers f = request.m9883f();
            ArrayList arrayList = new ArrayList(f.size() + 4);
            arrayList.add(new C14451c(C14451c.f32678f, request.m9881h()));
            arrayList.add(new C14451c(C14451c.f32679g, C13900i.f31341a.m2347c(request.m9877l())));
            String d = request.m9885d("Host");
            if (d != null) {
                arrayList.add(new C14451c(C14451c.f32681i, d));
            }
            arrayList.add(new C14451c(C14451c.f32680h, request.m9877l().m10033q()));
            int size = f.size();
            for (int i = 0; i < size; i++) {
                String b = f.m10071b(i);
                Locale locale = Locale.US;
                C9971q.m14634f(locale, "Locale.US");
                if (b != null) {
                    String lowerCase = b.toLowerCase(locale);
                    C9971q.m14634f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C14475g.f32806g.contains(lowerCase) || (C9971q.m14638b(lowerCase, "te") && C9971q.m14638b(f.m10067j(i), "trailers"))) {
                        arrayList.add(new C14451c(lowerCase, f.m10067j(i)));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final Response.C11430a m457b(Headers headerBlock, EnumC12246q protocol) {
            C9971q.m14633g(headerBlock, "headerBlock");
            C9971q.m14633g(protocol, "protocol");
            Headers.C11418a aVar = new Headers.C11418a();
            int size = headerBlock.size();
            C13903k kVar = null;
            for (int i = 0; i < size; i++) {
                String b = headerBlock.m10071b(i);
                String j = headerBlock.m10067j(i);
                if (C9971q.m14638b(b, ":status")) {
                    C13903k.C13904a aVar2 = C13903k.f31344d;
                    kVar = aVar2.m2340a("HTTP/1.1 " + j);
                } else if (!C14475g.f32807h.contains(b)) {
                    aVar.m10063c(b, j);
                }
            }
            if (kVar != null) {
                return new Response.C11430a().m9817p(protocol).m9826g(kVar.f31346b).m9820m(kVar.f31347c).m9822k(aVar.m10062d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C14475g(OkHttpClient client, C13549f connection, C13898g chain, C14457f http2Connection) {
        C9971q.m14633g(client, "client");
        C9971q.m14633g(connection, "connection");
        C9971q.m14633g(chain, "chain");
        C9971q.m14633g(http2Connection, "http2Connection");
        this.f32812d = connection;
        this.f32813e = chain;
        this.f32814f = http2Connection;
        List<EnumC12246q> E = client.m9965E();
        EnumC12246q qVar = EnumC12246q.H2_PRIOR_KNOWLEDGE;
        this.f32810b = !E.contains(qVar) ? EnumC12246q.HTTP_2 : qVar;
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: a */
    public void mo468a() {
        C14481i iVar = this.f32809a;
        C9971q.m14636d(iVar);
        iVar.m405n().close();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: b */
    public Source mo467b(Response response) {
        C9971q.m14633g(response, "response");
        C14481i iVar = this.f32809a;
        C9971q.m14636d(iVar);
        return iVar.m403p();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: c */
    public C13549f mo466c() {
        return this.f32812d;
    }

    @Override // p409wj.AbstractC13895d
    public void cancel() {
        this.f32811c = true;
        C14481i iVar = this.f32809a;
        if (iVar != null) {
            iVar.m413f(EnumC14449b.CANCEL);
        }
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: d */
    public long mo465d(Response response) {
        C9971q.m14633g(response, "response");
        if (!C13896e.m2372b(response)) {
            return 0L;
        }
        return C12729c.m5599s(response);
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: e */
    public Sink mo464e(Request request, long j) {
        C9971q.m14633g(request, "request");
        C14481i iVar = this.f32809a;
        C9971q.m14636d(iVar);
        return iVar.m405n();
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: f */
    public void mo463f(Request request) {
        boolean z;
        C9971q.m14633g(request, "request");
        if (this.f32809a == null) {
            if (request.m9888a() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f32809a = this.f32814f.m528P0(f32808i.m458a(request), z);
            if (!this.f32811c) {
                C14481i iVar = this.f32809a;
                C9971q.m14636d(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.m397v().mo9679g(this.f32813e.m2353h(), timeUnit);
                C14481i iVar2 = this.f32809a;
                C9971q.m14636d(iVar2);
                iVar2.m419E().mo9679g(this.f32813e.m2351j(), timeUnit);
                return;
            }
            C14481i iVar3 = this.f32809a;
            C9971q.m14636d(iVar3);
            iVar3.m413f(EnumC14449b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: g */
    public Response.C11430a mo462g(boolean z) {
        C14481i iVar = this.f32809a;
        C9971q.m14636d(iVar);
        Response.C11430a b = f32808i.m457b(iVar.m421C(), this.f32810b);
        if (!z || b.m9825h() != 100) {
            return b;
        }
        return null;
    }

    @Override // p409wj.AbstractC13895d
    /* renamed from: h */
    public void mo461h() {
        this.f32814f.flush();
    }
}
