package okhttp3;

import com.facebook.react.views.image.ReactImageView;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9904h;
import kotlin.jvm.internal.C9971q;
import okhttp3.Headers;
import p307qj.C12222f;
import p307qj.C12241o;
import p307qj.EnumC12246q;
import p389vj.C13541c;
import p409wj.C13896e;

@Metadata(m15074d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\\B}\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020#\u0012\b\u0010,\u001a\u0004\u0018\u00010(\u0012\u0006\u00102\u001a\u00020-\u0012\b\u00108\u001a\u0004\u0018\u000103\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010H\u001a\u00020C\u0012\u0006\u0010K\u001a\u00020C\u0012\b\u0010P\u001a\u0004\u0018\u00010L¢\u0006\u0004\bZ\u0010[J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0013\u0010&R\u0019\u0010,\u001a\u0004\u0018\u00010(8\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u00102\u001a\u00020-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00108\u001a\u0004\u0018\u0001038\u0007¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010<\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0019\u0010?\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u0019\u0010B\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u0017\u0010H\u001a\u00020C8\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010K\u001a\u00020C8\u0007¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR\u001c\u0010P\u001a\u0004\u0018\u00010L8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b\u001e\u0010OR\u0011\u0010T\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010Y\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006]"}, m15073d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "", "name", "defaultValue", "s", "Lokhttp3/Response$a;", "R", "", "Lqj/f;", "i", "", "close", "toString", "Lokhttp3/CacheControl;", "k", "Lokhttp3/CacheControl;", "lazyCacheControl", "Lokhttp3/Request;", "l", "Lokhttp3/Request;", "b0", "()Lokhttp3/Request;", "request", "Lqj/q;", "m", "Lqj/q;", "U", "()Lqj/q;", "protocol", "n", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "message", "", "o", "I", "()I", "code", "Lqj/o;", "p", "Lqj/o;", "()Lqj/o;", "handshake", "Lokhttp3/Headers;", "q", "Lokhttp3/Headers;", "z", "()Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "r", "Lokhttp3/ResponseBody;", "b", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response;", "Q", "()Lokhttp3/Response;", "networkResponse", "t", "h", "cacheResponse", "u", "S", "priorResponse", "", "v", "J", "f0", "()J", "sentRequestAtMillis", "w", "Y", "receivedResponseAtMillis", "Lvj/c;", "x", "Lvj/c;", "()Lvj/c;", "exchange", "", "X", "()Z", "isSuccessful", "C", "isRedirect", "g", "()Lokhttp3/CacheControl;", "cacheControl", "<init>", "(Lokhttp3/Request;Lqj/q;Ljava/lang/String;ILqj/o;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLvj/c;)V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Response implements Closeable {

    /* renamed from: k */
    private CacheControl f25488k;

    /* renamed from: l */
    private final Request f25489l;

    /* renamed from: m */
    private final EnumC12246q f25490m;

    /* renamed from: n */
    private final String f25491n;

    /* renamed from: o */
    private final int f25492o;

    /* renamed from: p */
    private final C12241o f25493p;

    /* renamed from: q */
    private final Headers f25494q;

    /* renamed from: r */
    private final ResponseBody f25495r;

    /* renamed from: s */
    private final Response f25496s;

    /* renamed from: t */
    private final Response f25497t;

    /* renamed from: u */
    private final Response f25498u;

    /* renamed from: v */
    private final long f25499v;

    /* renamed from: w */
    private final long f25500w;

    /* renamed from: x */
    private final C13541c f25501x;

    public Response(Request request, EnumC12246q protocol, String message, int i, C12241o oVar, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, C13541c cVar) {
        C9971q.m14633g(request, "request");
        C9971q.m14633g(protocol, "protocol");
        C9971q.m14633g(message, "message");
        C9971q.m14633g(headers, "headers");
        this.f25489l = request;
        this.f25490m = protocol;
        this.f25491n = message;
        this.f25492o = i;
        this.f25493p = oVar;
        this.f25494q = headers;
        this.f25495r = responseBody;
        this.f25496s = response;
        this.f25497t = response2;
        this.f25498u = response3;
        this.f25499v = j;
        this.f25500w = j2;
        this.f25501x = cVar;
    }

    /* renamed from: t */
    public static /* synthetic */ String m9834t(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.m9835s(str, str2);
    }

    /* renamed from: C */
    public final boolean m9853C() {
        int i = this.f25492o;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final String m9852H() {
        return this.f25491n;
    }

    /* renamed from: Q */
    public final Response m9851Q() {
        return this.f25496s;
    }

    /* renamed from: R */
    public final C11430a m9850R() {
        return new C11430a(this);
    }

    /* renamed from: S */
    public final Response m9849S() {
        return this.f25498u;
    }

    /* renamed from: U */
    public final EnumC12246q m9848U() {
        return this.f25490m;
    }

    /* renamed from: X */
    public final boolean m9847X() {
        int i = this.f25492o;
        return 200 <= i && 299 >= i;
    }

    /* renamed from: Y */
    public final long m9846Y() {
        return this.f25500w;
    }

    /* renamed from: b */
    public final ResponseBody m9845b() {
        return this.f25495r;
    }

    /* renamed from: b0 */
    public final Request m9844b0() {
        return this.f25489l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f25495r;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: f0 */
    public final long m9843f0() {
        return this.f25499v;
    }

    /* renamed from: g */
    public final CacheControl m9842g() {
        CacheControl cacheControl = this.f25488k;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b = CacheControl.f25345p.m10088b(this.f25494q);
        this.f25488k = b;
        return b;
    }

    /* renamed from: h */
    public final Response m9841h() {
        return this.f25497t;
    }

    /* renamed from: i */
    public final List<C12222f> m9840i() {
        String str;
        Headers headers = this.f25494q;
        int i = this.f25492o;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return C9904h.m14862i();
        } else {
            str = "Proxy-Authenticate";
        }
        return C13896e.m2373a(headers, str);
    }

    /* renamed from: l */
    public final int m9839l() {
        return this.f25492o;
    }

    /* renamed from: n */
    public final C13541c m9838n() {
        return this.f25501x;
    }

    /* renamed from: p */
    public final C12241o m9837p() {
        return this.f25493p;
    }

    /* renamed from: r */
    public final String m9836r(String str) {
        return m9834t(this, str, null, 2, null);
    }

    /* renamed from: s */
    public final String m9835s(String name, String str) {
        C9971q.m14633g(name, "name");
        String a = this.f25494q.m10072a(name);
        if (a != null) {
            return a;
        }
        return str;
    }

    public String toString() {
        return "Response{protocol=" + this.f25490m + ", code=" + this.f25492o + ", message=" + this.f25491n + ", url=" + this.f25489l.m9877l() + '}';
    }

    /* renamed from: z */
    public final Headers m9833z() {
        return this.f25494q;
    }

    @Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bi\u0010jB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bi\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001b\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010aR$\u0010h\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010.¨\u0006k"}, m15073d2 = {"Lokhttp3/Response$a;", "", "", "name", "Lokhttp3/Response;", "response", "", "f", "e", "Lokhttp3/Request;", "request", "r", "Lqj/q;", "protocol", "p", "", "code", "g", "message", "m", "Lqj/o;", "handshake", "i", "value", "j", "a", "Lokhttp3/Headers;", "headers", "k", "Lokhttp3/ResponseBody;", "body", "b", "networkResponse", "n", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "receivedResponseAtMillis", "q", "Lvj/c;", "deferredTrailers", "l", "(Lvj/c;)V", "c", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lqj/q;", "getProtocol$okhttp", "()Lqj/q;", "setProtocol$okhttp", "(Lqj/q;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lqj/o;", "getHandshake$okhttp", "()Lqj/o;", "setHandshake$okhttp", "(Lqj/o;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "getHeaders$okhttp", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lvj/c;", "getExchange$okhttp", "()Lvj/c;", "setExchange$okhttp", "exchange", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.Response$a */
    /* loaded from: classes8.dex */
    public static class C11430a {

        /* renamed from: a */
        private Request f25502a;

        /* renamed from: b */
        private EnumC12246q f25503b;

        /* renamed from: c */
        private int f25504c;

        /* renamed from: d */
        private String f25505d;

        /* renamed from: e */
        private C12241o f25506e;

        /* renamed from: f */
        private Headers.C11418a f25507f;

        /* renamed from: g */
        private ResponseBody f25508g;

        /* renamed from: h */
        private Response f25509h;

        /* renamed from: i */
        private Response f25510i;

        /* renamed from: j */
        private Response f25511j;

        /* renamed from: k */
        private long f25512k;

        /* renamed from: l */
        private long f25513l;

        /* renamed from: m */
        private C13541c f25514m;

        public C11430a() {
            this.f25504c = -1;
            this.f25507f = new Headers.C11418a();
        }

        /* renamed from: e */
        private final void m9828e(Response response) {
            if (response != null) {
                if (!(response.m9845b() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        private final void m9827f(String str, Response response) {
            boolean z;
            boolean z2;
            boolean z3;
            if (response != null) {
                boolean z4 = true;
                if (response.m9845b() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (response.m9851Q() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (response.m9841h() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (response.m9849S() != null) {
                                z4 = false;
                            }
                            if (!z4) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        /* renamed from: a */
        public C11430a m9832a(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            this.f25507f.m10065a(name, value);
            return this;
        }

        /* renamed from: b */
        public C11430a m9831b(ResponseBody responseBody) {
            this.f25508g = responseBody;
            return this;
        }

        /* renamed from: c */
        public Response m9830c() {
            boolean z;
            int i = this.f25504c;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Request request = this.f25502a;
                if (request != null) {
                    EnumC12246q qVar = this.f25503b;
                    if (qVar != null) {
                        String str = this.f25505d;
                        if (str != null) {
                            return new Response(request, qVar, str, i, this.f25506e, this.f25507f.m10062d(), this.f25508g, this.f25509h, this.f25510i, this.f25511j, this.f25512k, this.f25513l, this.f25514m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f25504c).toString());
        }

        /* renamed from: d */
        public C11430a m9829d(Response response) {
            m9827f("cacheResponse", response);
            this.f25510i = response;
            return this;
        }

        /* renamed from: g */
        public C11430a m9826g(int i) {
            this.f25504c = i;
            return this;
        }

        /* renamed from: h */
        public final int m9825h() {
            return this.f25504c;
        }

        /* renamed from: i */
        public C11430a m9824i(C12241o oVar) {
            this.f25506e = oVar;
            return this;
        }

        /* renamed from: j */
        public C11430a m9823j(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            this.f25507f.m10058h(name, value);
            return this;
        }

        /* renamed from: k */
        public C11430a m9822k(Headers headers) {
            C9971q.m14633g(headers, "headers");
            this.f25507f = headers.m10070f();
            return this;
        }

        /* renamed from: l */
        public final void m9821l(C13541c deferredTrailers) {
            C9971q.m14633g(deferredTrailers, "deferredTrailers");
            this.f25514m = deferredTrailers;
        }

        /* renamed from: m */
        public C11430a m9820m(String message) {
            C9971q.m14633g(message, "message");
            this.f25505d = message;
            return this;
        }

        /* renamed from: n */
        public C11430a m9819n(Response response) {
            m9827f("networkResponse", response);
            this.f25509h = response;
            return this;
        }

        /* renamed from: o */
        public C11430a m9818o(Response response) {
            m9828e(response);
            this.f25511j = response;
            return this;
        }

        /* renamed from: p */
        public C11430a m9817p(EnumC12246q protocol) {
            C9971q.m14633g(protocol, "protocol");
            this.f25503b = protocol;
            return this;
        }

        /* renamed from: q */
        public C11430a m9816q(long j) {
            this.f25513l = j;
            return this;
        }

        /* renamed from: r */
        public C11430a m9815r(Request request) {
            C9971q.m14633g(request, "request");
            this.f25502a = request;
            return this;
        }

        /* renamed from: s */
        public C11430a m9814s(long j) {
            this.f25512k = j;
            return this;
        }

        public C11430a(Response response) {
            C9971q.m14633g(response, "response");
            this.f25504c = -1;
            this.f25502a = response.m9844b0();
            this.f25503b = response.m9848U();
            this.f25504c = response.m9839l();
            this.f25505d = response.m9852H();
            this.f25506e = response.m9837p();
            this.f25507f = response.m9833z().m10070f();
            this.f25508g = response.m9845b();
            this.f25509h = response.m9851Q();
            this.f25510i = response.m9841h();
            this.f25511j = response.m9849S();
            this.f25512k = response.m9843f0();
            this.f25513l = response.m9846Y();
            this.f25514m = response.m9838n();
        }
    }
}
