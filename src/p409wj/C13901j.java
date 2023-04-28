package p409wj;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.image.ReactImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import p307qj.C12248r;
import p327rj.C12729c;
import p389vj.C13541c;
import p389vj.C13545e;
import p389vj.C13549f;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001f"}, m15073d2 = {"Lwj/j;", "Lokhttp3/Interceptor;", "Ljava/io/IOException;", "e", "Lvj/e;", "call", "Lokhttp3/Request;", "userRequest", "", "requestSendStarted", "d", "c", "Lokhttp3/Response;", "userResponse", "Lvj/c;", "exchange", "b", "", "method", "a", "", "defaultDelay", "f", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: wj.j */
/* loaded from: classes8.dex */
public final class C13901j implements Interceptor {

    /* renamed from: b */
    public static final C13902a f31342b = new C13902a(null);

    /* renamed from: a */
    private final OkHttpClient f31343a;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lwj/j$a;", "", "", "MAX_FOLLOW_UPS", "I", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: wj.j$a */
    /* loaded from: classes8.dex */
    public static final class C13902a {
        private C13902a() {
        }

        public /* synthetic */ C13902a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13901j(OkHttpClient client) {
        C9971q.m14633g(client, "client");
        this.f31343a = client;
    }

    /* renamed from: a */
    private final Request m2346a(Response response, String str) {
        String t;
        HttpUrl p;
        boolean z;
        RequestBody requestBody = null;
        if (!this.f31343a.m9938u() || (t = Response.m9834t(response, "Location", null, 2, null)) == null || (p = response.m9844b0().m9877l().m10034p(t)) == null) {
            return null;
        }
        if (!C9971q.m14638b(p.m10033q(), response.m9844b0().m9877l().m10033q()) && !this.f31343a.m9937v()) {
            return null;
        }
        Request.Builder i = response.m9844b0().m9880i();
        if (C13897f.m2364b(str)) {
            int l = response.m9839l();
            C13897f fVar = C13897f.f31328a;
            if (fVar.m2362d(str) || l == 308 || l == 307) {
                z = true;
            } else {
                z = false;
            }
            if (!fVar.m2363c(str) || l == 308 || l == 307) {
                if (z) {
                    requestBody = response.m9844b0().m9888a();
                }
                i.m9870g(str, requestBody);
            } else {
                i.m9870g("GET", null);
            }
            if (!z) {
                i.m9868i("Transfer-Encoding");
                i.m9868i("Content-Length");
                i.m9868i("Content-Type");
            }
        }
        if (!C12729c.m5611g(response.m9844b0().m9877l(), p)) {
            i.m9868i("Authorization");
        }
        return i.m9864m(p).m9875b();
    }

