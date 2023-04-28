package okhttp3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9904h;
import kotlin.jvm.internal.C9971q;
import okhttp3.Headers;
import p267of.C11286s;
import p326ri.C12718u;
import p327rj.C12729c;
import p409wj.C13897f;

@Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00014BC\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\b\u0010'\u001a\u0004\u0018\u00010$\u0012\u0016\u0010+\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0004\b2\u00103J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010'\u001a\u0004\u0018\u00010$8\u0007¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0011\u0010&R*\u0010+\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b\u001a\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0015\u00100¨\u00065"}, m15073d2 = {"Lokhttp3/Request;", "", "", "name", "d", "", "e", "j", "T", "Ljava/lang/Class;", "type", "k", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "i", "toString", "Lokhttp3/CacheControl;", "a", "Lokhttp3/CacheControl;", "lazyCacheControl", "Lokhttp3/HttpUrl;", "b", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "url", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "method", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "f", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "body", "", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "", "g", "()Z", "isHttps", "()Lokhttp3/CacheControl;", "cacheControl", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "Builder", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Request {

    /* renamed from: a */
    private CacheControl f25469a;

    /* renamed from: b */
    private final HttpUrl f25470b;

    /* renamed from: c */
    private final String f25471c;

    /* renamed from: d */
    private final Headers f25472d;

    /* renamed from: e */
    private final RequestBody f25473e;

    /* renamed from: f */
    private final Map<Class<?>, Object> f25474f;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        C9971q.m14633g(url, "url");
        C9971q.m14633g(method, "method");
        C9971q.m14633g(headers, "headers");
        C9971q.m14633g(tags, "tags");
        this.f25470b = url;
        this.f25471c = method;
        this.f25472d = headers;
        this.f25473e = requestBody;
        this.f25474f = tags;
    }

    /* renamed from: a */
    public final RequestBody m9888a() {
        return this.f25473e;
    }

    /* renamed from: b */
    public final CacheControl m9887b() {
        CacheControl cacheControl = this.f25469a;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b = CacheControl.f25345p.m10088b(this.f25472d);
        this.f25469a = b;
        return b;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> m9886c() {
        return this.f25474f;
    }

    /* renamed from: d */
    public final String m9885d(String name) {
        C9971q.m14633g(name, "name");
        return this.f25472d.m10072a(name);
    }

    /* renamed from: e */
    public final List<String> m9884e(String name) {
        C9971q.m14633g(name, "name");
        return this.f25472d.m10066p(name);
    }

    /* renamed from: f */
    public final Headers m9883f() {
        return this.f25472d;
    }

    /* renamed from: g */
    public final boolean m9882g() {
        return this.f25470b.m10041i();
    }

    /* renamed from: h */
    public final String m9881h() {
        return this.f25471c;
    }

    /* renamed from: i */
    public final Builder m9880i() {
        return new Builder(this);
    }

    /* renamed from: j */
    public final Object m9879j() {
        return m9878k(Object.class);
    }

    /* renamed from: k */
    public final <T> T m9878k(Class<? extends T> type) {
        C9971q.m14633g(type, "type");
        return (T) type.cast(this.f25474f.get(type));
    }

    /* renamed from: l */
    public final HttpUrl m9877l() {
        return this.f25470b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f25471c);
        sb2.append(", url=");
        sb2.append(this.f25470b);
        if (this.f25472d.size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.f25472d) {
                int i2 = i + 1;
                if (i < 0) {
                    C9904h.m14843s();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.m15067a();
                String str2 = (String) pair2.m15066b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i = i2;
            }
            sb2.append(']');
        }
        if (!this.f25474f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f25474f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b=\u0010>B\u0011\b\u0010\u0012\u0006\u0010?\u001a\u00020\u001f¢\u0006\u0004\b=\u0010@J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010\u001d\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0016\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\r\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0012\u0004\u0012\u00020\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006A"}, m15073d2 = {"Lokhttp3/Request$Builder;", "", "Lokhttp3/HttpUrl;", "url", "m", "", "l", "name", "value", "e", "a", "i", "Lokhttp3/Headers;", "headers", "f", "Lokhttp3/CacheControl;", "cacheControl", "c", "d", "Lokhttp3/RequestBody;", "body", "h", "method", "g", "tag", "k", "T", "Ljava/lang/Class;", "type", "j", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", "b", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "getHeaders$okhttp", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lokhttp3/Request;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static class Builder {

        /* renamed from: a */
        private HttpUrl f25475a;

        /* renamed from: b */
        private String f25476b;

        /* renamed from: c */
        private Headers.C11418a f25477c;

        /* renamed from: d */
        private RequestBody f25478d;

        /* renamed from: e */
        private Map<Class<?>, Object> f25479e;

        public Builder() {
            this.f25479e = new LinkedHashMap();
            this.f25476b = "GET";
            this.f25477c = new Headers.C11418a();
        }

        /* renamed from: a */
        public Builder m9876a(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            this.f25477c.m10065a(name, value);
            return this;
        }

        /* renamed from: b */
        public Request m9875b() {
            HttpUrl httpUrl = this.f25475a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f25476b, this.f25477c.m10062d(), this.f25478d, C12729c.m5624S(this.f25479e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public Builder m9874c(CacheControl cacheControl) {
            boolean z;
            C9971q.m14633g(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m9868i("Cache-Control");
            }
            return m9872e("Cache-Control", cacheControl2);
        }

        /* renamed from: d */
        public Builder m9873d() {
            return m9870g("GET", null);
        }

        /* renamed from: e */
        public Builder m9872e(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            this.f25477c.m10058h(name, value);
            return this;
        }

        /* renamed from: f */
        public Builder m9871f(Headers headers) {
            C9971q.m14633g(headers, "headers");
            this.f25477c = headers.m10070f();
            return this;
        }

        /* renamed from: g */
        public Builder m9870g(String method, RequestBody requestBody) {
            boolean z;
            C9971q.m14633g(method, "method");
            if (method.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody == null) {
                    if (!(true ^ C13897f.m2361e(method))) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!C13897f.m2364b(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                this.f25476b = method;
                this.f25478d = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: h */
        public Builder m9869h(RequestBody body) {
            C9971q.m14633g(body, "body");
            return m9870g("POST", body);
        }

        /* renamed from: i */
        public Builder m9868i(String name) {
            C9971q.m14633g(name, "name");
            this.f25477c.m10059g(name);
            return this;
        }

        /* renamed from: j */
        public <T> Builder m9867j(Class<? super T> type, T t) {
            C9971q.m14633g(type, "type");
            if (t == null) {
                this.f25479e.remove(type);
            } else {
                if (this.f25479e.isEmpty()) {
                    this.f25479e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f25479e;
                Object cast = type.cast(t);
                C9971q.m14636d(cast);
                map.put(type, cast);
            }
            return this;
        }

        /* renamed from: k */
        public Builder m9866k(Object obj) {
            return m9867j(Object.class, obj);
        }

        /* renamed from: l */
        public Builder m9865l(String url) {
            boolean F;
            boolean F2;
            C9971q.m14633g(url, "url");
            F = C12718u.m5738F(url, "ws:", true);
            if (F) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String substring = url.substring(3);
                C9971q.m14634f(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                url = sb2.toString();
            } else {
                F2 = C12718u.m5738F(url, "wss:", true);
                if (F2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("https:");
                    String substring2 = url.substring(4);
                    C9971q.m14634f(substring2, "(this as java.lang.String).substring(startIndex)");
                    sb3.append(substring2);
                    url = sb3.toString();
                }
            }
            return m9864m(HttpUrl.f25380l.m9997d(url));
        }

        /* renamed from: m */
        public Builder m9864m(HttpUrl url) {
            C9971q.m14633g(url, "url");
            this.f25475a = url;
            return this;
        }

        public Builder(Request request) {
            Map<Class<?>, Object> map;
            C9971q.m14633g(request, "request");
            this.f25479e = new LinkedHashMap();
            this.f25475a = request.m9877l();
            this.f25476b = request.m9881h();
            this.f25478d = request.m9888a();
            if (request.m9886c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C11286s.m10259v(request.m9886c());
            }
            this.f25479e = map;
            this.f25477c = request.m9883f().m10070f();
        }
    }
}