    /* renamed from: b */
    private final Request m2345b(Response response, C13541c cVar) {
        C12248r rVar;
        C13549f h;
        if (cVar == null || (h = cVar.m3456h()) == null) {
            rVar = null;
        } else {
            rVar = h.m3396A();
        }
        int l = response.m9839l();
        String h2 = response.m9844b0().m9881h();
        if (!(l == 307 || l == 308)) {
            if (l == 401) {
                return this.f31343a.m9950f().mo5081a(rVar, response);
            }
            if (l == 421) {
                RequestBody a = response.m9844b0().m9888a();
                if ((a != null && a.isOneShot()) || cVar == null || !cVar.m3453k()) {
                    return null;
                }
                cVar.m3456h().m3366y();
                return response.m9844b0();
            } else if (l == 503) {
                Response S = response.m9849S();
                if ((S == null || S.m9839l() != 503) && m2341f(response, ViewDefaults.NUMBER_OF_LINES) == 0) {
                    return response.m9844b0();
                }
                return null;
            } else if (l == 407) {
                C9971q.m14636d(rVar);
                if (rVar.m7267b().type() == Proxy.Type.HTTP) {
                    return this.f31343a.m9963G().mo5081a(rVar, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (l != 408) {
                switch (l) {
                    case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f31343a.m9960J()) {
                return null;
            } else {
                RequestBody a2 = response.m9844b0().m9888a();
                if (a2 != null && a2.isOneShot()) {
                    return null;
                }
                Response S2 = response.m9849S();
                if ((S2 == null || S2.m9839l() != 408) && m2341f(response, 0) <= 0) {
                    return response.m9844b0();
                }
                return null;
            }
        }
        return m2346a(response, h2);
    }

    /* renamed from: c */
    private final boolean m2344c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m2343d(IOException iOException, C13545e eVar, Request request, boolean z) {
        if (!this.f31343a.m9960J()) {
            return false;
        }
        if ((!z || !m2342e(iOException, request)) && m2344c(iOException, z) && eVar.m3403z()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m2342e(IOException iOException, Request request) {
        RequestBody a = request.m9888a();
        if ((a == null || !a.isOneShot()) && !(iOException instanceof FileNotFoundException)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final int m2341f(Response response, int i) {
        String t = Response.m9834t(response, "Retry-After", null, 2, null);
        if (t == null) {
            return i;
        }
        if (!new Regex("\\d+").m14583g(t)) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        Integer valueOf = Integer.valueOf(t);
        C9971q.m14634f(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r7 = r0;
        r0 = r1.m3411r();
        r6 = m2345b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r6 != null) goto L_0x005a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r0.m3452l() == false) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1.m3430B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        r0 = r6.m9888a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r0.isOneShot() == false) goto L_0x006a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = r7.m9845b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r0 == null) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        p327rj.C12729c.m5608j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r8 = (r8 ? 1 : 0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r8 > 20) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r0.m9850R().m9818o(r7.m9850R().m9831b(null).m9830c()).m9830c();
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C9971q.m14633g(r11, r0)
            wj.g r11 = (p409wj.C13898g) r11
            okhttp3.Request r0 = r11.m2352i()
            vj.e r1 = r11.m2356e()
            java.util.List r2 = kotlin.collections.C9904h.m14862i()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.m3418k(r0, r6)
            boolean r6 = r1.mo3420i()     // Catch: all -> 0x00d7
            if (r6 != 0) goto L_0x00cf
            okhttp3.Response r0 = r11.mo2360a(r0)     // Catch: IOException -> 0x0095, j -> 0x00ad, all -> 0x00d7
            if (r7 == 0) goto L_0x0040
            okhttp3.Response$a r0 = r0.m9850R()     // Catch: all -> 0x00d7
            okhttp3.Response$a r6 = r7.m9850R()     // Catch: all -> 0x00d7
            okhttp3.Response$a r6 = r6.m9831b(r4)     // Catch: all -> 0x00d7
            okhttp3.Response r6 = r6.m9830c()     // Catch: all -> 0x00d7
            okhttp3.Response$a r0 = r0.m9818o(r6)     // Catch: all -> 0x00d7
            okhttp3.Response r0 = r0.m9830c()     // Catch: all -> 0x00d7
        L_0x0040:
            r7 = r0
            vj.c r0 = r1.m3411r()     // Catch: all -> 0x00d7
            okhttp3.Request r6 = r10.m2345b(r7, r0)     // Catch: all -> 0x00d7
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0056
            boolean r11 = r0.m3452l()     // Catch: all -> 0x00d7
            if (r11 == 0) goto L_0x0056
            r1.m3430B()     // Catch: all -> 0x00d7
        L_0x0056:
            r1.m3417l(r3)
            return r7
        L_0x005a:
            okhttp3.RequestBody r0 = r6.m9888a()     // Catch: all -> 0x00d7
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isOneShot()     // Catch: all -> 0x00d7
            if (r0 == 0) goto L_0x006a
            r1.m3417l(r3)
            return r7
        L_0x006a:
            okhttp3.ResponseBody r0 = r7.m9845b()     // Catch: all -> 0x00d7
            if (r0 == 0) goto L_0x0073
            p327rj.C12729c.m5608j(r0)     // Catch: all -> 0x00d7
        L_0x0073:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x007e
            r1.m3417l(r5)
            r0 = r6
            goto L_0x0018
        L_0x007e:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: all -> 0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x00d7
            r0.<init>()     // Catch: all -> 0x00d7
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: all -> 0x00d7
            r0.append(r8)     // Catch: all -> 0x00d7
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x00d7
            r11.<init>(r0)     // Catch: all -> 0x00d7
            throw r11     // Catch: all -> 0x00d7
        L_0x0095:
            r6 = move-exception
            boolean r9 = r6 instanceof p450yj.C14448a     // Catch: all -> 0x00d7
            if (r9 != 0) goto L_0x009c
            r9 = r5
            goto L_0x009d
        L_0x009c:
            r9 = r3
        L_0x009d:
            boolean r9 = r10.m2343d(r6, r1, r0, r9)     // Catch: all -> 0x00d7
            if (r9 == 0) goto L_0x00a8
            java.util.List r2 = kotlin.collections.C9904h.m14847p0(r2, r6)     // Catch: all -> 0x00d7
            goto L_0x00c0
        L_0x00a8:
            java.lang.Throwable r11 = p327rj.C12729c.m5619X(r6, r2)     // Catch: all -> 0x00d7
            throw r11     // Catch: all -> 0x00d7
        L_0x00ad:
            r6 = move-exception
            java.io.IOException r9 = r6.m3354c()     // Catch: all -> 0x00d7
            boolean r9 = r10.m2343d(r9, r1, r0, r3)     // Catch: all -> 0x00d7
            if (r9 == 0) goto L_0x00c6
            java.io.IOException r6 = r6.m3355b()     // Catch: all -> 0x00d7
            java.util.List r2 = kotlin.collections.C9904h.m14847p0(r2, r6)     // Catch: all -> 0x00d7
        L_0x00c0:
            r1.m3417l(r5)
            r6 = r3
            goto L_0x0019
        L_0x00c6:
            java.io.IOException r11 = r6.m3355b()     // Catch: all -> 0x00d7
            java.lang.Throwable r11 = p327rj.C12729c.m5619X(r11, r2)     // Catch: all -> 0x00d7
            throw r11     // Catch: all -> 0x00d7
        L_0x00cf:
            java.io.IOException r11 = new java.io.IOException     // Catch: all -> 0x00d7
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: all -> 0x00d7
            throw r11     // Catch: all -> 0x00d7
        L_0x00d7:
            r11 = move-exception
            r1.m3417l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p409wj.C13901j.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
